package exercise.forloop;

import java.util.Scanner;

public class AverageArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter len of array: ");
		int length = sc.nextInt();
		
		int[] iArr = new int[length];
		int sum = 0;
		float average;
		System.out.print("Array created is: ");
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = (int) (Math.random() * 90);
			System.out.print(iArr[i] + " ");
		}
		
		for(int i = 0; i < iArr.length; i++) {
			sum+=iArr[i];
		}
		
		average = sum/length;
		System.out.println();
		System.out.print("Average of all element of array: " + average);
		sc.close();
		
	}

}
