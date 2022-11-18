package ARRAYS_CHAPTER_5;

public class Q2_RIGHT_ROTATE {
//	b.	Right Rotate the array for 5 times using 1 loop(time complexity O(n)
//	c.	Right Rotate the array for 5 times using 2 loops(time complexity O(n2)
	public static void main(String[] args) {

	int a[]= {11,10,12,10,41,12,45,21,74,95};
	int i,j;
	for(i=5;i>=0;i--){
		int temp=a.length-1;
		for(j=a.length-1;j>0;j--) {
			a[j+1]=a[j];
			
		}
		a[j]=temp;
	}	
	for(int k=0;k<a.length;k++) {
		System.out.print(a[k]+" ");
	}
	
	}


}
