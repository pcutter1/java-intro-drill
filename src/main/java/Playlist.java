import java.util.ArrayList;
import java.util.Collections;

public class Playlist {
  public String name;
  public ArrayList<Song> songs = new ArrayList<>();

  public Playlist(String name) {
    this.name = name;
  }

  public void addSong(Song song){
    songs.add(song);
  }

  public boolean isEmpty() {
    return songs.isEmpty();
  }

  public String[] songNames() {
    String[] songNames = new String[songs.size()];
    for (int i = 0; i < songNames.length; i++) {
      songNames[i] = songs.get(i).title;
    }
    return songNames;
  }

  public int totalDuration() {
    int totalDuration = 0;
    for (Song song : songs) {
      totalDuration += song.durationInSeconds;
    }
    return totalDuration;
  }

  public void swap(Song first, Song second) {
    Collections.swap(songs, songs.indexOf(first), songs.indexOf(second));
  }

  public void removeSong(Song song) {
    songs.remove(song);
  }
}
