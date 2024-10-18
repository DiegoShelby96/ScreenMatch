package com.aluracursos.Principal;

import com.aluracursos.screenmatch.modelos.Episodios;
import com.aluracursos.screenmatch.modelos.Peliculas;
import com.aluracursos.screenmatch.modelos.Series;
import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendaciones;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Peliculas miPelicula = new Peliculas("Titanic", 1996);
        miPelicula.setDuracionEnMinutos(110);
        miPelicula.setIncluidoEnElPlan(true);

//        System.out.println("Nombre: " + miPelicula.getNombre());
//        System.out.println("Fecha de lanzamiento: " + miPelicula.getFechaDeLanzamiento());
//        System.out.println("Duración " + miPelicula.getDuracionEnMinutos() + " Minutos");
//

        miPelicula.muestraFichaTecnica();
        miPelicula.evaluacion(10);
        miPelicula.evaluacion(10);
        System.out.println(miPelicula.getTotalDeEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Peliculas otraPelicula = new Peliculas("Deadpool", 2024);
        otraPelicula.setDuracionEnMinutos(130);

        Series casaDragon = new Series("La casa del Dragón", 2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodios(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendaciones filtroRecomendaciones = new FiltroRecomendaciones();
        filtroRecomendaciones.filtar(miPelicula);

        Episodios episodios = new Episodios();
        episodios.setNumero(1);
        episodios.setNombre("Chupalo");
        episodios.setSeries(casaDragon);
        episodios.setTotalVisualizaciones(50);

        filtroRecomendaciones.filtar(episodios);


        var peliculaDeDiego = new Peliculas("El señor de los anillos", 2001);
        peliculaDeDiego.setDuracionEnMinutos(180);

        ArrayList<Peliculas> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeDiego);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);

        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());
        System.out.println("La primera pelicula es: " + listaDePeliculas.get(0).getNombre());

        System.out.println(listaDePeliculas.toString());

        System.out.println("toString de la pelicula: " + listaDePeliculas.get(0).toString());







    }
}
