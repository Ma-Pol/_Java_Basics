package programmers.part09.custom_exception;

public class BizException extends RuntimeException {
    // Exception 클래스를 상속받은 클래스는 Checked Exception이 된다.
    // RuntimeException 클래스를 상속받은 클래스는 Unchecked Exception이 된다.
    public BizException(String exceptionMessage) {
        super(exceptionMessage);
    }

    public BizException(Exception e) {
        super(e);
    }
}
