import java.util.*;
public class Cricketer {
    String player_name;
    int runs_hit,innings_count,not_out_count;
    double batting_avg;
    public Cricketer(String player_name,int runs_hit,int innings_count,int not_out_count) {
        this.player_name = player_name;
        this.runs_hit = runs_hit;
        this.innings_count = innings_count;
        this.not_out_count = not_out_count;
    }
    void get_avg() {
        batting_avg = (double)runs_hit/innings_count;
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
        System.out.println("Player Name\tRuns\tInnings\tNot-Outs\tBatting Avg");
        for(int i=0;i<players.length;i++) {
            System.out.printf("%s\t%d\t%d\t%d\t%.2f\n",players[i].player_name,players[i].runs_hit,players[i].innings_count,players[i].not_out_count,players[i].batting_avg);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cricketer[] players = new Cricketer[11];
        for(int i=0;i<players.length;i++) {
            System.out.print("Enter the name of the player: ");
            String player_name = sc.next();
            System.out.print("Enter the number of runs hit: ");
            int runs_hit = sc.nextInt();
            System.out.print("Enter the number of innings: ");
            int innings_count = sc.nextInt();
            System.out.print("Enter the number of not outs: ");
            int not_out_count = sc.nextInt();
            players[i] = new Cricketer(player_name,runs_hit,innings_count,not_out_count);
            players[i].get_avg();
        }
        players[0].sort_team(players);
        players[0].print_team(players);
        sc.close();
    }
}
