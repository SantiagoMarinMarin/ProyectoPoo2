
package com.mycompany.proyectopoo2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Contrato {
   private long idContrato; 
   private LocalDate fechaInicio;
   private LocalDate fechaFin;
   private Contratoenum tipoContrato; 
   private String estado;

   private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Contrato(long idContrato, LocalDate fechaInicio, LocalDate fechaFin, Contratoenum tipoContrato, String estado) {
    this.idContrato = idContrato;
    this.fechaInicio = fechaInicio;  // Antes: this.fechaInicio = fechaInicio (que no existe en parámetros)
    this.fechaFin = fechaFin;
    this.tipoContrato = tipoContrato;
    this.estado = estado;
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

    public Contratoenum getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(Contratoenum tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

     @Override
    public String toString() {
        String inicio = (fechaInicio != null) ? fechaInicio.format(formatter) : "N/A";
        String fin = (fechaFin != null) ? fechaFin.format(formatter) : "N/A";

        return idContrato + "," + inicio + "," + fin + "," + tipoContrato + "," + estado;
    }
}
