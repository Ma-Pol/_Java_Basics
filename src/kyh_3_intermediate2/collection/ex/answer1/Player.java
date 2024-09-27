package kyh_3_intermediate2.collection.ex.answer1;

import java.util.TreeSet;

public class Player {
    private final TreeSet<Card> hand = new TreeSet<>();
    private String playerName;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public void drawCard(Deck deck) {
        hand.add(deck.drawNextCard());
    }

    public void printPlayerData() {
        System.out.println(playerName + "의 카드: " + hand + ", 합계: " + getTotalNumber());
    }

    public String getName() {
        return playerName;
    }

    public int getTotalNumber() {
        int totalNum = 0;
        for (Card card : hand) {
            totalNum += card.getNumber();
        }
        return totalNum;
    }
}
