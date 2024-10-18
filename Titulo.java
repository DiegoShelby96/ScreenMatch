package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.excepcion.ErrorEnLaDuracionException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeEvaluciones;
    private int totalDeEvaluaciones;

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public Titulo(TituloOMDB miTituloOMDB) {
        this.nombre = miTituloOMDB.title();
        this.fechaDeLanzamiento = Integer.valueOf(miTituloOMDB.year());
        if (miTituloOMDB.runtime().contains("N/A")){
            throw new ErrorEnLaDuracionException("No se pudo convertir," +
                    "ya que tiene un valor N/A");
        }
        this.duracionEnMinutos = Integer.valueOf(miTituloOMDB.runtime().substring(0,3).replace(" ", ""));
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public int getTotalDeEvaluaciones(){
        return totalDeEvaluaciones;
    }

    public void muestraFichaTecnica(){

        System.out.println("Nombre del titulo: " + nombre);
        System.out.println("Su fecha de lanzamiento fue: " + fechaDeLanzamiento);
        System.out.println("La duración es " + getDuracionEnMinutos() + " Minutos");
    }

    public void evaluacion(double nota){
        sumaDeEvaluciones += nota;
        totalDeEvaluaciones++;

    }
    public double calculaMedia(){
        return sumaDeEvaluciones / totalDeEvaluaciones;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        return "(nombre='" + nombre +
                ", fechaDeLanzamiento=" + fechaDeLanzamiento+
                ", Duración= " + duracionEnMinutos+")";
    }
}
