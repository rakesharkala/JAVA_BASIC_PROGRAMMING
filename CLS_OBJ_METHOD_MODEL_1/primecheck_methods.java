package CLS_OBJ_METHOD_MODEL_1;

public class primecheck_methods 
{
	
	int n,c;
	
	public void logic()
	{
		for(int x=2;x<=n/2;x++)
		{
			if(n%2==0)
			{
				c++;
			}
		}
		if(c==0)
		{
			System.out.println("prime");
		}else
		{
			System.out.println("not prime ");
		}
	}
	public void  display() {
		System.out.println("the prime logic is checked above");
		System.out.println("this is methods i have done here !!");
	}
	
	

}
