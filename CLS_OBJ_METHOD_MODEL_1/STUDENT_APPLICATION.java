package CLS_OBJ_METHOD_MODEL_1;

import java.util.Scanner;

public class STUDENT_APPLICATION
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
	
	student_methds sm=new student_methds();
	
	System.out.println("enter no of student to caluclate their criteria");
	
	int ch=sc.nextInt();
	int i=1;
	do {
	String s1=sc.next();
	int rn=sc.nextInt();
	
	int n1,n2,n3,n4,n5;
	
	n1=sc.nextInt();
	n2=sc.nextInt();
	n3=sc.nextInt();
	n4=sc.nextInt();
	n5=sc.nextInt();
	
	sm.name=s1;
	sm.rollno=rn;
	
	sm.m1=n1;
	sm.m2=n2;
	sm.m3=n3;
	sm.m4=n4;
	sm.m5=n5;
	
	sm.total=500;
	
	sm.fees=10000;
	
	sm.total_marks();
	sm.sch_sec();
	sm.display();
	
	i++;
	
	}while(i<=ch);

}
}
