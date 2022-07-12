package LogicalProgram;

public class armstrongNumber {

	public static void main(String[] args)
	{
		//123=1^3+2^3+3^3  =1+8+27=36
		//153=1^3+2^3+3^3  =1+125+27=153
		
		int num=153;
		int num1=0;
		for(int i=num;i>0;i=i/10)   // i=153  3 reminder i=i/10 updation after execution //15/10=1
		{
			int rem=i%10;				//153%10=3    // 15%10 =5
			num1=num1+(rem*rem*rem);   //  0+27  =  125+27+1=153
				
			
		}
		if(num==num1)
		{
			System.out.println("Armstrong");
			
		}
		else
		{
			System.out.println("Not Armstrong");
		}

	}

}
