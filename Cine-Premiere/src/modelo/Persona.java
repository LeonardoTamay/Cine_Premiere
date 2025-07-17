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
public abstract class Persona extends Usuario{

    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private TipoDocumento tipoDocumento;
    private int numeroDocumento;

    public Persona(String nombre, String apellido, String fechaNacimiento, TipoDocumento tipoDocumento, int numeroDocumento, String username, String password, TipoUsuario tipoUsuario, boolean activo) {
        super(username, password, tipoUsuario);
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + ", tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento + '}';
    }
}


