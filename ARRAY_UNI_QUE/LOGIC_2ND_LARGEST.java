package ARRAY_UNI_QUE;


public class LOGIC_2ND_LARGEST 
{
	public static void main(String[] args) {
    int a[]= {10, 5 ,4 ,5 ,10 ,51};
	int high=0;
	int shigh=0;
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>high)
		{
			shigh=high;      //
		     high=a[i];    
		}
		if(a[i]<high&&a[i]>shigh)
		{
			shigh=a[i];
		}
	}
	System.out.println("SECOND HIGHEST : "+shigh);

}
}