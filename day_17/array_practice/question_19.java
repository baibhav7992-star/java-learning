package day_17.array_practice;
/*
Q1. WAP to find the second largest distinct element
in an array.

Array: {10, 5, 20, 20, 8}

Expected Output:
10
*/
public class question_19 { 
    public static void main(String[] args) {
        int[] arr={10, 5, 20, 20, 8};
        int largest=arr[0];
        int secondLargest=arr[0];
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>largest) {
                largest=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]!=largest) {
                if(arr[i]==secondLargest || arr[i]>secondLargest) {
                    secondLargest=arr[i];
                }
            }
        }
        System.out.println("secondLargest"+ ":" +secondLargest);

    
}
    
}
