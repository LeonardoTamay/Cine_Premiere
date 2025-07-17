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
public class Cliente extends Persona{
    private String correoElectronico;

    public Cliente(String correoElectronico, String nombre, String apellido, String fechaNacimiento, TipoDocumento tipoDocumento, int numeroDocumento, String username, String password, TipoUsuario tipoUsuario, boolean activo) {
        super(nombre, apellido, fechaNacimiento, tipoDocumento, numeroDocumento, username, password, tipoUsuario, activo);
        this.correoElectronico = correoElectronico;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Cliente{" + "correoElectronico=" + correoElectronico + '}';
    }   
}
