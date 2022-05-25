import java.util. *;
class Empdetail {
    private String EmpName,EmpId;
    private int Salary;
    //getters
    String getEmpName(){return EmpName;}
    String getEmpId(){return EmpId;}
    int getSalary(){return Salary;}
    //setters
    void setEmpName(String name){EmpName=name;}
    void setEmpId(String id){EmpId=id;}
    void setSalary(int sal){Salary=sal;}
    //utility methods
    void display(){
        System.out.println("Employee name: "+EmpName);
        System.out.println("Employee id: #"+EmpId);
        System.out.println("Salary: $"+Salary);
    }
}
class Employee {
    public static void main(String[] args) {
        Empdetail e1 = new Empdetail();
        Empdetail e2 = new Empdetail();
        Empdetail e3 = new Empdetail();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee1 Details: ");
        System.out.print("Enter name: ");
        e1.setEmpName(sc.nextLine());
        System.out.print("Enter id: ");
        e1.setEmpId(sc.nextLine());
        System.out.print("Enter salary: ");
        e1.setSalary(sc.nextInt());

        System.out.println("\nEnter employee2 Details: ");
        System.out.print("Enter name: ");
        sc.nextLine();
        e2.setEmpName(sc.nextLine());
        System.out.print("Enter id: ");
        e2.setEmpId(sc.nextLine());
        System.out.print("Enter salary: ");
        e2.setSalary(sc.nextInt());

        System.out.println("\nEnter employee3 Details: ");
        System.out.print("Enter name: ");
        sc.nextLine();
        e3.setEmpName(sc.nextLine());
        System.out.print("Enter id: ");
        e3.setEmpId(sc.nextLine());
        System.out.print("Enter salary: ");
        e3.setSalary(sc.nextInt());

        System.out.println("Employee Having Highest Salary: ");
        if (e1.getSalary() > e2.getSalary() && e1.getSalary() > e3.getSalary()) {
            e1.display();
        } else if (e2.getSalary() > e1.getSalary() && e2.getSalary() > e3.getSalary()) {
            e2.display();
        } else {
            e3.display();
        }
    }
}