import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task9Calculator {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int temp = 0;
		do {
			System.out.println("Enter operator, x and y:");
			char operator = in.readLine().charAt(0);

			if (operator == '0') {
				System.out.println("Program quit");
				System.exit(0);
			} else if (operator == '+' || operator == '-' || operator == '/' || operator == '*') {
				int x = Integer.parseInt(in.readLine());
				int y = Integer.parseInt(in.readLine());
				int z = 0;
				
				if (y == 0) {
					System.out.println("Error, y can't be zero!");
				} else if (operator == '+') {
					z = x + y;
					System.out.println("Result = " + z);
				} else if (operator == '-') {
					z = x - y;
					System.out.println("Result = " + z);
				} else if (operator == '*') {
					z = x * y;
					System.out.println("Result = " + z);
				} else if (operator == '/') {
					z = x / y;
					System.out.println("Result = " + z);
				}

			} else {
				System.out.println("Operator is wrong :(");
			}
		} while (temp == 0);

	}

}
