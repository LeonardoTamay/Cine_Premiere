/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Enumeradores.EstadosPago;
import Enumeradores.TipoPago;

/**
 *
 * @author USER
 */
public class Pago {
    private TipoPago tipoPago;
    private String montoTotalPagar;
    private EstadosPago estadoPago;

    public Pago(TipoPago tipoPago, String montoTotalPagar, EstadosPago estadoPago) {
        this.tipoPago = tipoPago;
        this.montoTotalPagar = montoTotalPagar;
        this.estadoPago = estadoPago;
    }

    public TipoPago getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getMontoTotalPagar() {
        return montoTotalPagar;
    }

    public void setMontoTotalPagar(String montoTotalPagar) {
        this.montoTotalPagar = montoTotalPagar;
    }

    public EstadosPago getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(EstadosPago estadoPago) {
        this.estadoPago = estadoPago;
    }

    @Override
    public String toString() {
        return "Pago{" + "tipoPago=" + tipoPago + ", montoTotalPagar=" + montoTotalPagar + ", estadoPago=" + estadoPago + '}';
    }
}
