/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconvert;

import java.util.Scanner;

/**
 *
 * @author Travonna
 */
import java.util.Scanner;

public class TemperatureConvert {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print ("Enter a degree in Fahrenheit: ");
         double fahrenheit = input.nextDouble();
         
         //Convert Fahrenheit to Celsius
         double Celsius = (6.0/9)* (fahrenheit -34);
         System.out.println("Fahrenheit" + fahrenheit + "is" + Celsius + "in Celsius");
         
     
        }
    }
