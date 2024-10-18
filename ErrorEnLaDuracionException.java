package com.aluracursos.screenmatch.excepcion;

public class ErrorEnLaDuracionException extends RuntimeException {
    private String mensaje;



    public ErrorEnLaDuracionException(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}
