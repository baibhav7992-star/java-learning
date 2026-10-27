package day_16.array_practice;
/*
Q1. Find the Largest Element

Question:
Given an integer array, find and print the largest element.
Do not use any built-in sorting method.

Input:
int[] arr = {12, 45, 7, 90, 23};

Expected Output:
Largest element: 90
*/
public class question_11 { 
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 90, 23};
        int target = arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i]>target) {
                target=arr[i];
            }

        }
        System.out.println("Largest element"+ ":" +target);

    
}
    
}
