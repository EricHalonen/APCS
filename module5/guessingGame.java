

/**
 * This program will test the user to guess a random number that is given by the computer
 *
 * @author (Eric Halonen)
 * @version (10/29/17)
 */
import java.util.Scanner;
import java.util.Random;
public class guessingGame
{
 	public static void main(String[] args)
 	{
    	//user input done here
    	Scanner g = new Scanner(System.in);
    	System.out.println("Please enter a number between 1 and 40 here");
    	int guess = g.nextInt();
    	
    	//Random number generated here
    	Random randomNumber = new Random();
        int number = randomNumber.nextInt(40) + 1;
   	 
    	int numberOfGuesses = 1;
    	//looop starts here
    	while (guess != number)
    	{
        	System.out.print("Guess 1-40: ");
            guess = g.nextInt();
        	if (guess > number )
        	{
            	System.out.println( "Your guess was too high!");
        	}
        	else if (guess < number )
        	{
            	System.out.println( "Your guess was too low!");
        	}
        	else
        	{
            	System.out.println( "Correct! You have guessed "+ numberOfGuesses + " times. ");
        	}
        	numberOfGuesses++;
        }
    }
}