/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER
 */
public class Pelicula {
    private String nombrePelicula;
    private String fechaEstreno;
    private String duracion;
    private String descripcion;
    private String genero;

    public Pelicula(String nombrePelicula, String fechaEstreno, String duracion, String descripcion, String genero) {
        this.nombrePelicula = nombrePelicula;
        this.fechaEstreno = fechaEstreno;
        this.duracion = duracion;
        this.descripcion = descripcion;
        this.genero = genero;
    }

    public Pelicula() {
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(String fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombrePelicula=" + nombrePelicula + ", fechaEstreno=" + fechaEstreno + ", duracion=" + duracion + ", descripcion=" + descripcion + ", genero=" + genero + '}';
    }
}
