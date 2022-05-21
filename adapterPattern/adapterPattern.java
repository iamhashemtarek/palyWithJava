package adapterPattern;

public class adapterPattern {
    public static void main(String[] args) {
        mp3Player mp3Player = new mp3Player();

        mp3Player.play("mp3");
        mp3Player.play("mp4");
        mp3Player.play("vlc");
    }
}
