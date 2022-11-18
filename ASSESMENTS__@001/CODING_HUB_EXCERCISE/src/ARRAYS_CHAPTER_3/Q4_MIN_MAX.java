package ARRAYS_CHAPTER_3;

public class Q4_MIN_MAX {
//	d.	Write a program to find the minimum and maximum element in the array

	public static void main(String[] args) {
		int a[]= {10,55,75,55,4,52};
		int min=a[0];
		int max=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<a[0]){    // to find min value in array
				min=a[i];
			}
			if(max<a[i]) {  // to find max value in array
				max=a[i];
			}
		}
		System.out.println("the min value is :"+min);
		System.out.println("the max value is :"+max);
	}
}
