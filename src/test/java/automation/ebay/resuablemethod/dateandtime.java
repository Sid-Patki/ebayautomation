package automation.ebay.resuablemethod;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateandtime {
	
	public static String getcurrentdate() {
		
		DateFormat dateformat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		
		Date currentdate = new Date();
		
		return dateformat.format(currentdate); /*need to invetiate more*/
		
	}

}
