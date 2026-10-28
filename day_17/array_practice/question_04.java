package day_17.array_practice;
/*
Q6. Count Occurrences of an Element

Question:
Count how many times the target number appears
in the array.

Input:
int[] arr = {2, 5, 2, 8, 2, 9, 5};
int target = 2;

Expected Output:
Occurrences: 3
*/

public class question_04 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 8, 2, 9, 5};
        int target=2;
        int occurrence=0;
        for(int i=0;i<arr.length;i++) {
            if(target==arr[i]) {
                occurrence++;

            }
        }
        System.out.println("Occurrence"+ ":" +occurrence);
    
}
    
}
