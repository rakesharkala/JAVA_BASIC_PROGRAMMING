package BASIC;

public class practice_typecon {
public static void main(String[] args) {
//	int i=110;
//	char c;
//	c=(char)i;
//	System.out.println(c);
	
	
	byte b=42;
	char c=65;
	short s=1024;
	int i=50000;
	float f=5.6f;
	double d= .1234;
	
	double re=(f*b)+(i/c)-(d*s);
	System.out.println((f*b)+"+"+(i/c)+"-"+(d*s));
	System.out.println(re);
	System.out.println(c);
}
}