/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.util.InputMismatchException;
import java.util.Scanner;


public class MineSweeper {

    static Scanner scan = new Scanner(System.in); //Input system
    static int input; //Input variable
    static Map board = new Map(10,10); //Game board

    public static void main(String[] args) {
        // TODO code application logic here
          
        System.out.println(board.toString(10,10));
    }

    public void Menu() {
        boolean run = true;
        System.out.println("       Mine Sweeper      ");
        System.out.println("=========================");
        do {
            System.out.print("Please select an option:\n"
                    + "1. Play\n"
                    + "2. How to Play/Commands\n"
                    + "3. Quit\n\n"
                    + "> ");

            /* Collect input */
            input = -1;
            do {
                try {
                    input = scan.nextInt();
                } catch (InputMismatchException e) {
                }

                /* Invalid input */
                if (!(input > 0 && input <= 3)) {
                    input = -1;
                    System.out.print("Please input a number 1-3.\n\n"
                            + "> ");
                }
            } while (input == -1);

            /* Check input number */
            switch (input) {
                case 1:
                    playGame();
                    break;
                case 2:
                    break;
            }
        }while(run == true);
    }

    public void playGame() {

    }
}
