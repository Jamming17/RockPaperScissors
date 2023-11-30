package main.java.org.example;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Select an option: ");
        String userChoice = input.nextLine();

        //Opponent randomisation

        System.out.println("You selected __");
        System.out.println("Your opponent selected __");
        System.out.println("__ wins!");
        //Maybe implement replayability?
    }
}