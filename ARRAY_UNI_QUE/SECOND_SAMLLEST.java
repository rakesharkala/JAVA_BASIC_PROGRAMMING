package ARRAY_UNI_QUE;

public class SECOND_SAMLLEST 
{
	public static void main(String[] args)
	{
		int a[]= {10,21,2,14,1,21,1};
		
		int fm=Integer.MAX_VALUE;
		int sm=Integer.MAX_VALUE;
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<fm)
			{
				sm=fm;
				fm=a[i];
			}
			if(a[i]<fm&&a[i]>sm)
			{
				sm=a[i];
			}
		}
		System.out.println(sm);
	}

}
