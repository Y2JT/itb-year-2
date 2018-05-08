import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 
 */

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 01/03/2017
 * 
 */
public class PrintInternationalData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date lab = new Date();
		NumberFormat milkUK;
		NumberFormat milkDS;
		NumberFormat milkFR;
		
		//print date in UK
		Locale ukLocale = Locale.ENGLISH;
		DateFormat uk = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, ukLocale);
		System.out.println("UK: " + uk.format(lab));
		//print days in UK
		DateFormatSymbols dfsUK = new DateFormatSymbols(ukLocale);
	    String dayNamesUK[] = dfsUK.getWeekdays();

	    //for loop
	    for (int i=0; i<7; i++){
	    	System.out.println(dayNamesUK[i+1]);
	    }//end for loop
	    
	    //print cost of milk in UK
	    milkUK = NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.println("Pint of Milk: " + milkUK.format(2.50));
		
		//print date in Germany
		Locale dsLocale = Locale.GERMAN;
		DateFormat ds = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, dsLocale);
		System.out.println("\nGermany: " + ds.format(lab));
		//print days in Germany
		DateFormatSymbols dfsGER = new DateFormatSymbols(dsLocale);
	    String dayNamesGER[] = dfsGER.getWeekdays();

	    //for loop
	    for (int i=0; i<7; i++){
	    	System.out.println(dayNamesGER[i+1]);
	    }//end for loop
	    
	    //print cost of milk in Germany
	    milkDS = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        System.out.println("Pint of Milk: " + milkDS.format(2.50));
		
		//print date in France
		Locale frLocale = Locale.FRENCH;
		DateFormat fr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, frLocale);
		System.out.println("\nFrance: " + fr.format(lab));
		//print days in France
		DateFormatSymbols dfsFR = new DateFormatSymbols(frLocale);
	    String dayNamesFR[] = dfsFR.getWeekdays();

	    //for loop
	    for (int i=0; i<7; i++){
	    	System.out.println(dayNamesFR[i+1]);
	    }//end for loop
		
	    //print cost of milk in France
	    milkFR = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("Pint of Milk: " + milkFR.format(2.50));
	
	}//end main

}//end class
