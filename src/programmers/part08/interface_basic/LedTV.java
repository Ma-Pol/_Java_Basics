package programmers.part08.interface_basic;

public class LedTV implements TV {
    @Override
    public void turnOn() {
        System.out.println("전원을 켰습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("전원을 껐습니다.");
    }

    @Override
    public void changeVolume(int volume) {
        System.out.println("볼륨을 " + volume + "(으)로 변경했습니다.");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("채널을 " + channel + "(으)로 변경했습니다.");
    }
}
