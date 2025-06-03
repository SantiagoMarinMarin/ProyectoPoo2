
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaempleados = new javax.swing.JTable();
        txtIdentificacion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 755));
        setMinimumSize(new java.awt.Dimension(1280, 755));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Table/Black White Minimalist Professional Initial Logo (1) 1.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tablaempleados.setBackground(new java.awt.Color(177, 25, 25));
        tablaempleados.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
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
        tablaempleados.setGridColor(new java.awt.Color(0, 0, 0));
        tablaempleados.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tablaempleados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 1215, 300));

        txtIdentificacion.setBackground(new java.awt.Color(153, 153, 153));
        txtIdentificacion.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtIdentificacion.setForeground(new java.awt.Color(255, 255, 255));
        txtIdentificacion.setBorder(null);
        txtIdentificacion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 608, 660, 44));

        jButton1.setBackground(new java.awt.Color(177, 25, 25));
        jButton1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 604, 180, 47));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Table/Group 1.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
         MainInterface main = new MainInterface();
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaempleados;
    private javax.swing.JTextField txtIdentificacion;
    // End of variables declaration//GEN-END:variables
}
