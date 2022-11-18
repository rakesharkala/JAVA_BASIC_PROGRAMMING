package ASSESMENT_1;

public class EVIL_NO {

	public static void main(String[] args) {
	
		
	  int n=9,num,sum=0;
	  num=n*n;   //81
	  for(;num>0;num/=10)
	  {
		  int r=num%10;  //1//8
		  sum=sum+r;     //1+8=9

	  }
	  if(n==sum) {
		  System.out.println("EVIL NO ");
	  }
	  else {
		  System.out.println("NOT EVIL");
	  }
 

	}

}
