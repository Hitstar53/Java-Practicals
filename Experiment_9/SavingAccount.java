import java.util.*;
class negative_amount extends Exception {
    public negative_amount(double amt) {
        super();
    }
}
class insufficient_balance extends Exception {
    public insufficient_balance(double amt) {
        super();
    }
}
abstract class Account {
    String name;
    long account_no;
    double balance;
    abstract void deposit(double amt);
    abstract void withdraw(double amt);
    abstract void display();
}
public class SavingAccount extends Account {
    Scanner sc = new Scanner(System.in);
    double in_rate=3.5,minbal=0;
    SavingAccount(String name,long account_no,double balance) {
        this.name = name;
        this.account_no = account_no;
        this.balance = balance;
    }
    void setMinBal(double minbal) {
        this.minbal = minbal;
    }
    void addInterest() {
        balance = balance + (balance*in_rate/100);
    }
    void deposit(double amt) {
        balance += amt;
    }
    void withdraw(double amt) {
        balance -= amt;
    }
    void display() {
        System.out.println("Name: "+name);
        System.out.println("A/c No: "+account_no);
        System.out.println("Current Balance: "+balance);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = new String();
        long ac_no;
        double bal,minbal;
        System.out.print("Enter the name of the account holder: ");
        name = sc.nextLine();
        System.out.print("Enter the account number: ");
        ac_no = sc.nextLong();
        System.out.print("Enter the initial balance: ");
        bal = sc.nextDouble();
        SavingAccount sa = new SavingAccount(name,ac_no,bal);
        System.out.print("Enter the minimum balance: ");
        minbal = sc.nextDouble();
        sa.setMinBal(minbal);
        double amt;
        while(true) {
            System.out.println("\nWelcome to the Savings Account of "+name+"\nSelect 1 option:\n1.Deposit\n2.Withdraw\n3.Display");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter the amount to be deposited:");
                    try {
                        amt = sc.nextDouble();
                        if(amt<0) {
                            throw new negative_amount(amt);
                        }
                        else {
                            sa.deposit(amt);
                        }
                    }
                    catch (negative_amount ex) {
                        System.out.println("Amount cannot be negative!");
                    }
                    break;
                case 2:
                    System.out.println("Enter the amount to be withdrawn:");
                    try {
                        amt = sc.nextDouble();
                        if(amt>sa.balance || sa.balance-amt<sa.minbal) {
                            throw new insufficient_balance(amt);
                        }
                        else if(amt<0) {
                            throw new negative_amount(amt);
                        }
                        else {
                            sa.withdraw(amt);
                        }
                    }
                    catch (negative_amount e) {
                        System.out.println("Amount cannot be negative!");
                    }
                    catch (insufficient_balance e) {
                        System.out.println("Insufficient balance!");
                    }
                    break;
                case 3:
                    sa.display();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            if(choice!=3) {sa.display();}
            System.out.println("Do you want to continue?(y/n)");
            char ch = sc.next().charAt(0);
            if(ch=='n') {
                break;
            }
        }
        sc.close();
    }
}
