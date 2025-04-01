package com.mycompany.proyectopoo2;

import com.mycompany.proyectopoo2.Contrato;
import com.mycompany.proyectopoo2.Contratoenum;
import com.mycompany.proyectopoo2.Empleado;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ProyectoPoo2 {
    static List<Empleado> empleados = new ArrayList<>();
    private static final String ARCHIVO_EMPLEADOS = "C:\\empleados.txt"; 
    private static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static void main(String[] args) throws CampoObligatorioException {
        cargarYMostrarEmpleados();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nMenu Principal:");
                System.out.println("1) Generar Contrato");
                System.out.println("2) Cargar y Mostrar empleados");
                System.out.println("3) Despedir Empleados");
                System.out.println("4) Consultar Mensualidad");
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
                    case 1 -> {
                        try {
                            agregarEmpleado();
                        } catch (EdadInvalidaException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    case 2 -> cargarYMostrarEmpleados();
                    case 3 -> terminarContrato();
                    case 4 -> consultarMensualidad();
                    case 0 -> {
                        System.out.println("Saliendo del sistema...");
                        return;
                    }
                    default -> System.out.println("Opcion no valida, intente de nuevo.");
                }
            }
        }
    }

    
    
    
    
   private static void agregarEmpleado() throws CampoObligatorioException, EdadInvalidaException {
    Scanner scanner = new Scanner(System.in);
    DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("yyyy-MM-dd");

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

    System.out.print("Ingrese la edad del empleado: ");
    if (!scanner.hasNextInt()) throw new CampoObligatorioException("Debe ingresar una edad válida.");
    int edadIngresada = scanner.nextInt();
    scanner.nextLine();

    if (edadIngresada != edadCalculada) {
        throw new EdadInvalidaException("La edad ingresada no coincide con la calculada.");
    }

    System.out.print("Ingrese el número de identificación: ");
    int numeroIdentificacion = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Ingrese el número de teléfono del empleado (XXX-XXX-XXXX): ");
    String numeroTelefono = scanner.nextLine().trim();
    if (!numeroTelefono.matches("\\d{3}-\\d{3}-\\d{4}")) 
        throw new IllegalArgumentException("Error: El número de teléfono debe tener el formato XXX-XXX-XXXX");

    String correoElectronico = nombre.toLowerCase() + "." + primerApellido.toLowerCase() + "@empresa.co.org";

    Contratoenum tipoContrato = null;
    while (tipoContrato == null) {
        System.out.println("Seleccione el tipo de contrato:");
        System.out.println("1) Prestación de Servicios");
        System.out.println("2) Tiempo Indefinido");
        System.out.print("Opción: ");
        if (scanner.hasNextInt()) {
            int tipo = scanner.nextInt();
            scanner.nextLine();
            switch (tipo) {
                case 1 -> tipoContrato = Contratoenum.PRESTACION_SERVICIOS;
                case 2 -> tipoContrato = Contratoenum.TIEMPO_INDEFINIDO;
                default -> System.out.println("Opción no válida. Seleccione 1 o 2.");
            }
        } else {
            System.out.println("Debe ingresar un número válido.");
            scanner.next();
        }
    }

    System.out.print("Ingrese el ID del contrato: ");
    long idContrato = scanner.nextLong();
    scanner.nextLine();
    
    System.out.print("Ingrese la fecha de inicio del contrato (YYYY-MM-DD): ");
    String fechaInicioStr = scanner.nextLine().trim();
    LocalDate fechaInicio = LocalDate.parse(fechaInicioStr, FORMATO_FECHA);

    LocalDate fechaFin = null;
    String fechaFinStr = "N/A";
    if (tipoContrato == Contratoenum.PRESTACION_SERVICIOS) {
        System.out.print("Ingrese la fecha de finalización del contrato (YYYY-MM-DD): ");
        fechaFinStr = scanner.nextLine().trim();
        if (fechaFinStr.isEmpty()) throw new CampoObligatorioException("La fecha de finalización es obligatoria para contratos de prestación de servicios.");
        fechaFin = LocalDate.parse(fechaFinStr, FORMATO_FECHA);
        if (fechaFin.isBefore(fechaInicio)) throw new CampoObligatorioException("La fecha de finalización no puede ser antes de la fecha de inicio.");
    }

    System.out.print("Ingrese el estado del contrato (Activo/Inactivo): ");
    String estado = scanner.nextLine().trim();
    if (estado.isEmpty()) throw new CampoObligatorioException("El estado del contrato es obligatorio.");

    System.out.print("Ingrese el sueldo mensual del empleado: ");
    double sueldo = scanner.nextDouble();
    scanner.nextLine();

    String empleadoData = String.format(
        "%s|%s|%s|%d|%d|%s|%s|%s|%d|%s|%s|%s|%.2f",
        nombre, primerApellido, segundoApellido, edadIngresada, numeroIdentificacion,
        fechaNacimiento, numeroTelefono, correoElectronico, idContrato,
        fechaInicio, fechaFinStr, estado, sueldo
    );

    try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\empleados.txt", true))) {
        writer.write(empleadoData);
        writer.newLine();
        System.out.println("Empleado agregado exitosamente y guardado en el archivo C:\\empleados.txt");
    } catch (IOException e) {
        System.out.println("Error al guardar el empleado en el archivo: " + e.getMessage());
    }
}

 private static void cargarYMostrarEmpleados() {
        empleados.clear(); // Limpia la lista antes de cargar nuevos datos
        File archivo = new File(ARCHIVO_EMPLEADOS);

        if (!archivo.exists()) {
            System.out.println("No se encontró el archivo de empleados en la ruta: " + ARCHIVO_EMPLEADOS);
            System.out.println("Iniciando con lista vacía.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                try {
                    Empleado empleado = procesarLineaEmpleado(linea.trim());
                    if (empleado != null) {
                        empleados.add(empleado);
                    }
                } catch (Exception e) {
                    System.out.println("Error al procesar la línea: " + linea);
                    System.out.println("Detalle del error: " + e.getMessage());
                }
            }

            if (empleados.isEmpty()) {
                System.out.println("\nNo hay empleados registrados en el archivo.");
            } else {
                System.out.println("\nEmpleados cargados correctamente. Mostrando lista:");
                mostrarEmpleados(); // Mostrar empleados cargados
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    private static Empleado procesarLineaEmpleado(String linea) {
        String[] datos = linea.split("\\|");

        try {
            // Extraer datos de forma segura con valores predeterminados
            String nombre = (datos.length > 0) ? datos[0].trim() : "N/A";
            String primerApellido = (datos.length > 1) ? datos[1].trim() : "N/A";
            String segundoApellido = (datos.length > 2) ? datos[2].trim() : "N/A";
            int edad = (datos.length > 3) ? Integer.parseInt(datos[3].trim()) : 0;
            int numeroIdentificacion = (datos.length > 4) ? Integer.parseInt(datos[4].trim()) : 0;
            LocalDate fechaNacimiento = (datos.length > 5 && !datos[5].trim().equals("N/A"))
                    ? LocalDate.parse(datos[5].trim(), FORMATO_FECHA)
                    : null;
            String numeroTelefono = (datos.length > 6) ? datos[6].trim() : "N/A";
            String correoElectronico = (datos.length > 7) ? datos[7].trim() : "N/A";
            long idContrato = (datos.length > 8) ? Long.parseLong(datos[8].trim()) : 0;
            LocalDate fechaInicio = (datos.length > 9 && !datos[9].trim().equals("N/A"))
                    ? LocalDate.parse(datos[9].trim(), FORMATO_FECHA)
                    : null;
            LocalDate fechaFin = (datos.length > 10 && !datos[10].trim().equals("N/A"))
                    ? LocalDate.parse(datos[10].trim(), FORMATO_FECHA)
                    : null;
            String estado = (datos.length > 11) ? datos[11].trim() : "N/A";

            // Manejar el formato del sueldo (reemplazar coma por punto)
            double sueldo = 0.0;
            if (datos.length > 12) {
                String sueldoStr = datos[12].trim().replace(",", ".");
                sueldo = Double.parseDouble(sueldoStr); // Convertir a número
            }

            Contrato contrato = new Contrato(idContrato, fechaInicio, fechaFin, Contratoenum.TIEMPO_INDEFINIDO, estado, sueldo);

            // Crear y devolver el empleado con los datos disponibles
            return new Empleado(nombre, primerApellido, segundoApellido, edad, numeroIdentificacion, fechaNacimiento, numeroTelefono, correoElectronico, contrato);
        } catch (Exception e) {
            System.out.println("Error al procesar parcialmente la línea: " + linea);
            System.out.println("Detalle del error: " + e.getMessage());
            return null; // Devuelve null si no puede procesar los datos
        }
    }

    private static void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados para mostrar.");
            return;
        }

        System.out.println("Lista de Empleados:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado.toString());
        }
    }


   private static void eliminarEmpleadosInactivos() {
    empleados.removeIf(e -> e.getContrato().getEstado().equalsIgnoreCase("Inactivo"));

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_EMPLEADOS))) {
        for (Empleado emp : empleados) {
            // Verifica que las fechas no sean nulas, si lo son, guarda "N/A"
            String fechaNacimiento = (emp.getFechaNacimiento() != null) ? emp.getFechaNacimiento().format(FORMATO_FECHA) : "N/A";
            String fechaInicio = (emp.getContrato().getFechaInicio() != null) ? emp.getContrato().getFechaInicio().format(FORMATO_FECHA) : "N/A";
            String fechaFin = (emp.getContrato().getFechaFin() != null) ? emp.getContrato().getFechaFin().format(FORMATO_FECHA) : "N/A";

            // Generar la línea en el formato correcto
            String linea = String.join("|",
                emp.getNombre(), emp.getPrimerApellido(), emp.getSegundoApellido(),
                String.valueOf(emp.getEdad()), String.valueOf(emp.getNumeroIdentificacion()),
                fechaNacimiento, emp.getNumeroTelefono(), emp.getCorreoElectronico(),
                String.valueOf(emp.getContrato().getIdContrato()), fechaInicio, fechaFin,
                emp.getContrato().getEstado(), String.valueOf(emp.getContrato().getSueldo())
            );

            writer.write(linea + "\n"); // Escribir la línea con formato correcto
        }
    } catch (IOException e) {
        System.out.println("Error al actualizar el archivo tras eliminar empleados: " + e.getMessage());
    }

    System.out.println("Se eliminaron empleados con contratos inactivos y el archivo se ha actualizado.");
}


  
    private static void terminarContrato() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese la identificacion del empleado: ");
    int id = scanner.nextInt();

    Empleado empleado = null;
    for (Empleado e : empleados) {
        if (id == e.getNumeroIdentificacion()) {
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
    System.out.println("Contrato finalizado correctamente.");

    eliminarEmpleadosInactivos();
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






                
                
              
    
