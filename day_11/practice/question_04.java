package day_11.practice;
import java.util.*;

public class question_04 { 
    static int giveNumber(int number) {
        return number;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter your number");
        int number = Sc.nextInt();
        System.out.println("your number is " +number);
        int result = giveNumber(number);
        System.out.println(result);
        Sc.close();



    
}
    
}
