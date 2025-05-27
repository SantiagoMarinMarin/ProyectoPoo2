package com.mycompany.view;

import com.mycompany.proyectopoo2.Liquidacion;
import com.mycompany.proyectopoo2.Empleado;

import java.time.format.DateTimeFormatter;


public class LiquidarView extends javax.swing.JFrame {

  private Empleado empleado;
    private int motivo;
    private double totalLiquidacion;

    public LiquidarView(Empleado empleado, int motivo) {
        this.empleado = empleado;
        this.motivo = motivo;
        this.totalLiquidacion = Liquidacion.calcularLiquidacion(empleado, motivo);
        initComponents();
        llenarInformacion();
   
    }
        private void llenarInformacion() {
        setTitle("Liquidación de " + empleado.getPrimerNombre() + " " + empleado.getPrimerApellido());
        double cesantias = Liquidacion.getCesantias();
        double intereses = Liquidacion.getInteresesCesantias();
        double prima = Liquidacion.getPrima();
        double vacaciones = Liquidacion.getVacaciones();
        double indemnizacion = Liquidacion.getIndemnizacion();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        StringBuilder sb = new StringBuilder();
        sb.append("📄 Información del Empleado\n");
        sb.append("Nombre: ").append(empleado.getPrimerNombre()).append(" ").append(empleado.getPrimerApellido()).append("\n");
        sb.append("Identificación: ").append(empleado.getNumeroIdentificacion()).append("\n");
        sb.append("Edad: ").append(empleado.getEdad()).append("\n");
        sb.append("Correo: ").append(empleado.getCorreoElectronico()).append("\n");
        sb.append("Tipo de contrato: ").append(empleado.getTipodecontrato()).append("\n");
        sb.append("Fecha de ingreso: ").append(empleado.getFechaInicioContrato().format(formato)).append("\n");
        sb.append("Fecha de salida: ").append(empleado.getFechaFinContrato().format(formato)).append("\n");
        sb.append("Motivo: ").append(motivo == 1 ? "Justa causa" : "Sin justa causa").append("\n\n");
        sb.append("🔍 Detalle de la liquidación:\n");
        sb.append("Cesantías: $").append(String.format("%,.2f", cesantias)).append("\n");
        sb.append("Intereses: $").append(String.format("%,.2f", intereses)).append("\n");
        sb.append("Prima: $").append(String.format("%,.2f", prima)).append("\n");
        sb.append("Vacaciones: $").append(String.format("%,.2f", vacaciones)).append("\n");
        if (motivo == 2) {
            sb.append("Indemnización: $").append(String.format("%,.2f", indemnizacion)).append("\n");
            }

        sb.append("💰 Liquidación Total: $").append(String.format("%,.2f", totalLiquidacion)).append("\n");
        
        jTextArea1.setText(sb.toString());
    }
   //NO SE PUEDE EDITAR PORWUE NETBEANS LO BLOQUEA, DESDE AQUI
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Liquidacíon empleado");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
