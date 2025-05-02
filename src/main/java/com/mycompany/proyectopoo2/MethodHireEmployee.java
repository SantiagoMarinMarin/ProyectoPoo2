
package com.mycompany.proyectopoo2;

import java.net.http.*;
import java.net.URI;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class MethodHireEmployee {

    private static final String URL = "http://localhost:8000/empleados";
    private static final HttpClient client = HttpClient.newHttpClient();
    private static final Gson gson = new Gson();

    public static void crearEmpleado(Empleado emp) throws Exception {
        String json = gson.toJson(emp);

        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(URL))
            .header("Content-Type", "application/json")
            .POST(HttpRequest.BodyPublishers.ofString(json, StandardCharsets.UTF_8))
            .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Respuesta: " + response.body());
    }
    
     public static List<Empleado> obtenerEmpleados() throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(URL))
            .GET()
            .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        List<Empleado> empleados = gson.fromJson(response.body(), new TypeToken<List<Empleado>>(){}.getType());
        return empleados;
    }
}
