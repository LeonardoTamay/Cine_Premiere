/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author leona
 */
public class Usuario {

    private String username;
    private String password;
    private String tipoUsuario; // CLIENTE, EMPLEADO, ADMINISTRADOR
    private boolean activo;
    private String idPersona;

    public Usuario(String username, String password, String tipoUsuario, String idPersona) {
        this.username = username;
        this.password = password;
        this.tipoUsuario = tipoUsuario;
        this.idPersona = idPersona;
        this.activo = true;
    }

    // Getters y Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public boolean validarCredenciales(String username, String password) {
        return this.username.equals(username) && this.password.equals(password) && activo;
    }
}
