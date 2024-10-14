package ExceptionHandling;
import java.util.Scanner;
public class DivisionExceptionHandlingWithResource
{
	public static void main(String[] args)
	{
		//try with resource object
		try (Scanner sc = new Scanner(System.in)) 
		{
			//input of data through keyboard
			System.out.println("Enter First number:");
			int num1 = sc.nextInt();
			System.out.println("Enter Second number:");
			int num2 = sc.nextInt();
			System.out.println("Divide:" + num1 + "by" + num2);
			System.out.println("Quotient:" + (num1 / num2));
			System.out.println("Remainder :" + (num1 % num2));
		} 
		catch (ArithmeticException ae) {
			System.out.println("Unable to number a divide by 0:" + ae);
		}
		System.out.println("-------------Task Successfully Completed.--------------");
	}

}
