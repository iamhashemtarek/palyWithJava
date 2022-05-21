package adapterPattern;

public class mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playMp4(String name) {
        System.out.println("playing " + name + ".mp4");
    }

    @Override
    public void playVlc(String name) {
        System.out.println("do nothing");
    }
}
