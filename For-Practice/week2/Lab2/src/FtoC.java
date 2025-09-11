import java.util.*;

public class FtoC {
	static double convert(double celsius)
	{
		double Fahrenheit;
		Fahrenheit= celsius*1.8+32;
		return Fahrenheit;
	}
	
	public static void main(String[]args)
	{
		System.out.print("섭씨 온도:");
		Scanner c = new Scanner(System.in);
		double customerNum = c.nextDouble();
		double resultNum;
		resultNum = convert(customerNum);
		System.out.println("화씨 온도:"+ resultNum);
	}
}
