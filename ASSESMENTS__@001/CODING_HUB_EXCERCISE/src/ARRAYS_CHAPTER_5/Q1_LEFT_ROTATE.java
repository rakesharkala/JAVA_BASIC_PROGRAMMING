package ARRAYS_CHAPTER_5;


public class Q1_LEFT_ROTATE {
//	Chapter V 
//	a.	Right Rotate the array for 5 times using 2 loops(time complexity O(n2)
//	d.	Right Rotate the array for 5 times using 1 loop(time complexity O(n)

	
	public static void main(String[] args)
	{
		int a[]= {10,15,42,15,14,11,23};
		
		int i,j;
		for( i=0;i<5;i++)
		{
			int temp=a[0];
			for( j=0;j<a.length-1;j++) 
			{
				a[j]=a[j+1];
				
			}
			a[j]=temp;
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
	}

}
