import java.util.*;
import mypackage.Reverse_string;
public class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.println("Enter a String: ");
        str = sc.nextLine();
        System.out.println("The reversed string is: "+Reverse_string.ReverseIt(str));
        sc.close();
    }
}
