import java.util.*;
class Employee {
    double salary,bonus;
    void getSalary() {
        salary = 10000;
    }
    void getBonus() {
        bonus = 0;
    }
}
class Intern extends Employee {
    void getSalary() {
        salary = salary*0.75;
    }
    void getBonus() {
        bonus = 690;
    }
}
class Clerk extends Employee {
    void getSalary() {
        salary = salary/2;
    }
    void getBonus() {
        bonus = 720;
    }
}
class Manager extends Employee {
    void getSalary() {
        salary = 2*salary;
    }
    void getBonus() {
        bonus = 1000;
    }
}
public class ABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Intern in = new Intern();
        in.getSalary();
        in.getBonus();
        System.out.printf("Salary of Intern: $%.2f",in.salary+in.bonus);
        Clerk cr = new Clerk();
        cr.getSalary();
        cr.getBonus();
        System.out.printf("\nSalary of Clerk: $%.2f",cr.salary+cr.bonus);
        Manager mg = new Manager();
        mg.getSalary();
        mg.getBonus();
        System.out.printf("\nSalary of Employee: $%.2f",mg.salary+mg.bonus);
        sc.close();
    }
}