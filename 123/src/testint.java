import java.text.SimpleDateFormat;


public class testint {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");  
		//Timestamp tsp=b.getLeaveTime();
		java.util.Date date=new java.util.Date(); 
		String tssdf =sdf.format(date);
		String a=tssdf;
		//String s="abc123";
		int b=a.charAt(13);
		//int a=Integer.parseInt(s);
		System.out.println(b);
	}

}
