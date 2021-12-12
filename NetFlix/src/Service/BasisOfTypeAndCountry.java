package Service;

import Model.Show;

import java.util.List;
import java.util.stream.Collectors;

public class BasisOfTypeAndCountry {
    public static void findBasisOfTypeAndCountry(List<Show> shows, String typeofShow, String country) {
        List<Show> filterShows = shows.stream().filter(s -> s.getType().equalsIgnoreCase(typeofShow) && s.getCountry().equalsIgnoreCase(country)).collect(Collectors.toList());
        Writer wr = new Writer();
        for(Show s : filterShows) wr.outputWriter(s);
    }
}
