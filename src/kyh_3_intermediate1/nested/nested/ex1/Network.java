package kyh_3_intermediate1.nested.nested.ex1;

// Network 객체는 text 를 입력받아서 NetworkMessage 를
// 생성하고 출력하는 단순한 기능을 제공한다.
public class Network {
    public void sendMessage(String text) {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }
}
