package ARRAYS_CHAPTER_3;

public class Q5_UNIQUE_ELE {
//	e.	Write a program to find the unique elements in the array
	
	public static void main(String[] args) {
		
		int a[]= {2,14,15,74,14,74};
		int a1[]=new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if (a[i]!=a[j]) {
					a1[i]=a[i];
					
				}
			}
			System.out.print(a1[i]+"  ");
		}
		
	}
	
	
	
	

}
