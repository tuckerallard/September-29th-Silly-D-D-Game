package com.ourchars;

import com.app.Weapons;
import com.app.Weapons.Weapon;
import com.interfaces.Warrior;
import com.parents.Smurf;

public class SmurfWarrior extends Smurf implements Warrior {
	
	private Weapons warriorWeapon = null;

	public SmurfWarrior(Weapons warriorWeapon) {
		super();
		this.warriorWeapon = warriorWeapon;
	}

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


}