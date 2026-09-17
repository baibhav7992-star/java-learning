package day_03.practice;
import java.util.Scanner;
/*
Q8. Write a program to input temperature in Celsius and display:
Hot if temperature is greater than 35
Normal if temperature is between 20 and 35
Cold if temperature is below 20
*/

public class question_08 { public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("enter temperature");
    int temperature = Sc.nextInt();
    if(temperature>20 && temperature<35)
        System.out.println("temperatre is normal:");
    else if(temperature >35)
        System.out.println("temperature is hot");
    else
        if(temperature > 20)
            System.out.println("temperature is cold");
    Sc.close();

    

    
}
    
}
