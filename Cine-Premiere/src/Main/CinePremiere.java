/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import controlador.ArregloPelicula;
import modelo.Pelicula;
import util.estructuras.ListaEnlazada;
import vista.Inicio;

/**
 *
 * @author USER
 */
public class CinePremiere {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Inicio inicio = new  Inicio();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);*/
        Pelicula x = new Pelicula("mario bros", "13122005", "180min", "mayores de 5 años", "dibujos");
        Pelicula v = new Pelicula("bros", "13122005", "180min", "mayores de 5 años", "dibujos");
        Pelicula z = new Pelicula("luigi", "13122005", "180min", "mayores de 5 años", "dibujos");
       ListaEnlazada<Pelicula> y = new ListaEnlazada<>();
       y.addLista(x);
       y.addLista(v);
       y.addLista(z);
       
       y.showLista();
    }
    
}
