package day_09.practice;
import java.util.Scanner;
/*
Question 11

Create a function that takes a number
and prints its multiplication table.
*/
public class question_18 { 
    static void printTable(int num) {
        System.out.println("multiplication of number is:" +num);
        for(int i=1;i<=10;i++) {
            int answer = i*num;
            System.out.println(answer);
        }
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter te number");
        int number = Sc.nextInt();
        printTable(number);

    
}
    
}
