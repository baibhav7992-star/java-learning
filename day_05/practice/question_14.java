package day_05.practice;
/*
Q14. Write a program to count how many numbers from 1 to 50 are divisible by 5.
*/
public class question_14 { public static void main(String[] args) {
    int count = 0;
    for(int i =1;i<=50;i++)
    {
        if(i%5==0)
        {
            count++;
        }
    }
    System.out.println("total divisible count :" +count);
    
}
    
}
