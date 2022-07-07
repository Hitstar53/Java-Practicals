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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game g1 = new Game();
        shape s1 = new shape();
        g1.initDictionary();
        String secret = new String();
        String letter = new String();
        int flag,temp;
        while(true) {
            System.out.println("WELCOME TO HANGMAN");
            System.out.println("I will guess a secret word. On each turn, you guess a letter. If the letter is in the secret word, I will show you where it appears; if not, a part of your body gets strung up on the scaffold. The objective is to guess the word before you are hung.\nNote:Only one instance of a letter will be revealed if the guess is correct!");
            secret = g1.ChooseRandomWord();
            char[] guess = new char[secret.length()];
            char[] secret_char = secret.toCharArray();
            for(int i=0;i<secret.length();i++) {
                guess[i] = '-';
            }
            int i=8;
            while(i>0) {
                System.out.println("The secret word looks like this:");
                System.out.println(guess);
                System.out.printf("You have %d guesses left!\nGuess a letter: ",i);
                letter = sc.next();
                temp = secret.indexOf(letter.toUpperCase());
                if(temp!=-1) {
                    System.out.println("Correct!");
                    guess[temp] = secret_char[temp];
                    secret = secret.replaceFirst(letter.toUpperCase()," ");
                } else {
                    i--;
                    System.out.println("Wrong!");
                    s1.draw(i);
                }
                if(Arrays.equals(guess,secret_char)==true) {
                    System.out.println(guess);
                    System.out.println("You win!");
                    break;
                }
            }
            if(i==0) {
                System.out.print("You lose!\nThe secret word was: ");
                System.out.println(secret_char);
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