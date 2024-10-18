package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendaciones {
    public void filtar(Clasificacion clasificacion){
        if (clasificacion.getClasificacion() >= 4){
            System.out.println("Muy bien evaluado");
        } else if (clasificacion.getClasificacion() >= 2) {
            System.out.println("Esta buena");
        }else{
            System.out.println("Agregala a la lista para ver");
        }
    }
}
