import java.util.*;
class Testing {
    int score,x;
    int[] ans = new int[8];
    int[] correct = {2,2,1,1,2,2,1,1};
    Scanner sc = new Scanner(System.in);
    void takeTest() {
        System.out.println("What is the Vision of the company?\n1 -> to become a Unicorn\n2 -> To Automate Life");
        ans[0] = sc.nextInt();
        System.out.println("How long will you stay in this role?\n1 -> <10 years\n2 -> >10 years");
        ans[1] = sc.nextInt();
        System.out.println("What is final() Method in java?\n1 -> to declare constants in java\n2 -> to find length of string");
        ans[2] = sc.nextInt();
        System.out.println("What is the latest version of Java?\n1 -> <JAVA SE 18\n2 -> JAVA SE 22");
        ans[3] = sc.nextInt();
        System.out.println("What did you learn about Java in last job?\n1 -> I am a fesher\n2 -> I am experienced in Java");
        ans[4] = sc.nextInt();
        System.out.println("What do you wish to learn?\n1 -> Nothing I know Java\n2 -> Always ready to leanr latest stuff");
        ans[5] = sc.nextInt();
        System.out.println("What makes a team successful?\n1 -> Team work & Understanding\n2 -> Less communication & Indivisual work");
        ans[6] = sc.nextInt();
        System.out.println("Do you work faster in team or as individual?\n1 -> Team\n2 -> Indivisual");
        ans[7] = sc.nextInt();
    }
}
class Recruitment extends Testing {
    Scanner sc = new Scanner(System.in);
    void generateResult() {
        for(int i=0;i<8;i++) {
            if(correct[i] == ans[i]) {
                score += 1;
            }
        }
        if(score>=5) {
            System.out.printf("\nYou passed the 4 tests\nFinal Score: %d/8\n",score);
        }
        else {
            System.out.printf("\nYou Failed the 4 tests\nFinal Score: %d/8 (Required >5 to pass)\n",score);
        }
    }
    void sortapps(Recruitment [] recruits) {
        for(int i=0;i<recruits.length-1;i++) {
            for(int j=i+1;j<recruits.length;j++) {
                if(recruits[i].score<recruits[j].score) {
                    Recruitment temp = recruits[i];
                    recruits[i] = recruits[j];
                    recruits[j] = temp;
                }
            }
        }
        System.out.println("The 3 Applicants who got Selected are:\nApplicant No.\tScore(%)");
        for(int i=0;i<3;i++) {
            System.out.printf("Applicant %d\t%.1f%\n",recruits[i].x,((double)(recruits[i].score)/8)*100);
        }
    }
}
public class TesterAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Recruitment[] recruits = new Recruitment[6];
        for(int i=0;i<6;i++) {
            recruits[i] = new Recruitment();
            recruits[i].x = i+1;
            recruits[i].takeTest();
            recruits[i].generateResult();
        }
        recruits[0].sortapps(recruits);
    }
}
