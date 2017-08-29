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
public class InsertSort implements Algoritmo{

    private double tiempo_inicial;
    private double tiempo_final;
    private double tiempo_total;
    private int intercambios;
    private int comparaciones;
    
    
    public InsertSort(){
      this.tiempo_inicial = 0;
        this.tiempo_final = 0;
        this.tiempo_total = 0;
        this.comparaciones = 0;
        this.intercambios = 0;
    }
    
    @Override
    public void ordenar(double[] arreglo) {
        this.tiempo_inicial = System.currentTimeMillis();
        for(int i=1; i <arreglo.length;i++){
       
           for(int j = i; j > 0;j--){
             // comparaciones
             this.comparaciones++;
             if (arreglo[j]<arreglo[j-1]){
                 double aux = arreglo[j];
                 arreglo[j] = arreglo[j-1];
                 arreglo[j-1] = aux;
             this.intercambios++;    
             }
            
           }
       
       }
          //ya termino 
          this.tiempo_final = System.currentTimeMillis();
          this.tiempo_total = this.tiempo_final - this.tiempo_inicial;
    }

   /**
     * @return the tiempo_total
     */
    @Override
    public double getTiempo_total() {
        return tiempo_total;
    }
}
