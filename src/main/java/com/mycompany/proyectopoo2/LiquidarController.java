
package com.mycompany.proyectopoo2;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mycompany.proyectopoo2.Empleado;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class LiquidarController {
    
    
          public static Empleado obtenerEmpleadoPorId(long numeroIdentificacion) throws IOException {
        URL url = new URL("http://localhost:8000/employes/" + numeroIdentificacion);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");

        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Error al obtener el empleado: " + conn.getResponseCode());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder jsonBuilder = new StringBuilder();
        String output;
        while ((output = br.readLine()) != null) {
            jsonBuilder.append(output);
        }
        conn.disconnect();

        String json = jsonBuilder.toString();

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(java.time.LocalDate.class, new LocalDateAdapter())
                .create();

        return gson.fromJson(json, Empleado.class);
    }

    public static void eliminarEmpleadoPorId(long numeroIdentificacion) throws IOException {
        URL url = new URL("http://localhost:8000/employes/" + numeroIdentificacion);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("DELETE");
        conn.setRequestProperty("Content-Type", "application/json");

        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Error al eliminar empleado: " + conn.getResponseCode());
        }

        conn.disconnect();
    }
}
