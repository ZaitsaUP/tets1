package firstspring;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private List<Music> music = new ArrayList<>();
    private String name;
    private int volume;

    public MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public MusicPlayer() {
    }

    public void playMusic(){
        music.forEach(e -> System.out.println(e.getSong()));
    }

    public void setMusic(List<Music> music) {
        this.music = music;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void doInit(){
        System.out.println("init from musicPlayer");
    }

    public void doDestroy(){
        System.out.println("destroy from musicPlayer");
    }
}
