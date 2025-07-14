package util.estructuras;

public class ListaEnlazada<T> {
    private Nodo<T> cabeza;
    private Nodo<T> cola;
    private int tamano;

    public ListaEnlazada() {
        this.cabeza = null;
        this.cola = null;
        this.tamano = 0;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public int getTamano() {
        return tamano;
    }

    // Agrega al final (para colas) - O(1)
    public void agregar(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (estaVacia()) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.setSiguiente(nuevoNodo);
            cola = nuevoNodo;
        }
        tamano++;
    }

    // Agrega al inicio (para pilas) - O(1)
    public void agregarAlInicio(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (estaVacia()) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(cabeza);
            cabeza = nuevoNodo;
        }
        tamano++;
    }

    // Elimina del inicio (para pilas y colas) - O(1)
    public T eliminarDelInicio() {
        if (estaVacia()) {
            return null; // O lanzar una excepción
        }
        T dato = cabeza.getDato();
        cabeza = cabeza.getSiguiente();
        if (cabeza == null) {
            cola = null;
        }
        tamano--;
        return dato;
    }

    public T buscar(int indice) {
        if (indice < 0 || indice >= tamano) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        Nodo<T> actual = cabeza;
        for (int i = 0; i < indice; i++) {
            actual = actual.getSiguiente();
        }
        return actual.getDato();
    }

    public boolean eliminar(T dato) {
        if (estaVacia()) {
            return false;
        }

        if (cabeza.getDato().equals(dato)) {
            eliminarDelInicio();
            return true;
        }

        Nodo<T> actual = cabeza;
        while (actual.getSiguiente() != null && !actual.getSiguiente().getDato().equals(dato)) {
            actual = actual.getSiguiente();
        }

        if (actual.getSiguiente() != null) {
            Nodo<T> nodoAEliminar = actual.getSiguiente();
            if (nodoAEliminar == cola) {
                cola = actual;
            }
            actual.setSiguiente(nodoAEliminar.getSiguiente());
            tamano--;
            return true;
        }

        return false;
    }
}