package com.company;

import java.util.Scanner;

public class CashRegister {
    Scanner sc = new Scanner(System.in);
    private double price;
    private double vatRate;
    private double totalVAT;
    private double quantity;

    String name;
    String item;


    public void getData(){
        System.out.print("What type of product is it? Food or non-food: ");
        item = sc.next();

        System.out.print ("Enter the name of the product = ");
        name = sc.next();

        System.out.print("Enter the price of the product = ");
        price = sc.nextDouble();

        System.out.print("Enter number of products = ");
        quantity = sc.nextDouble();
    }

    public double calculateVAT(){
        if(item.equals("food")){
            vatRate = 0.09;
            totalVAT = price * vatRate;
        }
        else if (item.equals("nonfood")) {
            vatRate = 0.24;
            totalVAT = price * vatRate;
        }
        else {
            System.exit(0);
        }

        /*
        switch(item){
            case "food":
                vatRate = 0.09;
                totalVAT = price * vatRate;
                break;
            case "nonfood":
                vatRate = 0.24;
                totalVAT = price * vatRate;
                break;
            default:
                System.exit(0);
        }*/
        return totalVAT;
    }

    public double calculateTotalPrice(){
        double totalPrice;
        totalPrice = (price + totalVAT) * quantity;
        return totalPrice;
    }

    public void display(){
        System.out.print("\n\t Numele produsului:  " + name);
        System.out.print("\n\t Pretul produsului fara TVA:  " + price);
        System.out.print("\n\t Cantitatea: " + quantity);
        System.out.print("\n\t TVA: " + calculateVAT());
        System.out.print("\n\t Pretul produsului cu TVA: " + price + " x " + quantity + " + " + totalVAT*quantity + " = " + calculateTotalPrice());
    }
}
