package utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtilities {
    public static String[] returnNextMonth(){
        //create Date object
        Date dNow=new Date();
        // Create Calender object for Gregorian Calender
        Calendar calender=new GregorianCalendar();
        //Set calendar object to current date
        calender.setTime(dNow);
        //Create object for SimpleDateFormat
        //Defining date format to-example:(jan-2023)
        SimpleDateFormat sdf=new SimpleDateFormat("MMM-yyyy");
        //Increment the current month to 1
        calender.add(Calendar.MONTH,1);
        //Generate the date based on the specified calendar data
        String date= sdf.format(calender.getTime());
        return date.split("-");

    }
}
