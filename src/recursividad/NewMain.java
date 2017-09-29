/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author Roberto Cruz Leija
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        recursividad("A", 5);
        recursividad("B", 15);
        recursividad("D", 150);
        
    }
    public static void recursividad(String nom, int num){
    
        // caso base 
        if (num==0){
         System.out.println(nom+": "+num);
        }else{
           
            recursividad(nom, num-1);
            System.out.println(nom+": "+num);
        }
    
    }
    
    
}
