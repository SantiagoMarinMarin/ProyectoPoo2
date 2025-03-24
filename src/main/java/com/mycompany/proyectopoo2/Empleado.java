/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo2;

public class Empleado {
     private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private int edad;
    private String numeroIdentificacion;
    private String fechaNacimiento;
    private String numeroTelefono;
    private String correoElectronico;
    private Contrato contrato;

    public Empleado(String nombre, String primerApellido, String segundoApellido, int edad, String numeroIdentificacion, String fechaNacimiento, String numeroTelefono, String correo, Contrato tipoContrato) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.edad = edad;
        this.numeroIdentificacion = numeroIdentificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = generarCorreoElectronico(nombre, primerApellido);
        this.contrato = contrato;
    }

    private String generarCorreoElectronico(String nombre, String primerApellido) {
        return (nombre.toLowerCase() + primerApellido.toLowerCase()) + "@empresa.co.org";
    }

    @Override
    public String toString() {
        return nombre + "," + primerApellido + "," + segundoApellido + "," + edad + "," + numeroIdentificacion + "," + fechaNacimiento + "," + numeroTelefono + "," + correoElectronico + "," + contrato;
    }

    
   public static Empleado fromString(String linea) {
    String[] datos = linea.split(",");
    String nombre = datos[0];
    String primerApellido = datos[1];
    String segundoApellido = datos[2];
    int edad = Integer.parseInt(datos[3]);
    String numeroIdentificacion = datos[4];
    String fechaNacimiento = datos[5];
    String numeroTelefono = datos[6];
    String correoElectronico = datos[7]; 
    long idContrato = Long.parseLong(datos[8]);
    String fechaInicio = datos[9];
    String fechaFin = datos[10];
    Contratoenum tipoContrato = Contratoenum.valueOf(datos[11]);
    String estado = datos[12];
    Contrato contrato = new Contrato(idContrato, fechaInicio, fechaFin, tipoContrato, estado);
    return new Empleado(nombre, primerApellido, segundoApellido, edad, numeroIdentificacion, fechaNacimiento, numeroTelefono, correoElectronico, contrato);
}

}
