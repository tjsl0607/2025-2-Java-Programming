import java.util.Scanner;

public class MathTest2 {
	public static void main(String[]args) {
		final double JA = 30.0/99; // c언어와의 차이 주의: const는 자바에 없더라. 허거덩~
		final int SIX = 6;
		Scanner scan = new Scanner(System.in);
		System.out.print("평을 입력하세요:");
		int p = scan.nextInt();
		double sqMeter = p*(SIX*JA)*(SIX*JA);
		System.out.printf("%d평 = %.2f 제곱미터", p, sqMeter);
		scan.close();
	}
}
