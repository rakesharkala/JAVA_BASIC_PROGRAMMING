package ARRAY_UNI_QUE;

public class unique
{

	public static void main(String[] args) 
	{
		int a[]= {10,10,5,11,11};
		
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j]&&i!=j)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.print(a[i]+"  ");
			}
		}
		
		
	}

}
