package ARRAYS_CHAPTER_2;

public class Q3_COPY_EVEN_INDEXED_ELE {
//	c.	Write a program to copy all the even indexed elements in ‘A’ array into ‘B’ array
public static void main(String[] args) {
	int a[]= {1,9,7,3,7,66,45,1,2,22};
	int a1[]=new int[a.length];
	for(int i=0;i<a.length;i+=2) {
		if(i%2==0) {
			a1[i]=a[i];
		}
		System.out.print(a1[i]+" ");
	}
}
}
