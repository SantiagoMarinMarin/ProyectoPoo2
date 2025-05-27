
package com.mycompany.proyectopoo2;

import com.mycompany.ExceptionClass.EdadInvalidaException;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Empleado {
    public String PrimerNombre;
    public String SegundoNombre;
    public String PrimerApellido;
    public String SegundoApellido;
    public int edad;
    public int numeroIdentificacion;
    public LocalDate fechaNacimiento;
    public long numeroTelefono;
    public String correoElectronico;
    public int idContrato; 
    public String tipodecontrato; 
    public double sueldo;
    public LocalDate fechaInicioContrato;
    public LocalDate fechaFinContrato;

    private static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Empleado(String PrimerNombre, String SegundoNombre, String PrimerApellido, String SegundoApellido, int edad, int numeroIdentificacion, LocalDate fechaNacimiento, long numeroTelefono, String correoElectronico, int idContrato, String tipodecontrato, double sueldo, LocalDate fechaInicioContrato, LocalDate fechaFinContrato) {
        this.PrimerNombre = PrimerNombre;
        this.SegundoNombre = SegundoNombre;
        this.PrimerApellido = PrimerApellido;
        this.SegundoApellido = SegundoApellido;
        this.edad = edad;
        this.numeroIdentificacion = numeroIdentificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = correoElectronico;
        this.idContrato = idContrato;
        this.tipodecontrato = tipodecontrato;
        this.sueldo = sueldo;
        this.fechaInicioContrato = fechaInicioContrato;
        this.fechaFinContrato = fechaFinContrato;
    }

    public Empleado() {
    }
    
    public String getCedula() {
    return String.valueOf(this.numeroIdentificacion);
}

    public String getPrimerNombre() {
        return PrimerNombre;
    }

    public void setPrimerNombre(String PrimerNombre) {
        this.PrimerNombre = PrimerNombre;
    }

    public String getSegundoNombre() {
        return SegundoNombre;
    }

    public void setSegundoNombre(String SegundoNombre) {
        this.SegundoNombre = SegundoNombre;
    }

    public String getPrimerApellido() {
        return PrimerApellido;
    }

    public void setPrimerApellido(String PrimerApellido) {
        this.PrimerApellido = PrimerApellido;
    }

    public String getSegundoApellido() {
        return SegundoApellido;
    }

    public void setSegundoApellido(String SegundoApellido) {
        this.SegundoApellido = SegundoApellido;
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

    public long getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(long numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
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

    public LocalDate getFechaInicioContrato() {
        return fechaInicioContrato;
    }

    public void setFechaInicioContrato(LocalDate fechaInicioContrato) {
        this.fechaInicioContrato = fechaInicioContrato;
    }

    public LocalDate getFechaFinContrato() {
        return fechaFinContrato;
    }

    public void setFechaFinContrato(LocalDate fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }

    @Override
    public String toString() {
        return "Empleado{" + "PrimerNombre=" + PrimerNombre + ", SegundoNombre=" + SegundoNombre + ", PrimerApellido=" + PrimerApellido + ", SegundoApellido=" + SegundoApellido + ", edad=" + edad + ", numeroIdentificacion=" + numeroIdentificacion + ", fechaNacimiento=" + fechaNacimiento + ", numeroTelefono=" + numeroTelefono + ", correoElectronico=" + correoElectronico + ", idContrato=" + idContrato + ", tipodecontrato=" + tipodecontrato + ", sueldo=" + sueldo + ", fechaInicioContrato=" + fechaInicioContrato + ", fechaFinContrato=" + fechaFinContrato + '}';
    }

    

}
