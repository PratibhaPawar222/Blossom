package LogicalProgram;

public class Whitespace {

	public static void main(String[] args) 
	{
		String a="H i H ow r";
		int count=0;
		
		for(int i=0;i<=a.length()-1;i++)
		{
			char newchar = a.charAt(i);
			if(newchar==' ')
			{
				count++;
			}
		}
		System.out.println("Number of WhiteSpaces in this String "+a+ "is"+count);

	}

}
