/**
 * Program Filename: ConnectFour.java
 * Author: Sapp, Cameron; Smith, Ira
 * Date: February 5, 2016
 * Description: Plays 2-player Connect Four
 * Input: Keyboard, Grid
 * Output: Console, Grid
 */
package connectfour;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConnectFour {

    static Scanner scan = new Scanner(System.in); //Input system
    static int input; //Input variable
    static Grid board; //Game board
        
    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to Connect Four!\n");
        
        /* Run loop */
        boolean run = true;
        do {
            System.out.print("Please select an option:\n"
                    + "1. Play\n"
                    + "2. Best of 3\n"
                    + "3. Quit\n\n"
                    + "> ");
            
            /* Collect input */
            input = -1;
            do {
                try {
                    input = scan.nextInt();
                } catch(InputMismatchException e) { }
                
                /* Invalid input */
                if(!(input > 0 && input <= 3)) {
                    input = -1;
                    System.out.print("Please input a number 1-3.\n\n"
                            + "> ");
                }
            } while(input == -1);
            
            /* Check input number */
            switch(input) {
                case 1:
                    playGame();
                    break;
                case 2:
                    /* Score variables */
                    int p1 = 0, p2 = 0;
                    
                    /* Play three times, keep track of score */
                    for (int i = 0; i < 3; i++) {
                        switch(playGame()) {
                            case 1:
                                p1++;
                                break;
                            case 2:
                                p2++;
                                break;
                        }
                        if(p1 == 2 || p2 == 2)
                            break;
                    }
                    
                    /* Print winner & score */
                    for (int i = 0; i < 100; i++)
                        System.out.println();
                    if(p1 > p2)
                        System.out.println("P1 wins!\n");
                    else if(p2 > p1)
                        System.out.println("P2 wins!\n");
                    else
                        System.out.println("Tie!\n");
                    System.out.println("Score:\n"
                            + "P1: " + p1
                            + "\nP2: " + p2
                            + "\n");
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    run = false; //End game
                    break;
            }
        } while(run);
    }
    
    /**
     * Method: playGame()
     * Description: Plays a game of Connect Four and returns winner
     * Parameters: none
     * Pre-conditions: Main loop has been started
     * Post-conditions: One game has been played
     */
    static int playGame() throws InterruptedException {
        board = new Grid(); //Initialize game board
        
        boolean run = true;
        /* Game loop */
        do {
            /* Print board */
            for (int j = 0; j < 100; j++)
                System.out.println();
            System.out.println("1 2 3 4 5 6 7\n"
                    + "-------------\n"
                    + board.toString());
            
            /* P1 drops piece, check if won */
            System.out.print("P1: ");
            if(takeInput('@')) {
                System.out.println("P1 wins!\n");
                return 1;
            }
            
            /* Print board */
            for (int j = 0; j < 100; j++)
                System.out.println();
            System.out.println("1 2 3 4 5 6 7\n"
                    + "-------------\n"
                    + board.toString());
            
            /* P2 drops piece, check if won */
            System.out.print("P2: ");
            if(takeInput('&')) {
                System.out.println("P2 wins!\n");
                return 2;
            }
            
            /* End if board is full */
            if(board.full())
                run = false;
        } while(run);
        
        System.out.println("Tie!\n");
        return 0;
    }
    
    /**
     * Method: takeInput()
     * Description: Drops player chip and checks win condition
     * Parameters: player
     * Pre-conditions: board has been initialized
     * Post-conditions: Player chip has been dropped
     */
    static boolean takeInput(char player) throws InterruptedException {
        /* Collect input */
        input = -1;
        do {
            try {
                input = scan.nextInt();
            } catch(InputMismatchException e) { }
            
            /* Catch invalid input */
            if(!(input > 0 && input <= 7)) {
                input = -1;
                System.out.print("Please input a number 1-7.\n\n"
                        + "> ");
            } else if(!board.drop(input-1, player)) {
                /* Make sure column has empty spaces */
                input = -1;
                System.out.print("That column is full.\n\n"
                        + "> ");
            }
        } while(input == -1);
        
        return board.check(player); //Check if player won
    }
    
}
