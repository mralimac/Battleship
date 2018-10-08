package battleship;

import java.util.Scanner;

public class Main 
{
	private Scanner inputScanner = new Scanner(System.in);
	
	
	public static void main(String[] args) 
	{
		

	}

	public String getUserStringInput()
	{
		return inputScanner.next();
	}
	
	public int getUserIntInput()
	{
		while(true)
		{
			try
			{
				return Integer.parseInt(this.inputScanner.next());
			}
			catch(NumberFormatException e)
			{
				System.out.println("Invalid Input. Please try again");
			}
		}
	}
}
