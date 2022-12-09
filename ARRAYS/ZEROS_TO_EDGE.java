package ARRAYS;

public class ZEROS_TO_EDGE
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,0,3,0,4,0,0,4,0,5};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				a[i]=-1;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				System.out.print(a[i]+"  ");
			}
		}
		
	}
}
