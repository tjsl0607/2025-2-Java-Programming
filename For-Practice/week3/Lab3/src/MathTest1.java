import java.lang.Math;
import java.util.Scanner;

public class MathTest1 {
	public static void main(String[]args) {
		double a, b, c;
		System.out.printf("이차 방정식의 계수를 입력하세요:");
		Scanner scan = new Scanner(System.in);
		a= scan.nextDouble();
		b= scan.nextDouble();
		c= scan.nextDouble();
		double x;
		double y = b*b -4*a*c;
		if (y > 0) { // 0보다 크면 실근은 두개~
			x = (-b - Math.sqrt(y))/2*a;
			System.out.printf("%.2f ",x);
			x = (-b + Math.sqrt(y))/2*a;
			System.out.printf(" %.2f",x);
		} else if (y == 0) {
			x = -b /2*a;
			System.out.printf(" %.2f",x);
		} else if (y < 0) {
			System.out.print("실근이 없음");
		}
		scan.close();//scan.close 에겐 () 필요 <- 당연한데 모르는 나 자신...
	}
}
