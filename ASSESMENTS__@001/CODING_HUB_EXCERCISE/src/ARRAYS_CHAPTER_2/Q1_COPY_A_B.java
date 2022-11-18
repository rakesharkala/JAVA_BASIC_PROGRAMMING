package ARRAYS_CHAPTER_2;

public class Q1_COPY_A_B {
//	a.	Write  a program to copy all the elements in ‘A’ array into ‘B’ array
	public static void main(String[] args) {

	int a[]=new int[]{11,5,66,7,55,66};
	int a1[]=new int[a.length];
	
	
	
	for(int i=0;i<a.length;i++) {
		a1[i]=a[i];   // copy all the elements  a to b
	
		System.out.print(a1[i]+"  ");
	}



}
}