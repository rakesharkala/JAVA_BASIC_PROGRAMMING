package ARRAYS_CHAPTER_5;

import java.util.Arrays;

//g.	Sort the below String using any sorting technique(both ascending & descending)
//i.	“Hello “ ,”all” , “good” , “ Morning”, “Have” , “a” , “nice” ,”day” 
public class Q5_STRING_SORT {
	
	public static void main(String[] args) {
		
		String a[]= {"Hello" , "all" , "good" ,  "Morning", "Have" ," a" ," nice" ,"day"};
		
	   Arrays.sort(a);
	   
	   for(int i=0;i<a.length;i++) 
	   {
		   System.out.print(a[i].trim()+" ");
		   
	   }
/*		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				//if(a[i].equalsIgnoreCase(a[j]))
				if(a[i].equalsIgnoreCase(a[j])>0)
				{
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
			System.out.println(Arrays.toString(a));
		
	   
	}
*/
}
}
