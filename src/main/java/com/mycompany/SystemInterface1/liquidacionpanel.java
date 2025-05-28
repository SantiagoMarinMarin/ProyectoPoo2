
package com.mycompany.SystemInterface;
import javax.swing.*;


public class liquidacionpanel extends javax.swing.JPanel {
 
    public liquidacionpanel() {
        initComponents();
    }
    
     public void mostrarInformacion(String nombre, String cedula, String motivo, String total) {
        nombreLabel.setText("Nombre: " + nombre);
        cedulaLabel.setText("Cédula: " + cedula);
        motivoLabel.setText("Motivo: " + motivo);
        totalLabel.setText("Total Liquidación: $" + total);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nombreLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        cedulaLabel = new javax.swing.JLabel();
        motivoLabel = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreLabel.setText("Nombre:");
        jPanel1.add(nombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        totalLabel.setText("Total Liquidación:");
        jPanel1.add(totalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        cedulaLabel.setText("Cédula:");
        jPanel1.add(cedulaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        motivoLabel.setText("Motivo:");
        jPanel1.add(motivoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cedulaLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel motivoLabel;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}
