import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task4FourDigitNumber {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter four digit number:");
		int number = Integer.parseInt(in.readLine());

		int firstNumber = number / 1000;
		int secontNumber = (number / 100) % 10;
		int thirdNumber = (number / 10) % 10;
		int fourthNumber = number % 10;

		int result = firstNumber * secontNumber + thirdNumber * fourthNumber;

		System.out.println(firstNumber);
		System.out.println(secontNumber);
		System.out.println(thirdNumber);
		System.out.println(fourthNumber);
		System.out.println(result);

	}

}
