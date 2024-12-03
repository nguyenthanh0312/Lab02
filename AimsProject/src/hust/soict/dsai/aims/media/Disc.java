package hust.soict.dsai.aims.media;
public class Disc {
	 private int length;
	    private String director;

	    public Disc(String title, String category, float cost, int length, String director) { 
	        this.length = length;
	        this.director = director;
	    }

	    // Getter methods
	    public int getLength() {
	        return length;
	    }

	    public String getDirector() {
	        return director;
	    }

}
