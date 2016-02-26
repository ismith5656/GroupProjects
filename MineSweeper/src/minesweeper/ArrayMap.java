/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.util.Random;

/**
 *
 * @author ismith5656
 */
public class ArrayMap {

    char[][] Map;
    int numBombs;
    boolean[][] bomb;

    public ArrayMap(char[][] Map, int numBombs, boolean[][] bomb) {
        this.Map = Map;
        this.numBombs = numBombs;
        this.bomb = bomb;
    }

    public void MakeMap(int ROW, int COL) {
        for (int R = 0; R < ROW; R++) {
            for (int C = 0; C < COL; C++) {
                Map[ROW][COL] = '0';
                bomb[ROW][COL] = false;
            }
        }
    }

    public void ranBombGen(int ROW, int COL) {
        Random r = new Random();
        int x;
        int y;
        for (int i = 0; i < this.numBombs; i++) {
            x = r.nextInt(ROW);
            y = r.nextInt(COL);
            this.bomb[x][y] = true;
        }
    }
    public void checkClose(int x, int y){
        for(int i = 0; i < 2; i++){
            if(this.bomb[x][y]){
                
            }
        }
    }
    public int up(int y){
        return y + 1;
    }
public int down(int y){
        return y - 1;
    }
public int right(int x){
        return x + 1;
    }
public int left(int y){
        return y - 1;
    }

}
