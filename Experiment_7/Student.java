import java.util.*;
abstract class Marks {
    int s1,s2,s3,s4;
    double perc;
    abstract void getPercentage();
}
class A extends Marks {
    A(int s1, int s2,int s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    void getPercentage() {
        perc = s1+s2+s3;
        perc = (perc/3);
        System.out.printf("\nPercentage Of Student A: %.2f%%",perc);
    }
}
class B extends Marks {
    B(int s1, int s2,int s3,int s4) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
    }
    void getPercentage() {
        perc = s1+s2+s3+s4;
        perc = (perc/4);
        System.out.printf("\nPercentage Of Student B: %.2f%%", perc);
    }
}
public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[4];
        System.out.println("Enter Marks for Student A:");
        for(int i=0;i<3;i++) {
            System.out.printf("Subject %d: ",i+1);
            marks[i] = sc.nextInt();
        }
        A g1 = new A(marks[0], marks[1], marks[2]);
        System.out.println("Enter Marks for Student B:");
        for (int i=0;i<4;i++) {
            System.out.printf("Subject %d: ", i + 1);
            marks[i] = sc.nextInt();
        }
        B g2 = new B(marks[0], marks[1], marks[2], marks[3]);
        g1.getPercentage();;
        g2.getPercentage();
        sc.close();
    }
}
