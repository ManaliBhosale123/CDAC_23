 /*que no 17)Write a program to convert state of Integer instance into 
byte, short, int, long, float and double.*/


 class day2_11{
    public static void main(String[] args)
 {
        int value = 20;
        Integer bs = new Integer(value);

        byte num1 = bs.byteValue();
        System.out.println("Num1  :  "+num1); //int instance into byte

        short num2 = bs.shortValue();
        System.out.println("Num2  :   "+num2); //int instance into int

        long num3 = bs.longValue();
        System.out.println("Num3 :  "+num3); //int instance into long

        float num4 = bs.floatValue();
        System.out.println("Num4  :  "+num4); //int instance into float

        double num5 = bs.doubleValue();
        System.out.println("Num5  :  "+num5); //int instance into double
        
    }
    
}
 