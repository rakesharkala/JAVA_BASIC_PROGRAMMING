package ARRAYS_CHAPTER_3;

public class Q8_REMOVE_DUBLICATE {
//	h.	Write a program to remove the duplicate elements in the array.
public static void main(String[] args) {
	int a[]= {10,12,14,12,14,21,14};
	
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				a[i]=-1;
			}
		}
	}
	
	for(int i=0;i<a.length;i++) {
		if(a[i]!=-1) {
			System.out.print(a[i]+"  ");
		}
		
	}
 }
}