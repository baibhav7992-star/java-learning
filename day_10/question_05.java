package day_10;
import java.util.Scanner;
/*
Question 5

Create a function that takes a number as parameter
and prints its multiplication table.
*/
public class question_05 { 
    static void display(int number) {
        System.out.println("your number are :" +number);
        for(int i=number;i<=number*10;i=i+number) {
            System.out.println(i);

        }
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter your number");
        int number = Sc.nextInt();
        display(number);

    
}
    
}
