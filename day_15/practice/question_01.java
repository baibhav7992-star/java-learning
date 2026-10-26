package day_15.practice;

import javax.sound.sampled.SourceDataLine;

/*
Q1. Basic Parameterized Constructor

Create a class named MobilePhone.
Declare instance variables:
String brand;
int price;

Create a parameterized constructor to initialize
both variables.

Create a void method display() to print both values.

In main(), create two objects:
1. Samsung, price 20000
2. Apple, price 80000

Expected Output:
Brand: Samsung
Price: 20000
Brand: Apple
Price: 80000
*/

public class question_01 { 
    static class MobilePhone {
        String brand;
        int price;
        MobilePhone(String b,int p) {
            brand = b;
            price = p;
            System.out.println("Constructor called!");
        }
        void display() {
            System.out.println("Brand"+ ":" +brand);
            System.out.println("Price"+ ":" +price);


        }
    
    }
    public static void main(String[] args) {
        MobilePhone p1 = new MobilePhone("Samsung", 80000);

        MobilePhone p2= new MobilePhone("Apple",10000);
        p1.display();
        p2.display();
    
}
    
}
