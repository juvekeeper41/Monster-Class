package monster.controller;

import monster.model.MarshmallowMonster;

import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster firstMonster;
	private Scanner keyboardInput;

	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("Anubis", 7.2, 2, false, 3, 1);
		keyboardInput = new Scanner(System.in);
	}
	
	/*
	 * name = Anubis
	 * armCount = 3
	 * eyeCount = 2
	 * antennaCount = 7.2
	 * hasBellyButton = false
	 * noseCount = 1
	 */
	
	public void start()
	{
		System.out.println("Here is my monster: " + firstMonster + ".");
		System.out.println("Anubis has " + firstMonster.getAntennaCount() + " antennas,");
		System.out.println(firstMonster.getEyeCount() + " eyes,");
		System.out.println("Does not have a belly button,");
		System.out.println(firstMonster.getArmCount() + " arms,");
		System.out.println("and " + firstMonster.getNoseCount() + " nose.");
		
		System.out.println("Do you want to change my name?");
		String answer = keyboardInput.nextLine();
		
		if (answer.equalsIgnoreCase("yes"))
		{
			System.out.println("What do you want my name to be?");
			String newName = keyboardInput.nextLine();
			firstMonster.setName(newName);
			System.out.println("That's a horrible name.");
		
		System.out.println(firstMonster);
		}
		else
		{
			System.out.println("Fine, don't change my name!");
		}
		
		System.out.println("What's your favorite dish?");
		String answer1 = keyboardInput.nextLine();
		if (answer1.equalsIgnoreCase("human"))
		{
			System.out.println("That's my favorite too!");
		}
		else 
		{
			System.out.println("I only like and eat human, everything else is disgusting.");
		}
		
		System.out.println("Would you care to change how many eyes I have?");
		String answer2 = keyboardInput.nextLine();
		
		if(answer2.equalsIgnoreCase("yes"))
		{
			System.out.println("I'll change the amount myself, if you don't mind. Guess how many I have!");
			keyboardInput.nextLine();
			firstMonster.setEyeCount(6);
			System.out.println("I now have six eyes!");
			
		}
		else
		{
			System.out.println("You're actually happy with the two eyes I have?");
			String answer3 = keyboardInput.nextLine();
			if (answer3.equalsIgnoreCase("yes"))
			{
				System.out.println("You make me sick.");
			
			
		}
		else
		{
			System.out.println("Then why didn't you change the amount?");
			keyboardInput.nextLine();
			System.out.println("I'm leaving, bye!");
		}
			{
			System.out.println("*Anubis ran away.*");
			}
			System.out.println("Would you like to call for him to come back?");
			String answer4 = keyboardInput.nextLine();
			if (answer4.equalsIgnoreCase("yes"))
			{
				System.out.println("Anubis, come back!");
				System.out.println("*Anubis steps outside of the bushes.*");
			}
			else
			{
				System.out.println("*You walk away discouraged.*");
			
			loopMonster();
			}
			
			{
				
			}
		}
	}

		private void loopMonster()
		{
		//define a variable for condition/test	
		int numberOfTimes = 0;
		while(numberOfTimes < 1000)
			{
				//Code to do
				System.out.print("First monster words" + firstMonster);
				
				//Code to change variable for condition
				numberOfTimes++;
		}
		
		for(int count = 0; count < 100; count++)
		{
			System.out.println("First monster words " + firstMonster);
			}
		
		for(int count = 0; count < 50; count ++)
		{
			System.out.println("I can say my creator's name: Jake");
			}
		}
} 

