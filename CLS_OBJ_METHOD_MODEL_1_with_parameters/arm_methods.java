package CLS_OBJ_METHOD_MODEL_1_with_parameters;

public class arm_methods
{

	int sum=0,r,x;
	public void check(int n) {
		x=n;
		for(;n>0;n/=10)
		{
			r=n%10;
			sum=sum*10+r;
			
		}
		cc();            // calling method
	}
	public void cc()
	{
		if(x==sum) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
	

}
