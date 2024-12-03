package hust.soict.dsai.aims.media;
import java.util.*;
public class MediaComparator {
	public static Comparator<Media> COMPARE_BY_TITLE = new Comparator<Media>() {
        @Override
        public int compare(Media m1, Media m2) {
            return m1.get_Title().compareTo(m2.get_Title());
        }
    };

    public static Comparator<Media> COMPARE_BY_COST = new Comparator<Media>() {
        @Override
        public int compare(Media m1, Media m2) {
            return Float.compare(m1.get_Cost(), m2.get_Cost());
        }
    };
}
