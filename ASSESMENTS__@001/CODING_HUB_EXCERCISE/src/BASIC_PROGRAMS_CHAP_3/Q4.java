package BASIC_PROGRAMS_CHAP_3;


//public class Q4 {
//	d.	Write a program to print all prime numbers from 1 to 300
	


public class Q4 {
	public static void main(String[] args) {
		int ct = 0, n = 0, i = 1, j = 1;
		
		while (n < 62) 
			
		{
			j = 1;
			ct = 0;
			while (j <= i)    
				
			{
				if (i % j == 0)
					ct++;
				    j++;
			}
			
			
			if (ct == 2)
			{
				System.out.println( i);
				n++;
			}
			
			i++;
		}
		
	}
}