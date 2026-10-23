package day_14.practice;
/*
Q9. Create a class named NumberReverser.
Create a method reverse(int n) that returns
the reverse of a non-negative integer.
Use a loop to reverse the digits.
Call the method with 1234.
Print the returned value in main().

Expected Output:
Reversed: 4321
*/
class NumberReverser {
    public int reverse(int n) {
        int reversed = 0;
        
        while (n > 0) {
            reversed = (reversed * 10) + (n % 10);
            n = n / 10;
        }
        
        return reversed;
    }
}
public class question_17 { 
    public static void main(String[] args) {
        NumberReverser obj = new NumberReverser();
        System.out.println("Reversed: " + obj.reverse(1234));
    
}
    
}
