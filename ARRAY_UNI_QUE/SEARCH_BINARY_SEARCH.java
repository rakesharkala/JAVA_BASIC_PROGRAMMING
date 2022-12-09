package ARRAY_UNI_QUE;

public class SEARCH_BINARY_SEARCH 
{
		public static void main(String[] args)
		  {
			  int a[]= {10,20,14,44,53,76,99,101};
			  int ele=20;
			  int high=a.length,low=0;
			  int mid=(low+high)/2;
			  
			  for( low=0;low<=high;low++)
			  {
				  if(a[mid]<ele)
					  low=mid+1;
				  
				  else if(a[mid]==ele)
				  {
					  System.out.println("ELEMENT FOUND "+(mid+1));
					  break;
				  }
				  else 
				  {
					  high=mid-1;
					  mid=(low+high)/2;
				  }
				  if(low>high)
				  {
					  System.out.println("ELEMENT NOT FOUND");
				  }
				  
			  }
		  
	}

}
