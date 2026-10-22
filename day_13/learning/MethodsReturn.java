
package day_13.learning;

// Example 1: Method with return value
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int square(int n) {
        return n * n;
    }

    boolean isEven(int n) {
        return n % 2 == 0;
    }

    int greater(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}

public class MethodsReturn {
    public static void main(String[] args) {

        // Creating an object
        Calculator c1 = new Calculator();

        // Calling add() and storing the returned value
        int sum = c1.add(10, 20);
        System.out.println("Sum: " + sum);

        // Calling square()
        int result = c1.square(12);
        System.out.println("Square: " + result);

        // Calling isEven()
        boolean answer = c1.isEven(8);
        System.out.println("Is Even: " + answer);

        // Calling greater()
        int max = c1.greater(15, 9);
        System.out.println("Greater: " + max);
    }
}
