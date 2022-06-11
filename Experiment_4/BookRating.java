import java.util.*;
class BookRating {
    Scanner sc = new Scanner(System.in);
    void input() {
        System.out.print("Enter the number of readers: ");
        int n = sc.nextInt();
        double [][] books = new double[4][n];
        for(int i=0;i<4;i++) {
            System.out.printf("Enter %d ratings for book %d: \n",n,i+1);
            for(int j=0;j<n;j++) {
                books[i][j] = sc.nextDouble();
            }
        }
        average(n, books);
    }
    void average(int n,double [][] book) {
        double[] avg = new double[4];
        double popular=0;
        int c=0;
        for(int i=0;i<4;i++) {
            for(int j=0;j<n;j++) {
                avg[i] += book[i][j];
            }
            avg[i] = avg[i]/n;
            if(avg[i]>popular) {
                popular = avg[i];
                c = i;
            }
            System.out.printf("Book %d Rating: %.2f\n",i+1,avg[i]);
        }
        System.out.printf("\nThe Most popular Book:\nBook %d with Rating: %.2f\n",c,popular);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag;
        BookRating br1 = new BookRating();
        while(true) {
            br1.input();
            System.out.println("\nDo you want to continue?(yes=1/0=no)");
            flag = sc.nextInt();
            if(flag==0) {
                break;
            }
        }
    }
}
