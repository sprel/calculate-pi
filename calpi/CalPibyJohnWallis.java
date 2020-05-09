package ku.opensrcsw.calpi;

import java.util.Scanner;

public class CalPibyJohnWallis {

	public static void main(String[] args) {
		
		double pi = 0;
		double pi_div_2 = 1;
		int times = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("항의 개수를 늘려감에 따라 PI에 수렴합니다.");
		System.out.print("존 윌리스 급수 항의 개수 입력(1~): ");
		times = in.nextInt();
		
		for (double n = 1; n <= times; n++) {
			pi_div_2 *= ((2*n) / (2*n - 1)) * ((2*n) / (2*n + 1));
		}
		pi = pi_div_2 * 2;
		
		System.out.println("입력한 항의 개수의 존 윌리스 급수로 구한 PI값: " + pi);
		
		in.close();
	}

}
