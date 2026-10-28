package day_17.array_practice;
/*
Q8. Reverse an Array

Question:
Print the elements of the array in reverse order.
Do not create a second array and do not use built-in
reverse methods.

Input:
int[] arr = {11, 22, 33, 44, 55};

Expected Output:
55
44
33
22
11
*/
public class question_13 { public static void main(String[] args) {
    int[] arr = {11, 22, 33, 44, 55};
    for(int i=arr.length-1;i>=0;i--) {
        System.out.println(arr[i]);
    }

    
}
    
}
