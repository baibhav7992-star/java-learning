package day_16.array_practice;
/*
Q8. Print Array in Reverse

Use a for loop to print array elements
in reverse order. Do not create another array.

Given:
int[] arr = {10, 20, 30, 40};

Expected Output:
40
30
20
10
*/
public class question_07 { 
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        for(int i=arr.length-1;i>=0;i--) {
            System.out.println(arr[i]);

        }

    
}
    
}
