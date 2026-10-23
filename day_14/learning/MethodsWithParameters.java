package day_14.learning;

class Calculator {

    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
}

public class MethodsWithParameters {
    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        c1.add(10, 20);
    }
}