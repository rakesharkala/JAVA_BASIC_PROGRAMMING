package CLS_OBJ_MOTHOD_MODEL_3;

import java.util.Scanner;

public class LCM_MAIN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		lcm_m s = new lcm_m();

		int min = s.check(x, y);
		System.out.println(min);

	}

}
