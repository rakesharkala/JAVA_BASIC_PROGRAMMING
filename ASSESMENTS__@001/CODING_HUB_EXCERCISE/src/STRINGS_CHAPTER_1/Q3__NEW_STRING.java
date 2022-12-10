package STRINGS_CHAPTER_1;

public class Q3__NEW_STRING {
	
	public static void main(String[] args) {
		
		String s=new String("this");
		String r=new String(" is rakesh");
		
		String s1="this";
		String r2="  is anil";
		
		System.out.println(s+r+"\n"+s1+r2  +"\n");
		
		System.out.println(s.concat(r)+  "\n"   +s1.concat(r2));
		
		
	}

}
