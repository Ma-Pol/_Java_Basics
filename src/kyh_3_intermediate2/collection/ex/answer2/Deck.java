package kyh_3_intermediate2.collection.ex.answer2;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck = new ArrayList<>(52);

    public Deck() {
        createDeck();
        shuffleDeck();
    }

    private void createDeck() {
        for (Symbol symbol : Symbol.values()) {
            for (int i = 1; i <= 13; i++) {
                deck.add(new Card(symbol, i));
            }
        }
    }

    private void shuffleDeck() {
        Collections.shuffle(deck);
    }

    public Card drawCard() {
        return deck.remove(0);
    }
}
