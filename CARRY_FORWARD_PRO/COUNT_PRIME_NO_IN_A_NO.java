package CARRY_FORWARD_PRO;

public class COUNT_PRIME_NO_IN_A_NO 
{
	public static void main(String[] args)
	{
		int n = 45742, r,c=0;
		
		for (; n > 0; n /= 10) 
		{
			 
			int count = 0;
			r = n % 10;

			for (int i = 2; i <= r / 2; i++) 
			{
				if (r % i == 0)
				{

					count++;
					

				}
			}
			if(count==0) {
				c++;
			}
		
		}
		System.out.println(c);
	
	}

}
