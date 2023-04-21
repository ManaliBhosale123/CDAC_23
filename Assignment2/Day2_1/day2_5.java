/*que no 10) Write a program to perform below operations on char type to 
get:
a. The number of bits used to represent a char value
b. The number of bytes used to represent a char value
c. The minimum value a char
d. The maximum value a char*/

class day2_5{
    public static void main(String[] args){
    System.out.println("size:"+Character.SIZE);
    System.out.println("size:"+Character.BYTES);
    System.out.println("MIN_VALUE:"+Character.MIN_VALUE);
    System.out.println("MAX_VALUE:"+Character.MAX_VALUE);
    }
}