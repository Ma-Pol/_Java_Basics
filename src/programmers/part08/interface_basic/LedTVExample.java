package programmers.part08.interface_basic;

public class LedTVExample {
    public static void main(String[] args) {
        TV tv = new LedTV();

        tv.turnOn();
        tv.changeChannel(8);
        tv.changeVolume(30);
        tv.turnOff();
    }
}
