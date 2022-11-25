package CLS_OBJ_MOTHOD_MODEL_3;

public class lcm_m
{
	public int check(int x,int y)
	{
		/*int x1=x;
		for(int i=0;i<=x;i++)
		{
			if(x%i==0&&y%i==0)
			{
				x1=i;
				break;
			}
		}
		return x1;*/
				int gcd=1;
			    for(int i = 1; i <= x && i <= y; ++i)
			    {
			      // Checks if i is factor of both integers
			      if(x % i == 0 && y % i == 0)
			        gcd = i;
			    }

			    int lcm = (x * y) / gcd;
			   
				return lcm;
			  }
	  
	}


