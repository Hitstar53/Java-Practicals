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
    double calculate(double base, double power) {
        res = Math.pow(base,power);
        display(res);
        return res;
    }
    double calculate(int logBase,int argument) {
        res = Math.log(argument)/Math.log(logBase);
        display(res);
        return res;
    }
    void display(double n) {
        System.out.printf("Ans = %.2f",n);
    }    
}
class expo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    }
}
