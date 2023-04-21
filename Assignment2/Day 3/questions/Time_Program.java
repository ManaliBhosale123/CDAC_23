/*The program should be able to convert times between the following formats:
a. hh:mm:ss (e.g., 23:59:59)
b. hh:mm:ss a (e.g., 11:59:59 PM)
c. hh:mm (e.g., 23:59)*/

import java.time.LocalTime;
class Time_Program {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.now();
        //LocalDateTime ldt = LocalDateTime.now();
    int hour = lt.getHour();
    int minute = lt.getMinute();
    int sec = lt.getSecond();
    System.out.println(hour+" : "+minute+" :"+sec);
 }
 }