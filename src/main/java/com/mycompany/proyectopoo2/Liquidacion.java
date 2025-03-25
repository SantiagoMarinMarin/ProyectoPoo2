package com.mycompany.proyectopoo2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Liquidacion {
    private static final double cesantias = 0.12;
    private static final double prima = 0.0833;
    private static final double vacaciones = 0.0417;
    private static final double indemizacion = 30; 

    public static double calcularLiquidacion(Empleado empleado, int motivo) {
    LocalDate fechaInicio = empleado.getContrato().getFechaInicio();
    LocalDate fechaFin = LocalDate.now();
    long diasTrabajados = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
    double sueldo = empleado.getSueldo();
    double salarioDiario = sueldo / 30;

    double cesantias = sueldo * (diasTrabajados / 360.0);
    double interesesCesantias = cesantias * 0.12;
    double primaServicios = sueldo * 0.0833 * (diasTrabajados / 180.0);
    double vacaciones = sueldo * 0.0417 * (diasTrabajados / 360.0);
    double indemnizacion = 0;

    if (motivo == 3) { 
        double aniosTrabajados = diasTrabajados / 360.0;
        indemnizacion = 30 * salarioDiario * aniosTrabajados;
    }

    return cesantias + interesesCesantias + primaServicios + vacaciones + indemnizacion;
}
}
