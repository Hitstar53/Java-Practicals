import java.util.*;
class Movie {
    String name,type,hero,heroine;
    long budget;
    Scanner sc = new Scanner(System.in);
    Movie(String name,String type,String hero,String heroine,long budget) {
        this.name = name;
        this.type = type;
        this.hero = hero;
        this.heroine = heroine;
        this.budget = budget;
    }
    //sort movies according to budget
    void sortb(Movie [] movies) {
        for(int i=0;i<movies.length-1;i++) {
            for(int j=i+1;j<movies.length;j++) {
                if(movies[i].budget<movies[j].budget) {
                    Movie temp = movies[i];
                    movies[i] = movies[j];
                    movies[j] = temp;
                }
            }
        }
        System.out.println("\nMovies sorted by budget:\nMovie\tBudget(in Rs)");
        for(int i=0;i<movies.length;i++) {
            System.out.println(movies[i].name+"\t"+movies[i].budget);
        }
    }
    //List movies starting with S/A
    void list_sa(Movie [] movies) {
        System.out.println("\nMovies starting with S/A:");
        for(int i=0;i<movies.length;i++) {
            if(movies[i].name.toUpperCase().charAt(0)=='S' || movies[i].name.toUpperCase().charAt(0)=='A') {
                System.out.println(movies[i].name);
            }
        }
    }
    //List movies with the largest name
    void sortn(Movie [] movies) {
        String largest = movies[0].name;
        for(int i=1;i<movies.length;i++) {
            if(movies[i].name.compareTo(largest)>0) {
                largest = movies[i].name;
            }
        }
        System.out.println("\nMovie(s) with largest name:");
        for(int i=0;i<movies.length;i++) {
            if(movies[i].name.length()==largest.length()) {
                System.out.println(movies[i].name);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice,flag;
        long budget;
        String name,type,hero,heroine;
        System.out.print("Number of movies: ");
        int n = sc.nextInt();
        Movie[] movies = new Movie[n];
        for(int i=0;i<n;i++) {
            System.out.println("\nDetails of movie "+(i+1)+":");
            System.out.print("Enter name of the movie: ");
            name = sc.next();
            System.out.print("Enter type of the movie: ");
            type = sc.next();
            System.out.print("Enter name of the hero: ");
            hero = sc.next();
            System.out.print("Enter name of the heroine: ");
            heroine = sc.next();
            System.out.print("Enter budget of the movie: ");
            budget = sc.nextInt();
            movies[i] = new Movie(name,type,hero,heroine,budget);
        }
        while(true) {
            System.out.println("Select 1 Option:\n1 -> Sort by budget\n2 -> List movies starting with S/A\n3 -> List movies with largest name");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    movies[0].sortb(movies);
                    break;
                case 2:
                    movies[0].list_sa(movies);
                    break;
                case 3:
                    movies[0].sortn(movies);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("\nInvalid choice!");
            }
            System.out.println("\nDo you want to continue?(yes=1/0=no)");
            flag = sc.nextInt();
            if(flag==0) {
                break;
            }
        }
    }
}