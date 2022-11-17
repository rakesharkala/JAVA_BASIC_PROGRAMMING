package BASIC;

import java.util.*;
import java.util.Scanner;

public class Student_Scholor {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter name");
		String name = sc.next();

		System.out.print("Enter rollno");
		int rollno = sc.nextInt();

		char section = 'L';
		double sc1 = 10, sc2 = 15, sc3 = 20, fees = 10000;

		System.out.println("enter sub marks  ");
		
		int marks[] = new int[5];
		int total = 0;
		double dis, final_fees = 0;
		int exmfee=500;

		for (int i = 0; i < 5; i++) {
			marks[i] = sc.nextInt();
			total += marks[i];

		}

		double per = total / 500.0 * 100;

		if (per >= 60 && per <= 70) {
			section = 'C';
			dis = sc1 / 100 * fees;
			final_fees = fees - dis;

		} else if (per >= 70 && per <= 80) {
			section = 'B';
			dis = sc2 / 100.0 * fees;
			final_fees = fees - dis;

		} else if(per>=80){
			section = 'A';
			dis = sc3 / 100.0 * fees;
			final_fees = fees - dis;

		}
		else {
			
			final_fees=fees+exmfee;
			
		}

		System.out.println("STUDENT NAME IS    : " + name);
		System.out.println("STUDENT ROLLNO IS  : " + rollno);
		System.out.println("total marks        : " + total);
		System.out.println("percentage         : " + per);

		System.out.println("STUDENT SECTION    : " + section);
		System.out.println("fee paid by student : " + final_fees);

	}

}
