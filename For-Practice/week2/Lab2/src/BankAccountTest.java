import java.util.*;

class BankAccount{
	private String name;
	private int balance;
	public BankAccount(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}
	public void deposit(int amount) {
		if(amount<1){
			System.out.println("양의 정수만 입금 가능합니다.");
		}else {
			balance = balance + amount;
			System.out.println("%d원이 입금되었습니다. 현재 잔액: %d원",amount, balance);
		}
	}
	public void withdraw(int amount) {
		if(amount<1){
			System.out.println("양의 정수만 출금 가능합니다.");
		} else if(amount>balance){
			System.out.print("잔액이 부족합니다. 현재 잔액: %d, balance");
		}else {
			balance = balance - amount;
			
		}
	}
	public int getBalance()){
		
	}
}

public class BankAccountTest {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		String name;
		int depositAmount;
		int withdrawAmount;
		
		name = scan.next();
		
	}

}
