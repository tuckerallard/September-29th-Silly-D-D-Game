package com.ourchars;

import com.app.Weapons;
import com.app.Weapons.Weapon;
import com.interfaces.Jedi;
import com.parents.Twilek;

public class TwilekJedi extends Twilek implements Jedi 
{

	public TwilekJedi()
	{
		super();
	}
	
	public TwilekJedi(int health, int magic, String name, Weapon weapon)
	{
		super(health, magic, name, weapon);
	}

	@Override
	public void changehealth() 
	{
		super.setHealth(health + 75);

	}

	@Override
	public void changeMagic() 
	{
		super.setMagic(magic + 10);

	}
	
	@Override
	public void setWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapon(Weapon.LIGHTSABER);
	}

	public static TwilekJedi makeTwilekJedi()
	{
		TwilekJedi ourTwilekJedi = new TwilekJedi();
		
		ourTwilekJedi.changehealth();
		ourTwilekJedi.changeMagic();
		ourTwilekJedi.setName(null);
		ourTwilekJedi.setWeapon(null);
		
		return ourTwilekJedi;

	}
}