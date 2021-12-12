package Service;

import Model.Show;

public class Writer {
    public void outputWriter(Show s){
        System.out.println("Show ID: "+s.getShowId());
        System.out.println("Show Type: "+s.getType());
        System.out.println("Show Title: "+s.getTitle());
        System.out.println("Director: "+s.getDirector());
        System.out.println("Country: "+s.getCountry());
        System.out.println("Cast: "+s.getCast());
        System.out.println("Listed In As: "+s.getListedIn());
        System.out.println("Date Added: "+s.getDateAdded());
        System.out.println("Description: "+s.getDescription());
        System.out.println("Duration: "+s.getDuration());
        System.out.println("Rating: "+s.getRating());
        System.out.println("Release Year: "+s.getReleaseYear());
        System.out.println("************");
    }
}
