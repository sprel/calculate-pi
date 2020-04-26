package ku.opensrcsw.calpi;

import java.util.Scanner;
import java.lang.Math;

public class CalPiLeibniz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = 0;
		int times = 0;
		double temp_pi = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("항의 개수를 늘려감에 따라 PI에 수렴합니다.");
		System.out.println("라이프니츠 무한급수 항의 개수 입력(1~):");
		times = in.nextInt();

		for (int i = 0; i < times; i++) {
			temp_pi += ( Math.pow(-1, i) / ((2 * i) + 1) );
		}
		pi = 4 * temp_pi;
		System.out.println("times만큼의 항의 개수로 구한 PI값: " + pi);
		
		in.close();
	}

}