package Miit_Arshpals_Calculator;

public class Calculator {

	public double add(double n1,double n2){
		
		double n3=n1+n2;
			System.out.println("The addition of the numbers is: "+n3);
			System.out.println("************************************");	
		return n3; 
	}
	 public double subtract(double n1,double n2){
		 double n3=n1-n2;
		 System.out.println("The subtraction of the numbers is: "+n3);
		 System.out.println("************************************");
		 return n3; 
	 }
	 
	 public double multiply(double n1,double n2){
		 double n3=n1*n2;
		 System.out.println("The multiplication of the numbers is: "+n3);
		 System.out.println("************************************");
		 return n3; 
	 }
	 public double divide(double n1,double n2){
		 double n3=0;
		 if(n2==0){
			 System.out.println(n1 +" cannot be divided by 0.");
			 System.out.println(" Enter some other number instead of zero!!" );
			 
		 }
		 else
		 {
		 n3=n1/n2;
		 System.out.println("The division of the numbers is: "+n3);
		 System.out.println("************************************");
		 }
		 
		 return n3; 
	 }
}
