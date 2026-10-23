package day_14.practice;
/*
Q7. Create a class named DigitCounter.
Create a method countDigits(int n) that returns
the number of digits in a non-negative integer.
Use a loop to count the digits.
Call the method with 5832.
Print the returned value in main().

Expected Output:
Digits: 4
*/
class DigitCounter {
    int countDigits(int n) {
        if(n==0) {
            return 1;
        }
        int countDigit=0;
        while(n>0)
        {
            n=n/10;
            countDigit++;
        }
        return countDigit;
    }
}
public class question_14 { 
    public static void main(String[] args) {
        DigitCounter d1= new DigitCounter();
        int countDigits=d1.countDigits(5832);
        System.out.println("Digits"+ ":" +countDigits);
    
}
    
}
