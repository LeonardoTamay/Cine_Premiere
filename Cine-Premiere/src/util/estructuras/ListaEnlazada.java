package util.estructuras;

public class ListaEnlazada<T> {
    private NodoLista<T> cabeza;
    private int tamaño;

    public ListaEnlazada() {
        this.cabeza = null;
        this.tamaño = 0;
    }

    public boolean isEmpty() {
        return cabeza == null;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void addLista(T dato) {
        NodoLista<T> nuevo = new NodoLista<>(dato);
        if (isEmpty()) {
            cabeza = nuevo;
        }else{
            NodoLista<T> actual = cabeza;
            while (actual.getSiguiente() != null) {                
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
       tamaño++; 
    }
    
    public boolean deleteLista(T dato) {
        if (isEmpty()) {
            return false;
        }
        
        if (cabeza.getDato().equals(dato)) {
            cabeza.getSiguiente();
            tamaño--;
            return true;
        }
        
        NodoLista<T> actual = cabeza;
        while(actual.getSiguiente() != null && !actual.getDato().equals(dato)) {
            actual.getSiguiente();
        }
        
        if (actual.getSiguiente() != null) {
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
            tamaño--;
            return true;
        }
        return false;
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