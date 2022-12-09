package ARRAYS;

public class MODEL3_RETURNING_TOTAL_ARRAY
{
public static void main(String[] args) 
{
	int a[]=add();
	
	MODEL3_RETURNING_TOTAL_ARRAY obj=new MODEL3_RETURNING_TOTAL_ARRAY();
	int sum=obj.sub(a);
	
	System.out.println(sum);
//	for (int i : a) {
//		sum+=i;
//	}
//	System.out.println(sum);
	
	
}
public static int [] add()    // static method so no need of obj creation
{
	int x[]= {10 ,2 ,55,54};
	return x;
	
}

public  int  sub(int a[])     // not static but same cls then also wee need create obj /instance
{
	int sum=0;
	for (int i : a)
	{
		sum+=i;
	}
	return sum;
}

}
