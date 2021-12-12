package Service;

import Model.Show;

import java.util.List;

public class BasisOfListed {
    public static void findBasisOfListedIn(List<Show> shows, String listedIn) {
        Writer wr = new Writer();
        int flag = 0;
        for(Show s : shows) {
            if(s.getListedIn().contains(listedIn)) {
                wr.outputWriter(s);
                flag++;
            }
        }
        if(flag==0){
            System.out.println("Nothing Matches");
        }
    }
}
