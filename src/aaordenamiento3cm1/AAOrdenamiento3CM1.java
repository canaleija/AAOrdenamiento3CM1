/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaordenamiento3cm1;

import algoritmos.Algoritmo;
import algoritmos.Burbuja;
import algoritmos.BurbujaOptimizado;
import algoritmos.InsertSort;
import algoritmos.Mezcla;
import algoritmos.QuickSort;
import algoritmos.Seleccion;
import herramientas.Comparador;
import herramientas.Datos;
import herramientas.Grafica;
import java.util.ArrayList;

/**
 *
 * @author Roberto Cruz Leija
 */
public class AAOrdenamiento3CM1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
   
        
        
        ArrayList<Algoritmo> algoritmos = new ArrayList<>();
        algoritmos.add(new Burbuja());
        algoritmos.add(new BurbujaOptimizado());
        algoritmos.add(new InsertSort());
        algoritmos.add(new Seleccion());
        algoritmos.add(new Mezcla());
        //algoritmos.add(new QuickSort());
        
        Comparador comparador = new Comparador(algoritmos,1000, 10);
        comparador.compararAlgoritmos();
        System.out.println();
    }
   
}
