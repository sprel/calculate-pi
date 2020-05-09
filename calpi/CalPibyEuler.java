package ku.opensrcsw.calpi;

import java.util.Scanner;

public class CalPibyEuler {

	public static void main(String[] args) {
		
		double pi = 0;
		double pi_square_div_6 = 0;
		int times = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("항의 개수를 늘려감에 따라 PI에 수렴합니다.");
		System.out.print("오일러 급수 항의 개수 입력(1~): ");
		times = in.nextInt();
		
		for (int i = 1; i <= times; i++) {
			pi_square_div_6 += 1/(Math.pow(i, 2));
		}
		pi = Math.sqrt(pi_square_div_6 * 6);
		
		System.out.println("입력한 항의 개수의 오일러 급수로 구한 PI값: " + pi);
		
		in.close();
	}

}