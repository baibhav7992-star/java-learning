package day_14.practice;
/*
Q6. Create a class named FactorialCalculator.
Create a method factorial(int n) that returns
the factorial of a non-negative integer.
Use a loop to calculate the factorial.
Call the method with 5.
Print the returned value in main().

Expected Output:
Factorial: 120
*/
class FactorialCalculator {
    int factorial(int n) {
        int fact=1;

        for(int i=1;i<=n;i++) {
            fact=fact*i;

        }
        return fact;
    }
}
public class question_13 { 
    public static void main(String[] args) {
        FactorialCalculator c1= new FactorialCalculator();
        int factorial= c1.factorial(5);
        System.out.println("Factorial"+ ":" +factorial);
    
}
    
}
