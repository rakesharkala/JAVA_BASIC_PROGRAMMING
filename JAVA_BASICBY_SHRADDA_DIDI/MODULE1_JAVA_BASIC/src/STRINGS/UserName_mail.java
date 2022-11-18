package STRINGS;

import java.util.Scanner;

public class UserName_mail {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String uname=sc.next();
		
		for(int i=0;i<=uname.length()-1;i++) {
			
			if(uname.charAt(i)=='@') {
				break;
			}
			System.out.print(uname.charAt(i));
		}
		
	}
}
