
package BASIC;
public class Student_info {

	public static void main(String[] args) {
		
		String name="KARTHI";
		int rollno=50;
		String status="PROMOTED TO B";
		
		int  m1=1,m2=1,m3=1,m4=20,m5=1;
		int total_marks=m1+m2+m3+m4+m5;
		
		int per=(int) (total_marks/100.0*100);
	
		if(per>=65) {
			status="PROMOTED TO NEXTCLASS [A SECTION]";
		}
		System.out.println("NAME OF THE STUDENT      : "+name);
		System.out.println("ROLLNO OF THE STUDENT    : "+rollno);
		System.out.println("STUDENT AWARDED MARKS    : "+total_marks);
		System.out.println("PERCENTAGE IN THIS CLASS : "+per+"%");
		System.out.println();
		System.out.println("STATUS OF THE STUDENT    : "+status);
	
		}


}
