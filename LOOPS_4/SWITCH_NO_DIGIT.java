package LOOPS_4;

import java.util.Scanner;

public class SWITCH_NO_DIGIT {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter the count of number :  ");
		int s=sc.nextInt();
		
		System.out.print("enter the no  ---\nthe last no must be zero :   ");
		int n=sc.nextInt();
		int r,sum=0;
		for(;n>0;n/=10)
		{
			r=n%10;
			sum=sum*10+r;
		}
		for(int i=s;i>0;i--)
		{
			r=sum%10;
			sum=sum/10;
			switch(r)
			{
			case 1: System.out.println("one   ");break;
			case 2: System.out.println("two   ");break;
			case 3: System.out.println("three   ");break;
			case 4: System.out.println("four   ");break;
			case 5: System.out.println("five   ");break;
			case 6: System.out.println("six   ");break;
			case 7: System.out.println("seven   ");break;
			case 8: System.out.println("eight   ");break;
			case 9: System.out.println("nine   ");break;
			default:System.out.println("zero");
			}
		}
		
	}

}
