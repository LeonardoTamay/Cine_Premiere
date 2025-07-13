/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author USER
 */
public class Vector <T>{
    private T[] arregloVector;
    private int tamaño;
    private int nextIndice;

    public Vector(int capacidad) {
        this.tamaño = capacidad;
        this.arregloVector = (T[]) new Object[this.tamaño];
        this.nextIndice = 0;
    }

    public T[] getArregloVector() {
        return arregloVector;
    }

    public void setArregloVector(T[] arregloVector) {
        this.arregloVector = arregloVector;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getNextIndice() {
        return nextIndice;
    }
    
    public void setNextIndice(int nextIndice) {
        this.nextIndice = nextIndice;
    }
    
    public boolean isEmpty(T[] vector) {
        for (T datoVector : vector) {
            if(datoVector != null){
                return false;
            }
        }
        return true;
    }
    
    public void addElementsVector(T dato){
        if(nextIndice > arregloVector.length) throw new Error("El vector se encuentra lleno");
        
        if(isEmpty(arregloVector)){
            arregloVector[0] = dato;
            nextIndice++;
        }else{
            arregloVector[nextIndice] = dato;
            nextIndice++;
        }
    }

    public void mostrarElementos() {
        for (int i = 0; i < tamaño; i++) {
            System.out.println(arregloVector[i]);
        }
    }
    
}
