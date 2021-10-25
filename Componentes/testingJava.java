import java.util.Scanner;

public class testingJava
{

	public static void main (String args[])
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Write your text: ");
		String  stringInput =  input.nextLine();

		System.out.println("Your text typed is: "+stringInput);
	}
}

		
