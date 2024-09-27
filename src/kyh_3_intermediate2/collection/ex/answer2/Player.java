package kyh_3_intermediate2.collection.ex.answer2;

import java.util.TreeSet;

public class Player {
    private String playerName;
    private TreeSet<Card> hand;

    public Player(String playerName) {
        this.playerName = playerName;
        hand = new TreeSet<>();
    }

    public void drawCard(Deck deck) {
        hand.add(deck.drawCard());
    }

    public String getName() {
        return playerName;
    }

    public int getTotalNumber() {
        int totalNum = 0;
        for (Card card : hand) {
            totalNum += card.getCardNumber();
        }
        return totalNum;
    }

    public void printPlayerData() {
        System.out.println(playerName + "의 카드: " + hand + ", 합계: " + getTotalNumber());
    }
}
