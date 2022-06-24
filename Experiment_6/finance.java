import java.util.Scanner;
import java.util.Calendar;
import java.text.*;
import java.lang.Math; 
class Bank {
    double time;
    int p;
    double amt=0;;
    double rate=0;
    Bank(double time,int p) {
        this.time = time;
        this.p = p;
    }
    void get_rate_of_interest() {
        rate = 2;
    }
}
class SBI_bank extends Bank {
    SBI_bank(double time,int p) {
        super(time, p);
    }
    void get_rate_of_interest() {
        if(time>=7 && time<=14) {rate = 3;}
        else if(time>=15 && time<=30) {rate = 3;}
        else if(time>=31 && time<=45) {rate = 3;}
        else if(time>=46 && time<=90) {rate = 4.05;}
        else if(time>=91 && time<=120) {rate = 4.10;}
        else if(time<=121 && time>=180) {rate = 4.10;}
    }
    void display() {
        amt = (1+rate/100);
        amt = Math.pow(amt, time/365);
        amt = p*amt;
        System.out.printf("Total amount on Maturity: $%.2f\n",amt);
    }
}
class AXIS_Bank extends Bank {
    AXIS_Bank(double time,int p) {
        super(time, p);
    }
    void get_rate_of_interest() {
        if(time>=7 && time<=14) {rate = 3.15;}
        else if(time>=15 && time<=30) {rate = 3.15;}
        else if(time>=31 && time<=45) {rate = 3.45;}
        else if(time>=46 && time<=90) {rate = 4.05;}
        else if(time>=91 && time<=120) {rate = 4.70;}
        else if(time<=121 && time>=180) {rate = 5;}
    }
    void display() {
        amt = (1+rate/100);
        amt = Math.pow(amt, time/365);
        amt = p*amt;
        System.out.printf("Total amount on Maturity: $%.2f\n",amt);
    }
}
class ICICI_Bank extends Bank {
    ICICI_Bank(double time,int p) {
        super(time, p);
    }
    void get_rate_of_interest() {
        if(time>=7 && time<=14) {rate = 3.10;}
        else if(time>=15 && time<=30) {rate = 3.20;}
        else if(time>=31 && time<=45) {rate = 3.50;}
        else if(time>=46 && time<=90) {rate = 4.50;}
        else if(time>=91 && time<=120) {rate = 4.70;}
        else if(time<=121 && time>=180) {rate = 4.90;}
    }
    void display() {
        amt = (1+rate/100);
        amt = Math.pow(amt, time/365);
        amt = p*amt;
        System.out.printf("Total amount on Maturity: $%.2f\n",amt);
    }
}
public class finance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        DateFormat date = DateFormat.getDateInstance();
        int choice,flag,p;
        double time;
        while(true) {
            System.out.print("Enter time period(days): ");
            while(true) {
                time = sc.nextDouble();
                if(time<=120) {break;}
                else {System.out.print("Max Time limit is: 120 Days! Please Re-Enter time period: ");}
            }
            System.out.print("Enter the Amount: ");
            p = sc.nextInt();
            cal.add(Calendar.DATE,(int)time);
            System.out.println("Select 1 Bank:\n1 -> SBI Bank\n2 -> ICICI Bank\n3 -> AXIS Bank");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    SBI_bank b1 = new SBI_bank(time,p);
                    b1.get_rate_of_interest();
                    b1.display();
                    System.out.println("Your Amount will mature on: "+date.format(cal.getTime()));
                    break;
                case 2:
                    ICICI_Bank b2 = new ICICI_Bank(time,p);
                    b2.get_rate_of_interest();
                    b2.display();
                    System.out.println("Your Amount will mature on: "+date.format(cal.getTime()));
                    break;
                case 3:
                    AXIS_Bank b3 = new AXIS_Bank(time,p);
                    b3.get_rate_of_interest();
                    b3.display();
                    System.out.println("Your Amount will mature on: "+date.format(cal.getTime()));
                    break;
                default:
                    System.out.println("Invalid Bank!");
                    break;
            }
            System.out.println("Do you want to continue?(yes=1/0=no)");
            flag = sc.nextInt();
            if(flag==0) {
                break;
            }
        }
        sc.close();
    }
}
