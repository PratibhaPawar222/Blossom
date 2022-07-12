
package LogicalProgram;

import java.util.Scanner;

public class VowelFind 
//Find No of count in sentence
/*Read a sentence from the user
Create a variable (count) initialize it with 0;
Compare each character in the sentence with the characters {'a', 'e', 'i', 'o', 'u' }
If a match occurs increment the count.
Finally print count.*/

{

	public static void main(String[] args)
	{
		int count=0;  //Create a variable (count) initialize it with 0;
		
		System.out.println("Enter String"); 
		
		Scanner sc= new Scanner(System.in);		//Read a sentence from the user
		
		String sentence = sc.nextLine();   
		
		for(int i=0;i<sentence.length();i++)
		{
			char ch= sentence.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println("those char are "+ch);
				count++;
			}
				
		}
		System.out.println("Number of vowels in the given sentence is "+count);
			
	}

}
