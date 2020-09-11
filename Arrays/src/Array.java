import java.util.Random;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] array = new int[10];
		InitializeArray(array);
		int num = 0;
		int reply;

		do {
			System.out.println("\nWelcome to array1 program. Choose one of the following options:");
			System.out.println("1\t Output amount of numbers greater than 50");
			System.out.println("2\t Display the numbers in the order they were intialized in");
			System.out.println("3\t Display the numbers in reverse order that they were initialized within");
			System.out.println("4\t Output the total sum of all the numbers in this set");
			System.out.println("5\t Output the average of these numbers within this set");
			System.out.println("6\t The biggest number in this data set");
			System.out.println("7\t The smallest number in this data set");
			System.out.println("8\t Search the array for the various positions of each number in the data set");
			System.out.println("9\t EXIT PROGRAM");
			System.out.println("Your reponse : ");
			num = input.nextInt();

			reply = num;
			while (reply < 1 || reply > 9) {
				System.out.println("Error. The number you entered is not within the given range.");
				System.out.println("Your reponse : ");
				reply = input.nextInt();
			}
			num = reply;

			if (num == 1) {
				System.out.println("The amount of numbers that are greater than 50 in this set is : ");
				CountHigh(array);
			} else if (num == 2) {
				System.out.println("\nThe Ten Numbers In Order Are : ");
				Display(array);
				System.out.println(" ");
			} else if (num == 3) {
				System.out.println("\n\nThe Ten Numbers In Reverse Order Are : ");
				DisplayReverse(array);
				System.out.println(" ");
			} else if (num == 4) {
				System.out.println(Sum(array));
			} else if (num == 5) {
				System.out.println("\n\nThe Average Of The Ten Random Numbers Is : ");
				Average(Sum(array));
			} else if (num == 6) {
				System.out.println(FindMax(array));
			} else if (num == 7) {
				System.out.println(FindMin(array));
			} else if (num == 8) {
				Search(array);
			}

		} while (num >= 1 && num < 9);

	}

	public static void InitializeArray(int[] a) {
		Random rand = new Random();
		for (int i = 0; i <= 9; i++) {
			a[i] = rand.nextInt(100) + 1;
		}
	}

	public static void CountHigh(int a[]) {
		int counter = 0;
		for (int i = 0; i <= 9; i++) {
			if (a[i] > 50) {
				counter++;
			}
		}
		System.out.println(counter);
	}

	public static void Display(int a[]) {
		for (int i = 0; i <= 9; i++) {
			System.out.print(a[i]);
			System.out.print(", ");
		}
	}

	public static void DisplayReverse(int a[]) {
		for (int i = 9; i >= 0; i--) {
			System.out.print(a[i]);
			System.out.print(", ");
		}
	}

	public static int Sum(int a[]) {
		int sum = 0;
		for (int i = 0; i <= 9; i++) {
			sum = sum + a[i];
		}
		return sum;
	}

	public static void Average(double a) {
		double average = a / 10;
		System.out.println(average);
	}

	public static int FindMax(int a[]) {
		int max = 0;
		for (int i = 0; i <= 9; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public static int FindMin(int a[]) {
		int min = 1000;
		for (int i = 0; i <= 9; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

	public static void Search(int a[]) {
		System.out.println(" ");
		int b = -1;
		for (int i = 0; i <= 9; i++) {
			if (b == i) {
				if (b == 9) {
					break;
				} else {
					i++;
				}
			}
			System.out.print("The number " + a[i] + " occurs in the postion: " + (i + 1) + " ");

			for (int j = i + 1; j <= 9; j++) {
				if (a[i] == a[j]) {
					System.out.println(j + 1);
					b = j;
				}
			}
			System.out.println(" ");
		}
	}

}
