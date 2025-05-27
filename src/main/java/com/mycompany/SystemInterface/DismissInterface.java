package com.mycompany.SystemInterface;
import com.mycompany.proyectopoo2.Empleado;
import com.mycompany.proyectopoo2.Liquidacion;
import static com.mycompany.proyectopoo2.LiquidarController.eliminarEmpleadoPorId;
import static com.mycompany.proyectopoo2.LiquidarController.obtenerEmpleadoPorId;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class DismissInterface extends javax.swing.JFrame {
    
    public DismissInterface() {
        initComponents();
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
        fechadedespido = new javax.swing.JTextField();

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
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

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
        background.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, -1, -1));

        jRadioButton2.setText("Justa causa");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        background.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jRadioButton3.setText("sin justa cauca");
        background.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        jLabel5.setText("Fecha de despido:");
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));
        background.add(fechadedespido, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 190, -1));

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

    private void ParaAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParaAtrasMouseClicked

    }//GEN-LAST:event_ParaAtrasMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

    }//GEN-LAST:event_jLabel2MouseClicked

    private void identificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_identificacionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try {
    // Validar texto de identificación
    String texto = identificacion.getText().trim();
    if (texto.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Ingrese la identificación del empleado.");
        return;
    }

    // Convertir a long
    long id;
    try {
        id = Long.parseLong(texto);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "La identificación debe ser un número válido.");
        return;
    }

    // Obtener empleado desde backend
    Empleado empleado = obtenerEmpleadoPorId(id);
    if (empleado == null) {
        JOptionPane.showMessageDialog(null, "Empleado no encontrado.");
        return;
    }

    // Validar y convertir fecha de despido
    String fechaDespidoStr = fechadedespido.getText().trim();
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

    // Establecer fecha de fin
    empleado.setFechaFinContrato(fechaDespido);

    // Determinar motivo
    int motivo = jRadioButton2.isSelected() ? 2 : 3; // 2: justa causa, 3: injusta causa

    // Calcular liquidación
    double liquidacion = Liquidacion.calcularLiquidacion(empleado, motivo);

    // Mostrar resultado
    JOptionPane.showMessageDialog(null,
        "Empleado liquidado exitosamente.\n\n" +
        "Nombre: " + empleado.getPrimerNombre() + " " + empleado.getPrimerApellido() + "\n" +
        "Identificación: " + empleado.getNumeroIdentificacion() + "\n" +
        "Total a pagar: $" + liquidacion);

    // Eliminar de la base de datos
    eliminarEmpleadoPorId(id);

} catch (Exception ex) {
    ex.printStackTrace();
    JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
}

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
      try {
    // Validar texto de identificación
    String texto = identificacion.getText().trim();
    if (texto.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Ingrese la identificación del empleado.");
        return;
    }

    // Convertir a long
    long id;
    try {
        id = Long.parseLong(texto);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "La identificación debe ser un número válido.");
        return;
    }

    // Obtener empleado desde backend
    Empleado empleado = obtenerEmpleadoPorId(id);
    if (empleado == null) {
        JOptionPane.showMessageDialog(null, "Empleado no encontrado.");
        return;
    }

    // Validar y convertir fecha de despido
    String fechaDespidoStr = fechadedespido.getText().trim();
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

    // Establecer fecha de fin
    empleado.setFechaFinContrato(fechaDespido);

    // Determinar motivo
    int motivo = jRadioButton2.isSelected() ? 2 : 3; // 2: justa causa, 3: injusta causa

    // Calcular liquidación
    double liquidacion = Liquidacion.calcularLiquidacion(empleado, motivo);

    // Mostrar resultado
    JOptionPane.showMessageDialog(null,
        "Empleado liquidado exitosamente.\n\n" +
        "Nombre: " + empleado.getPrimerNombre() + " " + empleado.getPrimerApellido() + "\n" +
        "Identificación: " + empleado.getNumeroIdentificacion() + "\n" +
        "Total a pagar: $" + liquidacion);

    // Eliminar de la base de datos
    eliminarEmpleadoPorId(id);

} catch (Exception ex) {
    ex.printStackTrace();
    JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
}

    }//GEN-LAST:event_jButton1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ParaAtras;
    private javax.swing.JPanel background;
    private javax.swing.JTextField fechadedespido;
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
