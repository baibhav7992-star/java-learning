package day_14.practice;
/*
Q4. Create a class named Calculator.
Create a method divide(int a, int b) that returns
the quotient of two integers.
Call the method with 20 and 5.

Expected Output:
Division: 4
*/
class calculator3 {
    int divide(int a, int b) {
        int divisible=a%b;
        return divisible;
    }
}
public class question_08 { 
    public static void main(String[] args) {
        calculator3 c1 = new calculator3();
        int divide = c1.divide(20,5);
        System.out.println("Division"+ ":" +divide);


    
}
    
}
