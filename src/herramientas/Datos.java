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
    
}
