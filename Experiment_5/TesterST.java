import java.util.*;
class Stock {
    Scanner sc = new Scanner(System.in);    
    int[] prices;
    int n;
    void input() {
        System.out.print("Input No. of Days: ");
        n = sc.nextInt();
        prices = new int[n];
        for(int i=0;i<n;i++) {
            System.out.printf("Enter Price on Day %d: ",i+1);
            prices[i] = sc.nextInt();
        }
    }
}
class transaction extends Stock {
    void findMaxProfit() {
        int profit=0;
        for(int i=1;i<n;i++) {
            if(prices[i]>prices[i-1]) {
                profit += prices[i]-prices[i-1];
            }
        }
        System.out.println("Maximum Profit: "+profit);
    }
}
public class TesterST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        transaction t1 = new transaction();
        t1.input();
        t1.findMaxProfit();
        sc.close();
    }
}