/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biterrorarray;
import java.util.Random;
/**
 *
 * @author ismith5656
 */
 public class BitErrorArr {
    private final int ROW;
    private final int COL;
    private final Random r = new Random();
    private final boolean even;
    private int[][] bitArr;
    
    public BitErrorArr(int ROW, int COL){
        this.ROW = ROW;  
        this.COL = COL;  
        this.even = this.r.nextBoolean() ;
        makeArray(this.bitArr, this.ROW, this.COL, this.even);
    }
    
private int[][] makeArray(int arr[][], int ROW, int COL, boolean even){
     arr = new int[ROW][COL];
        int num = 0;
        for (int i = 0; i < ROW;i++){
            for( int j = 0; j < COL;j++){
                num++;
                arr[i][j] = num;
            }
        }
  return arr;
}
public void printArr(){
    for(int i = 0; i < this.ROW;i++){
        for( int j = 0; j < this.COL;j++){
              if(j == 0){
                    System.out.print("[");
                }
                if(j < 8){
                    System.out.print(this.bitArr[i][j] + ",");
                }else{
                    System.out.print(this.bitArr[i][j]);
                }
                
                if( j == 8 ){
                    System.out.print("]");
                    System.out.println("");
                }
        
            }
    }
}
}
