/**
 * *******************************************************************************
 * Program name: ListObject 
 * Authors: Ira and 
 * Turn in date: Description: This class is responsible for making objects 
 * for the linked list to hold. 
 * Input: name, species, ability, and strengthRating. 
 * Output: name,species, ability and strengthRating.
********************************************************************************
 */
package linkedlist;

public class ListObject {

    String name, species, ability;
    int strengthRating;

    // The object constructer 

    public ListObject(String name, String species, String ability, 
            int strengthRating) {
        this.name = name;
        this.species = species;
        this.ability = ability;
        this.strengthRating = strengthRating;
    }

    // THis method will print out the values of the object

    public String toStringObj() {
        String A = this.name + ", " + this.species + ", " + this.ability + ", " 
                + this.strengthRating;

        return A;
    }
}
