package kyh_4_advanced2.network.tcp.autocloseable;

public class ResourceCloseMainV1 {
    public static void main(String[] args) {
        try {
            logic();
        } catch (CallException e) {
            System.out.println("CallException 예외 처리");
            e.printStackTrace();
        } catch (CloseException e) {
            System.out.println("CloseException 예외 처리");
            e.printStackTrace();
        }
    }

    private static void logic() throws CallException, CloseException {
        // resource1의 정보를 기반으로 resource2를 생성한다고 가정
        // 자원 종료 시, resource2를 먼저 정리하도록 한다.
        ResourceV1 resource1 = new ResourceV1("resource1");
        ResourceV1 resource2 = new ResourceV1("resource2");

        resource1.call();
        resource2.callEx(); // CallException

        System.out.println("자원 정리"); // 호출 안됨
        resource2.closeEx();
        resource1.closeEx();
    }
}
