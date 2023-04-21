/*que 32)write a program to accept and print full name as an argument 
from command line.*/

class day2_16CommandLine{
    public static void main(String[] args)
    {
      String s1 = args[0];
      String s2 = args[1];
      String s3 = args[2];

      System.out.println("Your first name argument is: " + args[0]);
      System.out.println("second argument is: " + args[1]);
      System.out.println("Third argument is: " + args[2]);

    }
}
