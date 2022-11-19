package ASSESMENT_2;

public class LARGEST_DIGIT_IN_NUM {
	public static void main(String[] args) {

	int n=1357946,r,max=1;
	for(;n>0;n/=10)
	{
		r=n%10;
		if(max<r)
		{
			max=r;
		}
		
	}
	System.out.println(max);
}
}
