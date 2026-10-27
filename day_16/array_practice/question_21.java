package day_16.array_practice;
/*
Q5. Search an Element in an Array

Question:
Search for the target element in the array using a loop.
If found, print its index; otherwise, print "Not Found".

Input:
int[] arr = {10, 25, 30, 45, 50};
int target = 30;

Expected Output:
Element found at index: 2
*/

public class question_21 { 
    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 45, 50};
        int target=30;
        for(int i=0;i<arr.length;i++) {
            if(target==arr[i]) {
                System.out.println("Element found at index"+ ":"+i);
        
            }
        }
        
    
}
    
}
