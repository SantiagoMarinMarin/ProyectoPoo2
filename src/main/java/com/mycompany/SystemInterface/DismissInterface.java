
package com.mycompany.SystemInterface;

import com.mycompany.MainInterface.MainInterface;
import com.mycompany.view.LiquidarView;

public class DismissInterface extends javax.swing.JFrame {

    public DismissInterface() {
        initComponents();
        group = new ButtonGroup();
        justa = new JRadioButton("Justa causa");
        injusta = new JRadioButton("Sin justa causa");
        fechaField = new javax.swing.JTextField();
        group.add(justa);
        group.add(injusta);
        background.add(justa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));
        background.add(injusta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));
        background.add(fechaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 200, -1));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liquidarEmpleado();
            }
        });
    }

        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        ParaAtras = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

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

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        background.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 180, -1));

        jLabel3.setBackground(new java.awt.Color(255, 153, 51));
        jLabel3.setForeground(new java.awt.Color(51, 204, 0));
        jLabel3.setText("jLabel3");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 390, -1));

        jButton1.setText("Liquidar");
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
        background.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        jRadioButton3.setText("sin jusra cauca");
        background.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, -1, -1));

        jLabel5.setText("Fecha de despido:");
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        jTextField1.setText("jTextField1");
        background.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

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
        MainInterface main = new MainInterface();
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_ParaAtrasMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        MainInterface main = new MainInterface();
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*Liquidacion liquidacion = new Liquidacion();
        liquidacion.setVisible(true);
        dispose();
*/
    LiquidarView vista = new LiquidarView(empleado, motivoDespido);
    vista.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ParaAtras;
    private javax.swing.JPanel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
