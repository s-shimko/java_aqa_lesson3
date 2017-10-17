import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task5Odd {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter odd and even numbers");
		int a = Integer.parseInt(in.readLine());
		int b = Integer.parseInt(in.readLine());

		if (a % 2 == 0) {
			System.out.println(b);
		} else {
			System.out.println(a);
		}

	}

}
