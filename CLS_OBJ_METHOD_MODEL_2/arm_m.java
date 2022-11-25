package CLS_OBJ_METHOD_MODEL_2;

public class arm_m
{

public int p(int n) 
{
	int s=0,r;
	for(;n>0;n/=10)
	{
		r=n%10;
		s=s+(r*r*r);
	}
	return s;
}
}
