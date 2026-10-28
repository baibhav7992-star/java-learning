package day_17.array_practice;
/*
Q7. Find the Second-Largest Element

Question:
Find the second-largest DISTINCT element in the array.
Do not sort the array.

Input:
int[] arr = {10, 25, 8, 21, 18, 20};

Expected Output:
Second-largest element: 20
*/
public class question_08 { 
    public static void main(String[] args) {
        int[] arr = {10, 25, 8, 21, 18, 20};
        int largest = arr[0];
        int secondLargest = arr[0];
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>largest) {
                largest=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]!=largest) {
                if(arr[i]==secondLargest || arr[i]>secondLargest) {

                }
                
            }
        }
        System.out.println("Second-largest element"+ ":" +secondLargest);

    
}
    
}
