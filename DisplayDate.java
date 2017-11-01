import java.util.Date;
import java.text.*;

public class DisplayDate {
   public static void main(String args[]) {
      Date date = new Date( );
      SimpleDateFormat dateFormat = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

      System.out.println("Current Date: " + dateFormat.format(date));	
       

 System.out.println(date.toString());

System.out.println(date.getTime());
   }
}