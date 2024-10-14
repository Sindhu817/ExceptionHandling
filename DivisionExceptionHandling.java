package ExceptionHandling;
import java.util.Scanner;
public class DivisionExceptionHandling {

	public static void main(String[] args) {
		int num1,num2;
		//object of Scanner class
		Scanner sc=new Scanner(System.in);
		//input of data through keyboard
		System.out.println("Enter first number : ");
		num1=sc.nextInt();
		System.out.println("Enter Second Number : ");
		num2=sc.nextInt();
		try
		{
			System.out.println("On Dividing"+num1+"by"+num2+":");
			System.out.println("quotient :"+(num1/num2));
			System.out.println("Remainder : "+(num1%num2));
			
		}
		catch(ArithmeticException obj)
		{
			System.out.println("Unable to divide a number by 0:"+obj);
			
		}
		System.out.println("---------------task completed----------------");

	}

}
