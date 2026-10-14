package com.pluralsight;
public class Receipt {
    public static void main(String[] args) {

        String itemName = "shoe strings";
        double itemPrice = 1.99;
        int quantity = 5;


    double totalPrice = itemPrice * quantity;

        System.out.println("Item: " + itemName);
        System.out.println("Price: $" + itemPrice);
        System.out.println("Total: $" + totalPrice);
        System.out.println("You bought " + quantity + " " + itemName + " for $" + totalPrice);

    }
}