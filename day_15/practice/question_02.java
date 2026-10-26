package day_15.practice;
/*
Q1. Basic Parameterized Constructor

Create a class named CAR.
Declare instance variables:
String brand;
int price;

Create a parameterized constructor to initialize
both variables.

Create a void method display() to print both values.

In main(), create two objects:
1. BMW, price 20000
2. Bolero, price 80000

Expected Output:
Brand: BMW
Price: 20000000
Brand: bolero
Price: 800000
*/
class Car {
    String brand;
    int price;
    Car(String b,int p) {
        brand = b;
        price = p;
        System.out.println("Constructor called!");
    }
    void display() {
        System.out.println("Brand"+ ":" +brand);
        System.out.println("Price"+ ":" +price);


    }



}

public class question_02 { 
    public static void main(String[] args) {
        Car c1= new Car("BMW",1000000);
        Car c2= new Car("Bolero",80000);
        c1.display();
        c2.display();
    
}
    
}
