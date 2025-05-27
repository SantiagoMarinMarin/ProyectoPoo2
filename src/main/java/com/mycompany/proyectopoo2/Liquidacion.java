package com.mycompany.proyectopoo2;


import com.mycompany.proyectopoo2.Empleado;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Liquidacion {

    private static double cesantias;
    private static double interesesCesantias;
    private static double prima;
    private static double vacaciones;
    private static double indemnizacion;

    private static final double INTERES_CESANTIAS = 0.12;
    private static final double VACACIONES_DIVISOR = 720;
    private static final double BASE_INDEMNIZACION = 20;

    public static double getCesantias() {
        return cesantias;
    }

    public static double getInteresesCesantias() {
        return interesesCesantias;
    }

    public static double getPrima() {
        return prima;
    }

    public static double getVacaciones() {
        return vacaciones;
    }

    public static double getIndemnizacion() {
        return indemnizacion;
    }

    public static double calcularLiquidacion(Empleado empleado, int motivo) {
        LocalDate fechaInicio = empleado.getFechaInicioContrato();
        LocalDate fechaFin = empleado.getFechaFinContrato(); // o LocalDate.now();
        long diasTrabajados = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        double sueldo = empleado.getSueldo();
        double salarioDiario = sueldo / 30;

        cesantias = (sueldo * diasTrabajados) / 360;
        interesesCesantias = (cesantias * diasTrabajados * INTERES_CESANTIAS) / 360;
        prima = (sueldo * 180) / 360;
        vacaciones = (sueldo * diasTrabajados) / VACACIONES_DIVISOR;

        indemnizacion = 0;
        if (motivo == 2) { // 2 = sin justa causa
            double aniosTrabajados = diasTrabajados / 360.0;
            indemnizacion = (salarioDiario * aniosTrabajados * BASE_INDEMNIZACION) / 12;
        }

        return Math.round((cesantias + interesesCesantias + prima + vacaciones + indemnizacion) * 100.0) / 100.0;
    }
}
/*
public static void consultarMensualidad () {
        Scanner scanner = new Scanner(System.in);
      DecimalFormat formato = new DecimalFormat("#,###");
      
       if (Empleados == null || Empleados.isEmpty()){
           System.out.println("No hay empleados registrados.");
           return;
      }
       
      System.out.println("Seleccione un empleado:");
      int contador = 1;
      for (Empleado emp : empleados){
        System.out.println(contador + "." + emp.getNombre());
           contador++;
        }
        
        System.out.println("Ingrese el número del empleado: ");
       if (!scanner.hasNextInt()) {
            System.out.println("Entrada invalida. Debe ser un número.");
           scanner.next();
            return;
        }
        
        int seleccion = scanner.nextInt();
        if (seleccion < 1 || seleccion > empleados.size()){
            System.out.println("Seleccion invalida.");
            return;
        }
        
        Empleado empleadoActual = null;
        contador = 1;
        for(Empleado emp : empleados) {
            if(contador == seleccion) {
                empleadoActual = emp;
                break;
            }
            contador++;
        }
        
        if (empleadoActual == null) {
            System.out.println("Error al seleccionar empleado.");
            return;
        }
        
        double sueldo = empleadoActual.getSueldo();
        Contratoenum tipoContrato = empleadoActual.getContrato().getTipoContrato();
        
        double saludTotal = 0, saludEmpresa = 0, saludTrabajador = 0;
        double pensionTotal = 0, pensionEmpresa = 0, pensionTrabajador = 0;
        double subsidio = 0;
        double total = 0;
        double totalE = 0;
        
        switch (tipoContrato) {
            case TIEMPO_INDEFINIDO:
                saludTotal = sueldo * 0.125;
                saludEmpresa = sueldo * 0.085;
                saludTrabajador = sueldo * 0.04;
                
                pensionTotal = sueldo * 0.16;
                pensionEmpresa = sueldo * 0.12;
                pensionTrabajador = sueldo * 0.04;
                
                if (sueldo < 2847000) {
                    subsidio = 200000;
                }
                
                total = (sueldo + saludEmpresa + pensionEmpresa + subsidio) - (saludTrabajador + pensionTrabajador);
                totalE = sueldo + subsidio - pensionTrabajador - saludTrabajador;
                break;
                
                
            case PRESTACION_SERVICIOS:
                saludTotal = sueldo * 0.125;
                saludEmpresa = 0;
                saludTrabajador = saludTotal;
                
                pensionTotal = sueldo * 0.16;
                pensionEmpresa = 0;
                pensionTrabajador = pensionTotal;
                
                subsidio = 0;
                
                total = sueldo;
                totalE = sueldo;
                break;
        }   
        System.out.println("Empleado: " + empleadoActual.getNombre());
        System.out.println("Tipo de contrato: " + tipoContrato);
        System.out.println("Salario base: $" + formato.format(empleadoActual.getSueldo()));
        System.out.println("Salud Total: $" + formato.format(saludTotal) + " "  + "Aporte de la empresa: $" + formato.format(saludEmpresa) + " " + "Aporte Trabajador: $" + formato.format(saludTrabajador));
        System.out.println("Pension Total: $" + formato.format(pensionTotal) + " "  + "Aporte de la empresa: $" + formato.format(pensionEmpresa) + " "  + "Aporte Trabajador: $" + formato.format(pensionTrabajador));
        System.out.println("Subsidio de transporte: $" + formato.format(subsidio));
        System.out.println("");
        System.out.println("Total que debe pagar la empresa: $" + formato.format(total));
        System.out.println("Total que recibe el trabajador: $" + formato.format(totalE));
    
    }       
}
*/