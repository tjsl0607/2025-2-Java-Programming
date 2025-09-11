import java.util.Scanner;

class Card {
	private String name;
	private String department;
	private int sid;
	private String email;
	
	public Card(String name, String department, int sid, String email) {
		this.name = name;
		this.department = department;
		this.sid = sid;
		this.email = email;
	}
	public void print() {
		System.out.printf("안녕하세요. 제 이름은 %s이고 숙명여자대학교 %s에 재학중이며 학번은 %d이고 이메일은 %s입니다.", name, department, sid, email);
	}
	
}
public class CardTest {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		 String name;
		 String department;
		 int sid;
		 String email;
		 
		 System.out.print("이름:");
		name = scan.next();
		 System.out.print("학과:");
		department = scan.next();
		 System.out.print("학번:");
		sid = scan.nextInt();
		System.out.print("이메일:");
		email = scan.next();
		
		Card card = new Card(name, department, sid, email);
		card.print();
		
		scan.close();
	}
}
