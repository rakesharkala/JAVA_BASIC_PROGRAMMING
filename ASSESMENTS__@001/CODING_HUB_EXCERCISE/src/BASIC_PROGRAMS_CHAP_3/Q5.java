package BASIC_PROGRAMS_CHAP_3;

public class Q5 {
//	f.	Any year is input through the keyboard.
//	Write a program to determine whether the year is a leap year or not.
	
	public static void main(String[] args) {
		int year=2012;
		if((year%4==0||year%400==0)&&year%100!=0) {
			System.out.println("leap");
		}else {
			System.out.println("not leap");
		}
	}

}
