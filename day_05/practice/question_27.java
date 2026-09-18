package day_05.practice;
/*
Q4. Input N and calculate factorial
using reverse loop.

Example:
5 × 4 × 3 × 2 × 1
*/
public class question_27 { public static void main(String[] args) {
    int fact = 1;
    for(int i = 5;i>=1;i--)
    {
        fact = fact*i;
    }
    System.out.println("req factorial is" +fact);
    
}
    
}
