
public class Task12OddsEvens {

	public static void main(String[] args) {

		int[] array = new int[] { 3, 2, 3, 4, 6, 7, 9, 4, 8, 3, 1 };

		int k = 0;
		int sum = 0;
		for (int i = 1; i < array.length; i = i + 2) {
			if (array[i] % 2 == 0) {
				k++;
				sum = sum + array[i];
			}
		}

		float result = sum / k;
		System.out.println("Result = " + result);

	}

}
