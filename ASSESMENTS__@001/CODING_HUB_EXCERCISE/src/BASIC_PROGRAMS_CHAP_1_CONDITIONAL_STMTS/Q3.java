package BASIC_PROGRAMS_CHAP_1_CONDITIONAL_STMTS;

public class Q3 {
	//3.	Given the length and breadth of a rectangle, 
	//write a program to find whether the area of the rectangle is greater than its perimeter. 
	//For example,
	//the area of the rectangle with length = 5 and breadth = 4 is greater than its 
	//perimeter.
	
	public static void main(String[] args) {
		int l=5;
		int b=4;
		int area=l*b;
		int perimeter=2*(l+b);
		
		String s=area>perimeter?"area greater":"perimeter is greter ";
		System.out.println(s);
		
		
		
		
	}
	
}
