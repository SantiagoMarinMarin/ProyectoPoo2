
package com.mycompany.proyectopoo2;

import com.mycompany.ExceptionClass.EdadInvalidaException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

   public class ContratoIndefinido extends Empleado{
       
   public int idContrato; 
   public String tipodecontrato; 
   public double sueldo;

    private static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public ContratoIndefinido(int idContrato, String tipodecontrato, double sueldo, String PrimerNombre, String SegundoNombre, String PrimerApellido, String SegundoApellido, int edad, int numeroIdentificacion, LocalDate fechaNacimiento, long numeroTelefono, String correoElectronico) {
        super(PrimerNombre, SegundoNombre, PrimerApellido, SegundoApellido, edad, numeroIdentificacion, fechaNacimiento, numeroTelefono, correoElectronico);
        this.idContrato = idContrato;
        this.tipodecontrato = tipodecontrato;
        this.sueldo = sueldo;
    }

    public ContratoIndefinido() {
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
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
        return "ContratoIndefinido{" + "idContrato=" + idContrato + ", tipodecontrato=" + tipodecontrato + ", sueldo=" + sueldo + '}';
    }

 
}

  

    

 

