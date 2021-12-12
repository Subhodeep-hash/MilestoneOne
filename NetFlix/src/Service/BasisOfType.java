package Service;

import Model.Show;

import java.util.List;
import java.util.stream.Collectors;

public class BasisOfType {
    public static void findBasisOfType(List<Show> shows, String type){
        Writer wr = new Writer();
        List<Show> filterShows = shows.stream().filter(s -> s.getType().equalsIgnoreCase(type)).collect(Collectors.toList());
        if(filterShows.size()>0)
            for(Show s : filterShows) wr.outputWriter(s);
        else
            System.out.println("Nothing Matches");
    }
}
