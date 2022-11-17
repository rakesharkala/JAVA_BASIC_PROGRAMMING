package CONDITIONAL_stmts;

public class SWAP_MIDDLE_NO 
{
	
			
				public static void main(String[] args)
				{
			
				int n=4658,r=0,count=0,s=0,a=0,b = 0;
				
				for(;n>0;n/=10)
				{
					r=n%10;
					count++;
					if(count==1||count==4)
					{
						if(count==1) 
						{
							a=r;
						}
						if(count==4) 
						{
							b=r;
						}
					}
					else 
					{
						s=s*10+r;
					}
				}
			    int n1=s,s1=0;
				for(;n1>0;n1/=10)
				{
					r=n1%10;
					s1=s1*10+r;
				}
			
				System.out.println(b+""+s1+""+a);
				
			}

		}


	//4658
	//Swap
	//O/p=4568
