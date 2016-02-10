/**
 * Program Filename: Map.java
 * Author: Smith, Ira
 * Date: February ??, 2016
 * Description: Quadruply linked data structure for storing Mine Sweeper Map
 * Input: MineSweeper
 * Output: Console, MineSweeper
 */
package minesweeper;

public class Map {
    
    Node topleft = null; //Starting position
    
    /**
     * Method: constructor
     * Description: Initializes a 11 x 11 grid
     * Parameters: none
     * Pre-conditions: Grid object is declared
     * Post-conditions: ROW x COL grid has been built
     */
    public Map(int ROW, int COL) {
        /* Makes 11 columns */
        for (int i = 0; i < ROW; i++)
            addCol(COL);
    }
    
    /**
     * Method: addCol()
     * Description: Adds a X tall column on the right side of grid
     * Parameters: none
     * Pre-conditions: Grid object is being initialized
     * Post-conditions: 1 column is added
     */
    private void addCol(int COL) {
        /* Special case */
        if(topleft == null) {
            /* Build first column */
            topleft = new Node('0');
            Node cur = topleft;
            
            for (int i = 0; i < COL; i++) {
                cur.down = new Node('0');
                cur = cur.down;
            }
        } else {
            /* Build column on far right, set connections for previous column */
            Node cur = topleft;
            while(cur.right != null)
                cur = cur.right;
            
            Node prev = cur;
            cur.right = new Node('0');
            cur = cur.right;
            
            for (int i = 0; i < COL; i++) {
                cur.down = new Node('0');
                prev.downright = cur.down;
                prev = prev.down;
                prev.upright = cur;
                cur = cur.down;
                prev.right = cur;
            }
        }
    }
    
    
    
    
    /**
     * Method: full()
     * Description: Checks if board is full of player pieces
     * Parameters: none
     * Pre-conditions: 6 x 7 grid is initialized
     * Post-conditions: true is returned if board is full
     */
    //public boolean full() {
        //boolean b = true; //Remains true until 0 is found
        //Node col = topleft; //Start at top left
        
        /* Loop through each column */
        //for (int i = 0; i < 7; i++) {
            //Node cur = col;
            
            /* Loop down column */
            //for (int j = 0; j < 6; j++) {
                /* Check if space is empty */
                //if(cur.val == '0')
                    //b = false;
                //cur = cur.down; //Move down
            //}
            //col = col.right; //Move right
        //}
        //return b;
    //}
    
    /**
     * Method: toString()
     * Description: Converts grid into readable String
     * Parameters: none
     * Pre-conditions: ROW x COL grid has been initialized
     * Post-conditions: Grid is returned as String
     */
    public String toString(int ROW , int COL) {
        String s = ""; //Holds grid as String
        Node row = topleft; //Start at top left
        
        /* Loop through each row */
        for (int i = 0; i < ROW; i++) {
            Node cur = row;
            
            /* Loop towards the right */
            for (int j = 0; j < COL; j++) {
                s += cur.toString(); //Add current node
                
                cur = cur.right; //Move right
            }
            
            s += "\n"; //Add newline
            row = row.down; //Move down
        }
        return s;
    }
    
    /**
    * Classname: Node
    * Description: Holds data for a node in the grid and its four neighbors
    * Input: Grid
    * Output: Grid
    */
    private class Node {
        char val; //Value of this node
        boolean bomb;
        /* Neighboring nodes */
        Node down, downright, right, upright;
        
        /**
        * Method: constructor
        * Description: Sets the value of this Node
        * Parameters: val
        * Pre-conditions: Node object has been declared
        * Post-conditions: Object is initialized
        */
        public Node(char val) {
            this.val = val;
        }
        
        /**
        * Method: checkDown()
        * Description: Checks if player has won vertically
        * Parameters: player
        * Pre-conditions: Node and three downwards neighbors have been initialized
        * Post-conditions: Vertical win condition has been returned
        */
        public boolean checkDown(char player) {
            boolean b = true; //Remains true until node != player
            Node cur = this; //Start here
            
            /* Loop down four times */
            for (int i = 0; i < 4; i++) {
                if(cur.val != player) {
                    b = false; //Player has not won
                    break;
                }
                cur = cur.down; //Move down
            }
            return b;
        }
        
        /**
        * Method: checkRight()
        * Description: Checks if player has won horizontally
        * Parameters: player
        * Pre-conditions: Node and three neighbors to the right have been initialized
        * Post-conditions: Horizontal win condition has been returned
        */
        public boolean checkRight(char player) {
            boolean b = true; //Remains true until node != player
            Node cur = this; //Start here
            
            /* Loop right four times */
            for (int i = 0; i < 4; i++) {
                if(cur.val != player) {
                    b = false; //Player has not won
                    break;
                }
                cur = cur.right; //Move right
            }
            return b;
        }
        
        /**
        * Method: checkDownright()
        * Description: Checks if player has won diagonally
        * Parameters: player
        * Pre-conditions: Node and three neighbors to the southeast have been initialized
        * Post-conditions: Diagonal win condition has been returned
        */
        public boolean checkDownright(char player) {
            boolean b = true; //Remains true until node != player
            Node cur = this; //Start here
            
            /* Loop downright four times */
            for (int i = 0; i < 4; i++) {
                if(cur.val != player) {
                    b = false; //Player has not won
                    break;
                }
                cur = cur.downright; //Move downright
            }
            return b;
        }
        
        /**
        * Method: checkUpright()
        * Description: Checks if player has won diagonally
        * Parameters: player
        * Pre-conditions: Node and three neighbors to the northeast have been initialized
        * Post-conditions: Diagonal win condition has been returned
        */
        public boolean checkUpright(char player) {
            boolean b = true; //Remains true until node != player
            Node cur = this; //Start here
            
            /* Loop upright four times */
            for (int i = 0; i < 4; i++) {
                if(cur.val != player) {
                    b = false; //Player has not won
                    break;
                }
                cur = cur.upright; //Move upright
            }
            return b;
        }
        
        /**
        * Method: toString()
        * Description: Returns this Node's value as String
        * Parameters: none
        * Pre-conditions: Node object has been initialized
        * Post-conditions: Value has been returned as String
        */
        public String toString() {
            return this.val + " ";
        }
        
    }
    
}
