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
        Menu();  
        
    }

    public static void Menu() {
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
                    playInstructions();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    run = false; //End game
                    break;
            }
        }while(run == true);
    }

    public static void playGame() {

    }

    public static void playInstructions() {
        tenSpace();
        System.out.println("               Rules              ");
        System.out.println("=====================================");
        System.out.println("");
        System.out.print("The rules in Minesweeper are simple:\n" +
"\n" +
"Uncover a mine, and the game ends.\n" +
"\n" +
"Uncover an empty square, and you keep playing.\n" +
"\n" +
"Uncover a number, and it tells you how many mines lay hidden\n"
+ "in the eight surrounding squares—information you use\n"
                + "to deduce which nearby squares are safe to click.");
        System.out.print("\n\n" + "1. return to menu.\n\n" + ">");
        /* Collect input */
            input = -1;
            do {
                try {
                    input = scan.nextInt();
                } catch (InputMismatchException e) {
                }

                /* Invalid input */
                if (!(input > 0 && input <= 1)) {
                    input = -1;
                    System.out.print("1.Go back to menu.\n\n"
                            + "> ");
                }
            } while (input == -1);

            /* Check input number */
            switch (input) {
                case 1:
                    Menu();
                    break;
                
            }
        
    }
    public static void tenSpace(){
            for(int i = 0;i <10; i++){
                System.out.println("");
            }
        }
}
