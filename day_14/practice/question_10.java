package day_14.practice;
/*
Q2. Create a class named NumberChecker.
Create a method isEven(int n) that returns true
if the number is even, otherwise returns false.
Call the method with 18.
Print the returned value in main().

Expected Output:
Is Even: true
*/
class NumberChecker {
    boolean isEven(int n) {
        return n%2==0;
        

    }
}
public class question_10 { 
    public static void main(String[] args) {
        NumberChecker c1= new NumberChecker();
        boolean result= c1.isEven(18);
        System.out.println("Is Even"+ ":" +result);
        


    
}
    
}
