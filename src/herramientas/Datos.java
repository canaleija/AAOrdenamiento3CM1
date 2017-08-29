/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herramientas;

import java.util.Random;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Datos {
    
    
    public static double[] generarDatosAleatorios(int n, int limite){
            
        double[] datos = new double[n];
        Random ran = new Random();
        
        for (int x=0; x < n ; x++){
           datos[x] = ran.nextInt(limite);
        }
        
        return datos;
    }
    
    public static double[] generarDatosOrdenadosDescendentes(int n){
    
        double[] datos = new double[n];
    
         for (int x=n-1; x > -1 ; x--){
             datos[x] = n-x;
        }
    return datos;
    }
    
    public static double[] generarDatosOrdenadosAscendentes(int n){
    
        double[] datos = new double[n];
    
         for (int x=n-1; x > -1 ; x--){
             datos[x] = x;
        }
    return datos;
    }
    
}
