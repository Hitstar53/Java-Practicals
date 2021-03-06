import java.util. *;
import java.lang.Math;
class bank {
    Scanner sc = new Scanner(System.in);
    double in_bal;
    double roi;
    double time;
    bank() {
        roi = 3.5;
        in_bal = 10000;
    }
    double deposit(double dep) {
        if(dep>0) {
            in_bal = in_bal + dep;
        }
        else {
            System.out.println("Enter valid deposit amount!");
        }
        return in_bal;
    }
    double withdraw(double with) {
        if(with<in_bal) {
            in_bal = in_bal - with;
        }
        else {
            System.out.println("Withdraw amount cant be more than balance!");
        }
        return in_bal;
    }
    double comp_int() {
        double amt;
        System.out.println("Enter Rate of interest: ");
        roi = sc.nextDouble();
        System.out.println("Enter Time period in yrs: ");
        time = sc.nextDouble();
        amt = in_bal*Math.pow((double)(1 + roi/100),time);
        return amt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bank b1 = new bank();
        System.out.println("Welcome to Banking System:");
        while(true) {
            System.out.println("Select 1 choice:\n1 -> Deposit\n2 -> Withdraw\n3 -> Compund Interest");
            int choice = sc.nextInt();
            double deposit,bal,withdraw;
            int flag;
            switch (choice) {
                case 1:
                    System.out.println("Enter deposit amount: ");
                    deposit = sc.nextDouble();
                    bal = b1.deposit(deposit);
                    System.out.println("Current Balance: $"+bal);
                    break;
                case 2:
                    System.out.println("Enter Withdraw amount: ");
                    withdraw = sc.nextDouble();
                    bal = b1.withdraw(withdraw);
                    System.out.println("Current Balance: $"+bal);
                    break;
                case 3:
                    bal = b1.comp_int();
                    System.out.printf("Final amount: $%.2f\n",(float)bal);
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
            System.out.println("Do you want to continue?(yes=1/no=0)");
            flag = sc.nextInt();
            if(flag==0) {
                break;
            }
        }
        sc.close();
    }
}