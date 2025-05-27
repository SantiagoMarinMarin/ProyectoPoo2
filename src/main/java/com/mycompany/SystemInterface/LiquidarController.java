
package com.mycompany.SystemInterface;
import com.mycompany.proyectopoo2.Empleado;
import com.mycompany.proyectopoo2.Liquidacion;
import org.json.JSONObject;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDate;


public class LiquidarController {
    public static Empleado obtenerEmpleadoPorCedula(String cedula) {
        try {
            URL url = new URL("http://localhost:3000/api/empleado/" + cedula);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            int status = con.getResponseCode();
            if (status != 200) {
                JOptionPane.showMessageDialog(null, "Empleado no encontrado. Código: " + status);
                return null;
            }

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = in.readLine()) != null) {
                content.append(line);
            }
            in.close();
            con.disconnect();

            JSONObject json = new JSONObject(content.toString());

            Empleado empleado = new Empleado();
            empleado.setPrimerNombre(json.getString("PrimerNombre"));
            empleado.setSegundoNombre(json.getString("SegundoNombre"));
            empleado.setPrimerApellido(json.getString("PrimerApellido"));
            empleado.setSegundoApellido(json.getString("SegundoApellido"));
            empleado.setEdad(json.getInt("edad"));
            empleado.setNumeroIdentificacion(json.getInt("numeroIdentificacion"));
            empleado.setNumeroTelefono(json.getLong("numeroTelefono"));
            empleado.setCorreoElectronico(json.getString("correoElectronico"));
            empleado.setIdContrato(json.getInt("idContrato"));
            empleado.setTipodecontrato(json.getString("tipodecontrato"));
            empleado.setSueldo(json.getDouble("sueldo"));
            empleado.setFechaInicioContrato(LocalDate.parse(json.getString("fechaInicioContrato")));
            empleado.setFechaFinContrato(LocalDate.parse(json.getString("fechaFinContrato")));

            return empleado;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
            
            
}
