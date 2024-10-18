package com.aluracursos.Principal;

import com.aluracursos.screenmatch.modelos.Peliculas;
import com.aluracursos.screenmatch.modelos.Series;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalConListas {
    public static void main(String[] args) {

        Peliculas miPelicula = new Peliculas("Titanic", 1996);
        Peliculas otraPelicula = new Peliculas("Deadpool", 2024);
        var peliculaDeDiego = new Peliculas("El señor de los anillos", 2001);
        Series casaDragon = new Series("La casa del Dragón", 2022);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        miPelicula.evaluacion(9);
        lista.add(otraPelicula);
        otraPelicula.evaluacion(6);
        lista.add(peliculaDeDiego);
        peliculaDeDiego.evaluacion(10);
        lista.add(casaDragon);

        for (Titulo item: lista) {
            System.out.println(item.getNombre());
            if (item instanceof Peliculas peliculas && peliculas.getClasificacion() > 2) {
                System.out.println(peliculas.getClasificacion());
            }
        }

        List<String> listaDeArtistas = new LinkedList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Leonardo Di Caprio");
        listaDeArtistas.add("Antonio Bandera");

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de Artistas ordenados " + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista ordenanada: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha" + lista);
        
    }
}
