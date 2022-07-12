package LogicalProgram;

import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) 
	{
		//%give you modules and /give you div
		// num/2 rem-->0-->even
		// System.out.println(10%2);//0
		// System.out.println(10/2);//5
		
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		if(a%2==0)
		{
		System.out.println(" Even number");
		}
		else 
		{

			System.out.println(" odd number");
	}

}
}