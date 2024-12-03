package hust.soict.dsai.aims.media;
import hust.soict.dsai.aims.media.Disc;
import java.util.*;
public class CompactDisc {
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<>();
		
	public CompactDisc(int id, String title, String category, float cost, String artist) {
        super(id, title, category, cost); 
        this.artist = artist;
        this.tracks = new ArrayList<>();
    }
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track is already in the list: " + track.getTitle());
        } else {
            tracks.add(track);
            System.out.println("Track added: " + track.getTitle());
        }
    }
	
	public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed: " + track.getTitle());
        } else {
            System.out.println("Track not found: " + track.getTitle());
        }
    }
	
	public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
}
