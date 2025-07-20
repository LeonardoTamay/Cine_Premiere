package modelo;

import Enumeradores.TipoPago;

/**
 *
 * @author USER
 */
public class Ticket {
    private String fechaEmision;
    private String horaEmision;
    private int numeroSala;
    private String nombrePelicula;
    private String nombreCliente;
    private int cantidadTickets;
    private int cantidadEntradasNiños;
    private int cantidadEntradasAdultos;
    private int cantidadEntradasMayores60;
    private String[] ubicacionHacientos;
    private String precioTotal;
    private TipoPago tipoPago;

    public Ticket(String fechaEmision, String horaEmision, int numeroSala, String nombrePelicula, String nombreCliente, int cantidadTickets, int cantidadEntradasNiños, int cantidadEntradasAdultos, int cantidadEntradasMayores60, String[] ubicacionHacientos, String precioTotal, TipoPago tipoPago) {
        this.fechaEmision = fechaEmision;
        this.horaEmision = horaEmision;
        this.numeroSala = numeroSala;
        this.nombrePelicula = nombrePelicula;
        this.nombreCliente = nombreCliente;
        this.cantidadTickets = cantidadTickets;
        this.cantidadEntradasNiños = cantidadEntradasNiños;
        this.cantidadEntradasAdultos = cantidadEntradasAdultos;
        this.cantidadEntradasMayores60 = cantidadEntradasMayores60;
        this.ubicacionHacientos = ubicacionHacientos;
        this.precioTotal = precioTotal;
        this.tipoPago = tipoPago;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getHoraEmision() {
        return horaEmision;
    }

    public void setHoraEmision(String horaEmision) {
        this.horaEmision = horaEmision;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getCantidadTickets() {
        return cantidadTickets;
    }

    public void setCantidadTickets(int cantidadTickets) {
        this.cantidadTickets = cantidadTickets;
    }

    public int getCantidadEntradasNiños() {
        return cantidadEntradasNiños;
    }

    public void setCantidadEntradasNiños(int cantidadEntradasNiños) {
        this.cantidadEntradasNiños = cantidadEntradasNiños;
    }

    public int getCantidadEntradasAdultos() {
        return cantidadEntradasAdultos;
    }

    public void setCantidadEntradasAdultos(int cantidadEntradasAdultos) {
        this.cantidadEntradasAdultos = cantidadEntradasAdultos;
    }

    public int getCantidadEntradasMayores60() {
        return cantidadEntradasMayores60;
    }

    public void setCantidadEntradasMayores60(int cantidadEntradasMayores60) {
        this.cantidadEntradasMayores60 = cantidadEntradasMayores60;
    }

    public String[] getUbicacionHacientos() {
        return ubicacionHacientos;
    }

    public void setUbicacionHacientos(String[] ubicacionHacientos) {
        this.ubicacionHacientos = ubicacionHacientos;
    }

    public String getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(String precioTotal) {
        this.precioTotal = precioTotal;
    }

    public TipoPago getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }

    @Override
    public String toString() {
        return "Ticket{" + "fechaEmision=" + fechaEmision + ", horaEmision=" + horaEmision + ", numeroSala=" + numeroSala + ", nombrePelicula=" + nombrePelicula + ", nombreCliente=" + nombreCliente + ", cantidadTickets=" + cantidadTickets + ", cantidadEntradasNiños=" + cantidadEntradasNiños + ", cantidadEntradasAdultos=" + cantidadEntradasAdultos + ", cantidadEntradasMayores60=" + cantidadEntradasMayores60 + ", ubicacionHacientos=" + java.util.Arrays.toString(ubicacionHacientos) + ", precioTotal=" + precioTotal + ", tipoPago=" + tipoPago + '}';
    }
}
