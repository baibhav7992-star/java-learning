package day_12.practice;

public class question_22 {
    /*
Q1. Given array:
{10, 20, 30, 40, 50}

for loop ka use karke reverse order mein print karo.

Expected Output:
50
40
30
20
10
*/
     public static void main(String[] args) {
        int number[]={10, 20, 30, 40, 50};
        for(int i=number.length-1;i>=0;i--) {
            System.out.println(number[i]);
        }
    
}
    
}
