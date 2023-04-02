 class Compound_int{

    public static void main(String args[]){
	    double loan_amount=5;
		double Period =5;
		double Rate_i =10.75;
		double compound_i ;
		double Total_amount ;
		
		Total_amount = loan_amount*(Math.pow((1+(Rate_i/100)),Period));
		System.out.println("Total_amount= " +Total_amount + "Cr");
	compound_i= Total_amount- loan_amount;
	System.out.println("compound_i =" +compound_i + "Cr");
		
	
	}
}