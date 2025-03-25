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

    public static void main(String[] args) throws CampoObligatorioException {
        cargarEmpleadosDesdeArchivo();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nMenu Principal:");
                System.out.println("1) Generar Contrato");
                System.out.println("2) Mostrar Empleados");
                System.out.println("3) Despedir Empleados");
                System.out.println("0) Salir");
                System.out.print("Seleccione una opcion: ");
                
                if (!scanner.hasNextInt()) {
                    System.out.println("Error: Debe ingresar un numero.");
                    scanner.next();
                    continue;
                }
                int opcion = scanner.nextInt();
                scanner.nextLine();
            
                switch (opcion) {
                    case 1:
                        try {
                            agregarEmpleado();
                        } catch (EdadInvalidaException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case 2:
                        mostrarEmpleados();
                        break;
                    case 3:
                      
                         terminarContrato();
                        break;
                    case 0:
                        guardarEmpleadosEnArchivo();
                        System.out.println("Saliendo del sistema...");
                        return;
                    default:
                        System.out.println("Opcion no valida, intente de nuevo.");
                }
            }
        }
    }
        
   private static void agregarEmpleado() throws EdadInvalidaException, CampoObligatorioException {  
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese SOLO EL NOMBRE del empleado: ");
    String nombre = scanner.nextLine().trim();
    if (nombre.isEmpty()) throw new CampoObligatorioException("El nombre es obligatorio.");

    System.out.print("Ingrese el primer apellido del empleado: ");
    String primerApellido = scanner.nextLine().trim();
    if (primerApellido.isEmpty()) throw new CampoObligatorioException("El primer apellido es obligatorio.");

    System.out.print("Ingrese el segundo apellido del empleado: ");
    String segundoApellido = scanner.nextLine().trim();
    if (segundoApellido.isEmpty()) throw new CampoObligatorioException("El segundo apellido es obligatorio.");

    System.out.print("Ingrese la fecha de nacimiento (YYYY-MM-DD): ");
    String fechaStr = scanner.nextLine().trim();
    if (fechaStr.isEmpty()) throw new CampoObligatorioException("La fecha de nacimiento es obligatoria.");
    LocalDate fechaNacimiento = LocalDate.parse(fechaStr, FORMATO_FECHA);

    int edadCalculada = Period.between(fechaNacimiento, LocalDate.now()).getYears();
    System.out.println("Edad calculada: " + edadCalculada);

    System.out.print("Ingrese la edad del empleado: ");
    if (!scanner.hasNextInt()) throw new CampoObligatorioException("Debe ingresar una edad valida.");
    int edadIngresada = scanner.nextInt();
    scanner.nextLine();
    
    if (edadIngresada != edadCalculada) {
        throw new EdadInvalidaException("La edad ingresada no coincide con la calculada.");
    }

    System.out.print("Ingrese el numero de identificacion: ");
    String numeroIdentificacion = scanner.nextLine().trim();
    if (numeroIdentificacion.isEmpty()) throw new CampoObligatorioException("El numero de identificacion es obligatorio.");

    // ✅ Verificar si el numero de identificacion ya existe
    for (Empleado e : empleados) {
        if (e.getNumeroIdentificacion().equals(numeroIdentificacion)) {
            throw new CampoObligatorioException("Error: Ya existe un empleado con esta identificacion.");
        }
    }

    System.out.print("Ingrese el numero de telefono: ");
    String numeroTelefono = scanner.nextLine().trim();
    if (numeroTelefono.isEmpty()) throw new CampoObligatorioException("El numero de telefono es obligatorio.");

    String correoElectronico = nombre.toLowerCase() + "." + primerApellido.toLowerCase() + "@empresa.co.org";
    
    // Seleccion del tipo de contrato con validacion
    Contratoenum tipoContrato = null;
    while (tipoContrato == null) {
        System.out.println("Seleccione el tipo de contrato:");
        System.out.println("1) Prestacion de Servicios");
        System.out.println("2) Tiempo Indefinido");
        System.out.print("Opcion: ");
        if (scanner.hasNextInt()) {
            int tipo = scanner.nextInt();
            scanner.nextLine();
            if (tipo == 1) {
                tipoContrato = Contratoenum.PRESTACION_SERVICIOS;
            } else if (tipo == 2) {
                tipoContrato = Contratoenum.TIEMPO_INDEFINIDO;
            } else {
                System.out.println("Opcion no valida. Seleccione 1 o 2.");
            }
        } else {
            System.out.println("Debe ingresar un numero valido.");
            scanner.next();
        }
    }

    System.out.print("Ingrese el ID del contrato: ");
    if (!scanner.hasNextLong()) throw new CampoObligatorioException("Debe ingresar un ID de contrato valido.");
    long idContrato = scanner.nextLong();
    scanner.nextLine();

    for (Empleado e : empleados) {
        if (e.getContrato().getIdContrato() == idContrato) {
            throw new CampoObligatorioException("Error: Ya existe un contrato con este ID.");
        }
    }

    System.out.print("Ingrese la fecha de inicio del contrato (YYYY-MM-DD): ");
    String fechaInicioStr = scanner.nextLine().trim();
    if (fechaInicioStr.isEmpty()) throw new CampoObligatorioException("La fecha de inicio es obligatoria.");
    LocalDate fechaInicio = LocalDate.parse(fechaInicioStr, FORMATO_FECHA);

    LocalDate fechaFin = null;
    if (tipoContrato == Contratoenum.PRESTACION_SERVICIOS) {
        System.out.print("Ingrese la fecha de finalizacion del contrato (YYYY-MM-DD): ");
        String fechaFinStr = scanner.nextLine().trim();
        if (fechaFinStr.isEmpty()) throw new CampoObligatorioException("La fecha de finalizacion es obligatoria para contratos de prestacion de servicios.");
        fechaFin = LocalDate.parse(fechaFinStr, FORMATO_FECHA);

        if (fechaFin.isBefore(fechaInicio)) {
            throw new CampoObligatorioException("La fecha de finalizacion no puede ser antes de la fecha de inicio.");
        }
    } else {
        System.out.println("Para contratos a termino indefinido, la fecha de finalizacion sera 'N/A'.");
    }

    System.out.print("Ingrese el estado del contrato (Activo/Inactivo): ");
    String estado = scanner.nextLine().trim();
    if (estado.isEmpty()) throw new CampoObligatorioException("El estado del contrato es obligatorio.");

    System.out.print("Ingrese el sueldo mensual del empleado: ");
    double sueldo = scanner.nextDouble();
    scanner.nextLine();
    
    // Creacion del contrato
    Contrato contrato = new Contrato(idContrato, fechaInicio, (tipoContrato == Contratoenum.TIEMPO_INDEFINIDO) ? null : fechaFin, tipoContrato, estado, sueldo);
    
    // Creacion del empleado
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
                Empleado empleado = Empleado.fromString(linea);
                if (empleado != null) {
                    empleados.add(empleado);
                }
            } catch (Exception e) {
                System.out.println("Error al procesar linea: " + linea);
            }
        }
        System.out.println("Empleados cargados desde el archivo.");
    } catch (IOException e) {
        System.out.println("No se encontro archivo previo, iniciando con lista vacia.");
    }
}
            
    
    private static void eliminarEmpleadosInactivos() {
    empleados.removeIf(e -> e.getContrato().getEstado().equalsIgnoreCase("Inactivo"));
    guardarEmpleadosEnArchivo();
    System.out.println("Se eliminaron empleados con contratos inactivos.");
}


    
private static void terminarContrato() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese la identificacion del empleado: ");
    String id = scanner.nextLine();

    Empleado empleado = null;
    for (Empleado e : empleados) {
        if (e.getNumeroIdentificacion().equals(id)) {
            empleado = e;
            break;
        }
    }

    if (empleado == null) {
        System.out.println("No se encontro el empelado. Prueba Otra vez");
        return;
    }

    System.out.println("Seleccione el motivo de terminacion:");
    System.out.println("1. Renuncia voluntaria");
    System.out.println("2. Despido con justa causa");
    System.out.println("3. Despido sin justa causa");
    System.out.print("Opcion: ");
    
    int opcion = scanner.nextInt();
    if (opcion < 1 || opcion > 3) {
        System.out.println("Opcion invalida.");
        return;
    }

    double liquidacion = Liquidacion.calcularLiquidacion(empleado, opcion);
    System.out.println("El total de la liquidacion es de: $" + liquidacion);

    empleado.getContrato().setEstado("Inactivo");
    guardarEmpleadosEnArchivo();
    System.out.println("Contrato finalizado correctamente.");

    eliminarEmpleadosInactivos();
}

}



                
                
              
    
