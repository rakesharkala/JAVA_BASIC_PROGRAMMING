package BASIC_PROGRAMS_CHAP_1_CONDITIONAL_STMTS;

import java.util.Scanner;

public class Q6 {
//	6. A certain grade of steel is graded according to the following conditions: 
//		(i) Hardness must be greater than 50                        >50
//		(ii) Carbon content must be less than 0.7						<0.7
//		 (iii) Tensile strength must be greater than 5600 The grades are as follows:  >5600
//		 Grade is 10 if all three conditions are met
//		 Grade is 9 if conditions (i) and (ii) are met
//		 Grade is 8 if conditions (ii) and (iii) are met
//		 Grade is 7 if conditions (i) and (iii) are met 
//		Grade is 6 if only one condition is met
//		 Grade is 5 if none of the conditions are met 
//		
//	Write a program, which will require the user to give values of hardness,
	//carbon content and tensile strength of the steel under consideration and output
	//the grade of the steel.
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int  hard=sc.nextInt();
		double carbon=sc.nextDouble();
		int ts=sc.nextInt();
		
		if(hard >50&&carbon<0.7&&ts>5600) {
			System.out.println("grade 10");
		}
		else if((hard >50||ts>5600)&&carbon<0.7) {
			System.out.println("grade 9");
		}
		else if((carbon<0.7&&ts>5600)&&hard>50) {
			System.out.println("grade 8");
		}

		else if((hard >50||ts>5600)&&carbon<0.7) {
			System.out.println("grade 7");
		}
		else if(hard>50||ts>5600||carbon<0.7) {
			System.out.println("grade 6");
		}
		else {
			System.out.println("grade 5");
		}
		
		
	}
	
	
}
