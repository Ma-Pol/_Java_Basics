package kyh_3_intermediate1.exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException {

        // 문제 상황 발생
//        MyCheckedException exception = new MyCheckedException("ex");
//        throw exception;
        throw new MyCheckedException("ex");
    }
}
