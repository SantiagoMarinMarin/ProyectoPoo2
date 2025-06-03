
package com.mycompany.SystemInterface;

import com.mycompany.MainInterface.MainInterface;
import com.mycompany.proyectopoo2.Empleado;
import static com.mycompany.proyectopoo2.LiquidarController.obtenerEmpleadoPorId;
import com.mycompany.proyectopoo2.MethodHireEmployee;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.text.DecimalFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaempleados = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jButton1.setText("Obtener datos del empleado.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Identificación del empleado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 1014, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1028, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(367, 367, 367))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addGap(80, 80, 80))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        MainInterface main = new MainInterface();
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
        long id = Long.parseLong(txtIdentificacion.getText());
        Empleado empleadoActual = obtenerEmpleadoPorId(id);

        if (empleadoActual == null) {
            JOptionPane.showMessageDialog(null, "Empleado no encontrado.");
            return;
        }

        DecimalFormat formato = new DecimalFormat("#,###");

        double sueldo = empleadoActual.getSueldo();
        String tipoContrato = empleadoActual.getTipodecontrato().toUpperCase().replace(" ", "_"); 

        double saludTotal = 0, saludEmpresa = 0, saludTrabajador = 0;
        double pensionTotal = 0, pensionEmpresa = 0, pensionTrabajador = 0;
        double subsidio = 0;
        double total = 0;
        double totalE = 0;

        if (tipoContrato.equals("INDEFINIDO") || tipoContrato.equals("DEFINIDO")) {
            saludTotal = sueldo * 0.125;
            saludEmpresa = sueldo * 0.085;
            saludTrabajador = sueldo * 0.04;

            pensionTotal = sueldo * 0.16;
            pensionEmpresa = sueldo * 0.12;
            pensionTrabajador = sueldo * 0.04;

            if (sueldo < 2847000) {
                subsidio = 200000;
            }

            total = (sueldo + saludEmpresa + pensionEmpresa + subsidio) - (saludTrabajador + pensionTrabajador);
            totalE = sueldo + subsidio - pensionTrabajador - saludTrabajador;

        } else if (tipoContrato.equals("POR PRESTACIÓN SERVICIOS")) {
            saludTotal = sueldo * 0.125;
            saludEmpresa = 0;
            saludTrabajador = saludTotal;

            pensionTotal = sueldo * 0.16;
            pensionEmpresa = 0;
            pensionTrabajador = pensionTotal;

            subsidio = 0;

            total = sueldo;
            totalE = sueldo;

        } else {
            JOptionPane.showMessageDialog(null, "Tipo de contrato desconocido: " + tipoContrato);
            return;
        }

        // Mostrar resultados
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Empleado: ").append(empleadoActual.getPrimerNombre()).append(" ").append(empleadoActual.getPrimerApellido()).append("\n");
        mensaje.append("Tipo de contrato: ").append(empleadoActual.getTipodecontrato()).append("\n");
        mensaje.append("Salario base: $").append(formato.format(sueldo)).append("\n\n");
        mensaje.append("Salud Total: $").append(formato.format(saludTotal))
                .append(" (Empresa: $").append(formato.format(saludEmpresa))
                .append(" | Trabajador: $").append(formato.format(saludTrabajador)).append(")\n");
        mensaje.append("Pensión Total: $").append(formato.format(pensionTotal))
                .append(" (Empresa: $").append(formato.format(pensionEmpresa))
                .append(" | Trabajador: $").append(formato.format(pensionTrabajador)).append(")\n");
        mensaje.append("Subsidio de transporte: $").append(formato.format(subsidio)).append("\n\n");
        mensaje.append("Total que debe pagar la empresa: $").append(formato.format(total)).append("\n");
        mensaje.append("Total que recibe el trabajador: $").append(formato.format(totalE)).append("\n");

        JOptionPane.showMessageDialog(null, mensaje.toString(), "Resumen Mensualidad", JOptionPane.INFORMATION_MESSAGE);

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Identificación inválida. Debe ser un número.");
    } catch (RuntimeException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }   catch (java.io.IOException ex) {
            Logger.getLogger(AboutEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaempleados;
    private javax.swing.JTextField txtIdentificacion;
    // End of variables declaration//GEN-END:variables
}
