package day_05.practice;
/*
Write a program to find the sum of all even numbers from 1 to 100.
*/
public class question_21 { public static void main(String[] args) {
    int sum = 0;
    for(int i=1;i<=100;i++)
    {
        if(i%2==0)
            sum = sum+1;
    }
    System.out.println("total sum is" +sum);

    
}
    
}
