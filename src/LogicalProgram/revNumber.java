package LogicalProgram;

public class revNumber {

	public static void main(String[] args)
	{
		int num=145;
		int rev=0;
		
		
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;           //3=0+3
			rev=rev*10+rem;			//32=3*10+2
									//321=320+1	
		}
		System.out.println("rev number is "+rev);
	}

}
