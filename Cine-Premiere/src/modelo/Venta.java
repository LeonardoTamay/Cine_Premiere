/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER
 */
public class Venta {
    private String tipoVenta; //presencial o virtual
    private int montoTotal;

    public Venta(String tipoVenta, int montoTotal) {
        this.tipoVenta = tipoVenta;
        this.montoTotal = montoTotal;
    }

    public String getTipoVenta() {
        return tipoVenta;
    }

    public void setTipoVenta(String tipoVenta) {
        this.tipoVenta = tipoVenta;
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    @Override
    public String toString() {
        return "Venta{" + "tipoVenta=" + tipoVenta + ", montoTotal=" + montoTotal + '}';
    }
}