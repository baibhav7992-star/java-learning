package day_14.practice;
/*
Q8. Create a class named PrimeChecker.
Create a method isPrime(int n) that returns true
if the number is prime, otherwise returns false.
Use a loop to check divisibility.
Call the method with 17.
Print the returned value in main().

Expected Output:
Is Prime: true
*/
class PrimeChecker {
    boolean isPrime(int n) {
        if(n%2!=0) {
            return true;
        }
        else {
            return false;
        }
    }
}
public class question_16 { 
    public static void main(String[] args) {
        PrimeChecker p1= new PrimeChecker();
        boolean isPrime= p1.isPrime(17);
        System.out.println("Is Prime"+ ":" +isPrime);

    
}
    
}
