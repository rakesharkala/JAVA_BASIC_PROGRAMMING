package PATTERNS;

public class INBEETWEEN_SYMBOL {
	public static void main(String[] args) {
		int r=3,c=3;
		for(int x=1;x<=r;x++)
		{
			for(int y=1;y<=c;y++)
			{
				if(x==1&&y==1||x==2&&y==2||x==3&&y==3)
				{
					System.out.print("$  ");
				}else {
		
				System.out.print("*  ");
				}
			}
			System.out.println();
		}
	}

	

}
