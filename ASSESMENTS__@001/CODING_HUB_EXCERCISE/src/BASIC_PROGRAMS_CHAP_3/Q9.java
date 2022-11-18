package BASIC_PROGRAMS_CHAP_3;

public class Q9 {
//	j.	Write a program to print the Fibonacci series 
	public static void main(String[] args) {

	int a=1,b=2,c;
	int i=1;
	
 System.out.println(a);
 System.out.println(b);
while(i<10) {
	c=a+b;
	System.out.println(c);
	a=b;
	b=c;
	i++;
}
	    
	

}
}