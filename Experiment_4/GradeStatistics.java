import java.util.*;
import java.lang.Math;
class GradeStatistics {
    Scanner sc = new Scanner(System.in);
    double avg=0,min=0,max=0,med=0,std=0;
    void input() {
        System.out.println("Enter no. of Students: ");
        int n = sc.nextInt();
        int grade[] = new int[n];
        for(int i=0;i<n;i++) {
            System.out.printf("Enter grade for student %d: ",i+1);
            grade[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(grade));
        display(n,grade);
    }
    void display(int n,int [] grade) {
        Arrays.sort(grade);
        for(int i=0;i<n;i++) {
            avg += grade[i];
        }
        avg = avg/n;
        for(int i=0;i<n;i++) {
            std += (grade[i] - avg)*(grade[i] - avg);
        }
        std = std/n;
        std = Math.sqrt(std);
        min = grade[0];
        max = grade[n-1];
        if(n%2!=0) {
            med = grade[(n+1)/2];
        }
        else {
            med = (grade[n/2] + grade[(n/2)+1])/2;
        }
        System.out.printf("The Average = %.2f\n",avg);
        System.out.printf("The Minimum = %.0f\n",min);
        System.out.printf("The Maximum = %.0f\n",max);
        System.out.printf("The Median = %.2f\n",med);
        System.out.printf("The Standard Deviation = %.2f",std);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GradeStatistics g1 = new GradeStatistics();
        int flag,n;        
        while(true) {
            g1.input();
            System.out.println("\nDo you want to continue?(yes=1/0=no)");
            flag = sc.nextInt();
            if(flag==0) {
                break;
            }
        }
    }
}
