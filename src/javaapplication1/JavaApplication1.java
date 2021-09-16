/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* TASK 1.1 TC -> TF */
        Scanner in = new Scanner(System.in);
        System.out.print("Input celcius temperature: ");
        double celcius = in.nextDouble();
        
        double farengeit = celcius * 9/5 +32;
        
        System.out.println("Your temperature in fahrengeit: "+farengeit);
        
    
       
        
        
        
       
        
    }
    
}
