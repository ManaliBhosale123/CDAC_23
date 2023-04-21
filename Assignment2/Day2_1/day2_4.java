/*que no 9) Write a program to convert state of Byte instance into byte, 
short, int. long, float and double.
*/

class day2_4{
    public static void main(String[] args)
    {
        byte value = 125;
        Byte bs = new Byte(value);

        byte num1 = bs.byteValue( );
        System.out.println("Num1  :  "+num1); //byte instance into byte

        short num2 = bs.shortValue( );
        System.out.println("Num2  :  "+num2);  //byte instance into short

        int num3 = bs.intValue( );
        System.out.println("Num3  :   "+num3); //byte instance into int

        long num4 = bs.longValue();
        System.out.println("Num4 :  "+num4); //byte instance into long

        float num5 = bs.floatValue( );
        System.out.println("Num5  :  "+num5); //byte instance into float

        double num6 = bs.doubleValue( );
        System.out.println("Num6  :  "+num6); //byte instance into double
        
    }
    
}

