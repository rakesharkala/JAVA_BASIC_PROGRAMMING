package ARRAYS_CHAPTER_1;
//9.	Sort the odd indexed arrays in ascending order and even indexed arrays in descending order 
class Q9{
	public static void main(String[] args) {
		int a[]= {11,15,3,4,9,74};
		
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				for(int j=i+2;j<a.length;j=j+2) {
					if(a[i]>a[j]) {
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
				System.out.print(a[i]+"  ");

			}
		
		}
		// 2nd part 
		System.out.println();
		for(int i=1;i<a.length;i++) {
			if(i%2!=0) {
				for(int j=i;j<a.length;j=j+2) {
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
