import java.util.*;

class BankAccount{
	private int balance;
	private String name;
	public BankAccount(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}
	public void deposit(int amount) {
		if(amount<1){
			System.out.println("양의 정수만 입금 가능합니다.");
		}else {
			balance = balance + amount;
			System.out.printf("%d원이 입금되었습니다. 현재 잔액: %d원\n",amount, balance);
		}
	}
	public void withdraw(int amount) {
		if(amount<1){
			System.out.println("양의 정수만 출금 가능합니다.");
		} else if(amount>balance){
			System.out.printf("잔액이 부족합니다. 현재 잔액: %d원\n", balance);
		}else {
			balance = balance - amount;
			System.out.printf("%d원이 출금되었습니다. 현재 잔액: %d원\n", amount, balance);
			
		}
	}
	public int getBalance() {
		System.out.printf("최종 잔액은 %d원\n", balance);
		return balance;
	}
}

public class BankAccountTest {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("계좌 소유자 이름을 입력하세요.");
		String name = scan.next();
		System.out.print("초기 잔액을 입력하세요.");
		int balance = scan.nextInt();
		//여기서 BankAccount 클래스를 갈기는 것과 그냥 balance를 int로 정의하는 것에 어떤 차이가 있지?
		System.out.print("입금할 금액을 입력하세요");
		int amount = scan.nextInt();
		BankAccount bc1 = new BankAccount(name, balance);
		// 아니 근데 객체 만들 때 왜 name이랑 balance를 만들어야하는 거임..
		bc1.deposit(amount);
		System.out.print("출금할 금액을 입력하세요");
		amount = scan.nextInt();
		bc1.withdraw(amount);
		bc1.getBalance();
	}

}
