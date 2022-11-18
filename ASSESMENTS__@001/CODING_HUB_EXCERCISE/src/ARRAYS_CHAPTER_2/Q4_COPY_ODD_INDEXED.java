package ARRAYS_CHAPTER_2;

public class Q4_COPY_ODD_INDEXED {
//	d.	Write a program to copy all the odd indexed elements in ‘A’ array into ‘B’ array

	public static void main(String[] args) {
		int a[]= {1,55,4,7,66,9,1,2,2,44,33,7};
		int a1[]=new int[a.length];
		
		for(int i=1;i<a.length;i+=2) {
			if(i%2!=0) {
				a1[i]=a[i];
				
			}
			System.out.print(a1[i]+"  ");
		}
	}
}
