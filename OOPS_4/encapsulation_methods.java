package OOPS_4;

public class encapsulation_methods 
{
	private String name;
	private int id;
	private String info;

	

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName() 
	{
		return name;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getInfo()
	{
		return info;
	}

	public void setInfo(String info)
	{
		this.info = info;
	}

	@Override
	public String toString() 
	{
		return "encapsulation_methods [name=" + name + ", id=" + id + ", info=" + info + "]";
	}

}
