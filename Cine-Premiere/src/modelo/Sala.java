/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Enumeradores.EstadoSala;
import modelo.Pelicula;

/**
 *
 * @author USER
 */
public class Sala {

    private String codigoSala;
    private String nombreSala;
    private Pelicula pelicula;
    private int cantidadAsientos;
    private EstadoSala estadoSala;

    public Sala(String codSala, String nameSala,Pelicula pelicula, int cantidadAsientos, EstadoSala estadoSala) {
        this.codigoSala = codSala;
        this.nombreSala = nameSala;
        this.pelicula = pelicula;
        this.cantidadAsientos = cantidadAsientos;
        this.estadoSala = estadoSala;
    }

    public String getCodigoSala() {
        return codigoSala;
    }

    public void setCodigoSala(String codigoSala) {
        this.codigoSala = codigoSala;
    }
    
    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public EstadoSala getEstadoSala() {
        return estadoSala;
    }

    public void setEstadoSala(EstadoSala estadoSala) {
        this.estadoSala = estadoSala;
    }

    @Override
    public String toString() {
        return "Sala{" + "pelicula=" + pelicula + ", cantidadAsientos=" + cantidadAsientos + ", estadoSala=" + estadoSala + '}';
    }
}

    
