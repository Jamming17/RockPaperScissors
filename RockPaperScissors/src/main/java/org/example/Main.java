package main.java.org.example;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean replay;
        do {
            System.out.println("Welcome to Rock, Paper, Scissors!");

            //User selection
            boolean valid = false;
            String userChoice = "";
            while (valid == false) {
                System.out.println("Select an option: ");
                userChoice = input.nextLine();
                userChoice = userChoice.toLowerCase();
                System.out.println(userChoice);
                if (userChoice.equals("s") || userChoice.equals("scissors")) {
                    userChoice = "scissors";
                    valid = true;
                } else if (userChoice.equals("p") || userChoice.equals("paper")) {
                    userChoice = "paper";
                    valid = true;
                } else if (userChoice.equals("r") || userChoice.equals("rock")) {
                    userChoice = "rock";
                    valid = true;
                } else {
                    System.out.println("Invalid choice; please enter rock, paper or scissors");
                }
            }

            //Opponent randomisation
            Random rnd = new Random();
            String[] randomSelection = {"rock", "paper", "scissors"};
            String opponentChoice = randomSelection[rnd.nextInt(3)];

            //Decide the winner
            System.out.println("You selected " + userChoice);
            System.out.println("Your opponent selected " + opponentChoice);
            if (userChoice.equals("rock") && opponentChoice.equals("scissors") || userChoice.equals("paper") && opponentChoice.equals("rock") || userChoice.equals("scissors") && opponentChoice.equals("paper")) {
                System.out.println("You win!");
            } else if (userChoice.equals(opponentChoice)) {
                System.out.println("It's a tie!");
            } else {
                System.out.println("Your opponent wins.");
            }

            System.out.println("Would you like to play again?");
            String replayInput = input.nextLine().toLowerCase();
            if (replayInput.equals("y") || replayInput.equals("yes")) {
                replay = true;
            } else {
                replay = false;
            }
        } while (replay == true);
    }
}