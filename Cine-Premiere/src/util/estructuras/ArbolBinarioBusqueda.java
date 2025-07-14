package util.estructuras;

public class ArbolBinarioBusqueda<T extends Comparable<T>> {
    private NodoArbol<T> raiz;

    public ArbolBinarioBusqueda() {
        this.raiz = null;
    }

    public void insertar(T dato) {
        raiz = insertarRecursivo(raiz, dato);
    }

    private NodoArbol<T> insertarRecursivo(NodoArbol<T> actual, T dato) {
        if (actual == null) {
            return new NodoArbol<>(dato);
        }

        if (dato.compareTo(actual.getDato()) < 0) {
            actual.setIzquierdo(insertarRecursivo(actual.getIzquierdo(), dato));
        } else if (dato.compareTo(actual.getDato()) > 0) {
            actual.setDerecho(insertarRecursivo(actual.getDerecho(), dato));
        } else {
            // El valor ya existe, no se inserta de nuevo
            return actual;
        }

        return actual;
    }

    public boolean buscar(T dato) {
        return buscarRecursivo(raiz, dato);
    }

    private boolean buscarRecursivo(NodoArbol<T> actual, T dato) {
        if (actual == null) {
            return false;
        }
        if (dato.equals(actual.getDato())) {
            return true;
        }
        return dato.compareTo(actual.getDato()) < 0
               ? buscarRecursivo(actual.getIzquierdo(), dato)
               : buscarRecursivo(actual.getDerecho(), dato);
    }

    public void recorridoInOrden() {
        recorridoInOrdenRecursivo(raiz);
    }

    private void recorridoInOrdenRecursivo(NodoArbol<T> nodo) {
        if (nodo != null) {
            recorridoInOrdenRecursivo(nodo.getIzquierdo());
            System.out.print(nodo.getDato() + " ");
            recorridoInOrdenRecursivo(nodo.getDerecho());
        }
    }
}