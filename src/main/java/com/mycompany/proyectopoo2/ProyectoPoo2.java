package com.mycompany.proyectopoo2;

import java.io.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProyectoPoo2 {
    static List<Empleado> empleados = new ArrayList<>();
    static String ARCHIVO_EMPLEADOS = System.getProperty("user.home") + "\\Documents\\empleados.txt";
    private static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static void main(String[] args) {
        cargarEmpleadosDesdeArchivo();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nMenú Principal:");
                System.out.println("1) Generar Contrato");
                System.out.println("2) Mostrar Empleados");
                System.out.println("3) Menú de despidos hecho por Nicol");
                System.out.println("0) Salir");
                System.out.print("Seleccione una opción: ");
                
                if (!scanner.hasNextInt()) {
                    System.out.println("Error: Debe ingresar un número.");
                    scanner.next();
                    continue;
                }
                int opcion = scanner.nextInt();
                scanner.nextLine();
            
                switch (opcion) {
                    case 1:
                        try {
                            agregarEmpleado(scanner);
                        } catch (EdadInvalidaException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case 2:
                        mostrarEmpleados();
                        break;
                    case 3:
                        System.out.println("Menú con funcionalidad y toda la vaina de Nicol");
                        break;
                    case 0:
                        guardarEmpleadosEnArchivo();
                        System.out.println("Saliendo del sistema...");
                        return;
                    default:
                        System.out.println("Opción no válida, intente de nuevo.");
                }
            }
        }
    }
        
    private static void agregarEmpleado(Scanner scanner) throws EdadInvalidaException {  
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el primer apellido del empleado: ");
        String primerApellido = scanner.nextLine();

        System.out.print("Ingrese el segundo apellido del empleado: ");
        String segundoApellido = scanner.nextLine();

        System.out.print("Ingrese la fecha de nacimiento (YYYY-MM-DD): ");
        LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine(), FORMATO_FECHA);
        
        int edadCalculada = Period.between(fechaNacimiento, LocalDate.now()).getYears();
        System.out.println("Edad calculada: " + edadCalculada);

        System.out.print("Ingrese la edad del empleado: ");
        int edadIngresada = scanner.nextInt();
        scanner.nextLine();

        if (edadIngresada != edadCalculada) {
            throw new EdadInvalidaException("La edad ingresada no coincide con la calculada a partir de la fecha de nacimiento.");
        }
        
        System.out.print("Ingrese el número de identificación: ");
        String numeroIdentificacion = scanner.nextLine();

        System.out.print("Ingrese el número de teléfono: ");
        String numeroTelefono = scanner.nextLine();

        String correoElectronico = nombre.toLowerCase() + "." + primerApellido.toLowerCase() + "@empresa.co.org";
        
        System.out.println("Seleccione el tipo de contrato:");
        System.out.println("1) Prestación de Servicios");
        System.out.println("2) Tiempo Indefinido");
        System.out.print("Opción: ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        Contratoenum tipoContrato = (tipo == 1) ? Contratoenum.PRESTACION_SERVICIOS : Contratoenum.TIEMPO_INDEFINIDO;

        System.out.print("Ingrese el ID del contrato: ");
        long idContrato = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Ingrese la fecha de inicio del contrato (YYYY-MM-DD): ");
        LocalDate fechaInicio = LocalDate.parse(scanner.nextLine(), FORMATO_FECHA);

        System.out.print("Ingrese la fecha de finalización del contrato (YYYY-MM-DD): ");
        LocalDate fechaFin = LocalDate.parse(scanner.nextLine(), FORMATO_FECHA);

        if (fechaFin.isBefore(fechaInicio)) {
            System.out.println("Error: La fecha de finalización no puede ser antes de la fecha de inicio.");
            return;
        }

        System.out.print("Ingrese el estado del contrato (Activo/Inactivo): ");
        String estado = scanner.nextLine();

        Contrato contrato = new Contrato(idContrato, fechaInicio, fechaFin, tipoContrato, estado);
        Empleado empleado = new Empleado(nombre, primerApellido, segundoApellido, edadIngresada, numeroIdentificacion, fechaNacimiento, numeroTelefono, correoElectronico, contrato);
        empleados.add(empleado);
        guardarEmpleadosEnArchivo();
        System.out.println("Empleado agregado exitosamente y guardado en el archivo.");
    }

    private static void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("\nLista de empleados:");
            for (Empleado emp : empleados) {
                System.out.println(emp);
            }
        } 
    }

    private static void guardarEmpleadosEnArchivo() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_EMPLEADOS))) {
            for (Empleado emp : empleados) {
                writer.write(emp.toString() + "\n");
            }
            System.out.println("Empleados guardados en el archivo: " + ARCHIVO_EMPLEADOS);
        } catch (IOException e) {
            System.out.println("Error al guardar los empleados: " + e.getMessage());
        }
    }

    private static void cargarEmpleadosDesdeArchivo() {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_EMPLEADOS))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                try {
                    empleados.add(Empleado.fromString(linea));
                } catch (Exception e) {
                    System.out.println("Error al procesar línea: " + linea);
                }
            }
            System.out.println("Empleados cargados desde el archivo.");
        } catch (IOException e) {
            System.out.println("No se encontró archivo previo, iniciando con lista vacía.");
        }
    }
}



                
                
              
    
