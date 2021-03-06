import java.util. *;
public class Gcd {
    public static int gcd(int a, int b) {
        if(b==0)
            return a;
        else if(a==0)
            return b;
        if(a>b) 
            return gcd(a-b, b);
        else 
            return gcd(b-a, a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        do{
            System.out.println("Enter the first number: ");
            a = sc.nextInt();
            System.out.println("Enter the second number: ");
            b = sc.nextInt();
            System.out.println("GCD of "+a+" and "+b+" is "+gcd(a,b));
            System.out.println("Do you want to continue? (y=1/n=0)");
        }while(sc.nextInt()!=0);
        sc.close();
    }
}