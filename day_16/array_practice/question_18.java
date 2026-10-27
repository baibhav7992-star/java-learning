package day_16.array_practice;
/*
Q3. Calculate the Average of Array Elements

Question:
Calculate the sum of all array elements and then
calculate their average.

Input:
int[] arr = {100, 200, 300, 40, 50};

Expected Output:
Sum:
Average:
*/
public class question_18 { 
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 40, 50};
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            sum = sum+arr[i];
        }
        double average = (double) sum/arr.length;
        System.out.println("Sum"+ ":" +sum);
        System.out.println("Average"+ ":" +average);
    
}
    
}
