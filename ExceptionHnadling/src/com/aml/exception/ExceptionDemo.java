package com.aml.exception;

public class ExceptionDemo {
	/*public static void main(String[] args)
	{
		String[] s = {"abc", "123", "xyz", "456"};   //String Array containing valid and invalid numeric values

		for (int i = 0; i < s.length; i++)
		{
			try
			{
				int intValue = Integer.parseInt(s[i]); //This statement may throw NumberFormatException
			}
			catch(NumberFormatException ex)
			{
				System.out.println("The thrown NumberFormatException will be caught here");
			}
			finally
			{
				System.out.println("This block is always executed");
			}
		}*/
	/*public static void main(String[] args)
		{
			try
			{
				int i = 10/0;           //This statement throws ArithmeticException

				System.out.println("This statement will not be executed");
			}
			catch(Exception ex)
			{
				System.out.println("This block is executed immediately after an exception is thrown");
			}
			finally
			{
				System.out.println("This block is always executed");
			}
		}/*/
	/*public static void main(String[] args)
	{
		System.out.println("You can keep any number of statements here");

		try
		{
			int i = 10/0;           //This statement throws ArithmeticException

			System.out.println("This statement will not be executed");
		}

		//You can't keep statements here

		catch(ArithmeticException ex)
		{
			System.out.println("This block is executed immediately after an exception is thrown");
		}

		//You can't keep statements here

		finally
		{
			System.out.println("This block is always executed");
		}

		System.out.println("You can keep any number of statements here");
	}*/
	public static void main(String[] args) {
		//public void m1() {
try
{
	String s = null;

	System.out.println(s.length());   //This statement throws NullPointerException

	System.out.println("This statement will not be executed");
	return ;
}
catch(Exception ex)
{
	System.out.println(ex);    //Output : java.lang.NullPointerException

	ex.printStackTrace();   
	return;//This prints stack trace of exception
}
finally
{
	System.out.println("This block is always executed");
	//return;
}
//}
	//	return;
	}
	
//return;
}


