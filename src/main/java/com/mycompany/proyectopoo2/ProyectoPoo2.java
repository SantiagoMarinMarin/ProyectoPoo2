package com.mycompany.proyectopoo2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProyectoPoo2 {

    static List<Empleado> empleados = new ArrayList<>();
    static String ARCHIVO_EMPLEADOS = System.getProperty("user.home") + "\\Documents\\empleados.txt";

    public static void main(String[] args) {
        cargarEmpleadosDesdeArchivo();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nMenú Principal:");
            System.out.println("1) Generar Contrato");
            System.out.println("2) Mostrar Empleados");
            System.out.println("3) Menú de despidos hecho por Nicol");
            System.out.println("0) Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
        
            switch (opcion) {
                case 1:
                    agregarEmpleado();
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
        
    private static void agregarEmpleado() {  
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el primer apellido del empleado: ");
        String primerApellido = scanner.nextLine();

        System.out.print("Ingrese el segundo apellido del empleado: ");
        String segundoApellido = scanner.nextLine();

        System.out.print("Ingrese la edad del empleado: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el número de identificación: ");
        String numeroIdentificacion = scanner.nextLine();

        System.out.print("Ingrese la fecha de nacimiento (DD-MM-YYYY): ");
        String fechaNacimiento = scanner.nextLine();

        System.out.print("Ingrese el número de teléfono: ");
        String numeroTelefono = scanner.nextLine();

        System.out.print("Ingrese el correo electrónico: ");
        String correoElectronico = scanner.nextLine();

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

        System.out.print("Ingrese la fecha de inicio del contrato (DD-MM-YYYY): ");
        String fechaInicio = scanner.nextLine();

        System.out.print("Ingrese la fecha de finalización del contrato (DD-MM-YYYY): ");
        String fechaFin = scanner.nextLine();

        System.out.print("Ingrese el estado del contrato (Activo/Inactivo): ");
        String estado = scanner.nextLine();

        // Crear el contrato
        Contrato contrato = new Contrato(idContrato, fechaInicio, fechaFin, tipoContrato, estado);

        // Crear el empleado con contrato
        Empleado empleado = new Empleado(nombre, primerApellido, segundoApellido, edad, numeroIdentificacion, fechaNacimiento, numeroTelefono, correoElectronico, contrato);
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
        try (FileWriter writer = new FileWriter(ARCHIVO_EMPLEADOS)) {
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
                empleados.add(Empleado.fromString(linea));
            }
            System.out.println("Empleados cargados desde el archivo.");
        } catch (IOException e) {
            System.out.println("No se encontró archivo previo, iniciando con lista vacía.");
        }
    }
}



                
                
              
    
