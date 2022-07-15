import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
interface randword {
    String[] words = new String[10];
    public void initDictionary();
    public String ChooseRandomWord();
}
class Game implements randword {
    public void initDictionary() {
        words[0] = "AIRPLANE";
        words[1] = "UMBRELLA";
        words[2] = "FRIENDS";
        words[3] = "ONOMATOPOEIA";
        words[4] = "UNIVERSITY";
        words[5] = "CLICKBAIT";
        words[6] = "TECHNOLOGY";
        words[7] = "YOUTUBE";
        words[8] = "WEBSITE";
        words[9] = "ANIME";
    }
    public String ChooseRandomWord() {
        int index = (int)((Math.random())*10);
        return words[index];
    }
}
class shape {
    String[] figure = {"+----+", "|", "|    |", "|    O", "|   /|\\", "|   / \\"};
    void draw(int n) {
        if(n==7) {
            System.out.println(figure[0]);
        }
        else if(n==6) {
            System.out.println(figure[1]);
            System.out.println(figure[1]);
            System.out.println(figure[0]);
        }
        else if(n==5) {
            for(int i=0;i<4;i++) {
                System.out.println(figure[1]);
            }
            System.out.println(figure[0]);
        }
        else if(n==4) {
            for (int i=0;i<5;i++) {
                System.out.println(figure[1]);
            }
            System.out.println(figure[0]);
        }
        else if(n==3) {
            System.out.println(figure[0]);
            System.out.println(figure[2]);
            for (int i=0;i<5;i++) {
                System.out.println(figure[1]);
            }
            System.out.println(figure[0]);
        }
        else if(n==2) {
            System.out.println(figure[0]);
            System.out.println(figure[2]);
            System.out.println(figure[3]);
            for (int i=0;i<4;i++) {
                System.out.println(figure[1]);
            }
            System.out.println(figure[0]);
        }
        else if(n==1) {
            System.out.println(figure[0]);
            System.out.println(figure[2]);
            System.out.println(figure[3]);
            System.out.println(figure[4]);
            for (int i=0;i<3;i++) {
                System.out.println(figure[1]);
            }
            System.out.println(figure[0]);
        }
        else if(n==0) {
            System.out.println(figure[0]);
            System.out.println(figure[2]);
            System.out.println(figure[3]);
            System.out.println(figure[4]);
            System.out.println(figure[5]);
            for (int i=0;i<2;i++) {
                System.out.println(figure[1]);
            }
            System.out.println(figure[0]);
        }
    }
}
public class hangman {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game g1 = new Game();
        shape s1 = new shape();
        g1.initDictionary();
        String secret = new String();
        String letter = new String();
        int flag,temp;
        while(true) {
            System.out.println(CYAN+"WELCOME TO HANGMAN\nI will guess a secret word. On each turn, you guess a letter. If the letter is in the secret word, I will show you where it appears; if not, a part of your body gets strung up on the scaffold. The objective is to guess the word before you are hung.\nNote:Only one instance of a letter will be revealed if the guess is correct!"+ANSI_RESET);
            secret = g1.ChooseRandomWord();
            char[] guess = new char[secret.length()];
            char[] secret_char = secret.toCharArray();
            for(int i=0;i<secret.length();i++) {
                guess[i] = '-';
            }
            int i=8;
            while(i>0) {
                System.out.println(YELLOW+"The secret word looks like this:");
                System.out.println(guess);
                System.out.printf("You have %d guesses left!\nGuess a letter: %s",i,ANSI_RESET);
                letter = sc.next();
                temp = secret.indexOf(letter.toUpperCase());
                if(temp!=-1) {
                    System.out.println(GREEN+"Correct!"+ANSI_RESET);
                    guess[temp] = secret_char[temp];
                    secret = secret.replaceFirst(letter.toUpperCase()," ");
                } else {
                    i--;
                    System.out.println(RED+"Wrong!"+ANSI_RESET);
                    s1.draw(i);
                }
                if(Arrays.equals(guess,secret_char)==true) {
                    System.out.println(guess);
                    System.out.println(CYAN+"You win!"+ANSI_RESET);
                    break;
                }
            }
            if(i==0) {
                System.out.print(PURPLE+"You lose!\nThe secret word was: "+ANSI_RESET);
                System.out.println(secret_char);
            }
            System.out.println(YELLOW+"Do you want to play again?"+GREEN+"\n1. no"+RED+"\t2. yes"+ANSI_RESET);
            flag = sc.nextInt();
            if (flag == 1) {
                break;
            }
        }
        sc.close(); 
    }
}