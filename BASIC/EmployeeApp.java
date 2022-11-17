package BASIC;
public class EmployeeApp {

	public static void main(String[] args) {

		String Ename = "Rakesh Arkala";
		String dept = "Developer";
		int phno = 70322;

		int base_sal = 20000;

		double da = 10.0 / 100 * 20000;
		double ta = 15.0 / 100 * 20000;
		double Hra = 11.0 / 100 * 20000;
		double fa = 5.0 / 100 * 20000;
		double tot_sal = base_sal + da + ta + Hra + fa;

		double Gst = 18.0 / 100 * tot_sal;
		double Pt = 13.0 / 100 * tot_sal;

		double Gross_sal = tot_sal - (Gst + Pt);
		
		System.out.println();
		
		System.out.println("  >-- WELCOME TO THE EMPLOYEE APPLICATION -->");
		System.out.println();
		System.out.println("========================================================");
		System.out.println();
		System.out.println("    Employee name : " + Ename);
		System.out.println("    Employee dept : " + dept);
		System.out.println("    Employee phno : " + phno+"*****");
		System.out.println();
		System.out.println("    EMPLOYEE TOTAL SALARY : " + tot_sal);
		System.out.println();
		System.out.println("    EMPLOYEE GROSS SALARY (after cuttings) :" + Gross_sal);
		System.out.println();
		System.out.println("========================================================");

	}

}
