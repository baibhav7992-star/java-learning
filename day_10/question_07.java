package day_10;
import java.util.Scanner;
/*
Question 9

Create a function that takes a number as parameter
and prints the reverse of the number.
*/
public class question_07 { 
    static void display(int number) {
        while(number > 0) {

        int remainder = number % 10;
        {

        System.out.print(remainder);

        number = number / 10;
        }
    }
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = Sc.nextInt();
        display(number);
    
}
    
}
