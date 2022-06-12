import java.util.*;
class ShoppingCart {
    Scanner sc = new Scanner(System.in);
    void input() {
        int [][][] items = new int[3][2][];
        int total,max=0,c=0,num=0;
        for(int i=0;i<3;i++) {
            System.out.printf("\nCart %d:\n",i+1);
            total=0;
            for(int j=0;j<2;j++) {
                if(j==0) {
                    System.out.print("Enter no. of Perishable Items: ");
                    int n1 = sc.nextInt();
                    items[i][j] = new int[n1];
                    System.out.println("Enter "+n1+" Perishable Item costs: ");
                    for(int k=0;k<n1;k++) {
                        items[i][j][k] = sc.nextInt();
                        total += items[i][j][k];
                    }
                }
                else {
                    System.out.print("Enter no. of Non-Perishable Items: ");
                    int n2 = sc.nextInt();
                    items[i][j] = new int[n2];
                    System.out.println("Enter "+n2+" Non-Perishable Item costs: ");
                    for(int k=0;k<n2;k++) {
                        items[i][j][k] = sc.nextInt();
                        total += items[i][j][k];
                        if(items[i][j][k]>max) {
                            max = items[i][j][k];
                            c = i+1;
                            num = k+1;
                        }
                    }
                }
            }
            System.out.printf("\nTotal Cost of Cart %d: $%d",i+1,total);
        }
        System.out.printf("\nCostliest Non-Perishable Item:\nItem %d of Cart %d which costs: $%d",num,c,max);
    }
    public static void main(String[] args) {
        ShoppingCart sc = new ShoppingCart();
        sc.input();
    }
}