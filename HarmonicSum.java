package exercise.forloop;

public class HarmonicSum {

	public static void main(String[] args) {
		int n = 50000;
		double L2R = printLeftToRightSum(n);
		double R2L = printRightToLeftSum(n);
		System.out.print("Diffrence: " + (L2R - R2L));
		
	}

	public static double printLeftToRightSum(int n) {
		double sum = 0.0;
		for (int i = 1; i <= n; i++) {
			sum += (double) 1 / i;
		}
		System.out.printf("Left to Right Harmonic: " + sum);
		System.out.println();
		return sum;
	}

	public static double printRightToLeftSum(int n) {
		double sum = 0.0;
		for (int i = n; i >= 1; i--) {
			sum += 1.0 / i;
		}
		System.out.print("Right to Left Harmonic: " + sum);
		System.out.println();
		return sum;
	}

}
