package ARRAYS_CHAPTER_3;

public class Q7_FIND_FREQUANCY {
//	g.	Write a program to print the frequency of all the elements in the array

	
	public static void main(String[] args) {
     int a[]= {10,10,5,10,15,20,5};
  
     
     for(int i=0;i<a.length;i++) {
    	 int count=1;
    	 for(int j=i+1;j<a.length;j++) {
    		
    		 if(a[i]==a[j]) {
    			 count++;
    			 System.out.println(a[i]+" "+count);
    		 }
    		}
     }
     for(int i=0;i<a.length;i++) {
   	 for(int j=i+1;j<a.length;j++) {
    	 if(a[i]==a[j]) {
    		 a[i]=-1;
    	   }
    	 }
     }
     for(int i=0;i<a.length;i++) {
    	 if(a[i]!=-1) {                              // for dublicates 
    		 for(int j=i+1;j<a.length;j++) {
    			 if(a[i]>a[j]) {
    				 int temp=a[i];                  //for sorting 
    				 a[i]=a[j];
    				 a[j]=temp;
    			 }
    		 }
    		 System.out.print(+a[i]+"\t");//count);
    	 }
     }
	}
}
