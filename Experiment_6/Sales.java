import java.util.*;
class Publication {
    Scanner sc = new Scanner(System.in);
    String title;
    float price;
    void getData() {
        System.out.print("Enter the title: ");
        title = sc.nextLine();
        System.out.print("Enter the price: ");
        price = sc.nextInt();
    }
    void putData() {
        System.out.printf("\nDetails:\nTitle: %s\nPrice: $%.2f",title,price);
    }    
}
class Book extends Publication {
    int pg_count;
    void getData() {
        super.getData();
        System.out.print("Enter no. of pages: ");
        pg_count = sc.nextInt();
    }
    void putData() {
        super.putData();
        System.out.printf("\nNo. of Pages: %d",pg_count);
    }
}
class Tape extends Publication {
    float mins;
    void getData() {
        System.out.println("\nTape:");
        super.getData();
        System.out.print("Enter time(in Mins): ");
        mins = sc.nextFloat();
    }
    void putData() {
        super.putData();
        System.out.printf("Time: %.1f mins",mins);
    }
}
class Sales extends Book {
    Scanner sc = new Scanner(System.in);
    int[] sale = new int[3];
    void getData() {
        System.out.println("Book:");
        super.getData();
        for(int i=0;i<3;i++) {
            System.out.printf("Enter Sales for Month %d: ",i+1);
            sale[i] = sc.nextInt();
        }
    }
    void putData() {
        super.putData();
        System.out.printf("\nSales:\nMonth 1: %d\nMonth 2: %d\nMonth 3: %d",sale[0],sale[1],sale[2]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sales s = new Sales();
        Tape t = new Tape();
        s.getData();
        t.getData();
        s.putData();
        t.putData();
        sc.close();
    }
}