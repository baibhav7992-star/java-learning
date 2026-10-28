package day_17.array_practice;
/*
Q2. WAP to reverse an array without using
another array.

Array: {1, 2, 3, 4, 5}

Expected Output:
5 4 3 2 1
*/
public class question_20 { 
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for(int i=arr.length-1;i>=0;i--) {
            System.out.print(arr[i]);
        }
    
}
    
}
