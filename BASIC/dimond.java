package BASIC;

public class dimond {
	public static void main(String[] args) {

		int n = 5;
		for (int i = 0; i < n; i++)
		{

			// spaces
			for (int k = 0; k < n - i; k++)
			{
				System.out.print(" ");
			}
			// upper half pattern
			
			for (int j = 0; j < i; j++) 
			{
				if(j==0||i==n) 
			
				System.out.print("*");
			}
			for(int j=1;j<i;j++) 
			{
				if(j==0||i==n)
				System.out.print("*");
			}
			
			System.out.println();
		}

		// 2nd half
		for (int i =n; i >0; i--)
		{

			// spaces
			for (int k = 0; k < n - i; k++)
			{
				System.out.print(" ");
			}
			// upper half pattern
			for (int j = 0; j < i; j++) 
			{
				System.out.print("*");
			}
			for(int j=1;j<i;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}