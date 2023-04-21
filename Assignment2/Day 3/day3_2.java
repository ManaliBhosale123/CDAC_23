import java.util.Calendar;
class day3_2{
    public static void main(String[] args)
    {
        Calendar c = Calendar.getInstance();
        int day = c.get( Calendar.DAY_OF_MONTH );

        int month = c.get(Calendar.MONTH ) + 1;
        int year = c.get( Calendar.YEAR );
        System.out.println( day +"/" + month+" / "+year);
    }
}