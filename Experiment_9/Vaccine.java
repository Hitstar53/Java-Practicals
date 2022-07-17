import java.util.*;
class MyException extends Exception {
    public MyException(int days) {
        super();
    }
}
public class Vaccine {
    public static void main(String[] args) {
        int days,flag=0;
        Scanner sc = new Scanner(System.in);
        while(flag==0) {
            System.out.println("Enter days(1-84) between 2 Vaccine doses:");
            try {
                days = sc.nextInt();
                if(days>100 || days<0) {
                    throw new MyException(days);
                }
                else {
                    flag = 1;
                }
                System.out.println("Entry is valid!");
            } 
            catch (InputMismatchException e) {
                System.out.println("Invalid input(Nust be an integer!)");
                sc.nextLine();
                flag=0;
            }
            catch (MyException ex) {
                System.out.println("Days cannot be more than 100 or negative!");
                flag=0;
            }
        }
        sc.close();
    }
}