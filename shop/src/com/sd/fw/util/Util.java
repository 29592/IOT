package com.sd.fw.util;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Util {
	private static DecimalFormat moneyFormat = new DecimalFormat("###,##0");
	private static String datePattern = "yyyy-MM-dd";
	
	public static String moneyFormat(int money) {
		return moneyFormat.format(money); 
	}
	
	public static String moneyFormat(String money) {
		return moneyFormat.format(money); 
	}
	
	public static String dateFormat(String dateString) {
		Calendar calendar = null;   
		if(dateString.length()=="yyyyMMdd".length()) {
			calendar = getCalendarWithNormal(dateString);   
		} else if (dateString.length()=="yyyyMMddhhmmss".length()) {
			calendar = getCalendarWithFull(dateString);   
		}
	    return dateFormat(calendar);
	}
	
	public static String dateFormat(Calendar cal) { 
	     
	     SimpleDateFormat formatter = new SimpleDateFormat(datePattern);
	     return formatter.format(cal.getTime());
	}
	

	public static Calendar getCalendarWithNormal(String yyyyMMdd) {
		int yyyy = Integer.parseInt( yyyyMMdd.substring(0, 4) );
	    int MM   = Integer.parseInt( yyyyMMdd.substring(4, 6) );
	    int dd   = Integer.parseInt( yyyyMMdd.substring(6, 8) ); 
	     
	    return new GregorianCalendar(yyyy, MM - 1, dd); 
	}
	
	public static Calendar getCalendarWithFull(String yyyyMMddhhmmss) {
		int yyyy = Integer.parseInt( yyyyMMddhhmmss.substring(0, 4) );
	    int MM   = Integer.parseInt( yyyyMMddhhmmss.substring(4, 6) );
	    int dd   = Integer.parseInt( yyyyMMddhhmmss.substring(6, 8) );
 	    int hh   = Integer.parseInt( yyyyMMddhhmmss.substring(8, 10) );
 	    int mm   = Integer.parseInt( yyyyMMddhhmmss.substring(10, 12) );
 	    int ss   = Integer.parseInt( yyyyMMddhhmmss.substring(12, 14) );
	     
	    return new GregorianCalendar(yyyy, MM - 1, dd, hh, mm, ss); 
	}
}
