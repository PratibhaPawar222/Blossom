package Pattern;

public class StarBox {

	public static void main(String[] args) 
	{
		//* * * * *
		//* * * * *
		//* * * * *
		//* * * * *
		//* * * * *
		
		//col=5,row=5
		for(int i=1;i<=5;i++)  // outer for loop--> row
		{
			for(int j=1;j<=5;j++)	//inner for loop-->column
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
