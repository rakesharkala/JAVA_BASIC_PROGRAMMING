package ARRAYS_CHAPTER_1;

import java.util.Arrays;

public class Even_Odd_places {
	public static void main(String[] args) {
	   int a[]=new int[] {10,5,2,9,77,6,4};
	   
	  int a1[]=new int[a.length/2];
	   for(int i=0;i<a.length;i=i+2) {
		   
         //   a1[i]=a[i];
		   System.out.print(a[i]+"  ");
		 a1[i]=a[i];
	   }
	  // Arrays.sort(a1);
	   //for(int i=0;i<a1.length;i++) {
		   
	  // }
	   
	   
	}

}
