/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author ismith5656
 */
import java.util.ArrayList;

public class LinkedListRun {

    

        private static Long time = System.nanoTime();
       

        public static void main(String args[]) {
            
            new LinkedListRun().go();
        }

        public void go() {
            System.out.println("===========================================");
            System.out.println("=            Linked List Data             =");
            System.out.println("===========================================");
            LinkedList list = new LinkedList();
           
		
            
            System.out.print("        Data List : ");
            list.get(0).printData();
            System.out.println();
            System.out.print("Reverse Data List : ");
            list.get(list.size() - 1).printReverseData();
            System.out.println();
            System.out.println("===========================================");
            System.out.println("delete data 3");
            list.get(2).delete();
            System.out.println("===========================================");
            System.out.print("        Data List : ");
            list.get(0).printData();
            System.out.println();
            System.out.print("Reverse Data List : ");
            list.get(list.size() - 1).printReverseData();
            System.out.println();
            System.out.println("===========================================");
            System.out.println("delete data 1");
            list.get(1).delete();
            System.out.println("===========================================");
            System.out.print("        Data List : ");
            list.get(0).printData();
            System.out.println();
            System.out.print("Reverse Data List : ");
            list.get(list.size() - 1).printReverseData();
            System.out.println();
            System.out.println("===========================================");
            double executeTime = (System.nanoTime() - time) / 1000000000.0;
            System.out.println("Execute Time : " + executeTime + " s");
        }
    
}
