import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class a321 {

	public static String getNum(String str){
		String str2="";
		str=str.trim();
		if(str != null && !"".equals(str)){
		for(int i=0;i<str.length();i++){
		if(str.charAt(i)>=48 && str.charAt(i)<=57){
		str2+=str.charAt(i);
		}
	}
}
		return str2;

		}
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");  
		//Timestamp tsp=b.getLeaveTime();
		java.util.Date date=new java.util.Date(); 
		String tssdf =sdf.format(date);
		int b = Integer.parseInt(tssdf);
	 
		
         System.out.println(b);
         //System.out.println(sdf.format(date));
	}

}
