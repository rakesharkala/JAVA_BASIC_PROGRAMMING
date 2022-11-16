package PATTERNS;

public class up_dn_rev_no {
	public static void main(String[] args) {
		
		
		//upper half
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+"  ");
			}
			System.out.println();
		}
		
		//lower half
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j+"  ");
			}
			System.out.println();
		}
		
	}

}
