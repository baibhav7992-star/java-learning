package day_14.practice;
/*
Q1. Create a class named Addition.
Create a method add(int a, int b) that returns
the sum of two integers.
Call the method with 25 and 35.
Print the returned value in main().

Expected Output:
Sum: 60
*/
class Addition {
    int add(int a, int b) {
        int sum= a+b;
        return sum;
    }
}
public class question_09 { 
    public static void main(String[] args) {
        Addition a1= new Addition();
        int add = a1.add(25,35);
        System.out.println("Sum"+ ":" +add);
    
    
}
    
}
