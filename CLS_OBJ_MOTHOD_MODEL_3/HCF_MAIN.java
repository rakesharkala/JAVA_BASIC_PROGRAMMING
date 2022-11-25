package CLS_OBJ_MOTHOD_MODEL_3;

import java.util.Scanner;

public class HCF_MAIN 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int x= sc.nextInt();
		int y=sc.nextInt();
		
		hcf_m m=new hcf_m();
		int result=m.check(x,y);
		
		System.out.println(result);
		
		
	}

}
