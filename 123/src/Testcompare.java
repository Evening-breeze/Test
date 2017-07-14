import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Testcompare {

	public static void main(String[] args) {
		
		
		SimpleDateFormat timeformat = new SimpleDateFormat("yyyy-MM-dd,HH:mm:ss");
		long t1 = 0L;
        long t2 = 0L;
        long t3 = 0L;
        String ts1,ts2,ts3;
        ts1 = timeformat.format(leavetime);
        ts2 = timeformat.format(order.getStartTime());
        //System.out.println(ts1);
        
        int begin,leave;
        begin=(ts2.charAt(11)-'0')*10+(ts2.charAt(12)-'0');
        leave=(ts1.charAt(11)-'0')*10+(ts1.charAt(12)-'0');
        //System.out.println(begin+" "+leave);
        
                
        try {
            t1 = timeformat.parse(getTimeStampNumberFormat(order.getLeaveTime())).getTime();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            t2 = timeformat.parse(getTimeStampNumberFormat(order.getStartTime())).getTime();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


	}

}
