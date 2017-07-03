//Travonna Wilson
//CST-105
//7/2/17 
//This is my own work 
package guessgame;
/**
 *
 * @author Travonna Wilson
 */
 
 import java.util.Random;
 import java.util.Scanner;
 
public class Guessgame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               System.out.println("Welcome the guessing game.");
        System.out.println("Pick a number between 1 and 10000: ");

        Scanner inputnum = new Scanner(System.in);  
        int maxnum;
        maxnum = inputnum.nextInt();

        Random rand = new Random();
        int number = rand.nextInt(maxnum);
        int tries = 0; 
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;

        while (win == false){  

            System.out.println("Guess a number between 1 and "+ maxnum +": ");
            guess = input.nextInt();
            tries++; 

            if (guess == number){
                win = true;
            }

            else if(guess < number){
                System.out.println("Number is to low, try again");
                
            }

            else if(guess > number){
                System.out.println("Number is to high, try again");
                
            }

        }

        System.out.println("You win!");
        
        System.out.println("It took you "+ tries + " tries.");

    }
}
   
    
