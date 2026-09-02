package day_02.learning;

import java.util.Scanner;

public class Float {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first decimal number:");
        float a = sc.nextFloat();

        System.out.println("Enter second decimal number:");
        float b = sc.nextFloat();

        float sum = a + b;

        System.out.println("Sum = " + sum);

        sc.close();
    }
}
