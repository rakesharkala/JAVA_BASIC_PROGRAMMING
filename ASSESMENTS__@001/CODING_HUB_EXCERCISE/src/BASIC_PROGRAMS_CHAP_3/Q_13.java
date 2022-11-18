package BASIC_PROGRAMS_CHAP_3;

public class Q_13 {

//	n.	Write a program to find whether a number is palindrome or not.
public static void main(String[] args) {
	int n=121;
	int rev=0,rem,temp;
	temp=n;
	
	while(n>0) {
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	System.out.println(rev);
	if(temp==rev) {
		System.out.println("palindrome !!");
	}
	else {
		System.out.println("not palindrome !!");
	}
	
}


}



