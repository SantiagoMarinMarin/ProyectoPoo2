
package com.mycompany.SystemInterface1;

import com.mycompany.MainInterface.MainInterface;
import com.mycompany.proyectopoo2.Empleado;
import com.mycompany.proyectopoo2.MethodHireEmployee;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AboutEmployee extends javax.swing.JFrame {

    public static List<Empleado> listaEmpleados;
    public AboutEmployee() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaempleados = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaempleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaempleados);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Mostrar los empleados.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(54, 54, 54)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {
            List<Empleado> empleados = MethodHireEmployee.obtenerEmpleados();
            listaEmpleados = empleados;

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Nombre");
            model.addColumn("Apellido");
            model.addColumn("Edad");
            model.addColumn("Identificación");
            model.addColumn("Correo");
            model.addColumn("Tipo Contrato");

            for (Empleado emp : empleados) {
                model.addRow(new Object[]{
                    emp.PrimerNombre + " " + emp.SegundoNombre,
                    emp.PrimerApellido + " " + emp.SegundoApellido,
                    emp.edad,
                    emp.numeroIdentificacion,
                    emp.correoElectronico,
                    emp.tipodecontrato
                });
            }

            tablaempleados.setModel(model);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener empleados");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        MainInterface main = new MainInterface();
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaempleados;
    // End of variables declaration//GEN-END:variables
}
