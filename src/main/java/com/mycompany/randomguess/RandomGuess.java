/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.randomguess;

/**
 *
 * @author ROTONDWA
 */
import javax.swing.JOptionPane;

public class RandomGuess {
    public static void main(String[] args) {
        // Generate a random number between 1 and 10
        int randomNumber = (int)(Math.random() * 10) + 1;
        int guess;
        int attempts = 0;

        JOptionPane.showMessageDialog(null, "Welcome to the Guess Game!\nThink of a number between 1 and 10.");

        do {
            // Ask user for input
            String input = JOptionPane.showInputDialog("Enter your guess:");
            
            // Convert input to integer
            guess = Integer.parseInt(input);
            attempts++;

            if (guess == randomNumber) {
                JOptionPane.showMessageDialog(null, "🎉 Correct! The number was " + randomNumber +
                        "\nYou guessed it in " + attempts + " attempts.");
                break;
            } else if (guess < randomNumber) {
                JOptionPane.showMessageDialog(null, "Too low! Try again.");
            } else {
                JOptionPane.showMessageDialog(null, "Too high! Try again.");
            }
        } while (true);

        JOptionPane.showMessageDialog(null, "Thanks for playing!");
    }
}

