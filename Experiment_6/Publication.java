import java.util.*;
class Publication {
    Scanner sc = new Scanner(System.in);
    String title;
    float price;
    void getData() {
        System.out.print("Enter the title: ");
        title = sc.nextLine();
        price = sc.nextInt();
    }
    void putData() {
        System.out.printf("Title: %s\nPrice: $%d",title,price);
    }    
}
class book extends Publication {
    int pg_count;
    void getData() {
        System.out.print("Enter no. of pages: ");
        pg_count = sc.nextInt();
    }
    void putData() {
        System.out.printf("No. of Pages: %d",pg_count);
    }
}
class tape extends Publication {
    float mins;
    void getData() {
        System.out.print("Enter time(in Mins): ");
        mins = sc.nextFloat();
    }
    void putData() {
        System.out.printf("Time: %d mins",mins);
    }
}
class sales {
    void getData() {
        System.out.println();
    }
    void putData() {
        System.out.println();
    }
}