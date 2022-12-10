package STRINGS_CHAPTER_1;
//15.	Using split() to convert a string into String array
public class QN15_SPLIT
{
  public static void main(String[] args) 
  {
	  String s="HELLO WORLD THIS IS RAKHI ";
	  String s1[]=s.split(" ");
	  
	  for (String str : s1)
	  {
		  System.out.print(str+ " ");
		
	}
	
}
}
