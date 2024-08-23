package kyh_3_intermediate1.examples.nested.nested.ex1;

// Network 객체 안에서만 사용
public class NetworkMessage {

    private final String content;

    public NetworkMessage(String content) {
        this.content = content;
    }

    public void print() {
        System.out.println(content);
    }
}
