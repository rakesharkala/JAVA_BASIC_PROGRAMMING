package BASIC_PROGRAMS_CHAP_3;

public class Q_12 {
//	m.	Write a program to find whether a number is Armstrong or not 
	
  public static void main(String[] args) {
	int n=153,temp;
	temp=n;
	
	int rem,rev=0;
	while(n>0) {
		rem=n%10;
		rev+=rem*rem*rem;
		n=n/10;
	
	}
	if(temp==rev) {
		System.out.println("armstrong");
	}else {
		System.out.println("not armstrong");
	}
}

}
