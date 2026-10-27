package day_16.array_practice;
/*
Q2. Find the Smallest Element

Question:
Given an integer array, find and print the smallest element.

Input:
int[] arr = {34, 12, 56, 8, 91};

Expected Output:
Smallest element: 8
*/
public class question_15 { 
    public static void main(String[] args) {
        int[] arr = {34, 12, 56, 8, 91};
        int smallest = arr[0];
        for(int i=0;i<arr.length;i++) {
            if(arr[i]<smallest) {
                smallest=arr[i];
            }
        }
        System.out.println("Smallest element"+ ":" +smallest);
        



    
}
    
}
