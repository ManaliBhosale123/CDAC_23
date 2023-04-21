//que no- 6
/*
boolean value into string
boolean value into Boolean instance
String value into boolean value
String value into Boolean instance

*/

class day2_1 {
    public static void main(String[] args){

        /*
        boolen b1 = false;
        String s1 = Boolean.toString(b1);      //boolean to string is created used to string method i
        System.out.println("string is:"+b1);
        */

        /*
        Boolean b2 = true;
        Boolean b = Boolean.valueof(b2);   //boolean instance is created using value of method
        System.out.println("boolean instance value is:"+b);
        */

        /*
        String s1 ="true";
        String s2 ="false";
        boolean b3 = Boolean.parseBoolean(s1);  // here unboxing is happened as boolean is primitive, then pre to nonpremitive conversion we use parse method
        boolean b4 = Boolean.parseBoolean(s2);
        System.out.println("boolean value is:"+b3);
         System.out.println("boolean value is:"+b4);
        */

         String s3="123";  //string value into boolean instance
         Boolean b5=Boolean.valueof(s3);
         System.out.println("boolean instance value is:"+b5);


    }
}

