package ARRAYS_CHAPTER_2;

public class Q6_COPY_ODD_ELE {
//	f.	Write a program to copy all the odd elements in ‘A’ array into ‘B’ array
	public static void main(String[] args) {
		int a[] = { 11, 21, 4, 66, 7, 99, 75, 5, 10, 44, 22, 63};
		int a1[] = new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				a1[i]=a[i];
				System.out.print(a1[i]+"  ");
			}
		}

	}
}
