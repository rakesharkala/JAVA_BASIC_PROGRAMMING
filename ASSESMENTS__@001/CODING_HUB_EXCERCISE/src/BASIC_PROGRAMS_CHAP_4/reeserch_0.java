package BASIC_PROGRAMS_CHAP_4;


public class reeserch_0 {
	public static void main(String[] args) {

	int n=605401,sum=0,sum2=0,r,r1,count=0;  //40567
	
	for(;n>0;n=n/10) 
	{
		r=n%10;         
		sum=sum*10+r;  //=SUM+(R+1000) SUM
	}
	int num1=sum;

	//	System.out.println(sum);
	for(int i=0;i<5;i++)
	{
		count++;
		r1=num1%10;
		num1/=10;
		//sum2=sum2*10+r1;
		if(count==5)
		{
			System.out.println("ZERO");
		}
		else 
		{
			switch(r1)
			{
			case 1: System.out.print(" ONE "); break;
			case 2: System.out.print(" TWO "); break;
			case 3: System.out.print(" THREE "); break;
			case 4: System.out.print(" FOUR "); break;
			case 5: System.out.print(" FIVE "); break;
			case 6: System.out.print(" SIX "); break;
			case 7: System.out.print(" SEVEN "); break;
			case 8: System.out.print(" EIGHT "); break;
			case 9: System.out.print(" NINE "); break;
			default: System.out.print(" ZERO "); 
			}
		}
	}
	}	
	}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		r=n%10;	
//		if(r==0) {
//			sum=sum+(r+10);
//			v1=sum;
//			
//		}
//		else {
//			sum=sum*10+r;
//		}
//	}
//
//	 f_v=sum*v1;
//	System.out.println(f_v);
//
//}
//}