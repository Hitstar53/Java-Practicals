import java.util.*;
class Stock {
    Scanner sc = new Scanner(System.in);    
    int[] prices;
    void input() {
        System.out.print("Input No. of Days: ");
        int n = sc.nextInt();
        prices = new int[n];
        for(int i=0;i<n;i++) {
            System.out.print("Enter Price on Day %d",i+1);
            prices[i] = sc.nextInt();
        }
    }
}
class transaction extends Stock {
    Scanner sc = new Scanner(System.in);
    void findMaxProfit() {
        
    }
}
public class TesterST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    }
}