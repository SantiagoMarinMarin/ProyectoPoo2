package com.mycompany.proyectopoo2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Liquidacion {

    private static final double CESANTIAS_INTERES = 0.12;
    private static final double VACACIONES_DIVISOR = 720;
    private static final double INDEMNIZACION_MULTIPLICADOR = 20;

    // Cálculo de liquidación según motivo (2 = justa causa, 3 = sin justa causa)
    public static double calcularLiquidacion(Empleado empleado, int motivo) {
        LocalDate fechaInicio = empleado.getFechaInicioContrato();
        LocalDate fechaFin = empleado.getFechaFinContrato(); // Debes haberla seteado antes de llamar a este método

        long diasTrabajados = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        double sueldo = empleado.getSueldo();
        double salarioDiario = sueldo / 30;

        double cesantias = (sueldo * diasTrabajados) / 360;
        double interesesCesantias = (cesantias * diasTrabajados * CESANTIAS_INTERES) / 360;
        double primaServicios = (sueldo * 180) / 360;
        double vacaciones = (sueldo * diasTrabajados) / VACACIONES_DIVISOR;
        double indemnizacion = 0;

        // Si es sin justa causa, se liquida con indemnización
        if (motivo == 3) {
            double aniosTrabajados = diasTrabajados / 360.0;
            indemnizacion = (salarioDiario * aniosTrabajados * INDEMNIZACION_MULTIPLICADOR) / 12;
        }

        double liquidacionTotal = cesantias + interesesCesantias + primaServicios + vacaciones + indemnizacion;
        return Math.round(liquidacionTotal * 100.0) / 100.0;
    }
}