package day_14.practice;

class Subtraction {
    int subtract(int a, int b) {
        return a - b;
    }
}

public class question_06 {
    public static void main(String[] args) {
        Subtraction obj = new Subtraction();

        int result = obj.subtract(50, 20);

        System.out.println("Difference: " + result);
    }
}