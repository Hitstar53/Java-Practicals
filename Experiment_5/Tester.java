import java.util.*;
class Employee {
    private int age;
    private String name,id;
    Employee(String name,String id,int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    //getters
    int getage(){return age;}
    String getid(){return id;}
    String getname(){return name;}
    //setters
    void setid(String id){this.id = id;}
    void setname(String name){this.name = name;}
    void setage(int age){this.age = age;}
}
class SalariedEmployee extends Employee {
    private double salary;
    SalariedEmployee(String name,String id,int age,double empSalary) {
        super(name,id,age);
        setSalary(empSalary);
    }
    //setters & getters
    void setSalary(double salary){this.salary = salary;}
    double getSalary(){return salary;}
    void sortsal(int n,SalariedEmployee [] employees) {
        double max = 0;
        int c=0;
        for(int i=0;i<n;i++) {
            if(employees[i].getSalary()>max) {
                max = employees[i].getSalary();
                c = i;
            }
        }
        System.out.println("\nDetails of Highest-Paid Employee:\nEmployee ID\tName\tAge\tSalary");
        System.out.printf("%s\t%s\t%d\t%.2f",employees[c].getid(),employees[c].getname(),employees[c].getage(),employees[c].getSalary());
    }
}
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name,id;
        int age,e;
        double salary;
        System.out.print("No. of Employees: ");
        int n = sc.nextInt();
        SalariedEmployee [] employees = new SalariedEmployee[n];
        for(int i=0;i<n;i++) {
            System.out.printf("\nEmployee %d:\n",i+1);
            System.out.print("Enter name: ");
            name = sc.next();
            System.out.print("Enter ID: ");
            id = sc.next();
            System.out.print("Enter Age: ");
            age = sc.nextInt();
            System.out.print("Enter Salary: ");
            salary = sc.nextDouble();
            System.out.print("1 -> Permenant Employee\n2 -> Contracted Employee\n");
            e = sc.nextInt();
            if(e==1) {
                salary += 2000;
            }
            employees[i] = new SalariedEmployee(name,id,age,salary);
        }
        employees[0].sortsal(n,employees);
    }
}