import java.utils.*;
class ShoppingCart1 {
    Scanner sc = new Scanner(System.in);
    void input() {
        System.out.println("Enter no. of items: ");
        int n = sc.nextInt();
        int [][][] cart = new int[3][2][n];
        for(int i=0;i<3;i++) {
            System.out.printf("Cart %d:\n",i+1);
            for(int j=0;j<2;j++) {
                if(j==0) {System.out.println("Enter %d Perishable Item costs: "+n);}
                else {System.out.println("Enter %d Non-Perishable Item costs: "+n);}
                for(int k=0;k<n;k++) {
                    cart[i][j][k] = sc.nextInt();
                }
            }
        }
    }
    void total(int n,int [][][] cart) {
        int total=0;
        for(int i=0;i<3;i++) {
            for(int j=0;j<2;j++) {
                for(int k=0;k<n;k++) {
                    total += cart[i][j][k];
                }
            }
        }
        System.out.printf("Total Cost of all Items: $%d",total);
    }
    void max(int n,int [][][] cart) {
        int max=0,c,num;
        for(int i=0;i<3;i++) {
            for(int k=0;k<n;k++) {
                if(cart[i][1][k]>max) {
                    max = cart[i][j][k];
                    c = i;
                    num = k;
                }
            }
        }
        System.out.printf("Costliest Non-Perishable Item:\nItem %d of Cart %d which costs: $%d",c,k,max);
    }
}