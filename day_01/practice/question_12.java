package day_01.practice;

public class question_12 { 
    public static void main(String[] args) {
        int basic = 30000;
        int hra = 2000;
        int ta = 1500;
        int tax = 2500;
        int grossSalary = basic + hra + ta;
        int netSalary = grossSalary - tax; 
        System.out.println("Required Gross Salary is: " + grossSalary);
        System.out.println("Required Net Salary is: " + netSalary);
    }
}
