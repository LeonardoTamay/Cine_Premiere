package util.estructuras;

public class Cola<T> {
    private ListaEnlazada<T> lista;

    public Cola() {
        this.lista = new ListaEnlazada<>();
    }

    public void encolar(T dato) {
        lista.agregar(dato);
    }

    public T desencolar() {
        return lista.eliminarDelInicio();
    }

    public T frente() {
        if (lista.estaVacia()) {
            return null;
        }
        return lista.buscar(0);
    }

    public boolean estaVacia() {
        return lista.estaVacia();
    }

    public int getTamano() {
        return lista.getTamano();
    }
}