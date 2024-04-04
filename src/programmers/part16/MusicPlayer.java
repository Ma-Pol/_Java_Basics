package programmers.part16;

public class MusicPlayer extends Thread {
    int type;
    MusicBox musicBox;

    MusicPlayer(int type, MusicBox musicBox) {
        this.type = type;
        this.musicBox = musicBox;
    }

    @Override
    public void run() {
        switch (this.type) {
            case 1:
                this.musicBox.playMusicA();
                break;
            case 2:
                this.musicBox.playMusicB();
                break;
            case 3:
                this.musicBox.playMusicC();
                break;
        }
    }
}
