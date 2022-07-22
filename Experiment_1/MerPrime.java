import java.lang.Math;
public class MerPrime {
    public int CheckPrime(double n) {
        if (n==0 || n==1) {
            return 0;
        }
        for (int i=2;i<=Math.sqrt(n);i++) {
            if (n%i==0) {
                return 0;
            }
        }
        System.out.print((int)n+" ");
        return 1;
    }
    public static void main(String[] args) {
        MerPrime obj = new MerPrime();
        double a;
        for(int i=2;i<=31;i++) {
            a = Math.pow(2.0,(double)i)-1.0;
            obj.CheckPrime(a);
        }
    }
}