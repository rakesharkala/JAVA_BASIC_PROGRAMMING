package ARRAYS;
// 10 20 31 41 55 71 81 99
// count
//sum
//what r those 

public class SUM_OF_PRIMES 
{
   public static void main(String[] args)
   {
	   int a[]= {10,20,31,41,55,71,81,99};
	   int sum=0,c=0;
	   for(int i=0;i<a.length;i++)
	   {
		   int count=0;
		   
		   for(int j=2;j<=a[i]/2;j++)
		   {
			   
			   if(a[i]%j==0)
			   {
				   count++;
				   break;
			   }
		   }
		   if(count==0)
		   {
			   c++;
			   System.out.println(a[i]);
			   sum=sum+a[i];
		   }
		   
	   }
	   System.out.println();
	   System.out.println("SUM OF THOSE PRIMES   : "+sum);
	   System.out.println("COUNT OF THOSE PRIMES : "+c);
	
}
}
