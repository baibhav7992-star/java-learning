package day_09.practice;
import java.util.Scanner;
/*
Question 14

Create a function that takes three numbers
and prints the largest number.
*/
public class question_19 { 
    static void printLarger(int number1,int number2,int number3) {
        System.out.println("your numbers are: " + number1 + ", " + number2 + ", " + number3);
        if(number1>number2 && number1>number2) {
            System.out.println("number1 is larger");
        }
        else if(number2>number1 && number2>number3) {
            System.out.println("number2 is larger");
        }
        else if(number3>number2 && number3>number1) {
            System.out.println("number3 is larger");

        }
        else {
            System.out.println("all number are same");
        }

        


    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter number1");
        int number1=Sc.nextInt();
        System.out.println("enter number2");
        int number2=Sc.nextInt();
        System.out.println("enter number3");
        int number3=Sc.nextInt();
        printLarger(number1,number2,number3);


    
}
    
}
