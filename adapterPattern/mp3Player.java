package adapterPattern;

public class mp3Player implements  MediaPlayer{
    MediaAdapter mediaAdapter;
    public void play(String name) {
        if(name == "mp3") {
            System.out.println("playing " + name);
        }else  {
            mediaAdapter = new MediaAdapter(name);
            mediaAdapter.play(name);
        }
    }
}
