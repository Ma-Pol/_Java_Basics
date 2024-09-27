package kyh_3_intermediate2.collection.ex.answer1;

public class Card implements Comparable<Card> {
    private final char symbol;
    private final int number;

    public Card(char symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int compareTo(Card o) {
        if (this.number < o.number) {
            return -1;
        }

        if (this.number > o.number) {
            return 1;
        }

        return Character.compare(changeSymbol(this.symbol), changeSymbol(o.symbol));
    }

    private char changeSymbol(char symbol) {
        return symbol == '\u2663' ? '\u2667' : symbol;
    }

    @Override
    public String toString() {
        return number + "(" + symbol + ")";
    }
}