import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task7CountDigits {

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		int a = Integer.parseInt(in.readLine());

		if (a == 0) {
			System.out.println("This is zero!");
		} else if (a > 0) {
			System.out.println("Number is positive! And it's a " + digitPositiveMessage(a));
		} else {
			System.out.println("Number is negative :( And it's a " + digitNegativeMessage(a));
		}

	}

	public static String digitPositiveMessage(int a) {
		String result;
		if (a / 100 >= 1) {
			result = "three digit number";
		} else if (a / 10 >= 1) {
			result = "two digit number";
		} else {
			result = "single digit number";
		}
		return result;
	}
	
	public static String digitNegativeMessage(int a) {
		String result;
		if (a / 100 <= -1) {
			result = "three digit number";
		} else if (a / 10 <= -1) {
			result = "two digit number";
		} else {
			result = "single digit number";
		}
		return result;
	}
}
