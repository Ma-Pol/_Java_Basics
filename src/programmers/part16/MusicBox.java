package programmers.part16;

public class MusicBox {
    public synchronized void playMusicA() {
        for (int i = 0; i < 10; i++) {
            System.out.println("신나는 음악!!!");

            try {
                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void playMusicB() {
        for (int i = 0; i < 10; i++) {
            System.out.println("슬픈 음악!!!");

            try {
                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void playMusicC() {
        for (int i = 0; i < 10; i++) {
            synchronized (this) { // 동기화 블록
                System.out.println("카페 음악!!!");
            }

            try {
                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
