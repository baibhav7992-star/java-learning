package day_10;
import java.util.Scanner;

/*
Question 1

Create a function that takes a number as parameter
and prints whether it is Even or Odd.
*/
public class question_03 { 
    static void display(int number) {
        System.out.println("your number are :" +number);
            if(number%2==0) {
                System.out.println("even");
            }
            else {
                System.out.println("odd");
            }
        
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int  number = Sc.nextInt();
        display(number);

    
}
    
}
