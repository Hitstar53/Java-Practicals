import java.util.*;
class low_avg extends Exception
{
    low_avg() {
        super("Team Average is too low!");
    }
}
public class Cricketer {
    String player_name;
    int runs_hit,innings_count,not_out_count;
    double batting_avg;
    public Cricketer(String player_name,int runs_hit,int innings_count,int not_out_count) {
        this.player_name = player_name;
        this.runs_hit = runs_hit;
        this.innings_count = innings_count;
        this.not_out_count = not_out_count;
        batting_avg = 0;
    }
    void get_avg() {
        try {
            batting_avg = (double)runs_hit/(innings_count-not_out_count);
        }
        catch(ArithmeticException e) {
            System.out.println("batting avg is invalid!");
        }
    }
    void sort_team(Cricketer [] players) {
        Arrays.sort(players,new Comparator<Cricketer>() {
            @Override
            public int compare(Cricketer o1, Cricketer o2) {
                return o1.batting_avg>o2.batting_avg?1:-1;
            }
        });
    }
    void print_team(Cricketer [] players) {
        double avg=0;
        System.out.println("Player\tRuns\tInnings\tN/Os\tBat. Avg");
        for(int i=0;i<players.length;i++) {
            System.out.printf("%s\t%d\t%d\t%d\t%.2f\n",players[i].player_name,players[i].runs_hit,players[i].innings_count,players[i].not_out_count,players[i].batting_avg);
            avg+=players[i].batting_avg;
        }
        try {
            avg = avg/players.length;
            if(avg<20)
                throw new low_avg();
            else 
                System.out.println("Team Average is "+avg);
        }
        catch(low_avg e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cricketer[] players = new Cricketer[3];
        String player_name = new String();
        int runs_hit=0,innings_count=0,not_out_count=0;
        for(int i=0;i<players.length;i++) {
            System.out.println("\nPlayer "+(i+1));
            try {
                System.out.print("Enter the name of the player: ");
                player_name = sc.next();
                System.out.print("Enter the number of runs hit: ");
                runs_hit = sc.nextInt();
                System.out.print("Enter the number of innings: ");
                innings_count = sc.nextInt();
                System.out.print("Enter the number of not outs: ");
                not_out_count = sc.nextInt();
                players[i] = new Cricketer(player_name, runs_hit, innings_count, not_out_count);
                players[i].get_avg();
            }
            catch(InputMismatchException e) {
                System.out.println("Invalid input!");
                i--;
            }
        }
        players[0].sort_team(players);
        players[0].print_team(players);
        sc.close();
    }
}
