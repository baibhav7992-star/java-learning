package day_09.practice;
import java.util.Scanner;
/*
Question 16

Create a function that takes temperature
and prints Hot or Cold.
*/
public class question_21 { 
    static void Temperature(int celsius) {
        System.out.println("your celsius is :" +celsius);
        if(celsius>=40 && celsius<=60) {
            System.out.println("hot");

        }
        if(celsius>=10 && celsius<=20) {
            System.out.println("cold");
        }

    }

    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("enter your celsius");
        int celsius = Sc.nextInt();
        Temperature(celsius);
    
}
    
}
