package day_12.practice;

public class question_13 {
    /*
Q1. Given array: {25, 10, 80, 5,2, 40}
    for loop aur if condition ka use karke array mai se 
    sabse CHOTA (Minimum) number find karo.

Expected Output:
Minimum = 5
*/

     public static void main(String[] args) {
        int number[] =  {25, 10, 80, 5,2, 40};
        int minimum =number[0];
        for(int i=0;i<number.length;i++) {
            if(number[i]<minimum) {
                minimum=number[i];
            }
        }
        System.out.println("Minimum = " +minimum);
    
}
    
}
