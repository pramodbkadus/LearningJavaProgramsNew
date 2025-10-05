package ex_11_While;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Lab123_While_Guessing_Game {
    public static void main(String[] args) {
        // Guess a number between 1 and 100

        Random random = new Random();
        int numberToGuess = random.nextInt(101);
       // System.out.println(numberToGuess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int guess;
        int attempts = 0;

        while(true){
            if(!scanner.hasNextInt()){
                System.out.println("Invalid input! Please enter a number");
                scanner.next();
                continue;
            }

            guess = scanner.nextInt();
            attempts++;

            if( guess < 1 || guess > 100){
                System.out.println("Please enter a number between 1 and 100");
                continue;
            }

            if(guess < numberToGuess){
                System.out.println("Too low, Try again");
            } else if (guess > numberToGuess) {
                System.out.println("Too high, Try again");
            }
            else{
                System.out.println("Correct! You guessed it in " + attempts + " attempts");
                break;
            }
        }

    }
}
