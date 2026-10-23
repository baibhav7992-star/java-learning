package day_14.practice;
/*
Q2. Create a class named Calculator1.
Create a void method multiply(int a, int b) that
accepts two integers and prints their product.
Call the method with 5 and 4.

Expected Output:
Product: 20
*/
class calculator1 {
    void multiply(int a,int b) {
        int product = a*b;
        System.out.println("Product"+ ":"+ +product);
    }
}
public class question_02 { 
    public static void main(String[] args) {
        calculator1 c1=new calculator1();
        c1.multiply(5,4);
    
}
    
}
