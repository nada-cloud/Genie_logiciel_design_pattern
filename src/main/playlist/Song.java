package playlist;

public class Song implements IComponent{
    public String songName;
    public String artist;
    public Float speed;

    Song(String songName, String artist) {
        this.songName = songName;
        this.artist = artist;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Float getSpeed() {
        return speed;
    }

    @Override
    public void play() {
        System.out.println("Playing a song...");
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        this.speed = speed;
    }

    @Override
    public String getName() {
        return songName;
    }
}
