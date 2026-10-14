package com.pluralsight;

public class VariableApp {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");

    String name = "Andres";
    int age = 27;
    String favoriteColor = "Black";
    int yearStarted = 2026;
    char middleInitial =' ';
    boolean hasPets = true;
    String niceMessage = "Thanks for getting to know me!";

        System.out.println("Hi, I am " + name +" I am " + age + " Years old" + ".");
        System.out.println("my favorite color is "+ favoriteColor  + ".");
        System.out.println("The year I started this program " + yearStarted + "!");
        System.out.println("The first letter of my middle initial is " + middleInitial + ".");
        System.out.println(hasPets ? "I have pets." : "I do not have pets.");
        System.out.println(niceMessage);

        int daysOfTheWeek = 7;
        double priceOfCoffee = 4.99;
        char favoriteLetter = 'A';
        boolean isRaining = false;

        System.out.println("There is " + daysOfTheWeek + " days in a week.");
        System.out.println("The price of a coffee is " + priceOfCoffee + ".");
        System.out.println("My favorite letter is " + favoriteLetter + ".");
        System.out.println("It is raining today: " + isRaining + ".");

    }
}
