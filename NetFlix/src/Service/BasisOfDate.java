package Service;

import Model.Show;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class BasisOfDate {
    public static void findBasisOfDate(List<Show> shows, String startDate, String endDate) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
        Writer wr = new Writer();
        Date startOfDate = formatter.parse(startDate);
        Date endOfDate = formatter.parse(endDate);
        if ((Date.parse(startDate) <= Date.parse(endDate))){
            System.out.println(("End date should be greater than Start date"));
        }else{
            for(Show show : shows) {
                if (!show.getDateAdded().isEmpty()) {
                    String dateShow = show.getDateAdded();
                    if (dateShow.charAt(1) == ' ') {
                        StringBuilder sb = new StringBuilder(dateShow);
                        sb.deleteCharAt(1);
                        dateShow = sb.toString();
                    }
                    String[] dateSplit = dateShow.split(" ");
                    String month = null;
                    if (dateSplit[0].length() > 4) {
                        month = dateSplit[0].substring(1, 4);
                    } else {
                        month = "May";
                    }
                    String date = null;
                    if (dateSplit[1].length() > 2) {
                        date = dateSplit[1].substring(0, 2);
                    } else {
                        date = dateSplit[1].substring(0, 1);
                        date = "0".concat(date);
                    }
                    String wholeDate = date.concat("-").concat(month).concat("-").concat(dateSplit[2]);
                    Date dateOriginal = formatter.parse(wholeDate);
                    if(dateOriginal.after(startOfDate) && dateOriginal.before(endOfDate)) wr.outputWriter(show);
                }
            }
        }
    }
}
