package ARRAYS_CHAPTER_3;

public class Q3_SUM_OF_ARRAY {
//	c.	Write a program to find the sum of all the elements in the array
	
	public static void main(String[] args) {
		
		
		int a[]= {10,54,74,55,55,6};
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			sum+=a[i];

		}
		System.out.println(sum);
		
	}

}
