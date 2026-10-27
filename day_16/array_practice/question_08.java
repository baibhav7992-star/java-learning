package day_16.array_practice;
/*
Q9. Print Even Numbers

Use a for loop and if condition to print
only even numbers from the array.

Given:
int[] arr = {1, 2, 3, 4, 5, 6};

Expected Output:
2
4
6
*/
public class question_08 { 
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        for(int i=0;i<=arr.length;i++) {
            if(arr[i]%2==0) {
                System.out.println(arr[i]);
            }
        }

    
}
    
}
