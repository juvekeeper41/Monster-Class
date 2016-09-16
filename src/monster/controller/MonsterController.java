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
		
		System.out.println(firstMonster);
		}
		else
		{
			System.out.println("Fine, don't change my name!");
		}
		System.out.println(firstMonster);
	}
}

