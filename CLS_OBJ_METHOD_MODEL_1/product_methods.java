package CLS_OBJ_METHOD_MODEL_1;

public class product_methods 
{
	String pname;
	int id, q;
	double price, total, dis;

	public void total() {
		total = price * q;

	}

	public void disc()
	{

		if (total > 1000 && total <= 5000) 
		{
			dis = 10;
			dis = dis/100  * total;
			total = total - dis;

		}
		if (total < 1000)
		{
			dis = 5;
			dis = dis / 100 * total;
			total = total - dis;

		}
		if (total > 5000) 
		{
			dis = 20;
			dis = dis / 100 * total;
			total = total - dis;

		}
	}

	public void display() 
	{
		System.out.println(pname+"   "+id+"   "+dis+"  "+total);
	}
}
