package STRINGS_CHAPTER_2;
//29.	Write a Java program to swap corner words and reverse middle character of a string
//a.	Input    : Hello this is codinghub user
//Output : User codinghub eth is siht Hello


public class Q9 
{
	public static void main(String[] args) 
	{
		String s="User codinghub eth is siht Hello";
		String a[]=s.split(" ");
		String f="";
		for(int i=0;i<a.length;i++)
		{
			if(i==0||i==a.length-1)
			{
				String x=a[i];
				a[i]=a[a.length-1];
				a[a.length-1]=x;
				System.out.println(a[i]);
			}
			else {
				for(int j=a.length-2;j>0;j--)
				{
				   System.out.println(a[j]);
				}
			}
			
		}
		
	}

}
