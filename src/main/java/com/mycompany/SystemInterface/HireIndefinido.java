/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.SystemInterface;

import com.mycompany.MainInterface.MainInterface;
import com.mycompany.proyectopoo2.ContratoIndefinido;
import com.mycompany.proyectopoo2.MethodHireEmployee;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

public class HireIndefinido extends javax.swing.JFrame {

    public HireIndefinido() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        ParaAtras = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        primernombre = new javax.swing.JTextField();
        segundonombre = new javax.swing.JTextField();
        primerapellido = new javax.swing.JTextField();
        segundoapellido = new javax.swing.JTextField();
        PrimerNombre = new javax.swing.JLabel();
        SegundoNombre = new javax.swing.JLabel();
        PrimerApellido = new javax.swing.JLabel();
        SegundoApellido = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Edad = new javax.swing.JLabel();
        edad = new javax.swing.JTextField();
        Identificacion = new javax.swing.JLabel();
        identificacion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nacimiento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tipodecontrato = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        idcontrato = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        sueldo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ParaAtras.setBackground(new java.awt.Color(153, 153, 153));
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

        Background.add(ParaAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));
        Background.add(primernombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 130, -1));
        Background.add(segundonombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 140, -1));
        Background.add(primerapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 130, -1));
        Background.add(segundoapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 140, -1));

        PrimerNombre.setText("Primer Nombre:");
        Background.add(PrimerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        SegundoNombre.setText("Segundo Nombre:\n");
        Background.add(SegundoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        PrimerApellido.setText("Primer Apellido:\n");
        Background.add(PrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        SegundoApellido.setText("Segundo Apellido: ");
        Background.add(SegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, 20));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("HIRE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(329, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 60));

        Edad.setText("Edad:");
        Background.add(Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));
        Background.add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 100, -1));

        Identificacion.setText("Identificación: ");
        Background.add(Identificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));
        Background.add(identificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 210, -1));

        jLabel5.setText("Fecha de nacimiento: ");
        Background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, 20));
        Background.add(nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 90, -1));

        jLabel6.setText("Telefono\n");
        Background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));
        Background.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 160, -1));

        jLabel7.setText("Correo: ");
        Background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));
        Background.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 270, 210, -1));

        jLabel8.setText("Tipo de contrato: ");
        Background.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));
        Background.add(tipodecontrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 190, -1));

        jLabel9.setText("Id del contrato: ");
        Background.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));
        Background.add(idcontrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 110, -1));

        jLabel10.setText("Sueldo: ");
        Background.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, -1));
        Background.add(sueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 190, -1));

        jButton1.setText("Guardar nuevo empleado\n");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        Background.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ParaAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParaAtrasMouseClicked
        MainInterface main = new MainInterface();
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_ParaAtrasMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        MainInterface main = new MainInterface();
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

       ContratoIndefinido emp = new ContratoIndefinido();
        
       emp.PrimerNombre = primernombre.getText();
       emp.SegundoNombre = segundonombre.getText();
       emp.PrimerApellido = primerapellido.getText();
       emp.SegundoApellido = segundoapellido.getText();
       emp.edad = Integer.parseInt(edad.getText());
       emp.numeroIdentificacion = Integer.parseInt(identificacion.getText());
       emp.fechaNacimiento = LocalDate.parse(nacimiento.getText()); // debe tener formato "yyyy-MM-dd"
       emp.numeroTelefono = Long.parseLong(telefono.getText());
       emp.correoElectronico = correo.getText();
       emp.tipodecontrato = tipodecontrato.getText();
       emp.idContrato = Integer.parseInt(idcontrato.getText());
       emp.sueldo = Double.parseDouble(sueldo.getText());
        try {
        MethodHireEmployee.crearEmpleado(emp);
        JOptionPane.showMessageDialog(null, "Empleado creado exitosamente");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        ex.printStackTrace();
    }
    }//GEN-LAST:event_jButton1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Edad;
    private javax.swing.JLabel Identificacion;
    private javax.swing.JPanel ParaAtras;
    private javax.swing.JLabel PrimerApellido;
    private javax.swing.JLabel PrimerNombre;
    private javax.swing.JLabel SegundoApellido;
    private javax.swing.JLabel SegundoNombre;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField edad;
    private javax.swing.JTextField idcontrato;
    private javax.swing.JTextField identificacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nacimiento;
    private javax.swing.JTextField primerapellido;
    private javax.swing.JTextField primernombre;
    private javax.swing.JTextField segundoapellido;
    private javax.swing.JTextField segundonombre;
    private javax.swing.JTextField sueldo;
    private javax.swing.JTextField telefono;
    private javax.swing.JTextField tipodecontrato;
    // End of variables declaration//GEN-END:variables
}
