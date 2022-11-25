package CLS_OBJ_METHOD_MODEL_2;

public class ARMSTRIONG {

	
	public static void main(String[] args) {
		arm_m a=new arm_m();
		
		int s=153;
		
		int j=a.p(s);
		if(j==s) {
			System.out.println("ARMSTRONG");
		}
		else {
			System.out.println("NOT AN ARMSTRONG");
		}
	}
}
