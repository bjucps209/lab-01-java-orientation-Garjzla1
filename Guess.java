/*
import random

# generate secret number
secretNum = random.randrange(1, 11)

numGuesses = 0
guess = 0
while guess != secretNum:

    guess = int(input("Enter your guess: "))
    numGuesses += 1

    # Give feedback on guess
    if guess < secretNum:
        print("Your guess is too low.")
    elif guess > secretNum:
        print("Your guess is too high.")
    else:
        print("You got it!!")

print("It took you", numGuesses, "guesses.")
*/

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args){
        // Get random value
        Random random = new Random();
        int guessNum = random.nextInt(10) + 1;

        // Set up needed data
        int guessedNum = 0;
        int guesses = 0;

        while (guessNum != guessedNum){
            // Get user's value
            Scanner scanner = new Scanner(System.in);
            guessedNum = Integer.parseInt(scanner.nextLine());

            // Increment the number of guesses the user has done
            guesses++;

            if (guessedNum < guessNum){
                System.out.println("Your guess is too low.");
            } else if (guessedNum > guessNum){
                System.out.println("Your guess is too high.");
            } else{
                System.out.println("You got it!");
            }
        }

        // End of game
        System.out.println("It took you "+guesses+" guesses.");

    }
}
