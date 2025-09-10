import java.util.*;

public class Hello {
	public static void main(String[] args)
	{	
		int a, b;
		Scanner s = new Scanner(System.in);
		
		System.out.println("두 수를 입력하시오");
		a = s.nextInt();
		b = s.nextInt();
		
		System.out.println(a+b);
	}
}
