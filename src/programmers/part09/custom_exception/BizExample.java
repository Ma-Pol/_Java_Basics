package programmers.part09.custom_exception;

public class BizExample {
    public static void main(String[] args) {
        BizService bizService = new BizService();

        try {
            bizService.bizMethod(5);
            bizService.bizMethod(-3);
        } catch (BizException e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }
}
