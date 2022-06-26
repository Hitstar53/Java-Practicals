import java.util. *;
public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Enter the percentage of the student: ");
            int perc = input.nextInt();
            if(perc>=75) {
                System.out.println("Grade: Distinction");
            } else if(perc>=60) {
                System.out.println("Grade: First Class");
            } else if(perc>=45) {
                System.out.println("Grade: Second Class");
            } else {
                System.out.println("Grade: Fail");
            }
            System.out.println("Do you want to continue? (y=1/n=0)");
        }while(input.nextInt()!=0);
        input.close();
    }
}