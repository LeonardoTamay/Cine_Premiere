/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Enumeradores.TipoUsuario;

/**
 *
 * @author leona
 */
public class Administrador extends Usuario{

    public Administrador(String username, String password, TipoUsuario tipoUsuario) {
        super(username, password, tipoUsuario);
    }
}
