package com.mycompany.SystemInterface;


import com.mycompany.MainInterface.MainInterface;
import com.mycompany.proyectopoo2.Empleado;
import com.mycompany.proyectopoo2.Liquidacion;

import static com.mycompany.proyectopoo2.LiquidarController.eliminarEmpleadoPorId;
import static com.mycompany.proyectopoo2.LiquidarController.obtenerEmpleadoPorId;

import java.time.LocalDate;
import javax.swing.*;


public class DismissInterface extends javax.swing.JFrame {
    private javax.swing.ButtonGroup grupoMotivo;


    public DismissInterface() {
        initComponents();
        setLocationRelativeTo(null); // Centrar ventana
        
        
        grupoMotivo = new javax.swing.ButtonGroup();
        grupoMotivo.add(jRadioButton2);
        grupoMotivo.add(jRadioButton3);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        ParaAtras = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        identificacion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        fechadedespido1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ParaAtras.setBackground(new java.awt.Color(255, 255, 255));
        ParaAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ParaAtrasMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ParaAtrasLayout = new javax.swing.GroupLayout(ParaAtras);
        ParaAtras.setLayout(ParaAtrasLayout);
        ParaAtrasLayout.setHorizontalGroup(
            ParaAtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParaAtrasLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        ParaAtrasLayout.setVerticalGroup(
            ParaAtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ParaAtrasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        background.add(ParaAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Dismiss\n");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 270, -1));

        jLabel4.setText("Cédula de la persona que desea despedir:");
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        identificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identificacionActionPerformed(evt);
            }
        });
        background.add(identificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 180, -1));

        jButton1.setText("Liquidar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        background.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        jRadioButton2.setText("Justa causa");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        background.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jRadioButton3.setText("sin justa causa");
        background.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));

        jLabel5.setText("Fecha de despido:");
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        fechadedespido1.setText("AAA-MM-DD");
        fechadedespido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechadedespido1ActionPerformed(evt);
            }
        });
        background.add(fechadedespido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void liquidarEmpleado() {
        try {
            String texto = identificacion.getText().trim();
            if (texto.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese la identificación del empleado.");
                return;
            }

            long id;
            try {
                id = Long.parseLong(texto);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "La identificación debe ser un número válido.");
                return;
            }

            Empleado empleado = obtenerEmpleadoPorId(id);
            if (empleado == null) {
                JOptionPane.showMessageDialog(null, "Empleado no encontrado.");
                return;
            }

            String fechaDespidoStr = fechadedespido1.getText().trim();
            if (fechaDespidoStr.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese la fecha de despido.");
                return;
            }

            LocalDate fechaDespido;
            try {
                fechaDespido = LocalDate.parse(fechaDespidoStr);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Formato de fecha inválido. Use AAAA-MM-DD.");
                return;
            }

            empleado.setFechaFinContrato(fechaDespido);
            int motivo;

            if (jRadioButton2.isSelected()) {
            motivo = 2; // Justa causa
            } else if (jRadioButton3.isSelected()) {
            motivo = 3; // Sin justa causa
            } else {
            JOptionPane.showMessageDialog(null, "Seleccione el motivo del despido.");
            return;
            }

            double liquidacion = Liquidacion.calcularLiquidacion(empleado, motivo);

            JOptionPane.showMessageDialog(null,
                "Empleado liquidado exitosamente.\n\n" +
                "Nombre: " + empleado.getPrimerNombre() + " " + empleado.getPrimerApellido() + "\n" +
                "Identificación: " + empleado.getNumeroIdentificacion() + "\n" +
                "Total a pagar: $" + liquidacion);

            eliminarEmpleadoPorId(id);

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }
    private void ParaAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParaAtrasMouseClicked
        MainInterface main = new MainInterface();
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_ParaAtrasMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
    
    }//GEN-LAST:event_jLabel2MouseClicked

    private void identificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identificacionActionPerformed
  
    }//GEN-LAST:event_identificacionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    liquidarEmpleado();



    }//GEN-LAST:event_jButton1MouseClicked

    private void fechadedespido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechadedespido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechadedespido1ActionPerformed

        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ParaAtras;
    private javax.swing.JPanel background;
    private javax.swing.JTextField fechadedespido1;
    private javax.swing.JTextField identificacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    // End of variables declaration//GEN-END:variables
}