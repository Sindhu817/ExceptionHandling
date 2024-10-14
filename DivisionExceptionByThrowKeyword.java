package ExceptionHandling;

import java.util.Scanner;

public class DivisionExceptionByThrowKeyword {
	public static void main(String[] args) {
		// Variables declaration
		int num1, num2;
		// try block with resource object
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter first Number:");
			num1 = sc.nextInt();
			System.out.println("Enter Second Number:");
			num2 = sc.nextInt();
			if (num2 == 0) {
				throw new ArithmeticException("Unable to divide by Zero");
			} else {
				System.out.println("Quotient:" + (num1 / num2));
				System.out.println("Remainder:" + (num1 % num2));
			}
		} catch (ArithmeticException ae) {
			System.out.println(ae);
		}
		System.out.println("---------Thank You.------------");

	}

}
