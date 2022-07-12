package LogicalProgram;

import java.util.Scanner;

public class MultiplicationWithoutOperator {

	public static void main(String[] args) 
	{
		//4*3 //4+4+4
		//int a=3;
		//int b=4;
		int sum=0;
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("enter the number of a");
		System.out.println("enter the number of b");
		int a=sc.nextInt();
		
		
		int b=sc.nextInt();
		
		
		for(int i=1;i<=b;i++)
		{
			sum=sum+a;
		}
		System.out.println("Multiplication is"+sum);
	}

}
