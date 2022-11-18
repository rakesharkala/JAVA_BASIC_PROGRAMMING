package LOOPS_4;

public class largest_ele_in_n0 {
public static void main(String[] args) {
	int n=45619587,r;
	int max=0;
	
	for(;n>0;n=n/10) {
		r=n%10;
		if(max<r) {
			max=r;
		}
	}
	System.out.println(max);
	
}
}
