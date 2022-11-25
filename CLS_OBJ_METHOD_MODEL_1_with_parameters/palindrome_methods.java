package CLS_OBJ_METHOD_MODEL_1_with_parameters;

public class palindrome_methods
{
	public void method(int n)
	{
		int sum=0,r;
		int s=n;
		for(;n>0;n/=10)
		{
			r=n%10;
			sum=sum*10+r;
		}
		if(s==sum) {
			System.out.println("PALINDROME");
		}
		else {
			System.out.println("NOT PALINDROME");
		}
		
		
	}

}
