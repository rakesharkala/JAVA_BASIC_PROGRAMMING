package STRINGS_CHAPTER_1;

public class Q4_EQUAL_OPERATOR {
	
	public static void main(String[] args) {
		
		String name ="sathya";
		String name2="sathya";
		
		String n=new String ("anil");
		String n2=new String("anil");
		
		System.out.println(name ==name2);          //comparision not work for new string
		System.out.println(n==n2);
		
		System.out.println(name.equals(n));   // equals method
		System.out.println(n.equals(n2));
	}

}
