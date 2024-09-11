package kyh_3_intermediate1.nested.nested.ex2;

public class Network {
    public void sendMessage(String text) {
        // 자신에게 포함 된 중첩 클래스에 접근할 때는
        // 바깥 클래스 이름을 적지 않아도 된다.
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }

    private static class NetworkMessage {
        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }
}
