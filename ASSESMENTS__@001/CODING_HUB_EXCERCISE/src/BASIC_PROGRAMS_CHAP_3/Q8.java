package BASIC_PROGRAMS_CHAP_3;

public class Q8 {
//	i.	Write a program to find the factors of a number.
	
	public static void main(String[] args) {
		int n=20;
		int i=1;
		while(i<21) {
			if(n%i==0) {
				System.out.println("factors of "+n+" "+i);
				
			}
			i++;
		}
	}

}
