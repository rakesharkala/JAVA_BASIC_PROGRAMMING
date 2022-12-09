package ARRAY_UNI_QUE;

public class DUBLICATE_ELE_impimp
{
	public static void main(String[] args) 
	{
		int a[]= {1,5,1,5,6};
		
		for(int i=0;i<a.length;i++)
		{
		int count=0;
			for(int j=0;j<a.length;j++)
			{
				
				if(a[i]==a[j]&&i!=j)
				{
				 count++;
				 a[j]=-1;
				}
				
			}
			if(count>0&&a[i]!=-1)
			{
				System.out.print(a[i]+"  ");
			}
			
		}
	
		
	}

}
