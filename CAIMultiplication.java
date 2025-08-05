//CAIMultiplication.java - This program runs through mathematical questions for the user to answer, and repeat the question if the answer is wrong.
//CSIS 212-B02
// Class Random: https://docs.oracle.com/javase/8/docs/api/java/util/Random.html

package caimultiplication;

import java.util.Scanner;     //  Import; program uses of class scanner
import java.util.Random;      // import; programs uses of class random 

public class CAIMultiplication {

	// Main method beings execution of Java application
	    public static int askQuestion(int first, int second) {
	        System.out.printf("How much is %d times %d? ", first, second);
	        int correctAnswer = first * second;  
	        return correctAnswer;                
	    }

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);  // Create a Scanner to obtain input from the command window
	        Random randomNumbers = new Random();     // This will create Random object, for this program a random number

	        int firstNumber;   // This holds first random number
	        int secondNumber;  // This holds second random number
	        int correctAnswer; // Correct answer to the current question
	        int studentAnswer; // Student's answer

	        // Start of the main loop
	        while (true) {

	            // Two random 1-digit numbers
	            firstNumber = 1 + randomNumbers.nextInt(9);
	            secondNumber = 1 + randomNumbers.nextInt(9);

	            // Call method
	            correctAnswer = askQuestion(firstNumber, secondNumber);

	            // Loop till the answer it is correct
	            do {
	                studentAnswer = input.nextInt();  // This will read the student's answer

	                if (studentAnswer == correctAnswer) {
	                    System.out.println("Very Good!"); // Correct answer response 
	                    System.out.println("David Lyman – Assignment 4\n");
	                } else {
	                    System.out.println("No. Please try again.");  // Wrong answer response 
	                    System.out.print("How much is " + firstNumber + " times " + secondNumber + "? ");
	                }

	            } while (studentAnswer != correctAnswer);  // Repeat till answer is correct
	            // After the answer is correct, loop will repeat
	           
	        } // End of Main loop
	    } // End of Main Method
	} //End of Class CircleArea
