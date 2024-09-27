package kyh_3_intermediate2.collection.ex.answer2;

public enum Symbol {
    SPADE("♠"),
    HEART("♥"),
    DIAMOND("♦"),
    CLOVER("♣");

    private final String symbol;

    Symbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}