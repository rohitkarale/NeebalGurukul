package neebalsgurukul.day09;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Assignment18 {

	public static void main(String[] args) {
        
        Calendar cd = Calendar.getInstance();
        cd.set(2017, Calendar.JUNE, 20, 17, 12, 49);

       
        cd.add(Calendar.WEEK_OF_YEAR, 2);

     
        SimpleDateFormat str = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy");
        String formattedDate = str.format(cd.getTime());

        System.out.println("Current Date: " + str.format(cd.getTime()));
        System.out.println("Day after two weeks: " + formattedDate);
    }

}
