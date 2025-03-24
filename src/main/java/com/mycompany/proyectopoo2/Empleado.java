
package com.mycompany.proyectopoo2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Empleado {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private int edad;
    private String numeroIdentificacion;
    private LocalDate fechaNacimiento;
    private String numeroTelefono;
    private String correoElectronico;
    private Contrato contrato;

    private static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Empleado(String nombre, String primerApellido, String segundoApellido, int edad, String numeroIdentificacion, LocalDate fechaNacimiento, String numeroTelefono, String correo, Contrato contrato) throws EdadInvalidaException {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.numeroIdentificacion = numeroIdentificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = generarCorreoElectronico(nombre, primerApellido);
        this.contrato = contrato;

        int edadCalculada = calcularEdad(fechaNacimiento);
        if (edadCalculada != edad) {
            throw new EdadInvalidaException("La edad ingresada no coincide con la fecha de nacimiento. Edad calculada: " + edadCalculada);
        }
        this.edad = edad;
    }

    private String generarCorreoElectronico(String nombre, String primerApellido) {
        return (nombre.toLowerCase() + "." + primerApellido.toLowerCase()) + "@empresa.co.org";
    }

    private int calcularEdad(LocalDate fechaNacimiento) {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return nombre + "," + primerApellido + "," + segundoApellido + "," + edad + "," + numeroIdentificacion + "," + fechaNacimiento.format(FORMATO_FECHA) + "," + numeroTelefono + "," + correoElectronico + "," + contrato;
    }

    public static Empleado fromString(String linea) throws EdadInvalidaException {
        String[] datos = linea.split(",");
        String nombre = datos[0];
        String primerApellido = datos[1];
        String segundoApellido = datos[2];
        int edad = Integer.parseInt(datos[3]);
        String numeroIdentificacion = datos[4];
        LocalDate fechaNacimiento = LocalDate.parse(datos[5], FORMATO_FECHA);
        String numeroTelefono = datos[6];
        String correoElectronico = datos[7];
        long idContrato = Long.parseLong(datos[8]);
        LocalDate fechaInicio = LocalDate.parse(datos[9], FORMATO_FECHA);
        LocalDate fechaFin = LocalDate.parse(datos[10], FORMATO_FECHA);
        Contratoenum tipoContrato = Contratoenum.valueOf(datos[11]);
        String estado = datos[12];
        Contrato contrato = new Contrato(idContrato, fechaInicio, fechaFin, tipoContrato, estado);

        return new Empleado(nombre, primerApellido, segundoApellido, edad, numeroIdentificacion, fechaNacimiento, numeroTelefono, correoElectronico, contrato);
    }
}

