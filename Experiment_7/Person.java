import java.util.*;
class Westside {
    int clothes = 10;
    int accessories = 10;
    void reduce_clothes(int n) {
        clothes = clothes - n;
    }
    void reduce_accessories(int m) {
        accessories = accessories - m;
    }
}
abstract class Payment {
    abstract void payment_details(int a, int b);
}
class cashpayment extends Payment {
    void payment_details(int a, int b) {
        System.out.println("Amount " + a + " Paid in cash, balance : " + b);
    }
}
class CreditCardPayment extends Payment {
    String cardname;
    int cardnumber;
    int carddate, cardmonth, cardyear;
    int e;
    static int balance;
    CreditCardPayment() {
        balance = 25000;
    }
    void get_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Card name:");
        cardname = sc.next();
        System.out.println("Enter card number:");
        cardnumber = sc.nextInt();
        System.out.println("Enter expiry date in dd/mm/yyyy format:");
        carddate = sc.nextInt();
        cardmonth = sc.nextInt();
        cardyear = sc.nextInt();
        sc.close();
    }
    int reduce_card(int n) {
        balance = balance - n;
        return balance;
    }
    void payment_details(int a, int r) {
        System.out.println("Amount $" + a + " paid by credit card , Card Name: " + this.cardname
                + " Credit Card number: " + this.cardnumber + ", balance remaining :" + r + " date of expiry :"
                + this.carddate + "/" + this.cardmonth + "/" + cardyear);
    }
    int card_balance() {
        return balance;
    }
}
public class Person {
    String name;
    int id;
    void setPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Enter your id no.:");
        id = sc.nextInt();
        sc.close();
    }
    void getperson_details() {
        System.out.println("Name :" + this.name + " , ID :" + this.id);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Westside w = new Westside();
        Person[] p = new Person[5];
        CreditCardPayment[] card = new CreditCardPayment[5];
        cashpayment[] cash = new cashpayment[5];
        int x;
        int[] check = new int[5];
        int r = 0, z;
        int n,m;
        int index;
        while (w.clothes != 0 || w.accessories != 0) {
            index = (int) (Math.random() * 5);
            z = 0;
            for (int i = 0; i < r; i++) {
                if (check[i] == index) {
                    z++;
                }
            }
            if (r == 0) {
                check[0] = index;
                r++;
            }
            if (z == 0) {
                check[r] = index;
                if (r != 4) {
                    r++;
                }
            }
            System.out.println("clothes remaining =" + w.clothes);
            System.out.println("accessories remaining =" + w.accessories);
            System.out.println("Person : " + (index + 1));
            if (z == 0) {
                card[index] = new CreditCardPayment();
                cash[index] = new cashpayment();
                p[index] = new Person();
                p[index].setPerson();
            }
            System.out.println("Enter no. of clothes u wish to buy");
            n = sc.nextInt();
            System.out.println("Enter no. of accessories u wish to buy");
            m = sc.nextInt();
            int amount = ((n + m) * (5000));
            if ((card[index].card_balance() >= amount) && (n <= w.clothes && m <= w.accessories)) {
                w.reduce_accessories(m);
                w.reduce_clothes(n);
                System.out.println("Total amount to be paid: $" + amount);
                System.out.println("Press 2 to pay in cash or press 1 to pay using credit card");
                int option = sc.nextInt();
                if (option == 1) {
                    System.out.println("Enter Card Details:");
                    card[index].get_details();
                    x = card[index].reduce_card(amount);
                    p[index].getperson_details();
                    card[index].payment_details(amount, x);
                }
                if (option == 2) {
                    x = card[index].reduce_card(amount);
                    p[index].getperson_details();
                    cash[index].payment_details(amount, x);
                }
            } else
                System.out.println("Transaction failed!!");
        }
        sc.close();
    }
}