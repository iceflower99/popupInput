package input.controller;

import input.veiw.PopupVeiw;

public class InputController
{

	private PopupVeiw myPopups;

	public InputController()
	{
		myPopups = new PopupVeiw();
	}

	public void start()
	{
		String myName = myPopups.grabAnswer("Type in your name");
		myPopups.showResponse("You typed in: " + myName);
	}

	String temp=myPopups.grabAnswer("Type in your age");
	int myAge;

	if(isInteger(temp))
	{
		myAge= Interger.parseInt(temp);
	}
	else
	{
		myAge=-99999999999;
	}
		
	private boolean isInteger(String input)
	{
		boolean isInt=false;
		
		try
		{
			int temp=Integer.parseInt(input);
			isInt=true;
		}
		
		catch(NumberFormatExecption error)
		{
			myPopups.showResponse("not an int - bad value will be used");
		}
	return isInt;	
	}
	
	private boolean isDouble(String input)
	{
		boolean isDouble = false;

		try
		{
			double temp = Double.parseDouble(input);
			isDouble = true;
		}

		catch (NumberFormatException error)
		{
			myPopups.showResponse("not a double");
		}

		return isDouble;
	}
}
