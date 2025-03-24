
package com.mycompany.proyectopoo2;

public class Contrato {
 
   long idContrato; 
   String fechaInicio;
   String fechaFin;
   Contratoenum tipoContrato; 
   String estado;

    public Contrato() {
    }

    public Contrato(long idContrato, String fechaInicio, String fechaFin, Contratoenum tipoContrato, String estado) {
        this.idContrato = idContrato;
        this.fechaInicio = fechaInicio;
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

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
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
}
