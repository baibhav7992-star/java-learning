package day_10;
import java.util.Scanner;
/*
Question 8

Create a function that takes a number as parameter
and prints the factorial of the number.
*/
public class question_06 { 
    static void display(int fact) {
        int factorial =1;
        for(int i=1;i<=fact;i++) {
            System.out.println("your factorial is :" +factorial);
            fact =fact*i;
        }
        System.out.println("number");



    }
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter your number");
        int number = Sc.nextInt();
        display(number);

    
}
    
}
