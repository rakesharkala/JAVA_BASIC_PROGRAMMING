import java.util.Scanner;

public class palindrome {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		int n=sc.nextInt();
		int temp,r,sum=0;
		temp=n;
		
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum*10+r;
		}
		
		if(temp==sum) {
			System.out.println("palindrome no");
		}
		else {
			System.out.println("not a palindrome no");
		}
		
	}

}
