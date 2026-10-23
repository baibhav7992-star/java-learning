package day_14.learning;

class Calculator {

    int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}

public class MethodsWithReturnValue {
    public static void main(String[] args) {

        Calculator c1 = new Calculator();

        int result = c1.add(10, 20);

        System.out.println("Sum: " + result);
    }
}