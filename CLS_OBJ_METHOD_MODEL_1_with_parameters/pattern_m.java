package CLS_OBJ_METHOD_MODEL_1_with_parameters;

public class pattern_m 
{
	public void patt(int x)
	{
		//upper half
		for(int i=1;i<=x;i++) 
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1||j==i) {
				System.out.print(j+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			//for spaces
			int c=2*(x-i);
			for(int j=1;j<=c;j++)
			{
				System.out.print("  ");
			}
			
			for(int j=i;j>=1;j--) 
			{
				if(j==i||j==1) {
				System.out.print(j+" ");
				}else {
					System.out.print("  ");
				}
			}
		
			System.out.println();
		}
		
		lh(x);    // calling lower half
	
	}
	
	
	
	public void lh(int x)
	{
		//lower half
				for(int i=x;i>=1;i--) 
				{
					for(int j=1;j<=i;j++)
					{
						if(j==1||j==i) {
							
						System.out.print(j+" ");
						}else {
							System.out.print("  ");
						}
					}
					//for spaces
					int c=2*(x-i);
					for(int j=1;j<=c;j++)
					{
						System.out.print("  ");
					}
					
					for(int j=i;j>=1;j--) {
						if(j==1||j==i) {
					
						System.out.print(j+" ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
					
				}
	}

}
