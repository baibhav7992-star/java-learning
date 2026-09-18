package day_05.practice;
/*
Count how many numbers from 1 to 100
are divisible by both 2 and 5.
*/
public class question_16 { public static void main(String[] args) {
    int count = 0;
    for(int i = 1;i<=200;i++)
    {
        if(i%2==0 && i%5==0)
            count++;

    }
    System.out.println("total cont number is"+count);

}
    
}
