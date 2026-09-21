package day_08.practice;
/*

Find Factorial of 5

5! = 5×4×3×2×1

Expected Output:

120

*/
public class question_07 { public static void main(String[] args) {
    int fact =1;
    int i=1;
    while(i<=5) {
        fact=fact*i;
        i++;
    }
    System.out.println("req factorial is" +fact);
    
}
    
}
