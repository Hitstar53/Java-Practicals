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
        int profit=0,diff=0,k=0;
        for(int i=0;i<n;i++) {
            diff = 0;
            for(int j=i+1;j<n;j++) {
                if(diff<prices[j]-prices[i]) {
                    diff = prices[j]-prices[i];
                    k=j;
                }
                else if(diff>=prices[j]-prices[i]) {
                    break;
                }
            }
            if(diff!=0) {
                profit += diff;
                System.out.printf("Buy on Day %d and Sell on Day %d\n",i+1,k+1);
                i=k;
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