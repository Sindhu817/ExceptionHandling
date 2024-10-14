package Classwork;
import java.util.Scanner;
class radiusException extends Exception
{
	public radiusException(String msg)
	{
		super(msg);
	}
}
class radiusCalculation
{
	float radius;
	float PI=3.14f;
	public void radiuCalculation()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of the Circle:");
		radius=sc.nextFloat();
	}
	private void displayInfo() {
		System.out.println("radius"+radius );
		
	}//---------------------------------------------------------------------//
	public void calculateArea()
	{
		try
		{
			if(radius<0)
			{
				throw new radiusException("it doesn't take negative values");
			}
			else
			{
				float area = PI * radius * radius;
		        System.out.println("---------Area----------");
		        System.out.println("Radius:"+radius);
		        System.out.printf("Area of the circle: "+area); 
			}
		}
		catch(radiusException re)
		{
			System.err.println(re.getMessage());
		}
	}
	public void calculatePerimeter()
	{
		try
		{
			if(radius<0)
			{
				throw new radiusException("it doesn't take negative values");
			}
			else
			{
		        float perimeter = 2 * PI * radius;
		        System.out.println("------Perimeter-----");
		        System.out.printf("Perimeter of the circle:" +perimeter);
			}
		}
		catch(radiusException re)
			{
				System.err.println(re.getMessage());
			}	
	}
}
public class CalculateCircle {

	public static void main(String[] args) {
		radiusCalculation rc=new radiusCalculation();
		rc.calculateArea();
		rc. calculatePerimeter();
	}
}
