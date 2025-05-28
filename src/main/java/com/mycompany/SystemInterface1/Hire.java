
package com.mycompany.SystemInterface1;

import com.mycompany.MainInterface.MainInterface;
import com.mycompany.proyectopoo2.Empleado;
import com.mycompany.proyectopoo2.MethodHireEmployee;
import java.time.LocalDate;
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
        jLabel14 = new javax.swing.JLabel();
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
        fincontrato = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

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

        jLabel14.setText("Fecha de fin de contrato");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, -1, -1));
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
        jPanel1.add(iniciocontrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 90, -1));
        jPanel1.add(fincontrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 150, -1));

        jButton1.setText("Contratar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel15.setText("X");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    // Asignación de valores desde los campos de texto
    emp.PrimerNombre = primernombre.getText();
    emp.SegundoNombre = segundonombre.getText();
    emp.PrimerApellido = primerapellido.getText();
    emp.SegundoApellido = segundoapellido.getText();
    emp.edad = Integer.parseInt(edad.getText());
    emp.numeroIdentificacion = Integer.parseInt(identificacion.getText());

    // Validación y parseo de la fecha de nacimiento
    try {
        if (nacimiento.getText() != null && !nacimiento.getText().isEmpty()) {
            emp.fechaNacimiento = LocalDate.parse(nacimiento.getText());
        } else {
            throw new IllegalArgumentException("La fecha de nacimiento no puede estar vacía");
        }
    } catch (DateTimeParseException e) {
        JOptionPane.showMessageDialog(null, "Error en la fecha de nacimiento: " + e.getMessage());
        return;  // Salir si la fecha no es válida
    } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
        return;
    }

    emp.numeroTelefono = Long.parseLong(telefono.getText());
    emp.correoElectronico = correo.getText();
    emp.tipodecontrato = tipodecontrato.getText();
    emp.idContrato = Integer.parseInt(idcontrato.getText());
    emp.sueldo = Double.parseDouble(sueldo.getText());

    // Validación y parseo de la fecha de inicio de contrato
    try {
        if (iniciocontrato.getText() != null && !iniciocontrato.getText().isEmpty()) {
            emp.fechaInicioContrato = LocalDate.parse(iniciocontrato.getText());
        } else {
            // Si la fecha de inicio de contrato está vacía, asignamos null
            emp.fechaInicioContrato = null;
        }
    } catch (DateTimeParseException e) {
        JOptionPane.showMessageDialog(null, "Error en la fecha de inicio de contrato: " + e.getMessage());
        return;  // Salir si la fecha no es válida
    }

    // Validación y parseo de la fecha de fin de contrato (solo si aplica)
    try {
        if (fincontrato.getText() != null && !fincontrato.getText().isEmpty()) {
            emp.fechaFinContrato = LocalDate.parse(fincontrato.getText());
        } else {
            // Si no hay fecha de fin de contrato, se puede dejar en null o aplicar alguna lógica de negocio
            emp.fechaFinContrato = null;
        }
    } catch (DateTimeParseException e) {
        JOptionPane.showMessageDialog(null, "Error en la fecha de fin de contrato: " + e.getMessage());
        return;  // Salir si la fecha no es válida
    }

    // Intentar crear el empleado
    try {
        MethodHireEmployee.crearEmpleado(emp);
        JOptionPane.showMessageDialog(null, "Empleado creado exitosamente");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        ex.printStackTrace();
}

    }//GEN-LAST:event_jButton1MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        MainInterface main = new MainInterface();
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField correo;
    private javax.swing.JTextField edad;
    private javax.swing.JTextField fincontrato;
    private javax.swing.JTextField idcontrato;
    private javax.swing.JTextField identificacion;
    private javax.swing.JTextField iniciocontrato;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
