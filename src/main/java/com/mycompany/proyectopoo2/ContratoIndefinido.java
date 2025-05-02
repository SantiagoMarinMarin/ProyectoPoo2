
package com.mycompany.proyectopoo2;

import com.mycompany.ExceptionClass.EdadInvalidaException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

   public class ContratoIndefinido extends Empleado{
   private long idContrato; 
   private LocalDate fechaInicio;
   private LocalDate fechaFin;
   private String tipodecontrato; 
   private double sueldo;

   private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    // Constructor de la clase ContratoIndefinido
    public ContratoIndefinido(String nombre, String primerApellido, String segundoApellido, int edad,
                              int numeroIdentificacion, LocalDate fechaNacimiento, String numeroTelefono,
                              String correoElectronico, long idContrato, LocalDate fechaInicio, LocalDate fechaFin,
                              String tipodecontrato, double sueldo) throws EdadInvalidaException {
        // Llamada al constructor de la clase base (Empleado)
        super(nombre, primerApellido, segundoApellido, edad, numeroIdentificacion, fechaNacimiento,
              numeroTelefono, correoElectronico);
        
        // Inicializar los atributos específicos de ContratoIndefinido
        this.idContrato = idContrato;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.tipodecontrato = tipodecontrato;
        this.sueldo = sueldo;
    }

    public long getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(long idContrato) {
        this.idContrato = idContrato;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getTipodecontrato() {
        return tipodecontrato;
    }

    public void setTipodecontrato(String tipodecontrato) {
        this.tipodecontrato = tipodecontrato;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "ContratoIndefinido{" + "idContrato=" + idContrato + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", tipodecontrato=" + tipodecontrato + ", sueldo=" + sueldo + '}';
    }

 
}

  

    

 

