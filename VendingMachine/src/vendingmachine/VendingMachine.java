/*
 * 
 * 
 * 
 */
package vendingmachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ismith5656
 */
public class VendingMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String in;
        List<List<List<Object>>> create = create(3, 3, 3);
        in = input.next();
        System.out.println(checkLetter(in));
    }

    public static <E> List<List<List<E>>> create(int dim1, int dim2, int dim3) {
        List<List<List<E>>> list1 = new ArrayList<List<List<E>>>(dim1);
        for (int i = 0; i < dim1; i++) {
            List<List<E>> list2 = new ArrayList<List<E>>(dim2);
            for (int j = 0; j < dim2; j++) {
                List<E> list3 = new ArrayList<E>(dim3);
                for (int k = 0; k < dim3; k++) {
                    list3.add(null);
                }
                list2.add(list3);
            }
            list1.add(list2);
        }
        return list1;
    }

    public static int checkLetter(String input) {
        String exp1 = "[a-c]";
        String exp2 = "[A-C]";
        int test;
        CharSequence inputStr = input;
        Pattern correctLetter = Pattern.compile(exp1);
        Pattern correctLetterCap = Pattern.compile(exp2);
        Matcher check = correctLetter.matcher(inputStr);
        Matcher checkCap = correctLetterCap.matcher(inputStr);
        if (check.matches()) {
            test = (int) input.charAt(0) - 97;
        }else{
            test = 100;
        }
        if(checkCap.matches()){
            test = (int) input.charAt(0) - 65;
        }else{
            test = 100;
        }

        return test;

    }
}
