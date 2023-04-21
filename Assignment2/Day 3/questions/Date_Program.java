/* The program should be able to convert dates and times between the following formats:
1. dd/mm/yyyy hh:mm:ss(e,g,, 31/12/2022) 
2. mm/dd/yyyy hh:mm:ss ( 12/31/2022)
3. yyyy/mm/dd hh:mm ( 2022/12/31 23:59)*/

import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter; 

public class Date_Program{  
  public static void main(String[] args) 
  {  
    LocalDateTime datetime1 = LocalDateTime.now(); 

   // DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
    //DateTimeFormatter format = DateTimeFormatter.ofPattern("mm-dd-yyyy HH:mm:ss");
   
    DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); 
    String formatDateTime = datetime1.format(format);   
    System.out.println(formatDateTime);
    }
}