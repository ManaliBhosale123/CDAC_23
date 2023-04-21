/*que no 29)Write a program to convert state of Double instance into byte, 
short, int, long, float and double.*/

class day2_17{
    public static void main(String[] args)
    {
        double value =8765.00;
        Double bs = new Double(value);

        byte num1 = bs.byteValue();
        System.out.println("Num1  :  "+num1); //double instance into byte

        short num2 = bs.shortValue();
        System.out.println("Num2  :   "+num2); //double instance into int

        int num3 = bs.intValue();
        System.out.println("Num3 :  "+num3); //double instance into long

        float num4 = bs.floatValue();
        System.out.println("Num4  :  "+num4); //double instance into float

        long num5 = bs.longValue();
        System.out.println("Num5  :  "+num5); //double instance into double
          
    }
}
