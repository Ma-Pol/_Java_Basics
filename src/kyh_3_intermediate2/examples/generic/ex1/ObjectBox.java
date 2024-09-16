package kyh_3_intermediate2.examples.generic.ex1;

public class ObjectBox {

    private Object value;

    public void set(Object object) {
        this.value = object;
    }

    public Object get() {
        return value;
    }
}