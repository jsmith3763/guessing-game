package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        introduction();
    }

    public static void guessingGame() {
        Scanner sc = new Scanner(System.in);

        int correctNumber = 1 + (int)(100 * Math.random());
        int guess = -1;
        int attempts = 1;
        while(guess != correctNumber) {
            System.out.print("Your guess? ");
            guess = sc.nextInt();
            if(correctNumber == guess) {
                System.out.println("You got it right in " + attempts + " guesses");
                break;
            }else if(correctNumber > guess) {
                System.out.println("It's higher.");
            }else {
                System.out.println("It's lower.");
            }

            attempts++;
        }
        continuePlaying();

    }

    public static void introduction() {
        System.out.println("I'm thinking of a number between 1 and 100. . .");
        guessingGame();
    }

    public static void continuePlaying() {
        Scanner sc = new Scanner(System.in);
        String input = " ";
        System.out.print("Do you want to play again? Y or N ");
        input = sc.nextLine();

        if(input.equals("Y")) {
            introduction();
        }else {
            System.out.print("Thanks for playing!");
            System.exit(0);
        }

    }
}