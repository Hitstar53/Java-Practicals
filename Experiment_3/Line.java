import java.util.*;
class Line {
    double m,c;
    double x=1,x1,y1,x2,y2;
    //constructor 1
    Line(double m,double c) {
        this.m = m;
        this.c = c;
        System.out.printf("Line Eq: y = %.0f x + %.0f",m,c);
        System.out.printf("\ny = %.0f at x = %.0f",m*x + c,x);
    }
    //constructor 2
    Line(double m,double x1,double y1) {
        this.m = m;
        this.x1 = x1;
        this.y1 = y1;
        System.out.printf("Line Eq: y - %.0f = %.0f (x - %.0f )",y1,m,x1);
        System.out.printf("\ny = %.0f at x = %.0f",(m*(x-x1))+y1);
    }
    Line(double x1,double y1,double x2,double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        System.out.printf("Line Eq: (y - %.0f )/%.0f = (x - %.0f)/%.0f",y1,y1-y2,x2,x1-x2);
        System.out.printf("\ny = %.0f at x = %.0f",((x-x1)/(x1-x2))*(y1-y2)+y1,x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice,flag;
        double m,c;
        double x1,x2,y1,y2;
        while(true) {
            System.out.println("Select 1 Equation type:\n1 -> y = mx + c\n2 -> y-y1 = m(x-x1)\n3 -> (y-y1)/(y1-y2) = (x-x1)/(x1-x2)");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter slope & Y-intercept: ");
                    m = sc.nextDouble();
                    c = sc.nextDouble();
                    Line l1 = new Line(m, c);
                    break;
                case 2:
                    System.out.println("Enter slope & point(x1,y1): ");
                    m = sc.nextDouble();
                    x1 = sc.nextDouble();
                    y1 = sc.nextDouble();
                    Line l2 = new Line(m, x1, y1);
                    break;
                case 3:
                    System.out.println("Enter point(x1,y1) & point(x2,y2): ");
                    x1 = sc.nextDouble();
                    y1 = sc.nextDouble();
                    x2 = sc.nextDouble();
                    y2 = sc.nextDouble();
                    Line l3 = new Line(x1, y1, x2, y2);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println("\nDo you want to continue?(yes=1/0=no)");
            flag = sc.nextInt();
            if(flag==0) {
                break;
            }
        }
    }
}