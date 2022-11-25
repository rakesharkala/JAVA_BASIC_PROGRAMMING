package CLS_OBJ_METHOD_MODEL_2;

public class prime_method
{
   public int pm(int s,int e) 
   {
	   int sum=0;
	   for(;s<e;s++) 
	   {
		   int count=0,r;
		 
		   for(int i=2;i<=s/2;i++)
		   {
			   if(s%i==0)
			   {
				   count++;
				   break;
			   }
		   }
		   if(count==0)
		   {
			   System.out.println(s+"  ");
			   sum=sum+s;
		   }
		   
	   }
	   
	return sum;
	   
   }
}
