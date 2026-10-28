package day_17.array_practice;
/*
Q5. Search an Element in an Array

Question:
Search for the target element in the array using a loop.
If found, print its index; otherwise, print "Not Found".

Input:
int[] arr = {10, 25, 30, 45, 50};
int target = 50;

Expected Output:
Element found at index: 4
*/
public class question_02 { 
    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 45, 50};
        int target=50;
        boolean found=false;
        for(int i=0;i<arr.length;i++) {
            if(target==arr[i]) {
                System.out.println("Element found at index"+ ":" +i);
                found=true;
            }

        
        }
        if(found!=true) {
            System.out.println("Not found");

        }
    
}
    
}
