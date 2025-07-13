/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author USER
 */
public class Matriz <T>{
    private T[][] matriz;
    private int sizeFila;
    private int sizeColumna;
    private int nextX;
    private int nextY;
    
    public Matriz(int fila, int columna) {
        if(columna < 0 || fila < 0){
            throw new Error("la fila o coluna tiene un valor negativo");
        }else{
            this.sizeColumna = columna;
            this.sizeFila = fila;
            this.matriz = (T[][]) new Object[this.sizeFila][this.sizeColumna];
            this.nextX = this.nextY = 0;
        }
    }

    public T[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(T[][] matriz) {
        this.matriz = matriz;
    }

    public int getSizeFila() {
        return sizeFila;
    }

    public void setSizeFila(int sizeFila) {
        this.sizeFila = sizeFila;
    }

    public int getSizeColumna() {
        return sizeColumna;
    }

    public void setSizeColumna(int sizeColumna) {
        this.sizeColumna = sizeColumna;
    }

    public int getNextX() {
        return nextX;
    }

    public void setNextX(int nextX) {
        this.nextX = nextX;
    }

    public int getNextY() {
        return nextY;
    }

    public void setNextY(int nextY) {
        this.nextY = nextY;
    }
    
    public boolean isEmpty(T[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if(m[i][j] != null) {
                    return false;
                }
            } 
        }
        return true;
    }
    
    public void addElementsMatriz(T dato) {
        if(nextX >= matriz.length || nextY >= matriz[0].length) throw new Error("La matriz esta llena");
        
        matriz[nextX][nextY] = dato;
        
        nextY++;

        if(nextY == matriz[0].length){
            nextY = 0;
            nextX ++;
        }
    }
    
    public void showElementsMatriz(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]);
            } 
        }
    }
    
}
