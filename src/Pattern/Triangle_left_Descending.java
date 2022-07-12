package Pattern;

public class Triangle_left_Descending {

	public static void main(String[] args) 
	{
		//*****
		//****
		//***
		//**
		//*
		//step1 row=5 col=5
		
		int star= 5;					 // No of star present in first row
		
		for(int i=1;i<=5;i++)         //outer loop for 
		{
			for(int j=1;j<=star;j++)	//inner loop for column
			{
				System.out.print("*");
			}
			System.out.println();
			star --;
		}
		
		
		

	}

}
