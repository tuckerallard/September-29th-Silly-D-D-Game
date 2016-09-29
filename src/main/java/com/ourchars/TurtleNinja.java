package com.ourchars;

import com.app.Weapons;
import com.app.Weapons.Weapon;
import com.interfaces.Ninja;
import com.parents.Turtle;

public class TurtleNinja extends Turtle implements Ninja 
{

	public TurtleNinja()
	{
		super();
	}
	
	public TurtleNinja(int health, int magic, String name, Weapon weapon)
	{
		super(health, magic, name, weapon);
	}

	@Override
	public void changehealth() 
	{
		super.setHealth(health + 20);

	}

	@Override
	public void changeMagic() 
	{
		super.setMagic(magic - 5);

	}

	@Override
	public void setWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapon(Weapon.NUNCHUCK);
	}

	public static TurtleNinja makeTurtleNinja()
	{
		TurtleNinja ourTurtleNinja = new TurtleNinja();
		
		ourTurtleNinja.changehealth();
		ourTurtleNinja.changeMagic();
		ourTurtleNinja.setName(null);
		ourTurtleNinja.setWeapon(null);
		
		return ourTurtleNinja;

	}
}