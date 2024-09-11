package kyh_3_intermediate1.nested.nested.ex1;

// NetworkMessage 는 Network 객체 안에서만 사용되는 객체이다.
public class NetworkMessage {
    private String content;

    public NetworkMessage(String content) {
        this.content = content;
    }

    public void print() {
        System.out.println(content);
    }
}
