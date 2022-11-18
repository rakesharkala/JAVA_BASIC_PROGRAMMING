package ARRAYS_CHAPTER_5;

//h.	Sort only ODD indexed elements (both ascending & descending)
//i.	“Hello “ ,”all” , “good” , “ Morning”, “Have” , “a” , “nice” ,”day” 

public class Q7_STRING_SORT_ODD_INDEX
{
	public static void main(String[] args) {
		
		String a[]= {"Hello " ,"Aell" , "Good" , "Morning", "Have" , "a", "Nice" ,"Day"};

		//	String a[]= {"Hello " ,"all" , "good" , "Morning", "Have" , "a", "nice" ,"day"};
	//	String a[]= {"anil","rak","anilk","a","arukala"};

		for(int i=1;i<a.length;i+=2)
		{
			for(int j=i+3;j<a.length;j+=2)
			{
				if(a[i].compareTo(a[j])>0)
				{
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
