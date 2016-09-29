package com.ourchars;

import com.app.Weapons;
import com.app.Weapons.Weapon;
import com.interfaces.Warrior;
import com.parents.Smurf;

public class SmurfWarrior extends Smurf implements Warrior 
{

	public SmurfWarrior()
	{
		super();
	}
	
	public SmurfWarrior(int health, int magic, String name, Weapon weapon)
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
		super.setMagic(magic + 0);

	}
	
	@Override
	public void setWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapon(Weapon.MACE);
	}

	public static SmurfWarrior makeSmurfWarrior()
	{
		SmurfWarrior ourSmurfWarrior = new SmurfWarrior();
		
		ourSmurfWarrior.changehealth();
		ourSmurfWarrior.changeMagic();
		ourSmurfWarrior.setName(null);
		ourSmurfWarrior.setWeapon(null);
		
		return ourSmurfWarrior;

	}

}