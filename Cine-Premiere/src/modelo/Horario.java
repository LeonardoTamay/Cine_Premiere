/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USER
 */
public class Horario {
    private String fechaInicio;
    private String fechaFinal;
    private String horaInicio;
    private String horaFinal;

    public Horario(String fechaInicio, String fechaFinal, String horaInicio, String horaFinal) {
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    @Override
    public String toString() {
        return "Horario{" + "fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + ", horaInicio=" + horaInicio + ", horaFinal=" + horaFinal + '}';
    }
}
