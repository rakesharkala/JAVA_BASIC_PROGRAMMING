package STRINGS;

	
	import java.util.*;
	import java.util.Scanner;


      public class Stringpalindrome {

	  public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);

	    String str = sc.next(); 
	    String reverseStr = "";
	    
	    int strLength = str.length();

	    for (int i = (strLength - 1); i >=0; --i) {
	      reverseStr = reverseStr + str.charAt(i);
	    }

	    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
	      System.out.println(str);
	    }
	    else {
	    	System.out.println();
	    }
	    

	}
	}
