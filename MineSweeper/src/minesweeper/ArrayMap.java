/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

/**
 *
 * @author ismith5656
 */
public class ArrayMap {
    char[][] Map;
    int numBombs;
    boolean[][] bomb;
    
    public ArrayMap(char[][] Map, int numBombs,boolean[][] bomb,int ROW, int COL ){
        this.Map = Map;
        this.numBombs = numBombs;
        this.bomb = bomb;
        boolean run = true;
        int i = 0;
        for(int R = 0; R < ROW;R++){
            for(int C = 0;C < COL;C++){
                Map[ROW][COL] = '0';
                if(i != numBombs){
                    
                }
            }
        }
                
        
    }
}
