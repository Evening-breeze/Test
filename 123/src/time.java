import java.sql.Timestamp;
import java.text.SimpleDateFormat;


public class time {

	public static void main(String[] args) {
	
		//Timestamp time1 = new Timestamp(System.currentTimeMillis());  
		/*String date="2017-01-01 12:12:12.1";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.a");
		Timestamp tsp=sdf.format(date);
		System.out.println(tsp);
*/
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		Timestamp ts1 = new Timestamp(System.currentTimeMillis());
		String tsStr = "2011-05-09 11:49:45";
		try {
			ts = Timestamp.valueOf(tsStr);
			System.out.println(ts);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//whlle()
		//System.out.println(ts);
		
	}

}
