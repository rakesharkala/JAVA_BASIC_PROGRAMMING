package LOOPS_4;

public class fibonacci {
	public static void main(String[] args) {
		
		int a=0,b=1,temp,c;
		
		for(int i=0;i<10;i++) {
			System.out.print(a+"  ");
			c=a+b;
			a=b;
			b=c; 	
		}
		
	}

}
