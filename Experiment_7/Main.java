import java.util.*;

abstract class Amusement {
    abstract int getCost(int a, int b, int c);
}

class Esselworld extends Amusement {
    int getday(String s) {
        if (s.compareTo("sunday") == 0 || s.compareTo("saturday") == 0)
            return 300;
        else
            return 0;
    }

    int getage(int a) {
        if (a > 21 && a < 60)
            return 1050;
        else
            return 600;
    }

    int getextra(int n) {
        if (n > 7) {
            return (n - 7) * 50;
        } else
            return 0;
    }

    int getCost(int a, int b, int c) {
        return (a + b + c);
    }
}

class Imagica extends Amusement {
    int getday(String s) {
        if (s.compareTo("sunday") == 0 || s.compareTo("saturday") == 0)

            return 300;
        else
            return 0;
    }

    int getage(int a) {
        if (a > 21 && a < 60)
            return 1500;
        else
            return 1100;
    }

    int getextra(int n) {
        if (n > 7) {
            return (n - 7) * 50;
        } else
            return 0;
    }

    int getCost(int a, int b, int c) {
        return (a + b + c);
    }
}

public class Main{
    public static void main(String[] args) {
        Imagica imagica = new Imagica();
        Esselworld essel = new Esselworld();
        Scanner sc = new Scanner(System.in);
        System.out.println("press 1 to book tickets for imagica OR press 2 to book tickets for Esselworld");
        int c = sc.nextInt();
        if(c==1) {
            System.out.println("Hi ! Welcome to Imagica!!\n");
            System.out.println("Enter the day of your visit");
            String day = sc.next();
            System.out.println("Enter the no. of tickets to be booked");
            int num = sc.nextInt();
            int tot=0;
            int[][] times = new int[num][15];
            int[] played = new int[num];
            int[] games = new int[num];
            int[] age = new int[num];
            int[][] check = new int[num][15];
            for(int i =0;i<num;i++){
                System.out.println("Enter age of person :"+(i+1));
                age[i]= sc.nextInt();
                sc.nextLine();
                int tell;
                int stop=1;
                while(stop!=0) {
                        System.out.println("Which game do u wish to play ");
                        tell = sc.nextInt();
                            times[i][tell-1] =times[i][tell-1]+1 ;
                            played[i] = played[i] + 1;
                            if(check[i][tell-1]==0) {
                                games[i] = games[i] + 1;
                                check[i][tell-1]=check[i][tell-1]+1;
                            }
                            sc.nextLine();
                    System.out.println("To play more press 1 or press 0 to quit");
                    stop= sc.nextInt();
                }
            }
            for(int i =0;i<num;i++){
                System.out.println("\nTicket cost of person "+(i+1)+" = $"+imagica.getCost(imagica.getage(age[i]),imagica.getday(day),0));
                System.out.println("\nTotal available Games played by person "+(i+1)+" = "+games[i]);
                System.out.println("Total available Games not played by person "+(i+1)+" = "+(20-games[i]));
                System.out.println("\n");
                for(int j =0;j<15;j++){
                    System.out.println("Game no. "+(j+1)+" played "+times[i][j]+" times.");
                }
                tot=tot+imagica.getCost(imagica.getage(age[i]),imagica.getday(day),imagica.getextra(played[i]));
                System.out.println("Ticket cost of person + cost of extra games played = $"+imagica.getCost(imagica.getage(age[i]),imagica.getday(day),imagica.getextra(played[i])));
            }
            System.out.println("\nTotal Ticket cost of Imagica for "+num+" people = $"+tot);
        }
        if(c==2) {
            System.out.println("Hi ! Welcome to Esselworld!!\n");
            System.out.println("Enter the day of your visit:");
            String day = sc.next();
            System.out.println("Enter the no. of tickets to be booked:");
            int num = sc.nextInt();
            int tot=0;
            int[][] times = new int[num][15];
            int[] played = new int[num];
            int[] games = new int[num];
            int[] age = new int[num];
            int[][] check = new int[num][15];
            for(int i =0;i<num;i++){
                System.out.println("Enter age of person :"+(i+1));
                age[i]= sc.nextInt();
                sc.nextLine();
                int tell;
                int stop=1;
                while(stop!=0) {
                    System.out.println("Which game do u wish to play ");
                    tell = sc.nextInt();
                    times[i][tell-1] =times[i][tell-1]+1 ;
                    played[i] = played[i] + 1;
                    if(check[i][tell-1]==0) {
                        games[i] = games[i] + 1;
                        check[i][tell-1]=check[i][tell-1]+1;
                    }
                    sc.nextLine();
                    System.out.println("To play more press 1 or press 0 to quit");
                    stop= sc.nextInt();
                }
            }
            for(int i =0;i<num;i++){
                System.out.println("\nTicket cost of person "+(i+1)+" = $"+essel.getCost(essel.getage(age[i]),essel.getday(day),0));
                System.out.println("\nTotal available Games played by person "+(i+1)+" = "+games[i]);
                System.out.println("Total available Games not played by person "+(i+1)+" = "+(15-games[i]));
                System.out.println("\n");
                for(int j =0;j<15;j++){
                    System.out.println("Game no. "+(j+1)+" played "+times[i][j]+" times.");
                }
                tot= tot+essel.getCost(essel.getage(age[i]),essel.getday(day),essel.getextra(played[i]));
                System.out.println("Ticket cost of person + cost of extra games played = $"+essel.getCost(essel.getage(age[i]),essel.getday(day),essel.getextra(played[i])));
            }
            System.out.println("\nTotal Ticket cost of Esselworld for "+num+" people = $"+tot);
        }
        sc.close();
    }
}