import java.util.*;
class Employee {
    double salary,bonus;
    Employee(double salary) {
        this.salary = salary;
    }
    void getSalary() {
        salary = 10000;
    }
    void getBonus() {
        bonus = 0;
    }
}
class Intern extends Employee {
    void getSalary() {
        salary = (3*salary)/4;
    }
    void getBonus() {

    }
}
class Clerk extends Employee {
    void getSalary() {
        salary = salary/2;
    }
    void getBonus() {

    }
}
class Manager extends Employee {
    void getSalary() {
        salary = 2*salary;
    }
    void getBonus() {

    }
}
public class ABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
    }
}