/**
 * *****************************************************************************
 * Program name: LinkedList 
 * Authors: Ira and 
 * Turn in date: Description: This
 * class will create a linked list which is a list all connected together by
 * each other and the beginning is attached to null Input: objects Output:
 * objects
********************************************************************************
 */
package linkedlist;

public class LinkedList {

    // reference to the begining obj1.

    private Obj1 begining;
    private int listCount;

    // LinkedList constructor
    public LinkedList() {
		// this is an empty list, so the reference to the begining obj1
        // is set to a new obj1 with no data
        begining = new Obj1(null);
        listCount = 0;
    }
    // post: appends the specified element to the end of this list.
    public void add(Object data) 
    {
        Obj1 temp = new Obj1(data);
        Obj1 current = begining;
        // starting at the begining obj1, crawl to the end of the list
        while (current.getNext() != null) {
            current = current.getNext();
        }
        // the last obj1's "next" reference set to our new obj1
        current.setNext(temp);
        listCount++;// increment the number of elements variable
    }
    // post: inserts the specified element at the specified position 
    //in this list.
    public void add(Object data, int index)
    {
        Obj1 temp = new Obj1(data);
        Obj1 current = begining;
		// crawl to the requested index or the last element in the list,
        // whichever comes first
        for (int i = 1; i < index && current.getNext() != null; i++) {
            current = current.getNext();
        }
        // set the new obj1's next-obj1 reference to this obj1's next-obj1 
        //reference
        temp.setNext(current.getNext());
        // now set this obj1's next-obj1 reference to the new obj1
        current.setNext(temp);
        listCount++;// increment the number of elements variable
    }
 // post: returns the element at the specified position in this list.
    public Object get(int index)
    {
        // index must be 1 or higher
        if (index <= 0) {
            return null;
        }

        Obj1 current = begining.getNext();
        for (int i = 1; i < index; i++) {
            if (current.getNext() == null) {
                return null;
            }

            current = current.getNext();
        }
        return current.getData();
    }
// post: removes the element at the specified position in this list.
    public boolean remove(int index) 
    {
        // if the index is out of range, exit
        if (index < 1 || index > size()) {
            return false;
        }

        Obj1 current = begining;
        for (int i = 1; i < index; i++) {
            if (current.getNext() == null) {
                return false;
            }

            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        listCount--; // decrement the number of elements variable
        return true;
    }

    public int size() // post: returns the number of elements in this list.
    {
        return listCount;
    }

    public String toString() {
        Obj1 current = begining.getNext();
        String output = "";
        while (current != null) {
            output += "[" + current.getData().toString() + "]";
            current = current.getNext();
        }
        return output;
    }

    private class Obj1 {
		// reference to the next obj1 in the chain,
        // or null if there isn't one.

        Obj1 next;
		// data carried by this obj1.
        // could be of any type you need.
        Object data;

        // Obj1 constructor
        public Obj1(Object _data) {
            next = null;
            data = _data;
        }

		// another Obj1 constructor if we want to
        // specify the obj1 to point to.
        public Obj1(Object _data, Obj1 _next) {
            next = _next;
            data = _data;
        }

        // these methods should be self-explanatory
        public Object getData() {
            return data;
        }

        public void setData(Object _data) {
            data = _data;
        }

        public Obj1 getNext() {
            return next;
        }

        public void setNext(Obj1 _next) {
            next = _next;
        }
    }
}
