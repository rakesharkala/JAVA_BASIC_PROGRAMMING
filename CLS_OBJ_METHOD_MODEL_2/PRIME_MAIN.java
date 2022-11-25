package CLS_OBJ_METHOD_MODEL_2;

public class PRIME_MAIN 
{
	public static void main(String[] args)
	{
		prime_method p=new prime_method();
		
		int start=10,end=100;
		
		int s=p.pm(start,end);
		System.out.println("\nSUM OF THOSE PRIMES : "+s);
	}

}
