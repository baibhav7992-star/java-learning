package day_14.practice;
/*
Q1. Create a class named Calculator.
Create a void method add(int a, int b) that accepts
two integers and prints their sum.
Create an object and call the method with 10 and 20.

Expected Output:
Sum: 30
*/
class calculator {
    void display(int a,int b) {
        int sum= a+b;
        System.out.println("Sum"+ " "+sum);


    }
}
public class question_01 { 
    public static void main(String[] args) {
        calculator c1= new calculator();
        c1.display(10,20);
    
}
    
}
