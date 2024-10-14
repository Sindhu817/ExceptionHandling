package Classwork;

import java.util.Scanner;
//-----Custom exception class for principal------/

class PrincipalException extends Exception {
	/*----constructor----*/
	public PrincipalException(String message) {
				super(message);
				// TODO Auto-generated constructor stub
			}

	}/*--------------------------------------------------------------*/


	//Custom exception class for rate

	class RateException extends Exception {
		//-----Constructor-----/
		public RateException(String msg)
			{
				super(msg);
			}
	}//--------------------------------------------------------------/

	//Custom exception class for Time----/

	class TimeException extends Exception {
		//----constructor----/
		public TimeException(String msg)
			{
				super(msg);
			}
	}//--------------------------------------------------------------//

	//Defining Interest class----/

	class Interest {
		//----Member variables----/
		float principal;
		float rate;
		int time;//-----Constructor-----/

		public Interest()
			{
				//----- Scanner class object ----/
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter principal in time : ");
				principal = sc.nextFloat();
				System.out.print("Enter rate(in %) : ");
				rate = sc.nextFloat();
				System.out.println("Enter time(in year) : ");
				time = sc.nextInt();
				System.out.println("-----------------------------------------------------");
			}
			//------ Method to display data -----/

		private void displayInfo() {
			System.out.println("Principal : Rs " + principal);
			System.out.println("Rate : " + rate + " %");
			System.out.println("Time : " + time + " year");
		}//---------------------------------------------------------------------//----

		//method to
		//calculate simple interest-----/

		public void calculateSimpleInterest()
			{
				try
				{
					if(principal<0)
					{
						throw new PrincipalException("Principal cannot be negative");
					}
					else if(rate < 0)
					{
						throw new RateException("Rate cannot be negative");
					}
					else if(time < 0)
					{
						throw new TimeException("Time cannot be negative");
					}
					else
					{
					 float si = (principal * rate * time)/100;
					//---- displaying data ----/
					displayInfo();
					System.out.println("Simple Interest : Rs "+si);
				}
			}
		catch(PrincipalException|RateException|TimeException exceptionObj)
		{
			System.err.println(exceptionObj.getMessage());
		}
	}
}//--------------------------------------------------------------/

public class InterestCalculator {

	public static void main(String[] args) {
			//---- Object of Interest --/
			Interest si=new Interest();
			si.calculateSimpleInterest();
		}

}


