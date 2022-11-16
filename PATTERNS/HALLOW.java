package PATTERNS;

public class HALLOW {
	public static void main(String[] args) {
		int r=9,c=9;
		for(int x=1;x<=r;x++)
		{
			for(int y=1;y<=c;y++)
			{
				if(x==1||x==9||y==1||y==9)
				{
					System.out.print("* ");
				}else {
		
				System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
