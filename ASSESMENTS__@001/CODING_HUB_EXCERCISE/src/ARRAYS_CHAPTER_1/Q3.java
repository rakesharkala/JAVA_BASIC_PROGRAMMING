package ARRAYS_CHAPTER_1;
import java.util.Scanner;

public class Q3 {
//	3.	Using for- each loop Display the above array
//	“hello”, ”all”, ”good” , ”Morning” , ”453” ,  ”?<>|+_”
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);


		String s[] = new String[6];

		for (int i = 0; i < s.length; i++) {
			s[i] = sc.next();
		}
	for(String i:s) {
		System.out.print(",,"+i+",,"+"  ");

}
	System.out.println();
	System.out.println("the length of array is : "+s.length);
	}}
