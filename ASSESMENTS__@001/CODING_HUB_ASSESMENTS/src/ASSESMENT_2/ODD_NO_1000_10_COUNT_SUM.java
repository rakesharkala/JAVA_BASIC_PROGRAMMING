package ASSESMENT_2;

public class ODD_NO_1000_10_COUNT_SUM {
	public static void main(String[] args) {
		int start =1000,end=10,count=0,sum=0;
		int n=start-1;
		for(;n>end;n=n-2)
		{
			System.out.println(n);
			count++;
			sum=sum+n;
		}
	
		System.out.println("\n\nCOUNT OF THOSE NUMBERS       :  "+count);
		System.out.println("SUM OF ALL THOSE ODD NUMBERS :  "+sum);
	}

}
