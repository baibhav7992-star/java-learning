package day_09.practice;
import java.util.Scanner;
/*
Question 2

Create a function that takes two numbers as parameters
and prints the greater number.
*/
public class question_08 {
    static void checkGreater(int num1, int num2) {
        if(num1>num2) {
            System.out.println("num1 is greater"+num1);
        }
        else if(num2>num1){
            System.out.println("num2 is greater"+num2);
        }
        else {
            System.out.println("both number are equal");
        }

        {


        }
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter you 1st number");
        int number1 = Sc.nextInt();
        System.out.println("enter you 2nd number");
        int number2 = Sc.nextInt();
        checkGreater(number1,number42);
        Sc.close();

    
}
    
}
