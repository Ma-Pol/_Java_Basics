package kyh_3_intermediate2.collection.ex.answer2;

public class Card implements Comparable<Card> {
    private final Symbol cardSymbol;
    private final int cardNumber;

    public Card(Symbol cardSymbol, int cardNumber) {
        this.cardSymbol = cardSymbol;
        this.cardNumber = cardNumber;
    }

    public String getCardSymbol() {
        return cardSymbol.getSymbol();
    }

    public int getCardNumber() {
        return cardNumber;
    }

    @Override
    public int compareTo(Card o) {
        if (this.cardNumber != o.cardNumber) {
            return Integer.compare(this.cardNumber, o.cardNumber);
        }

        return this.cardSymbol.compareTo(o.cardSymbol);
    }

    @Override
    public String toString() {
        return cardNumber + "(" + getCardSymbol() + ")";
    }
}
