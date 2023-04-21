/*The program should be able to convert times between the following formats:
a. hh:mm:ss (e.g., 23:59:59)
b. hh:mm:ss a (e.g., 11:59:59 PM)
c. hh:mm (e.g., 23:59)*/

class Date{
    int day;
    int month;
    int year;
    void initDate( int day, int month, int year ){
        this.day = day;
        this.month = month;
        this.year = year;
    }
          
     void printRecord( ){
        System.out.println(this.day+" / "+this.month+" / "+this.year);
    }
}
class Program{
    public static void main(String[] args){
        Date dt = new Date();
        dt.initDate( 31,12,2022);
        dt.printRecord( );
    }
}