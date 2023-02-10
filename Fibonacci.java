package exercise.forloop;


public class Fibonacci {

	public static void main(String[] args) {
		int nMax = 20;
		int n = 1;
		int f1 = 1;
		int f2 = 1;
		int sum = f1 + f2;
		double average;
		
		System.out.print("The First " + nMax + " Fibonacci numbers is: ");
		while(n <= nMax) {
			System.out.print(f1 + " ");
			sum = f1 + f2;
			f1 = f2;
			f2 = sum;
			++n;
		}
		average = sum / nMax;
		System.out.print("\n The average is: " + average);
	}

}
