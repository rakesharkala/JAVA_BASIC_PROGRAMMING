package STRINGS;

import java.util.Scanner;

public class Replace_LetterIn_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		
		String a=sc.next();
		
		String res="";
		
		for(int i=0;i<=a.length()-1;i++) {
			
			if(a.charAt(i)=='e') {
				res+='i';
				
			}
			if(a.charAt(i)=='i') {
				res+='e';
			}
			else {
				res+=a.charAt(i);
			}
		}
		System.out.println(res);
	}

}
