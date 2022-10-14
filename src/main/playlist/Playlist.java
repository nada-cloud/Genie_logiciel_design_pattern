package playlist;

import java.util.ArrayList;

public class Playlist implements IComponent{

    public String playlistName;
    public ArrayList<IComponent> playlist = new ArrayList<>();

    Playlist(String playlistName) {
            this.playlistName = playlistName;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public ArrayList<IComponent> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<IComponent> playlist) {
        this.playlist = playlist;
    }

    public void add(IComponent component) {
        playlist.add(component);
    }

    @Override
    public void play() {
        System.out.println("Playing a song from a playlist...");
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        for (IComponent song: playlist) {
            song.setPlaybackSpeed(speed);
        }
    }

    @Override
    public String getName() {
        return playlistName;
    }
}
