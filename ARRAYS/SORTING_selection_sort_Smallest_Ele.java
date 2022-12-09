package ARRAYS;

public class SORTING_selection_sort_Smallest_Ele
{
	public static void main(String[] args) 
	{
		int small=0;
		int a[]= {11,02,54,57,1,21};
		 
		
		for(int i=1;i<a.length;i++)
		{
			if(a[small]>a[i])
			{
				small=i;
			}
			
		}
		System.out.println(a[small]);
	}

}
