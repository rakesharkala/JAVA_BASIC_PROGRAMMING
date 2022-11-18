package LOOPS_4;

public class infinite_loop {
	public static void main(String[] args) {
		int n = 1055256, r, sum = 0;

		while (n > 0) {
			r = n % 10;
			n /= 10;
			sum += r;

		}
		System.out.println("1st half sum  :  "+sum);
	
		System.out.print("2nd half sum  :  ");
		int r1, tot = 0;
		while (sum > 0) {
			r1 = sum % 10;
			sum /= 10;
			tot += r1;
		}
		System.out.println(tot);

	}
}