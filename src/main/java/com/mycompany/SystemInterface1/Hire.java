
package com.mycompany.SystemInterface1;

import com.mycompany.proyectopoo2.Empleado;
import com.mycompany.proyectopoo2.MethodHireEmployee;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;


public class Hire extends javax.swing.JFrame {

   
    public Hire() {
        initComponents();
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        primernombre = new javax.swing.JTextField();
        segundonombre = new javax.swing.JTextField();
        primerapellido = new javax.swing.JTextField();
        segundoapellido = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        identificacion = new javax.swing.JTextField();
        nacimiento = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        tipodecontrato = new javax.swing.JTextField();
        idcontrato = new javax.swing.JTextField();
        sueldo = new javax.swing.JTextField();
        iniciocontrato = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Primer Nombre\n");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel2.setText("Segundo Nombre\n");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        jLabel3.setText("Primer Apellido\n");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, 20));

        jLabel4.setText("Segundo Apellido");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        jLabel5.setText("Edad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel6.setText("Identificación");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        jLabel7.setText("Fecha de nacimiento");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel8.setText("Telefono");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        jLabel9.setText("Correo");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jLabel10.setText("Tipo de contrato");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        jLabel11.setText("ID del contrato");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jLabel12.setText("Sueldo");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, -1, -1));

        jLabel13.setText("Fecha de Inicio de Contrato");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, 20));
        jPanel1.add(primernombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 140, -1));
        jPanel1.add(segundonombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 160, -1));
        jPanel1.add(primerapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 110, -1));
        jPanel1.add(segundoapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 170, -1));
        jPanel1.add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 100, -1));
        jPanel1.add(identificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 190, -1));
        jPanel1.add(nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 100, -1));
        jPanel1.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 180, -1));
        jPanel1.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 110, -1));
        jPanel1.add(tipodecontrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 180, -1));
        jPanel1.add(idcontrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 110, -1));
        jPanel1.add(sueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 160, -1));

        iniciocontrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciocontratoActionPerformed(evt);
            }
        });
        jPanel1.add(iniciocontrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 90, -1));

        jButton1.setText("Contratar");
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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
      Empleado emp = new Empleado();
      try {
            emp.setPrimerNombre(primernombre.getText());
            emp.setSegundoNombre(segundonombre.getText());
            emp.setPrimerApellido(primerapellido.getText());
            emp.setSegundoApellido(segundoapellido.getText());
            emp.setEdad(Integer.parseInt(edad.getText()));
            emp.setNumeroIdentificacion(Integer.parseInt(identificacion.getText()));
            emp.setNumeroTelefono(Long.parseLong(telefono.getText()));
            emp.setCorreoElectronico(correo.getText());
            emp.setTipodecontrato(tipodecontrato.getText());
            emp.setIdContrato(Integer.parseInt(idcontrato.getText()));
            emp.setSueldo(Double.parseDouble(sueldo.getText()));
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            emp.setFechaNacimiento(LocalDate.parse(nacimiento.getText(), formato));
            emp.setFechaInicioContrato(LocalDate.parse(iniciocontrato.getText(), formato));

            MethodHireEmployee.crearEmpleado(emp);
            JOptionPane.showMessageDialog(this, "✅ Empleado creado exitosamente");
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "⚠️ Error numérico: " + nfe.getMessage());
        } catch (DateTimeParseException dtpe) {
            JOptionPane.showMessageDialog(this, "⚠️ Error en el formato de fecha: yyyy-MM-dd requerido");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "❌ Error inesperado: " + ex.getMessage());
            ex.printStackTrace();
        }

    
    }//GEN-LAST:event_jButton1MouseClicked

    private void iniciocontratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciocontratoActionPerformed
        try {
            LocalDate fecha = LocalDate.parse(iniciocontrato.getText(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            JOptionPane.showMessageDialog(this, "✔ Fecha válida: " + fecha);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "⚠️ Fecha inválida. Usa el formato yyyy-MM-dd (Ej: 2024-01-01)");
        }

    }//GEN-LAST:event_iniciocontratoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField correo;
    private javax.swing.JTextField edad;
    private javax.swing.JTextField idcontrato;
    private javax.swing.JTextField identificacion;
    private javax.swing.JTextField iniciocontrato;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
