
package com.mycompany.SystemInterface;

import com.mycompany.proyectopoo2.Empleado;
import com.mycompany.proyectopoo2.MethodHireEmployee;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AboutEmployee extends javax.swing.JFrame {

    
    public AboutEmployee() {
        initComponents();
        cargarEmpleadosDesdeAPI();
    }
public void cargarEmpleadosDesdeAPI() {
    DefaultTableModel modelo = (DefaultTableModel) tablaempleados.getModel();
    modelo.setRowCount(0); // Limpiar tabla

    try {
        URL url = new URL("http://localhost:8000/employes");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");

        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Código de respuesta: " + conn.getResponseCode());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            response.append(line);
        }
        conn.disconnect();

        String json = response.toString()
                              .replace("[", "")
                              .replace("]", "")
                              .trim();

        if (!json.isEmpty()) {
            String[] objetos = json.split("\\},\\{");

            for (String obj : objetos) {
                obj = obj.replace("{", "").replace("}", "").trim();
                String[] pares = obj.split(",");

                String primerNombre = "", primerApellido = "", segundoApellido = "";
                String tipoContrato = "", sueldo = "", identificacion = "";

                for (String par : pares) {
                    String[] claveValor = par.split(":");
                    if (claveValor.length == 2) {
                        String clave = claveValor[0].replace("\"", "").trim();
                        String valor = claveValor[1].replace("\"", "").trim();

                        switch (clave) {
                            case "PrimerNombre":
                                primerNombre = valor;
                                break;
                            case "PrimerApellido":
                                primerApellido = valor;
                                break;
                            case "SegundoApellido":
                                segundoApellido = valor;
                                break;
                            case "tipodecontrato":
                                tipoContrato = valor;
                                break;
                            case "sueldo":
                                sueldo = valor;
                                break;
                            case "numeroIdentificacion":
                                identificacion = valor;
                                break;
                        }
                    }
                }

                Object[] fila = {
                    primerNombre + " " + primerApellido + " " + segundoApellido,
                    identificacion,
                    tipoContrato,
                    sueldo
                };
                modelo.addRow(fila);
            }
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al cargar empleados desde API: " + e.getMessage());
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaempleados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaempleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Identificación", "Tipo de contrato", "Sueldo"
            }
        ));
        jScrollPane1.setViewportView(tablaempleados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaempleados;
    // End of variables declaration//GEN-END:variables
}
