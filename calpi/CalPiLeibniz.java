package ku.opensrcsw.calpi;

import java.util.Scanner;
import java.lang.Math;

public class CalPiLeibniz {

	public static void main(String[] args) {

		double pi = 0;
		double pi_div_4 = 0;
		int times = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("항의 개수를 늘려감에 따라 PI에 수렴합니다.");
		System.out.print("라이프니츠 무한급수 항의 개수 입력(1~):");
		times = in.nextInt();

		for (int i = 0; i < times; i++) {
			pi_div_4 += ( Math.pow(-1, i) / ((2 * i) + 1) );
		}
		pi = 4 * pi_div_4;
		
		System.out.println("입력한 항의 개수의 라이프니츠 급수로 구한 PI값: " + pi);
		
		in.close();
	}

}