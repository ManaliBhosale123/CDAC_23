//2.BMI


class BMI_1calculator1{
    
       private double  height; //A double field to store the height of the person in meters.
       private double  weight; //A double field to store the weight of the person in kilograms.
       /* a. A constructor to initialize the height and weight fields of the BMI calculator
        object.
        b. Getter and setter methods.
        c. Double calculateBMI(): A method to calculate the BMI of the person using the
        following formula:
        BMI = weight / (height * height).*/
      

        public BMI_1(double height,double weight)
        {  
            this.height = height;//or height=ht; 
            this.weight = weight;//weight=wt;
            //System.out.println( bmi.getheight()+"  "+bmi.getweight());
        }
         public double getheight()
         {
          return this.height=height;
         }
         
         public void setheight(double height)
          {
            this.height=height;
          }
          public double getweight()
         {
          return this.weight=weight;
         }
         
         public void setweight(double weight)
          {
            this.weight=weight;
    }


       double BMI_1()
        {
          return weight / (height * height);
        
        
        }
}
class BMI_1{
    public static void main(String args[]){
        BMI_calculator1 bmi= new BMI_calculator1(5.67,56.8);
         double bmi_1= bmi.calculateBMI();
          System.out.println(bmi_1);
}

}
