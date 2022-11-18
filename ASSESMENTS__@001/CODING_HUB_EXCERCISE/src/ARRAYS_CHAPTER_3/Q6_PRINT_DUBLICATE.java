package ARRAYS_CHAPTER_3;

public class Q6_PRINT_DUBLICATE 
{
//	f.	Write a program to print the duplicate elements in array
	public static void main(String[] args)
	{

	int a[]= {10,12,10,11,55,10,55};
	//int count=1;
	
	
	for(int i=0;i<a.length;i++) 
	{
		for(int j=i+1;j<a.length;j++)
		{   int count=1;
			if(a[i]==a[j]) 
			{
				count++;
				System.out.println(a[j]+" "+count);

			}
		}
	 }
	//System.out.println("total dublicate no are : "+count);
	}
	
}