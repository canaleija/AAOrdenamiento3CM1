/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaordenamiento3cm1;

import algoritmos.Algoritmo;
import algoritmos.Burbuja;
import algoritmos.BurbujaOptimizado;
import herramientas.Comparador;
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
        //double [] datos = new double[]{6,5,3,1,8,7,2,4};
        ArrayList<Algoritmo> algoritmos = new ArrayList<>();
        algoritmos.add(new Burbuja());
        algoritmos.add(new BurbujaOptimizado());
        
        Comparador comparador = new Comparador(algoritmos, 1000, 10);
        comparador.compararAlgoritmos();
    }
   
}
