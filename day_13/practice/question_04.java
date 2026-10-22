package day_13.practice;
/*
Q7. Create a class Player with variables:
name and score.

Create three objects:
Player 1: Virat, 90
Player 2: Rohit, 75
Player 3: Dhoni, 60

Print the name and score of each player.

Expected Output:
Virat 90
Rohit 75
Dhoni 60
*/
class player {
    String name;
    int score;
    void display() {
        System.out.println(name+ " " +score);
    }
}
public class question_04 {
    public static void main(String[] args) {
        player p1= new player();
        p1.name="Virat";
        p1.score=90;
        player p2=new player();
        p2.name="Rohit";
        p2.score=75;
        player p3=new player();
        p3.name="Dhoni";
        p3.score=60;
        p1.display();
        p2.display();
        p3.display();
    
}
    
}
