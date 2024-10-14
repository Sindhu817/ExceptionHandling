package ExceptionHandling;

public class MultipleCatchException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {1,23,45,65,67};
		int num1=34;
		System.out.println("Divison of number");
		for(int index=0;index<=numbers.length;index++)
		{
			System.out.println("On Dividing"+(numbers[index]+"by"+num1));
			System.out.println("Quotient"+(numbers[index]/num1));
			System.out.println("Remainder:"+(numbers[index]%num1));
		}
		catch(ArrayIndexOutOfBoundsException|Arithmatic)
	}

}
