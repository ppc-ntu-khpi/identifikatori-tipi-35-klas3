package test;

import domain.Exercise;
import java.util.Scanner;

public class TestResult {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        try {
            System.out.println("Enter the first number:\n==> ");
            long firstNumber = userInput.nextLong();

            System.out.println("Enter the second number:\n==> ");
            long secondNumber = userInput.nextLong();

            System.out.println(Exercise.Calculate(firstNumber, secondNumber));
        }
        catch(Exception e) {
            System.out.println(e.toString());
        }
    }
}
