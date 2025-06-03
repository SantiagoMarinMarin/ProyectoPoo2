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
        jLabel1 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        identificacion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        fechadedespido1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setMinimumSize(new java.awt.Dimension(1280, 720));
        background.setPreferredSize(new java.awt.Dimension(1280, 720));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Table/Black White Minimalist Professional Initial Logo (1) 1.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(177, 25, 25));
        jRadioButton2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("WITH just cause");
        jRadioButton2.setBorder(null);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        background.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 250, 50));

        jRadioButton3.setBackground(new java.awt.Color(177, 25, 25));
        jRadioButton3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("WITHOUT just cause");
        jRadioButton3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        background.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, 270, 50));

        identificacion.setBackground(new java.awt.Color(153, 153, 153));
        identificacion.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        identificacion.setForeground(new java.awt.Color(255, 255, 255));
        identificacion.setBorder(null);
        identificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identificacionActionPerformed(evt);
            }
        });
        background.add(identificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 630, 40));

        jButton1.setBackground(new java.awt.Color(177, 25, 25));
        jButton1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Liquidate");
        jButton1.setBorder(null);
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
        background.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 630, 180, 45));

        fechadedespido1.setBackground(new java.awt.Color(153, 153, 153));
        fechadedespido1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        fechadedespido1.setForeground(new java.awt.Color(255, 255, 255));
        fechadedespido1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fechadedespido1.setText("AAA-MM-DD");
        fechadedespido1.setToolTipText("");
        fechadedespido1.setBorder(null);
        fechadedespido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechadedespido1ActionPerformed(evt);
            }
        });
        background.add(fechadedespido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 556, 190, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/despedir/Group 4.png"))); // NOI18N
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        MainInterface main = new MainInterface();
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JTextField fechadedespido1;
    private javax.swing.JTextField identificacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    // End of variables declaration//GEN-END:variables
}