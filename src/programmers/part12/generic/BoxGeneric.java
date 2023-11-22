package programmers.part12.generic;

public class BoxGeneric<E> {
    private E obj;

    public void setObj(E obj) {
        this.obj = obj;
    }

    public E getObj() {
        return this.obj;
    }
}
