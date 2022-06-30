import java.util.*;
class Westside {
    int clothes,accessories;
    Westside() {
        clothes = 10;
        accessories = 10;
    }
}
abstract class Payment{
    double pay;
    double per_pay;
    Payment(double per_pay) {
        pay = 25000;
        this.per_pay = per_pay;
    }
    abstract void paymentDetails();
}
class CashPayment extends Payment {
    CashPayment(double per_pay) {
        super(per_pay);
    }
    void paymentDetails() {
        pay += per_pay;
        System.out.println("Payment in Cash Successful!");
    }
}
class CreditCardPayment extends Payment {
    CreditCardPayment(double per_pay) {
        super(per_pay);
    }
    void paymentDetails() {
        pay += per_pay;
        System.out.println("Payment by Credit Card Successful!");
    }
}
public class Person {
    String p_name;
    int id;
    Person(String p_name,int id) {
        this.p_name = p_name;
        this.id = id;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] people = new Person[5];
        String name;
        int id;
        System.out.println("Enter Details of 5 people");
        for(int i=0;i<5;i++) {
            System.out.printf("\nPerson %d:\n",i+1);
            System.out.print("Enter Name:");
            name = sc.nextLine();
            System.out.print("Enter Id: ");
            id = sc.nextInt();
            people[i] = new Person(name, id);
        }
        sc.close();
    }
}
