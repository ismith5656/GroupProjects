/**
 * *****************************************************************************
 * Program name: LinkedListRun 
 * Authors: Ira and 
 * Turn in date: 
 * Description: it will run linked list 
 * Input: 
 * Output:
********************************************************************************
 */
package linkedlist;



public class LinkedListRun {

    private static Long time = System.nanoTime();

    public static void main(String args[]) {

        new LinkedListRun().go();
    }

    public void go() {
        System.out.println("===========================================");
        System.out.println("=            Linked List Data             =");
        System.out.println("===========================================");
        ListObject Superhero = new ListObject("Superman Prime", "kriptonion", 
                "Basically god", 2147483647);
        ListObject Wizard = new ListObject("Gandalf", "Maia", "Magic", 100);
        ListObject Monsters = new ListObject("Godzilla", "unknown", 
                "Mouth Lazer", 1000);
        ListObject DragonBallZ = new ListObject("Goku", "Saiyan", 
                "Kamehameha", 100000);
        ListObject AdventureTime = new ListObject("Finn", "Human", 
                "Enchanted Sword", 90);

        LinkedList list = new LinkedList();
        list.add(Superhero.toStringObj());
        list.add(Wizard.toStringObj());
        list.add(Monsters.toStringObj());
        list.add(DragonBallZ.toStringObj());
        list.add(AdventureTime.toStringObj());

        System.out.print("Data List : ");

        System.out.println(list.toString());
        System.out.println();

        System.out.println("*******************************************");
        System.out.println();

        System.out.println("===========================================");
        System.out.println("=          Linked List Data -1            =");
        System.out.println("===========================================");
        list.remove(4);
        System.out.print("Data List : ");
        System.out.println(list.toString());
        System.out.println();
        System.out.println("*******************************************");

        System.out.println("===========================================");
        System.out.println("=         Linked List Data Moved         =");
        System.out.println("===========================================");
        list.add(DragonBallZ.toStringObj(), 3);
        System.out.print("Data List : ");
        System.out.println(list.toString());
        System.out.println();
        System.out.println("*******************************************");

        double executeTime = (System.nanoTime() - time) / 1000000000.0;
        System.out.println("Execute Time : " + executeTime + " s");
    }

}
