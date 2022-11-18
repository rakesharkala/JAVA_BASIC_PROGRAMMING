package ARRAYS_CHAPTER_5;
//Insert an element=67 in the position=5 for the below array
////i.	10 20 30 40 50 60 70 80 90 100


public class Q3_INSERT_ELE {
	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50,60,70,80,90,100};
		
		for(int i=0;i<a.length;i++)
		{
			if(i==6)
			{
				a[i]=67;   // inserting element in array
			}
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
