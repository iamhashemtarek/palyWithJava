package adapterPattern;

public class vlcPlayer implements AdvancedMediaPlayer{
    public void playVlc(String name) {
        System.out.printf("palying " + name + ".vlc");
    }

    public void playMp4(String name) {
        System.out.printf("do noting");
    }
}
