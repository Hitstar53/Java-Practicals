import java.util. *;
import java.lang.Math;
public class Prime {
    public int CheckPrime(int n) {
        if (n==0 || n==1) {
            return 0;
        }
        for (int i=2;i<=Math.sqrt(n);i++) {
            if (n%i==0) {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Prime obj = new Prime();
        System.out.println("Enter the lower range: ");
        int lower = input.nextInt();
        System.out.println("Enter the upper range: ");
        int upper = input.nextInt();
        int count = 0;
        for (int i=lower;i<=upper;i++) {
            if (obj.CheckPrime(i)==1) {
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("\nTotal prime numbers are: " + count);
    }
}