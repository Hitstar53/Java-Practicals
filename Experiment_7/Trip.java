import java.util.Scanner;
abstract class AmusementPark {
    int age,en_fees;
    String day;
    int[] games = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    abstract void getCost();
}
class Esselworld extends AmusementPark {
    Esselworld(int age) {
        this.age = age;
    }
    void getCost() {
        if(age<21 || age>60) {
            en_fees = 660;
        } else {
            en_fees = 1050;
        }
        if(day.equalsIgnoreCase("Sunday") || day.equalsIgnoreCase("Saturday")) {
            en_fees += 300;
        }
    }
}
class Imagica extends AmusementPark {
    Imagica(int age) {
        this.age = age;
    }
    void getCost() {

    }
}
public class Trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
    }
}