package Miit_Arshpals_Calculator;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String [] arg){

		Calculator c=new Calculator();

		Scanner sc=new Scanner(System.in);

		String cont;
		do{

		System.out.println("Select operator(+,-,*,/)");
		String op=sc.next();

		System.out.println("Enter the First number!");
		double num1=sc.nextDouble();
		 
		System.out.println("Enter the Second number!");
		double num2=sc.nextDouble();
		 
		 

        
		switch(op)
		{
			case "+": c.add(num1,num2);
			break;
			
			case "-": c.subtract(num1,num2);
			break;
			
			case "*": c.multiply(num1,num2);
		    break;
			
			case "/": c.divide(num1,num2);
			break;
			
			default:
			System.out.println("You have entered the wrong operator!Please enter the operators mentioned above. ");
		}
		System.out.println("Do you want to continue the calculations?");
		System.out.println("Press y for Yes and n for No");
		cont=sc.next();
		}while(cont.equals("y")||cont.equals("Y"));
		}
}
