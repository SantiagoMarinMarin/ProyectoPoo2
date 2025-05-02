
package com.mycompany.proyectopoo2;

import com.mycompany.ExceptionClass.EdadInvalidaException;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Empleado {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private int edad;
    private int numeroIdentificacion;
    private LocalDate fechaNacimiento;
    private String numeroTelefono;
    private String correoElectronico;

    private static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Empleado(String nombre, String primerApellido, String segundoApellido, int edad, int numeroIdentificacion, LocalDate fechaNacimiento, String numeroTelefono, String correo) throws EdadInvalidaException {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.numeroIdentificacion = numeroIdentificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = generarCorreoElectronico(nombre, primerApellido);

        int edadCalculada = calcularEdad(fechaNacimiento);
        if (edadCalculada != edad) {
            throw new EdadInvalidaException("La edad ingresada no coincide con la fecha de nacimiento. Edad calculada: " + edadCalculada);
        }
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
    if (!numeroTelefono.matches("\\d{3}-\\d{3}-\\d{4}")) {
        throw new IllegalArgumentException("El número de teléfono debe tener el formato XXX-XXX-XXXX");
    }
    this.numeroTelefono = numeroTelefono;
}

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    private String generarCorreoElectronico(String nombre, String primerApellido) {
        return (nombre.toLowerCase() + "." + primerApellido.toLowerCase()) + "@empresa.co.org";
    }

    private int calcularEdad(LocalDate fechaNacimiento) {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }
    
    @Override
    public String toString() {
    return "Nombre: " + nombre + 
           ", Apellido 1: " + primerApellido + 
           ", Apellido 2: " + segundoApellido + 
           ", Edad: " + edad + 
           ", ID: " + numeroIdentificacion + 
           ", Fecha de nacimiento: " + fechaNacimiento.format(FORMATO_FECHA) + 
           ", Numero de telefono: " + numeroTelefono + 
           ", Correo: " + correoElectronico;
    }
}
