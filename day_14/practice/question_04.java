package day_14.practice;
/*
Q5. Create a class named NumberCheck.
Create a void method check(int n) that accepts an integer.
Use if-else to check whether the number is even or odd.
Call the method with 17.

Expected Output:
Odd
*/
class NumberCheck {
    void check(int n) {
        if(n%2==0) {
            System.out.println("even");

        }
        else {
            System.out.println("odd");
        }
    }

}
public class question_04 { 
    public static void main(String[] args) {
        NumberCheck n1=new NumberCheck();
        n1.check(17);
    
}
    
}
