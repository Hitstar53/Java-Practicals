import java.util.Scanner;
import java.util.Dictionary;
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
        words[3] = "ANIME";
        words[4] = "UNIVERSITY";
        words[5] = "CLICKBAIT";
        words[6] = "TECHNOLOGY";
        words[7] = "YOUTUBE";
        words[8] = "WEBSITE";
        words[9] = "ONOMATOPOEIA";
    }
    public String ChooseRandomWord() {
        int index = (int)Math.random()*10;
        return words[index];
    }
}
public class hangman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game g1 = new Game();
        String secret = new String();
        char letter;
        int flag;
        while(true) {
            System.out.println("WELCOME TO HANGMAN");
            System.out.println("I will guess a secret word. On each turn, you guess a letter. If the letter is in the secret word, I will show you where it appears; if not, a part of your body gets strung up on the scaffold. The objective is to guess the word before you are hung.");
            secret = g1.ChooseRandomWord();
            char[] guess = new char[secret.length()];
            System.out.println("The secret word looks like this: "+"-"*10);
            for(int i=0;i<8;i++) {

            }
            System.out.println("Do you want to play again?(yes=1/no=0)");
            flag = sc.nextInt();
            if (flag == 0) {
                break;
            }
        }
        sc.close(); 
    }
}