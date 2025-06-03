
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
        primernombre = new javax.swing.JTextField();
        segundonombre = new javax.swing.JTextField();
        primerapellido = new javax.swing.JTextField();
        segundoapellido = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        identificacion = new javax.swing.JTextField();
        nacimiento = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        idcontrato = new javax.swing.JTextField();
        sueldo = new javax.swing.JTextField();
        iniciocontrato = new javax.swing.JTextField();
        fincontrato = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tipodecontrato = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        primernombre.setBackground(new java.awt.Color(153, 153, 153));
        primernombre.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        primernombre.setForeground(new java.awt.Color(255, 255, 255));
        primernombre.setBorder(null);
        jPanel1.add(primernombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 224, 290, 42));

        segundonombre.setBackground(new java.awt.Color(153, 153, 153));
        segundonombre.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        segundonombre.setForeground(new java.awt.Color(255, 255, 255));
        segundonombre.setBorder(null);
        jPanel1.add(segundonombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 224, 290, 42));

        primerapellido.setBackground(new java.awt.Color(153, 153, 153));
        primerapellido.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        primerapellido.setForeground(new java.awt.Color(255, 255, 255));
        primerapellido.setBorder(null);
        jPanel1.add(primerapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 286, 290, 42));

        segundoapellido.setBackground(new java.awt.Color(153, 153, 153));
        segundoapellido.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        segundoapellido.setForeground(new java.awt.Color(255, 255, 255));
        segundoapellido.setBorder(null);
        jPanel1.add(segundoapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 286, 290, 42));

        edad.setBackground(new java.awt.Color(153, 153, 153));
        edad.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        edad.setForeground(new java.awt.Color(255, 255, 255));
        edad.setBorder(null);
        jPanel1.add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 346, 290, 42));

        identificacion.setBackground(new java.awt.Color(153, 153, 153));
        identificacion.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        identificacion.setForeground(new java.awt.Color(255, 255, 255));
        identificacion.setBorder(null);
        jPanel1.add(identificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 346, 290, 42));

        nacimiento.setBackground(new java.awt.Color(153, 153, 153));
        nacimiento.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        nacimiento.setForeground(new java.awt.Color(255, 255, 255));
        nacimiento.setBorder(null);
        jPanel1.add(nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 408, 290, 42));

        telefono.setBackground(new java.awt.Color(153, 153, 153));
        telefono.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        telefono.setForeground(new java.awt.Color(255, 255, 255));
        telefono.setBorder(null);
        jPanel1.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 408, 290, 42));

        correo.setBackground(new java.awt.Color(153, 153, 153));
        correo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        correo.setForeground(new java.awt.Color(255, 255, 255));
        correo.setBorder(null);
        jPanel1.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 472, 290, 42));

        idcontrato.setBackground(new java.awt.Color(153, 153, 153));
        idcontrato.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        idcontrato.setForeground(new java.awt.Color(255, 255, 255));
        idcontrato.setBorder(null);
        jPanel1.add(idcontrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 534, 290, 42));

        sueldo.setBackground(new java.awt.Color(153, 153, 153));
        sueldo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        sueldo.setForeground(new java.awt.Color(255, 255, 255));
        sueldo.setBorder(null);
        jPanel1.add(sueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 534, 290, 42));

        iniciocontrato.setBackground(new java.awt.Color(153, 153, 153));
        iniciocontrato.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        iniciocontrato.setForeground(new java.awt.Color(255, 255, 255));
        iniciocontrato.setBorder(null);
        iniciocontrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciocontratoActionPerformed(evt);
            }
        });
        jPanel1.add(iniciocontrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 595, 290, 42));

        fincontrato.setBackground(new java.awt.Color(153, 153, 153));
        fincontrato.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        fincontrato.setForeground(new java.awt.Color(255, 255, 255));
        fincontrato.setBorder(null);
        jPanel1.add(fincontrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 595, 290, 42));

        jButton1.setBackground(new java.awt.Color(177, 25, 25));
        jButton1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Contratar");
        jButton1.setBorder(null);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1058, 656, 190, 45));

        tipodecontrato.setBackground(new java.awt.Color(153, 153, 153));
        tipodecontrato.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        tipodecontrato.setForeground(new java.awt.Color(255, 255, 255));
        tipodecontrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DEFINIDO", "INDEFINIDO", "CONTRATACIÓN DE SERVICIOS" }));
        tipodecontrato.setBorder(null);
        tipodecontrato.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tipodecontrato.setDoubleBuffered(true);
        tipodecontrato.setFocusCycleRoot(true);
        tipodecontrato.setFocusTraversalPolicyProvider(true);
        tipodecontrato.setInheritsPopupMenu(true);
        tipodecontrato.setOpaque(true);
        jPanel1.add(tipodecontrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 472, 290, 42));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/despedir/Group 1.png"))); // NOI18N
        jLabel16.setFocusable(false);
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
    emp.tipodecontrato = tipodecontrato.getSelectedItem().toString();
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

    private void iniciocontratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciocontratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iniciocontratoActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        MainInterface main = new MainInterface();
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField correo;
    private javax.swing.JTextField edad;
    private javax.swing.JTextField fincontrato;
    private javax.swing.JTextField idcontrato;
    private javax.swing.JTextField identificacion;
    private javax.swing.JTextField iniciocontrato;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nacimiento;
    private javax.swing.JTextField primerapellido;
    private javax.swing.JTextField primernombre;
    private javax.swing.JTextField segundoapellido;
    private javax.swing.JTextField segundonombre;
    private javax.swing.JTextField sueldo;
    private javax.swing.JTextField telefono;
    private javax.swing.JComboBox<String> tipodecontrato;
    // End of variables declaration//GEN-END:variables
}
