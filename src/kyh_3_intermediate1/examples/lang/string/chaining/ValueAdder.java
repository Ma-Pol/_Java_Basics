package kyh_3_intermediate1.examples.lang.string.chaining;

public class ValueAdder {

    private int value;

    public ValueAdder add(int addValue) {
        value += addValue;
        return this;
    }

    public int getValue() {
        return value;
    }
}
