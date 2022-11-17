package CARRY_FORWARD_PRO;

public class FACT0_CF {
	public static void main(String[] args) {
		int n=45,sum=0,r;
		for(;n>0;n=n/10) {
			r=n%10;
			int fact=1;     //carry forward otherwise
			for(int i=1;i<=r;i++) {   // 1//2//3//4//5
				fact=fact*i;          //1//2//6//24//120
			}
			sum=sum+fact;
		}
		System.out.println(sum);
	}

}
