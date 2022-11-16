package PATTERNS;

public class NUM_REV {
	public static void main(String[] args) {
		int r=5,c=5;
		for(int i=5;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+"  ");
			}
			System.out.println();
		}
	}

}
//
//
//
//5  4  3  2  1  
//4  3  2  1  
//3  2  1  
//2  1  
//1  
