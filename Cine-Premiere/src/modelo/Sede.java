/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER
 */
public class Sede {
    private String codigo;
    private String ubicacion;
    private int cantidadSalas;
    private String encargado;

    public Sede(String codigo, String ubicacion, int cantidadSalas, String encargado) {
        this.codigo = codigo;
        this.ubicacion = ubicacion;
        this.cantidadSalas = cantidadSalas;
        this.encargado = encargado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCantidadSalas() {
        return cantidadSalas;
    }

    public void setCantidadSalas(int cantidadSalas) {
        this.cantidadSalas = cantidadSalas;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    @Override
    public String toString() {
        return "Sede{" + "codigo=" + codigo + ", ubicacion=" + ubicacion + ", cantidadSalas=" + cantidadSalas + ", encargado=" + encargado + '}';
    }
}
