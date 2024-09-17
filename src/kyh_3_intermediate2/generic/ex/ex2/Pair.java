package kyh_3_intermediate2.generic.ex.ex2;

public class Pair<F, S> {
    private F first;
    private S second;

    public void setFirst(F value) {
        first = value;
    }

    public void setSecond(S value) {
        second = value;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{first=" + first + ", second=" + second + "}";
    }
}
