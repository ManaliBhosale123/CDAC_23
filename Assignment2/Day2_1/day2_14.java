/*que no 21)Write a program to convert state of Long instance into byte, 
short, int, long, float and double*/

class day2_14{
    public static void main(String[] args)
    {
        long value =25648;
        Long bs = new Long(value);

        byte num1 = bs.byteValue();
        System.out.println("Num1  :  "+num1); //long instance into byte

        short num2 = bs.shortValue();
        System.out.println("Num2  :   "+num2); //long instance into int

        int num3 = bs.intValue();
        System.out.println("Num3 :  "+num3); //long instance into long

        float num4 = bs.floatValue();
        System.out.println("Num4  :  "+num4); //long instance into float

        double num5 = bs.doubleValue();
        System.out.println("Num5  :  "+num5); //long instance into double
        
    }
}