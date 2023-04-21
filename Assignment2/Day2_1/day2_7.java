/*que no 14)Write a program to convert state of Short instance into byte, 
short, int, long, float and double.
*/
class day2_7{
    public static void main(String[] arge)
{
        short value = 15;
        Short bs = new Short(value);

        byte num1 = bs.byteValue( );
        System.out.println("Num1  :  "+num1); //short instance into byte

        int num2 = bs.intValue( );
        System.out.println("Num2  :   "+num2); //short instance into int

        long num3 = bs.longValue();
        System.out.println("Num3 :  "+num3); //short instance into long

        float num4 = bs.floatValue( );
        System.out.println("Num4  :  "+num4); //short instance into float

        double num5 = bs.doubleValue( );
        System.out.println("Num5  :  "+num5); //short instance into double
        
    }
    
}