/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Enumeradores.TipoDocumento;
import Enumeradores.TipoUsuario;

/**
 *
 * @author leona
 */
public class Empleado extends Persona {
    
    private String codigoTrabajador;
    private String fechaIngreso;
    private String salario;
    private String sede; // Es la unidad comercial que depende legal y operativamente de la sede central
    private boolean estado;
    private String direccion;

    public Empleado(String codigoTrabajador, String fechaIngreso, String salario, String sede, boolean estado, String direccion, String nombre, String apellido, String fechaNacimiento, TipoDocumento tipoDocumento, int numeroDocumento, String username, String password, TipoUsuario tipoUsuario, boolean activo) {
        super(nombre, apellido, fechaNacimiento, tipoDocumento, numeroDocumento, username, password, tipoUsuario, activo);
        this.codigoTrabajador = codigoTrabajador;
        this.fechaIngreso = fechaIngreso;
        this.salario = salario;
        this.sede = sede;
        this.estado = estado;
        this.direccion = direccion;
    }

    public String getCodigoTrabajador() {
        return codigoTrabajador;
    }

    public void setCodigoTrabajador(String codigoTrabajador) {
        this.codigoTrabajador = codigoTrabajador;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Empleado{" + "codigoTrabajador=" + codigoTrabajador + ", fechaIngreso=" + fechaIngreso + ", salario=" + salario + ", sede=" + sede + ", estado=" + estado + ", direccion=" + direccion + '}';
    }
}
