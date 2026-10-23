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
class DigitalCounter {
    int countDigits(int n) {
        if(n==0) {
            return 1;
        }
        int countDigits=0;
        while(n>0) {
            n=n/10;
            countDigits++;
        }
        return countDigits;
    }
}
public class question_15 { 
    public static void main(String[] args) {
        DigitalCounter d1=new DigitalCounter();
        int countDigits= d1.countDigits(123456);
        System.out.println("Digits"+ ":" +countDigits);
    
}
    
}
