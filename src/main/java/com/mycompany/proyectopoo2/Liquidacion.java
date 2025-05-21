
/*package com.mycompany.proyectopoo2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Liquidacion {
    private static final double cesantias0 = 0.12;
    private static final double vacacionesp = 720;
    private static final double indemizacion0 = 20; 

    public static double calcularLiquidacion(Empleado empleado, int motivo) {
    LocalDate fechaInicio = Empleado.gettipodecontrato().getFechaInicio();
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
        double aniosTrabajados = diasTrabajados / 360.0;
        indemnizacion = (salarioDiario *  aniosTrabajados *indemizacion0)/12 ;
    }

     double liquidacionTotal = cesantias + interesesCesantias + primaServicios + vacaciones + indemnizacion;
        return Math.round(liquidacionTotal * 100.0) / 100.0;
    }
}

public static void consultarMensualidad () {
        Scanner scanner = new Scanner(System.in);
      DecimalFormat formato = new DecimalFormat("#,###");
      
       if (empleados == null || empleados.isEmpty()){
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