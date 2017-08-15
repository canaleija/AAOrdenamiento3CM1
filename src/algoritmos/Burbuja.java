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
public class Burbuja {
    
    private double tiempo;
    private int intercambios;
    private int comparaciones;

    public Burbuja() {
        this.tiempo = 0;
        this.comparaciones = 0;
        this.intercambios = 0;
    }
    
    public void ordenar(double []arreglo){
    
          for(int i = 0; i < arreglo.length - 1; i++)
            {
            for(int j = 0; j < arreglo.length - 1; j++)
                 {
                   this.comparaciones++;
                           
                if (arreglo[j] > arreglo[j + 1])
                {
                    double tmp = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = tmp;
                    this.intercambios++;
                }
            }
        }
    
    
    }
    
    
}
