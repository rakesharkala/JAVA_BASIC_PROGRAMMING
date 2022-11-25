package CLS_OBJ_METHOD_MODEL_1_with_parameters;

import java.util.Random;
import java.util.Scanner;

public class random_methods
{
	Scanner sc=new Scanner(System.in);
	public void random(int x)
	{
		String s;
		do
		{
			Random r=new Random();
			System.out.println(r.nextInt(x));
		
			System.out.println("ENTER UR CHOICE");
			 s=sc.next();
			
			
		}while(s.equals("yes"));
	}

}
