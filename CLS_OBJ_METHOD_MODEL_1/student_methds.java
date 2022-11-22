package CLS_OBJ_METHOD_MODEL_1;

public class student_methds
{
	String name;
	int rollno;
	char sec;
	
	int m1,m2,m3,m4,m5,total;
	double per,scholor,tt,fees;

	public void total_marks()
	{
		tt=m1+m2+m3+m4+m5;
		per=tt/total*100;
	}
	public void sch_sec()
	{
		if(per>=80) {
			sec='A';
			scholor=25/100.0*fees;
			fees=fees-scholor;
		}

		else if(per>=60&&per<80) {
			sec='B';
			scholor=10.0/100*fees;
			fees=fees-scholor;
		}
		else if(per>50&&per<60) {
			sec='C';
			scholor=5.0/100*fees;
			fees=fees-scholor;
		}
		else {
			sec='F';
		}
	
	}
	
	public void display()
		{
		System.out.println(name+"\n"+rollno+"\n"+sec+"\n"+per+"\n"+fees);
		}
}
