import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	public static void main(String[]args) {
		Random random = new Random();
		int a = random.nextInt(100)+1;
		int b;
		Scanner scan = new Scanner(System.in);
		int count = 0;
		while(true) {
			count++;
			System.out.print("정답을 추측하여 보시오:");
			b = scan.nextInt();
			if (b<a) {
				System.out.print("더 높아요\n");
			} else if (b==a) {
				System.out.printf("축하합니다. 시도횟수: %d", count);
				break;
			} else if (b>a) {
				System.out.print("더 낮아요\n");
				count++;
			}
		}
		scan.close();
	}
}
