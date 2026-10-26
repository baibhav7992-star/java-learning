package day_15.practice;

/*
Q3. Constructor with Three Parameters

Create a class named EmployeeDetails.
Declare:
String name;
int id;
double salary;

Create a parameterized constructor to initialize all variables.
Create a display() method to print all details.

Create one object:
Name: Rahul
ID: 101
Salary: 35000
*/
class Employeedetails {
    String name;
    int id;
    double salary;
    Employeedetails(String n,int i,double S) {
        name = n;
        id = i;
        salary = S;

        
        System.out.println("Constructor called!");
    }
    

    
    void display() {
        System.out.println("Name"+ ":" +name);
        System.out.println("ID"+ ":" +id);
        System.out.println("SALARY"+ ":" +salary);
    }
}
public class question_03 {
    public static void main(String[] args) {
        Employeedetails d1= new Employeedetails("Rahul",101,35000);
        d1.display();
    }
    

    
}
