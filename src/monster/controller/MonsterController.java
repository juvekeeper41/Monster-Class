package monster.controller;

import monster.model.MarshmallowMonster;

public class MonsterController
{
	private MarshmallowMonster firstMonster;

	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("Anubis", 7.2, 2, false, 3, 1);
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
		System.out.println("Here is my monster: " + firstMonster);
	}
}
