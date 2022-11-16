package PATTERNS;

public class up_dn_numbers {
	public static void main(String[] args) {
		
		int r=5;
		
		//upper half
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+"  ");
			}
			System.out.println();
		}
		
		//lower half
		
		for(int i=r-1;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+"  ");
			}
			System.out.println();
		}
		
		
	}

}
