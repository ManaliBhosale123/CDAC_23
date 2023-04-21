/*que no 30)Write a program to find minimum and maximum number as well as 
to add two double numbers using methods of Double.*/

class day2_22{
    public static void main(String[] args)
    {
     double num1 = 24.09d;
     double num2 = 10.04d;
     double Max_no = Math.max(num1,num2);
     double Min_no = Math.max(num1,num2);
     double Result = Double.sum(num1,num2);
     System.out.println("maximum value ="+Max_no);
     System.out.println("minmum value ="+Min_no);
     System.out.println("Result ="+Result);
    }
}