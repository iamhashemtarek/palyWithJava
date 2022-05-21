package adapterPattern;

public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;
    public MediaAdapter(String type) {
        if (type == "mp4"){
            advancedMediaPlayer = new mp4Player();
        } else if (type == "vlc") {
            advancedMediaPlayer = new vlcPlayer();
        }
    }
    public void play(String name) {
        if (name == "mp4"){
            advancedMediaPlayer.playMp4("mp4");
        } else if (name == "vlc") {
            advancedMediaPlayer.playVlc("vlc");
        }
    }
}
