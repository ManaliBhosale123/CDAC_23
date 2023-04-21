/*que no 19)Write a program to perform below operations on long type to 
get: 
a. The number of bits used to represent a long value
b. The number of bytes used to represent a long value
c. The minimum value a long
d. The maximum value a long
*/
class day2_12{
    public static void main(String[] args)
    {
    System.out.println("size:"+Long.SIZE);
    System.out.println("size:"+Long.BYTES);
    System.out.println("MIN_VALUE:"+Long.MIN_VALUE);
    System.out.println("MAX_VALUE:"+Long.MAX_VALUE);
    }
}