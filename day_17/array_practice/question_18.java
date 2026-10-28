package day_17.array_practice;
/*
Q9. Copy One Array into Another

Question:
Create a second array of the same length.
Copy every element from the first array into the second
using a loop, then print the second array.

Input:
int[] arr = {4, 8, 12, 16, 20};

Expected Output:
4
8
12
16
20
*/
public class question_18 { 
    public static void main(String[] args) {
        int[] arr = {4, 8, 12, 16, 20};
        int[] copiedArr = new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            copiedArr[i]=arr[i];
        }
        for(int i=0;i<copiedArr.length;i++) {
            System.out.println(copiedArr[i]+ "");
        }

    
}
    
}
