package com.mycompany.proyectopoo2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Liquidacion {
    private static final double cesantias0 = 0.12;
    private static final double vacacionesp = 720;
    private static final double indemizacion0 = 20; 

    public static double calcularLiquidacion(Empleado empleado, int motivo) {
    LocalDate fechaInicio = empleado.getContrato().getFechaInicio();
    LocalDate fechaFin = LocalDate.now();
    long diasTrabajados = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
    double sueldo = empleado.getSueldo();
    double salarioDiario = sueldo / 30;

    double cesantias = (sueldo * diasTrabajados) / 360;
    double interesesCesantias = (cesantias *diasTrabajados* cesantias0)/360;
    double primaServicios = (sueldo *  180)/360;
    double vacaciones = (sueldo * diasTrabajados) / vacacionesp;
    double indemnizacion = 0;

    if (motivo == 3) { 
        double aniosTrabajados = diasTrabajados / 360;
        indemnizacion = (salarioDiario *  aniosTrabajados *indemizacion0)/12 ;
    }

    return cesantias + interesesCesantias + primaServicios + vacaciones + indemnizacion;
}
}
