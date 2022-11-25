package CLS_OBJ_METHOD_MODEL_2;

public class fib_m {
	int sum=0;
	public int sec(int a,int b)
	{
		for(int i=1;i<=10;i++) {
		System.out.println(a);
		int c=a+b;
		a=b;
		b=c;
		sum=sum+a;
		
		}
		
		return sum;
		
	}

}
