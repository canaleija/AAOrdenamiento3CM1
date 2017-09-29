/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Mezcla implements Algoritmo{

    private double tiempo_inicial;
    private double tiempo_final;
    private double tiempo_total;
    private double[] datos;

    public Mezcla() {
        this.tiempo_inicial = 0;
        this.tiempo_final = 0;
        this.tiempo_total = 0;
    }
    
    
    
    @Override
    public void ordenar(double[] arreglo) {
        this.datos = arreglo.clone();
        this.tiempo_inicial = System.currentTimeMillis();
        ordenar(arreglo, 0, arreglo.length-1);
        this.tiempo_final = System.currentTimeMillis();
        this.tiempo_total = this.tiempo_final - this.tiempo_inicial;
    }
    
    private void ordenar(double[] tmpArray, int left, int right) {
        // verificar por lo menos left sea menor que right
        if (left < right){
           int center = (left+right)/2;
            ordenar(tmpArray, left, center);
            ordenar(tmpArray, center+1, right);
            merge(tmpArray,left,center+1,right);
        }
        
    }

    private void merge(double[] tmpArray, int leftpos, int rightpos, int rightEnd) {
        // establecer unos limites
        int leftEnd = rightpos - 1;
        int tmpPos = leftpos;
        // calcular un numero de elementos 
        int numElements = rightEnd - leftpos + 1;
        
        // generar los cambios en el arreglo temporal 
        while (leftpos <= leftEnd && rightpos<=rightEnd) {
            if (this.datos[leftpos]<this.datos[rightpos]){
              tmpArray[tmpPos++] = this.datos[leftpos++];
            }else {
               tmpArray[tmpPos++] = this.datos[rightpos++];
            }
        }
        // copiar el resto de la primera mitad
        while (leftpos <= leftEnd){
          tmpArray[tmpPos++] = this.datos[leftpos++];
        }        
        // copiar el resto de la segunda mitad
         while (rightpos <= rightEnd){
          tmpArray[tmpPos++] = this.datos[rightpos++];
        }  
        
        // actualizar el arreglo 
        // recorrer el arreglo
        for (int i = 0; i < numElements; i++, rightEnd--){
        this.datos[rightEnd] = tmpArray[rightEnd];
        }
            
    }

    @Override
    public double getTiempo_total() {
        return tiempo_total;
    }
    
}
