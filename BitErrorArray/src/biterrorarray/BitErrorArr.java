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
    
    public BitErrorArr(){
        this.ROW = 8;  
        this.COL = 8;  
        this.even = r.nextBoolean() ;
        
    }
    
private int[][] makeArray(int arr[][], int ROW, int COL, boolean even){
     arr = new int[ROW][COL];
     even = r.nextBoolean() ;
       if(even){
        for (int i = 0; i < ROW;i++){
            for( int j = 0; j < COL;j++){
                if (i <= 7 && j <= 6){
                    arr[i][j] = r.nextInt(2);
                }
                if (i <= 7 && j == 7){
                    arr[i][j] =1;
                }
                
                 
            }
        }
       }else{
         for (int i = 0; i < ROW;i++){
            for( int j = 0; j < COL;j++){
                if (i <= 7 && j <= 6){
                    arr[i][j] = r.nextInt(2);
                }
                if (i <= 7 && j == 7){
                    arr[i][j] =1;
                } 
                 
            }
        }
       }
  return arr;
}
public void check(int arr[][], int ROW, int COL, boolean even){
    int[][] biarrV = new int[ROW][COL];
    int[][] biarrH = new int[ROW][COL];
    for(int i = 0;i < ROW;i++){
        for(int j = 0;j < COL;j++){
            if(i <= 0 && j==0){
                biarrV[i][j] = 1;
            }else{
                if(i <= 1 && j==1){
                biarrV[i][j] = 2;
                }else{
                    biarrV[i][j] = biarrV[i-1][j]^2;
                }
            }
            
            if(i == 0 && j<=0){
                biarrH[i][j] = 1;
            }else{
                if(i == 1 && j<=1){
                biarrH[i][j] = 2;
                }else{
                    biarrH[i][j] = biarrH[i][j-1]^2;
                }
            }
        }
    }
    if(even){
        
    }else{
        
    }
    for(int i = 0;i < ROW;i++){
        for(int j = 0;j < COL;j++){
           if(j == 0){
                    System.out.print( i +"|");
                }
                if(j < 7){
                    System.out.print(biarrV[i][j] + " ");
                }else{
                    System.out.print(biarrV[i][j]);
                }
                
                if( j == 7 ){
                    System.out.print("");
                    System.out.println("");
                }
        }
    }
    for(int i = 0;i < ROW;i++){
        for(int j = 0;j < COL;j++){
           if(j == 0){
                    System.out.print( i +"|");
                }
                if(j < 7){
                    System.out.print(biarrH[i][j] + " ");
                }else{
                    System.out.print(biarrH[i][j]);
                }
                
                if( j == 7 ){
                    System.out.print("");
                    System.out.println("");
                }
        }
    }
}
public int[][] createArr(){

return makeArray(this.bitArr, this.ROW, this.COL, this.even);
    
}

}
