package neebalsgurukul.day09;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Assignment19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date currentDate = new Date();
		
		SimpleDateFormat df1=new SimpleDateFormat("yyyy-MM-dd");
		String str1=df1.format(currentDate);
		System.out.println("yyyy-MM-dd:"+str1);
		
		SimpleDateFormat tf2=new SimpleDateFormat("HH:mm:ss");
		String str2=tf2.format(currentDate);
		System.out.println("HH:mm:ss:"+str2);
		
		SimpleDateFormat dtf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str3 = dtf3.format(currentDate);
        System.out.println("yyyy-MM-dd HH:mm:ss:" + str3);
        
        SimpleDateFormat dtf4 = new SimpleDateFormat("E MMM yyyy HH:mm:ss.SSSZ", Locale.US);
        String str4 = dtf4.format(currentDate);
        System.out.println("E MMM yyyy HH:mm:ss.SSSZ:" + str4);
        
        
        SimpleDateFormat dtf5 = new SimpleDateFormat("HH:mm:ss,Z", Locale.US);
        dtf5.setTimeZone(TimeZone.getTimeZone("GMT"));
        String str5 = dtf5.format(currentDate);
        System.out.println("HH:mm:ss,Z: " + str5);
		
		
	}

}
