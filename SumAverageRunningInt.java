package exercise.forloop;

public class SumAverageRunningInt {

	public static void main(String[] args) {
		int sum = 0;
		int[] iArr = new int[100];
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}

		float avg = sum / iArr.length;
		System.out.println("Average of 100 first number: " + avg);
	}

}
