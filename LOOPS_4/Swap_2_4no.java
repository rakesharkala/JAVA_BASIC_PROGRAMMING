package LOOPS_4;

public class Swap_2_4no {
	public static void main(String[] args) {
		
		int n=2025,f1,f2,add,sum,p=2;
		f2=n%100;
		f1=n/100;
		add=f1+f2;
		sum=(int) Math.pow(add, p);
		
		System.out.println((n==sum)?"EXCELLEN NO ":"NOT AN EXCELLENT NO");
	
	
	}

}
