package day_12.practice;

public class question_12 {

public class Main {
    public static void main(String[] args) {

        /*
        Q5. Given array:
        {25, 10, 80, 5, 40}

        for loop aur if condition ka use
        karke maximum number find karo.

        Expected Output:
        Maximum = 80
        */


    }
}

public static void main(String[] args) {
    int number[]={25, 10, 80, 5, 40};
    int max = number[0];
    for(int i=0;i<number.length;i++) {
        if(number[i]>max) {
            max= number[i];
        }
    }
    System.out.println("Maximum =" +max);
    


    
    
}
    
}
