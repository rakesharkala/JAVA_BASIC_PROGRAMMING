package ARRAYS_CHAPTER_2;

public class Q7_SORT_EVEN_ODD {
	
//	g.	Write a program to print all the even indexed elements in ascending order and odd indexed elements in descending order  
public static void main(String[] args) {
	
	int a[]= {11,01,22,14,54,35,42,54,66};
	int a1[]=new int[a.length];
	
	for(int i=0;i<a.length;i+=2) {
		if(i%2==0) {
			for(int j=i+1;j<a.length;j+=2) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+"  ");
		}
		
	}
	//2nd part
	System.out.println();
	System.out.println("odd index no in desendeing order : ");
	for(int i=1;i<a.length;i+=2) {
		if(i%2!=0) {
			for(int j=i;j<a.length;j+=2) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}

			}
			System.out.print(a[i]+"  ");
		}
	}
}
}
