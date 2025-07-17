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
public class Asiento {
    private String ubicacion;
    private EstadoAsiento estadoAsiento;

    public Asiento(String ubicacion, EstadoAsiento estadoAsiento) {
        this.ubicacion = ubicacion;
        this.estadoAsiento = estadoAsiento;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public EstadoAsiento getEstadoAsiento() {
        return estadoAsiento;
    }

    public void setEstadoAsiento(EstadoAsiento estadoAsiento) {
        this.estadoAsiento = estadoAsiento;
    }

    @Override
    public String toString() {
        return "Asiento{" + "ubicacion=" + ubicacion + ", estadoAsiento=" + estadoAsiento + '}';
    }
}
