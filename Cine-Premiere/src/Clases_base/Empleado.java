/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases_base;

/**
 *
 * @author leona
 */
public class Empleado extends Persona {

    private String fechaIngreso;
    private String sucursal; // Es la unidad comercial que depende legal y operativamente de la sede central
    private boolean activo;

    public Empleado(String id, String nombre, String apellido, String dni, String telefono, String email) {
        super(id, nombre, apellido, dni, telefono, email);

        this.fechaIngreso = fechaIngreso;
        this.sucursal = sucursal;
        this.activo = true;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "fechaIngreso=" + fechaIngreso + ", sucursal=" + sucursal + ", activo=" + activo + '}';
    }
}
