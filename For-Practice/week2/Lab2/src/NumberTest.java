import java. util.*;

public class NumberTest {
	
	static boolean compare(int a)
	{
		int firstNum;
		int secondNum;
		firstNum= a/10;
		secondNum = a%10;
		
		if (firstNum == secondNum) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)");
		int customerNum;
		customerNum = scan.nextInt();
		
		if (customerNum < 10 || customerNum > 99) {
			System.out.println("두자리의 정수가 아닙니다.");
		} else {
				boolean result;
				result = compare(customerNum);
				
				if (result == true) {
					System.out.println("Yes! 10의 자리와 1의 자리가 같습니다");
				} else {
					System.out.println("NO! 10의 자리와 1의 자리가 다릅니다");
				}
			}
		
	}

}
