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
public class BitErrorArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BitErrorArr arr = new BitErrorArr();
        int[][] Arr = arr.createArr();
        
        System.out.println("  1 2 3 4 5 6 7 8");
        System.out.println(" _________________");
        for (int i = 0; i < 8;i++){
            for( int j = 0; j < 8;j++){
                if(j == 0){
                    System.out.print( i +"|");
                }
                if(j < 7){
                    System.out.print(Arr[i][j] + " ");
                }else{
                    System.out.print(Arr[i][j]);
                }
                
                if( j == 7 ){
                    System.out.print("");
                    System.out.println("");
                }
            }
        }
        
    }
    

    
}
