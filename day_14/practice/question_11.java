package day_14.practice;
/*
Q3. Create a class named GreaterNumber.
Create a method findGreater(int a, int b) that returns
the greater of two different integers.
Call the method with 45 and 72.
Print the returned value in main().

Expected Output:
Greater: 72
*/
class GreaterNumber {
    int findGreater(int a, int b) {
        if(a>b) {
            return a;
        }
        else {
            return b;
        }
    }
}
public class question_11 {
    public static void main(String[] args) {
        GreaterNumber g1= new GreaterNumber();
        int findGreater= g1.findGreater(45,72);
        System.out.println("Greater"+ ":"+findGreater);

    
}
    
}
