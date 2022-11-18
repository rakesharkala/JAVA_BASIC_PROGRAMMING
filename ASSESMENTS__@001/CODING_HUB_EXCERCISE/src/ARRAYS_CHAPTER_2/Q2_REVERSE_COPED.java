package ARRAYS_CHAPTER_2;

public class Q2_REVERSE_COPED {
//	b.	Write a program to copy all the elements in ‘A’ array into ‘B’ array in reverse order
public static void main(String[] args) {
	
	int a[]= {44,2,6,7,9,22,4,77,69};
	int a2[]=new int[a.length];
	
	for(int i=a.length-1;i>=0;i--) {
		a2[i]=a[i];
		System.out.print(a2[i]+"   ");
	}
	
}
}
