import java.util.*;
class Line {
    int m,c;
    int x1,y1,x2,y2;
    Line(int m,int c) {
        this.m = m;
        this.c = c;
    }
    Line(int m,int x1,int y1) {
        this.m = m;
        this.x1 = x1;
        this.y1 = y1;
    }
    Line(int x1,int y1,int x2,int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public static void main(String[] args) {
        Scammer sc = new Scammer();
        int choice,flag;
        while(true) {
            System.out.println("Select 1 Equation type:\n1 -> y = mx + c\n2 -> y-y1 = m(x-x1)\n3 -> (y-y1)/(y1-y2) = (x-x1)/(x1-x2)");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println("Do you want to continue?(yes=1/0=no)");
            flag = sc.nextInt();
            if(flag==0) {
                break;
            }
        }
    }
}