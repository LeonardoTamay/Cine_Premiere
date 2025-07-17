/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Enumeradores.EstadoAsiento;

/**
 *
 * @author USER
 */
public class Sala {
    private String pelicula;
    private int cantidadAsientos;
    private EstadoAsiento estadoSala;

    public Sala(String pelicula, int cantidadAsientos, EstadoAsiento estadoSala) {
        this.pelicula = pelicula;
        this.cantidadAsientos = cantidadAsientos;
        this.estadoSala = estadoSala;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public EstadoAsiento getEstadoSala() {
        return estadoSala;
    }

    public void setEstadoSala(EstadoAsiento estadoAsiento) {
        this.estadoSala = estadoAsiento;
    }

    @Override
    public String toString() {
        return "Sala{" + "pelicula=" + pelicula + ", cantidadAsientos=" + cantidadAsientos + ", estadoSala=" + estadoSala + '}';
    }
}
