
public class Task2Switch {

	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		int b;

		System.out.println("x = " + x);
		System.out.println("y = " + y);

		b = x;
		x = y;
		y = b;

		System.out.println("x = " + x);
		System.out.println("y = " + y);

		System.out.println("b = " + b);
	}

}
