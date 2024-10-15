/*-------A program to take input of number from user and dividing the existing array by it--------*/
package ExceptionHandling;
import java.util.Scanner;
public class MultipleCatchException {
	public static void main(String[] args) {
		/*--------declaration of array---------*/
		int[] numbers= {1,23,0,65,67};
		/*------Creating object for Scanner Class----------*/
		Scanner sc = new Scanner(System.in);
		/*----------taking input by user through the keyboard ---------*/
		System.out.println("Enter a number:");
		int num1=sc.nextInt();
		System.out.println("Divison of number");
		/*------creating try block for throw an exception-------*/
		try
		{
		for(int index=0;index<=numbers.length;index++)
		{
			System.out.println("On Dividing"+(numbers[index]+"by"+num1));
			System.out.println("Quotient"+(numbers[index]/num1));
			System.out.println("Remainder:"+(numbers[index]%num1));
		}
		}
		/*--------Creating catch block for handle and throw an Exception--------*/
		catch (ArrayIndexOutOfBoundsException | ArithmeticException exception)
		{
			System.err.println("Exception Ouccred."+exception.getMessage());	
		}
		System.out.println("==============================================");
	}
}


