package BASIC_PROGRAMS_CHAP_1;

import java.util.Scanner;

public class D_1 {
 
	//d.	If the marks obtained by a student in five different subjects are input through the
	//keyboard, find out the aggregate marks and percentage marks obtained by the student.
	//Assume that the maximum marks that can be obtained by a student in each subject is 100
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the name :");
		String name=sc.next();
		System.out.print("enter marks  :");
		
		int a[]=new int[5];
        int total=0;
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
			total+=a[i];	
		}
		double per=total/100.0*100;
		System.out.println("name of the student :"+name );
		System.out.println("total marks : "+total);
		System.out.println("percentage : "+per);
		
		
		
		
		
		

	}
}
