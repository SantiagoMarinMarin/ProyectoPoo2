package com.mycompany.proyectopoo2;

import com.mycompany.MainInterface.MainInterface;

public class Main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new MainInterface().setVisible(true);
        });
    }
}