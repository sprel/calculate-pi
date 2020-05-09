package ku.opensrcsw.calpi;

import java.util.Scanner;

public class CalPibyRamanujan {
	
	public static int fact(int n) {
		if (n <= 1) {
			return 1;
		}
		else { 
			return n * fact(n-1);
		}
	}
	
	public static void main(String[] args) {
		
		double pi = 0;
		double inverse_pi = 0;
		int times = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("항의 개수를 늘려감에 따라 PI에 수렴합니다.");
		System.out.print("스리니바사 라마누잔 급수 항의 개수 입력(1~): ");
		times = in.nextInt();
		
		for (int n = 0; n < times; n++) {
			inverse_pi += (fact(4*n) / Math.pow(fact(n), 4)) * ((26390 * n + 1103) / Math.pow(396, 4*n));
		}
		pi = 1 / (2 * Math.sqrt(2) / Math.pow(99, 2) * inverse_pi);
		
		System.out.println("입력한 항의 개수의 스리니바사 라마누잔 급수로 구한 PI값: " + pi);
		
		in.close();
	}

}
