/*que no 26).Write a program to find minimum and maximum number as well as 
to add two float numbers using methods of Float.*/

class day2_21{
    public static void main(String[] args)
    {
     float num1 = 20.05f;
     float num2 = 10.06f;
     float Max_no = Math.max(num1,num2);
     float Min_no = Math.max(num1,num2);
     float Result = Float.sum(num1,num2);
     System.out.println("maximum value ="+Max_no);
     System.out.println("minmum value ="+Min_no);
     System.out.println("Result ="+Result);
    }
}