import java.util.*;
interface RankT {
    List<String> ranks = new ArrayList<>();
}
interface suitT {
    List<String> suits = new ArrayList<>();
}
interface CardT {
    List<String> cards = new ArrayList<>();
    void newCard();
}
class genCard implements RankT,suitT,CardT {
    public void newCard() {
        Collections.addAll(ranks,"A","2","3","4","5","6","7","8","9","10","J","Q","K");
        Collections.addAll(suits, "H","C","S","D");
        for(int i=0;i<suits.size();i++) {
            for(int j=0;j<ranks.size();j++) {
                cards.add(ranks.get(j)+suits.get(i));
            }
        }
    }
    void printDeck() {
        Collections.shuffle(cards);
        System.out.println("The shuffled Deck of 52 cards: ");
        for(int i=0;i<cards.size();i++) {
            if (i % 13 == 0 && i != 0) {
                System.out.print("\n");
            }
            System.out.print("\t"+cards.get(i));
        }
        System.out.println("\n");
    }
}
public class Cards {
    public static void main(String[] args) {
        genCard gc = new genCard();
        gc.newCard();
        gc.printDeck();

    }
}
