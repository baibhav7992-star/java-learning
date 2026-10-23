package day_14.practice;
/*
Q4. Create a class named MaximumFinder.
Create a method findMaximum(int a, int b, int c)
that returns the greatest of three different integers.
Call the method with 25, 80, and 45.
Print the returned value in main().

Expected Output:
Maximum: 80
*/
class MaximumFinder {
    int findMaximum(int a,int b,int c) {
    if(a>b && b>c) {
        return a;

    }
    else if(b>a&&b>c) {
        return b;

    }
    else{
        return c;
    }
    
    
}
}
public class question_12 { 
    public static void main(String[] args) {
        MaximumFinder f1= new MaximumFinder();
        int findMaximum= f1.findMaximum(25,80,90);
        System.out.println("Maximum"+ ":" +findMaximum);
    
}
    
}
