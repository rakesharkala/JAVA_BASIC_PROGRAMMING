package BASIC_PROGRAMS_CHAP_1;

public class A_1 {
	
//	a.	Find Simple Interest for the following values SI = PTR/100 P=1000 T=2 R = 3 

	public static void main(String[] args) {
		
		//Simple Interest = (P × R × T)/100  
//				where P = Principal Amount, R = Rate per Annum, T = Time (years)  
	
		float p=13000,r=12,t=2,total;
		float si=(p*r*t)/100;
		System.out.println("SIMPLE INTREST :  "+si);
		total=p+si;
		System.out.println("TOTAL AMOUNT :  "+total);
		
	}
}
