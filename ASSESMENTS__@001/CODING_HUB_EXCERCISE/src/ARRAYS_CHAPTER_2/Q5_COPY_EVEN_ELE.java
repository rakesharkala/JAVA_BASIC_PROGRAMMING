package ARRAYS_CHAPTER_2;

public class Q5_COPY_EVEN_ELE {
//	e.	Write a program to copy all the even elements in ‘A’ array into ‘B’ array
public static void main(String[] args) {
	
	int a[]= {11,20,40,1,10,66,45,11};
	int a1[]=new int[a.length];
	
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) {
			a1[i]=a[i];
			System.out.print(a1[i]+"  ");
		}
		
	}
}
}
