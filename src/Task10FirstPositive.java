import java.util.Arrays;

public class Task10FirstPositive {

	public static void main(String[] args) {

		int array[] = new int[] { -1, 2, -4, 5, 3, -4, -7 };
		System.out.println(Arrays.toString(array));

		int i = 0;
		do {
			if(array[i] > 0) {
				System.out.println("Positive number is " + array[i] + " and it's number is " + (i + 1));
				break;
			}
			i++;
		}
		while (i < array.length);
	}

}
