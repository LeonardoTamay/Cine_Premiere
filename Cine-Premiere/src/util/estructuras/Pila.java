package util.estructuras;

public class Pila<T> {
    private ListaEnlazada<T> lista;

    public Pila() {
        this.lista = new ListaEnlazada<>();
    }

    public void push(T dato) {
        lista.agregarAlInicio(dato);
    }

    public T pop() {
        return lista.eliminarDelInicio();
    }

    public T peek() {
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