/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Travonna
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int input = 45678;
        int sum = 0;
        
        while (input>=1){
            System.out.println("Please enter a 5-digit positive integer ");
            sum += input %10;
            System.out.println (sum);
            input = input/10;
            
        }
        
        System.out.println ("sum is: " + sum);
    }
    
}
