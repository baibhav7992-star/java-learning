package day_16.array_practice;
/*
Q10. Calculate Array Sum

Use a for loop to calculate the sum
of all elements in the array.

Given:
int[] arr = {1, 2, 3, 4, 5};

Expected Output:
Sum: 15
*/
public class question_09 { 
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum=0;
        for(int i=0;i<=arr.length;i++) {
            sum = sum+i;

        }
        System.out.println("Sum"+ ":" +sum);

    
}
    
}
