import java.util.Scanner;

public class PowerOfNum {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		int pow=sc.nextInt();
		double sum=0;
		
		sum= Math.pow(num, pow);
		System.out.println(sum);
	}

}
