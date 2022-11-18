package ARRAYS_CHAPTER_5;

//i.	Sort only EVEN indexed elements(both ascending & descending)
//i.	“Hello “ ,”all” , “good” , “ Morning”, “Have” , “a” , “nice” ,”day” 


public class Q6_STRING_SORT_EVEN_INDEX {
	public static void main(String[] args) {
		
		String a[]= {"","hello","all","njy","self","aaa","abc"};
		
		for(int i=1;i<a.length;i+=2) 
		{
			for(int j=i+1;j<a.length;j+=2)
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
