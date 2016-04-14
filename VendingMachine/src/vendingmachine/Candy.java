/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

/**
 *
 * @author ismith5656
 */
public class Candy {
    String name;
    String type;
    int CPS;
    double price;
    public Candy(String name,String type, int CPS, double price){
        this.name = name;
        this.type = type;
        this.CPS = CPS;
        this.price = price;
    }
    public String getName(){
        return this.name;
    }
    public String getType(){
        return this.type;
    }
    public int getCPS(){
        return this.CPS;
    }
    public double getPrice(){
        return this.price;
    }
}
