
package com.mycompany.ExceptionClass;

public class CampoObligatorioException extends Exception {

    public CampoObligatorioException() {
    }
     public CampoObligatorioException(String mensaje) {
        super(mensaje);
    }
}
