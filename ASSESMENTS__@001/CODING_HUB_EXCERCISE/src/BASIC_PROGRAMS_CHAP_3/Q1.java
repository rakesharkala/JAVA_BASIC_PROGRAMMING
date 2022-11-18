package BASIC_PROGRAMS_CHAP_3;

public class Q1 {
//	a.	Write a program to find the range of a set of numbers.
//	Range is the difference between the smallest and biggest number in the list.
   public static void main(String[] args) {
	
	   int a[]= {10,11,2,55,77,57};
	   int min=a[0];
	   int max=0;
	   
	  for (int i=0;i<a.length;i++) {
		  if(min>a[i]) {
			  min=a[i];
		  }
		  if(max<a[i]) {
			  max=a[i];
		  }
	  }
	  int range =max-min;
	  System.out.println("minimum of no :  "+min);
	  System.out.println("maximum of no :  "+max);
	  System.out.println("range is      :  "+range);
	   
}

}
