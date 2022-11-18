package LOOPS_4;

public class digits_div_2_3 {
	public static void main(String[] args) {
		
		int n=256363,r,two=0,three=0,c=0;
		for(;n>0;n=n/10)
		{
			r=n%10;
			if(r%2==0&&r%3==0) {
				c++;
				
			}
			if(r%2==0) {
				two++;
			}
			if(r%3==0) {
				three++;
				
			}
			
		}
		System.out.print("digits divide by 2&3 : "+c+"\n");
		System.out.print("divide by 2 : "+two+" \n");
		System.out.print("divide by 3 : "+three+" \n");
		
	}

}
