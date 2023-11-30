package main.java.org.example;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper, Scissors!");

        //User selection
        boolean valid = false;
        while (valid == false) {
            System.out.println("Select an option: ");
            String userChoice = input.nextLine();
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

        System.out.println("You selected __");
        System.out.println("Your opponent selected __");
        System.out.println("__ wins!");
        //Maybe implement replayability?
    }
}