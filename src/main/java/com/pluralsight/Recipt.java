package com.pluralsight;

public class Recipt {
    public static void main(String[] args) {

        //variables for an item name (String) and item price (double)
        String itemName;
        double itemPrice;
        //Create a quantity variable (int)
        int quantity;

        //Assign variables
        itemName = "shirts";
        itemPrice = 3.50;
        quantity = 2;

        //Print out all variables in one sentence
        System.out.println("You bought " + quantity + " " + itemName + " for $" + itemPrice);
    }
}
