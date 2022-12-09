package ARRAY_UNI_QUE;

import java.util.Arrays;

public class SORTING_selection_sort_total_Array
{
	public static void main(String[] args) 
	{
		int small=0,temp;
		int a[]= {11,02,54,57,1,21};
		 
		
		for (int i = 0; i < a.length; i++) 
		{	 
		    small=i;
		   	for(int j=i+1;j<a.length;j++)
		   		{
		   			if(a[small]>a[j])
		   			{
		   				small=j;
		   			}
		   		}
		    temp=a[i];
		   	a[i]=a[small];
		   	a[small]=temp;
		}
		System.out.println(Arrays.toString(a));  // ARRAYS . TOSTRING PRINT THE ARRAY ELEMENTS

	}

}
