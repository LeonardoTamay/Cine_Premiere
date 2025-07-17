/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Pelicula;

/**
 *
 * @author USER
 */
public class ArregloPelicula {
    Pelicula[] peliculas;
    Pelicula peli = new Pelicula();
    int tamaño;
    
    public ArregloPelicula(int size) {
        peliculas = new Pelicula[size];
    }
    
    //Añadir Peliculas
    public void addPeliculas(String nombre, String fecEstreno, String duracion, String descripcion) {
        
        for (int i = 0; i < peliculas.length; i++) {
            peli.setNombrePelicula(nombre);
            peli.setFechaEstreno(fecEstreno);
            peli.setDuracion(duracion);
            peli.setDescripcion(descripcion);
            
            peliculas[i] = peli;
        }
    }
    
    
    
    public void showPelicula() {
        for (int i = 0; i < peliculas.length; i++) {
            System.out.println(peliculas[i]);
        }
    }
}
