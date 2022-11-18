package BASIC_PROGRAMS_CHAP_1_CONDITIONAL_STMTS;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) 
	{
	System.out.println("KARTHI DATA ABOUT INSURENCE :\n");

		String con="exellent";
		int age=25;
		String loc="city";
		String gen="male";

		double rate =0,amount = 0,f_a=0;
		String status="not insured";

		if((con=="exellent")&&(age>=25)&&(age<=35)&&(loc=="city")&&(gen=="male")) 
		{
			amount=200000;
			rate=4/100.0*200000;
			status="insured";
		}
		else if(con=="exellent"&&age>=25&&age<=35&&loc=="city"&&gen=="female") 
		{	
			amount=100000;
			rate=3/100.0*100000;
			status="insured";
		}
		else if(con=="poor"&&age>=25||age<=35&&loc=="village"&&gen=="male") 
		{
			amount=10000;
			rate=6/100.0*10000;
			status="insured";
		}
		else
		{
			System.out.println("not insured !!");
		}
		
		f_a=amount-rate;   //common to all so written outside otherwise code redendency occurs !!
		
		System.out.println("THE CONDITION OF KARTHI : "+con);
		System.out.println("THE AGE OF KARTHI       : "+age);
		System.out.println("THE LOCALITY OF KARTHI  : "+loc);
		System.out.println("THE GENDER OF KARTHI    : "+gen);
		System.out.println();  
		System.out.println("THE INSURANCE           :  "+amount);
		System.out.println("THE RATE APPLIED        :  "+rate);
		System.out.println("THE FINAL AMOUNT HE GET :  "+f_a);
		System.out.println("THE STATUS OF KARTHI    :  "+status);
	}
}













//5.	An Insurance company follows following rules to calculate premium. 
//(1) If a person’s health is excellent and the person is between 25 and 35 years 
//of age and lives in a city and is a male then the premium is Rs. 4 per thousand 
//and his policy amount cannot exceed Rs. 2 lakhs. 
//(2) If a person satisfies all the above conditions except that the sex is female
//then the premium is Rs. 3 per thousand and her policy amount cannot exceed Rs. 1 lakh. 
//(3) If a person’s health is poor and the person is between 25 and 35 years of age 
//and lives in a village and is a male then the premium is Rs. 6 per thousand 
//and his policy cannot exceed Rs. 10,000. 
//(4) In all other cases the person is not insured.   premium rate and maximum 
//amount for which he/she can be insured
	