package ARRAYS_CHAPTER_5;

//f.	Delete an element=40 in the below array
//i.	10 20 30 40 50 60 70 80 90 100
public class Q4_DELETE_eLE {
	
	public static void main(String[] args) {
		
		
		int a[]= {10,20,30,40,50,60,70,80,90};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==40) {
				a[i]=-1;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=-1)
			{
				System.out.println(a[i]);
			}
		}
	}

}
