package CLS_OBJ_MOTHOD_MODEL_3;

public class hcf_m 
{
	public int check(int x,int y)
	{
		int max=0;
		for(int i=1;i<=x;i++)
		{
			if(x%i==0&&y%i==0)
			{
				max=i;
			}
			
		}
		return max;
		
	}

	

}
