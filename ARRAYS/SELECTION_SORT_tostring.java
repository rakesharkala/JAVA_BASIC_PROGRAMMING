package ARRAYS;

//Selection sort in Java

import java.util.Arrays;

public class SELECTION_SORT_tostring 
{
	void selectionSort(int a[])
	{

		int small=0;
		for (int i = 0; i<a.length; i++) 
		{
			 small=i;

			for (int j = i + 1; j < a.length; j++)
			{

				if (a[j] <a[small]) 
				{
					small = j;
				}
			}
			
			// put min at the correct position
			int temp = a[i];
			a[i] = a[small];
			a[small] = temp;
		}
}
// driver code
	public static void main(String args[]) 
	{
		int a[] = { 20, 12, 10, 15, 2 };
		
		SELECTION_SORT_tostring ss = new SELECTION_SORT_tostring();
		ss.selectionSort(a);
		
		System.out.println("Sorted Array in Ascending Order: ");
		System.out.println(Arrays.toString(a));
	}

}


