package LogicalProgram;

import java.util.Scanner;

public class factorialSeries {

	public static void main(String[] args)
	{
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the number");
		
		int number=sc.nextInt();
		
		
		
	//	int number ;//4 3 2 1
		
		int number1= 1;
		for(int i=number;i>=1;i--)
		{
			number1=number1*i;
		}
		System.out.println("factorial of number is ..."+number1);

	}

}
