import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.text.*;
class Person {
    String name;
    String date;
    Person(String name, String date) {
        this.name = name;
        this.date = date;
    }
}
class Doctor extends Person {
    int fees;
    int income;
    String field;
    Doctor(String name,String date,int fees,int income,String field) {
        super(name,date);
        this.fees = fees;
        this.income = income;
        this.field = field;
    }
}
class Patient extends Person {
    Scanner sc = new Scanner(System.in);
    String disease;
    int doc;
    Patient(String name,String date,String disease) {
        super(name,date);
        this.disease = disease;
    }
    void getDoctor(Doctor [] doctors) {
        System.out.println("Available Doctors:");
        for(int i=0;i<doctors.length;i++) {
            System.out.printf("%d. %s\t%s\n",i+1,doctors[i].name,doctors[i].field);
        }
        System.out.print("Which Doctor Should be Assigned?(Enter Sr.No.): ");
        doc = sc.nextInt();
        doc -= 1;
        System.out.printf("You have been Assigned Mr/Mrs. %s",doctors[doc].name);
    }
}
class Billing {
    void getBill(Patient [] patients,Doctor [] doctors,int ad_fee) {
        for(int i=0;i<patients.length;i++) {
            System.out.printf("\nBill for %s:\n",patients[i].name);
            System.out.printf("Doctor: %s\nDate of Admission: %s\nDisease: %s\nTotal Amount Payable: %d\n",doctors[patients[i].doc].name,patients[i].date,patients[i].disease,doctors[patients[i].doc].fees+ad_fee);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Admission Fee of the Hospital: ");
        int ad_fee = sc.nextInt();
        System.out.print("Enter no. of doctors: ");
        int n = sc.nextInt();
        Doctor[] doctors = new Doctor[n];
        String name,date,field,disease;
        int fees,income;
        for(int i=0;i<n;i++) {
            sc.nextLine();
            System.out.printf("\nDoctor %d\nEnter name: ",i+1);
            name = sc.nextLine();
            System.out.print("Enter Date of Employment(DD/MM/YY): ");
            date = sc.nextLine();
            System.out.print("Enter field: ");
            field = sc.nextLine();
            System.out.print("Enter fees: ");
            fees = sc.nextInt();
            System.out.print("Enter income: ");
            income = sc.nextInt();
            doctors[i] = new Doctor(name,date,fees,income,field);
        }
        System.out.print("\nEnter no. of Patients: ");
        n = sc.nextInt();
        Patient[] patients = new Patient[n];
        for(int i=0;i<n;i++) {
            sc.nextLine();
            System.out.printf("\nPatient %d\nEnter name: ", i + 1);
            name = sc.nextLine();
            System.out.print("Enter Date of Admission(DD/MM/YY): ");
            date = sc.nextLine();
            System.out.print("Enter disease: ");
            disease = sc.nextLine();
            patients[i] = new Patient(name,date,disease);
            patients[i].getDoctor(doctors);
        }
        Billing b = new Billing();
        b.getBill(patients, doctors,ad_fee);
        sc.close();
    }
}
