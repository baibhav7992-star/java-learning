package day_17.array_practice;
/*
Q3. WAP to find the index of a target element.
If the element is not found, print -1.

Array: {4, 8, 2, 9}
Target: 2

Expected Output:
2
*/
public class question_21 { 
    public static void main(String[] args) {
        int[] arr = {4, 8, 2, 9};
        int target=2;
        boolean found=false;
        for(int i=0;i<arr.length;i++) {
            if(target==arr[i]) {
                found=true;
            }
        }
        if(found) {
            System.out.println(""+ ":" +target);
        }
        else {
            System.out.println(""+ ":" +-1);
        }
        
    
}
}
