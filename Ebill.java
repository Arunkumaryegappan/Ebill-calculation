package calculate_ebill;

import java.util.Scanner;

public class Ebill {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		float amount=0;
		float remainder=0;
		Ebill  e=new Ebill();
		Scanner getin = new Scanner(System.in);
		System.out.println("ENTER  THE  UNIT :");
		float unit=getin.nextFloat();
		e.calculate(unit);
	
	

	}
public double calculate(float unit) {
		
		if(unit <=100) {
		double amount= unit*1;
		return  amount;
				}
	
	else if (unit >=101 && unit<=300) {
		float remainder1= unit %100;
		calculate(remainder1);
		float value=unit - remainder1;
		double amount= value *2.50;
		double result= amount+value;
		System.out.println("you should pay : "+(remainder1+amount)+"rs");
		
		
		
	}
	else if (unit >=301 && unit<=500) {
		float remainder1= unit %100;
		calculate(remainder1);
		float value=unit - remainder1;
		double amount= value *4.75;
		double result= amount+value;
		System.out.println("you should pay : "+(remainder1+amount)+"rs");
		
		
		
	}
		
	else {
		float remainder1= unit %100;
		calculate(remainder1);
		float value=unit - remainder1;
		double amount= value *9;
		double result= amount+value;
		System.out.println("you should pay : "+(remainder1+amount)+"rs");
	
	}
		return 0;
		
			 

		

}
		
	}

		

