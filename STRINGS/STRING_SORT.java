package STRINGS;

import java.util.Scanner;
//anagram
//margana
public class STRING_SORT
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String sx = sc.next();
		String s2x = sc.next();
		String s=sx.toLowerCase();
		String s2=s2x.toLowerCase();

		char sr1[] = s.toCharArray();
		char sr2[] = s2.toCharArray();
		String st = "";
		String st1 = "";

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (sr1[i] > sr1[j]) {
					char c = sr1[i];
					sr1[i] = sr1[j];
					sr1[j] = c;
					
				}
				
				
				if (sr2[i] > sr2[j]) {
					char d = sr2[i];
					sr2[i] = sr2[j];
					sr2[j] = d;
					
				}
				
			}
			st1 = st1 + sr1[i];
			st = st + sr2[i];
		}
		System.out.println(st1+"\n"+st);
		if (st1.equalsIgnoreCase(st)) {
			System.out.println("ANAGRAM");
		} else {
			System.out.println("NOT ANAGARM");
		}

	}

}
