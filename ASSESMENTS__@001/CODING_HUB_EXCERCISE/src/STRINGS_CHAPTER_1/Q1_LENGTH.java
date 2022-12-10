package STRINGS_CHAPTER_1;
//*	1.	Write a Java program to find the length of a String .
//2.	Write a Java Program to print a string in reverse order
//3.	Write a Java program to create two strings using new and without new keyword
//4.	Write a java program to compare two strings(use both .equals and ==)(you should get the same output to when u use .equals and ==)
//5.	Write a Java Program to print the characters in a String using charAt().
public class Q1_LENGTH {
	
	public static void main(String[] args) {
		
		String a="anil yadav";
		
		System.out.println(a.length());  //using length method
		
		int i=0;                          // using normal way
		for(char c:a.toCharArray()) {
			i++;
		}
		System.out.println(i);
	}

}
