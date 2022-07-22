import java.util.*;
class Posting {
    int courseWork;
    int AptTest;
    int TechTest;
    int interview;
    Posting(int courseWork,int AptTest,int TechTest,int interview) {
        this.courseWork = courseWork;
        this.AptTest = AptTest;
        this.TechTest = TechTest;
        this.interview = interview;
    }
    Posting(int TechTest,int interview) {
        this.TechTest = TechTest;
        this.interview = interview;
    }
    Posting(int Interview) {
        this.interview = Interview;
    }
    void allotpost(int choice) { 
        if(interview>=90 && choice==3) {
            System.out.println("Post Alloted: Project Manager");
        }
        else if(TechTest+interview>=85 && choice==2) {
            System.out.println("Post Alloted: Team Leader");
        }
        else if(courseWork+AptTest+TechTest+interview>=80 && choice==1) {
            System.out.println("Post Alloted: Programmer");
        }
        else {
            System.out.println("Post Not Alloted");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice,flag;
        int courseWork,AptTest,TechTest,interview;
        while(true) {
            System.out.println("Select 1 Posting type:\n1 -> Apply for Programmer\n2 -> Apply for Team Leader\n3 -> Apply for Project Manager");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter marks for CourseWork,AptTest,TechTest,interview: ");
                    courseWork = sc.nextInt();
                    AptTest = sc.nextInt();
                    TechTest = sc.nextInt();
                    interview = sc.nextInt();
                    Posting p1 = new Posting(courseWork,AptTest,TechTest,interview);
                    p1.allotpost(choice);
                    break;
                case 2:
                    System.out.println("Enter TechTest,interview: ");
                    TechTest = sc.nextInt();
                    interview = sc.nextInt();
                    Posting p2 = new Posting(TechTest,interview);
                    p2.allotpost(choice);
                    break;
                case 3:
                    System.out.println("Enter Interview: ");
                    interview = sc.nextInt();
                    Posting p3 = new Posting(interview);
                    p3.allotpost(choice);
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
        sc.close();
    }
}