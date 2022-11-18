package BASIC_PROGRAMS_CHAP_1;

public class C_1 {
//	c.	Implement a Product Application(Use all 8 data types)
	public static void main(String[] args) {

	byte sno=1;
	String name="apples";
	char catogory='A';
	short quantity  =12;
	int price= 100;
    double dis=10,final_p;
	double tot=price*(int)quantity;
	float cash_back=100;
	dis=dis/100.0*tot;

	final_p=tot-dis-cash_back;
	long ch=(long) final_p;
	
	System.out.println(sno+"-"+name+":  "+catogory+"   ");
	System.out.println("price        :  "+price);
	System.out.println("discount     :  "+dis+" Cashback : "+cash_back);
	
	System.out.println("Total price  :   "+tot+"  rupees");
	System.out.println("After discount and cashback : "+ch+"  rupees");
	
	} 
	
}
