package util.estructuras;

public class ListaEnlazada<T> {
    private NodoLista<T> cabeza;
    private int tamaño;

    public ListaEnlazada() {
        this.cabeza = null;
        this.tamaño = 0;
    }

    public boolean isEmpty() {
        return cabeza.getSiguiente() == null;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void addLista(T dato) {
        NodoLista<T> nuevo = new NodoLista<>(dato);
        if (isEmpty()) {
            cabeza.setSiguiente(nuevo);
        }else{
            NodoLista<T> actual = cabeza;
            while (actual.getSiguiente() != null) {                
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
       tamaño++; 
    }
    
    public void showLista() {
        NodoLista<T> actual = cabeza;
        
        if (isEmpty()) {
            System.out.println("lista vacia");
        }
        
        while(actual != null){
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }
    }
}