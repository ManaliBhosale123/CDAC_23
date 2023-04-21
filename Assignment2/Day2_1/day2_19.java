/*que no 22)Write a program to find minimum and maximum number as well as 
to add two long numbers using methods of Long.*/

class day2_19{
    public static void main(String[] args)
    {
     long num1 = 23L;
     long num2 = 25L;
     long Max_no = Math.max(num1,num2);
     long Min_no = Math.max(num1,num2);
     long Result = Long.sum(num1,num2);
     System.out.println("maximum value ="+Max_no);
     System.out.println("minmum value ="+Min_no);
     System.out.println("Result ="+Result);
    }
}
