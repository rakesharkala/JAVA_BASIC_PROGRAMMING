package ARRAYS;

public class On_use_sort 
{
	public static void main(String[] args)
	{
		int a[]= {10,22,54,54,74,5,1,2,22};
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				
				i=-1;
			}
			
		}
		for (int i : a) 
		{
			System.out.print(i+"  ");
			
		}
		
	}

}
