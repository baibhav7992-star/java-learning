package day_14.practice;
/*
Q2. Create a class named Calculator3.
Create a method subtract(int a, int b) that returns
the difference between two integers.
Call the method with 50 and 20.

Expected Output:
Difference: 30
*/
class Calculator3 {
    int subtract(int a, int b) {
        return a - b;
    }
}

public class question_07 {
    public static void main(String[] args) {
        Calculator3 obj = new Calculator3();

        int result = obj.subtract(50, 20);

        System.out.println("Difference: " + result);
    }
}
