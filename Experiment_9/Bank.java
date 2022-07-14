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
    int account_no;
    double balance;
    abstract void deposit(double amt);
    abstract void withdraw(double amt);
    abstract void display();
}
class SavingAccount extends Account {
    Scanner sc = new Scanner(System.in);
    double in_rate=3.5,minbal=0;
    SavingAccount(String name,int account_no,double balance) {
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
        System.out.println("Enter the name of the account holder:");
        String name = sc.next();
        System.out.println("Enter the account number:");
        int ac_no = sc.nextInt();
        System.out.println("Enter the initial balance:");
        double bal = sc.nextDouble();
        SavingAccount sa = new SavingAccount(name,ac_no,bal);
        System.out.println("Enter the minimum balance:");
        double minbal = sc.nextDouble();
        sa.setMinBal(minbal);
        double amt;
        while(true) {
            System.out.println("Welcome to the Saving Account of "+name+"\nSelect 1 option:\n1.Deposit\n2.Withdraw\n3.Display");
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
            sa.display();
            System.out.println("Do you want to continue?(y/n)");
            char ch = sc.next().charAt(0);
            if(ch=='n') {
                break;
            }
        }
        sc.close();
    }
}
