import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class C2 {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
        String e=scan.nextLine();
        
        int result=8+i+(int)d;
        double r2=i+d;
        String f=s.concat(e);
        
        // s=s.concat(scan.toString());
        System.out.println(result);
        System.out.println(r2);
        System.out.println(f);


        scan.close();
    }
}