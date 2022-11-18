package LOOPS_4;

public class Swap_1st_place_nd_4th {
	public static void main(String[] args) {
		
		int n=1254,r,count=0,s=0,temp,a=0,b = 0;
		for(;n>0;n/=10) {
			r=n%10;
			count++;
			if(count==1||count==4) {
				if(count==1) {
					a=r;
				}
				if(count==4) {
					b=r;
				}
			}
			else {
				s=s*10+r;
			}
		}
		int e=s,s2=0;
		for(;e>0;e/=10) {
			r=e%10;
			s2=s2*10+r;
		}
		System.out.println(a+""+s2+""+b);
		
	}

}
