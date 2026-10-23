package day_14.practice;
/*
Q10. Create a class named Calculator1.
Create four void methods:
1. add(int a, int b)
2. subtract(int a, int b)
3. multiply(int a, int b)
4. divide(int a, int b)

Each method must accept two integers and print its result.
Call all four methods with 20 and 5.

Expected Output:
Sum: 25
Difference: 15
Product: 100
Division: 4
*/

class Calculator1 {
    void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    void subtract(int a, int b) {
        System.out.println("Difference: " + (a - b));
    }

    void multiply(int a, int b) {
        System.out.println("Product: " + (a * b));
    }

    void divide(int a, int b) {
        System.out.println("Division: " + (a / b));
    }
}

public class question_05 {
    public static void main(String[] args) {
        Calculator1 c1 = new Calculator1();

        c1.add(20, 5);
        c1.subtract(20, 5);
        c1.multiply(20, 5);
        c1.divide(20, 5);
    }
}
