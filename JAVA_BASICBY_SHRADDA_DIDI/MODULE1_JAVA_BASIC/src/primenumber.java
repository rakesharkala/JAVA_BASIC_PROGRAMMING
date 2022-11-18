import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int count=0;
		
		for(int i=2;i<=n/2;i++)       // the no product it self and with 1 the no is called prime no
		{
			if(n%i==0) {
				count++;
			}

		}
		if(count==0) {
			System.out.println(" prime no");
		}
		else {
			System.out.println("not prime");
		}
	
	}
}


