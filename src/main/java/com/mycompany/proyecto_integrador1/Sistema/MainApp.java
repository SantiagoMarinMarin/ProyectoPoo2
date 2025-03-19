
package com.mycompany.proyecto_integrador1.Sistema;

import com.mycompany.proyecto_integrador1.Sistema.AdminInterface;

public class MainApp {
    public static void main(String args[]) {
        // Configuración del Look and Feel (opcional)
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(AdminInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        // Se invoca la creación y visualización del formulario
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminInterface().setVisible(true);
            }
        });
    }
}
