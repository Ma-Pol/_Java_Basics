package kyh_3_intermediate2.collection.ex.answer1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> deck = new ArrayList<>(52);
    private int next;

    public Deck() {
        createDeck();
        Collections.shuffle(deck);
        next = -1;
    }

    public Card drawNextCard() {
        return deck.get(++next);
    }

    private void createDeck() {
        char[] symbolArr = {'\u2660', '\u2665', '\u2666', '\u2663'};

        for (char symbol : symbolArr) {
            for (int number = 1; number <= 13; number++) {
                deck.add(new Card(symbol, number));
            }
        }
    }
}
