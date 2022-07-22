import java.util.*;
import java.lang.Math;
class Test {
    double base,res;
    int power,logBase,argument;
    Test() {
        base = 2;
        power = 2;
        logBase = 2;
        argument = 2;
    }
    double calculate(double base, int power) {
        res = Math.pow(base,power);
        return res;
    }
    double calculate(int logBase,int argument) {
        res = Math.log(argument)/Math.log(logBase);
        return res;
    }
    void display() {
        System.out.printf("Ans = %.2f",res);
    }    
}
class Expo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice,flag;
        while(true) {
            System.out.println("Select 1 choice:\n1 -> power\n2 -> log");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter base & power: ");
                    Test t1 = new Test();
                    t1.base = sc.nextDouble();
                    t1.power = sc.nextInt();
                    t1.calculate(t1.base,t1.power);
                    t1.display();
                    break;
                case 2:
                    System.out.println("Enter base & argument: ");
                    Test t2 = new Test();
                    t2.logBase = sc.nextInt();
                    t2.argument = sc.nextInt();
                    t2.calculate(t2.logBase,t2.argument);
                    t2.display();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println("\nDo you want to continue?(1 -> yes/0 -> no)");
            flag = sc.nextInt();
            if(flag == 0)
                break;
        }
        sc.close();
    }
}
