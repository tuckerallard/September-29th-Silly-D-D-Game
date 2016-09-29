package com.ourchars;

import com.app.Weapons;
import com.app.Weapons.Weapon;
import com.interfaces.Jedi;
import com.parents.Twilek;

public class TwilekJedi extends Twilek implements Jedi 
{
	private Weapons twilekWeapon = null;

	public TwilekJedi(Weapons twilekWeapon) {
		super();
		this.twilekWeapon = twilekWeapon;
	}

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
		super.setHealth(health + 50);

	}

	@Override
	public void changeMagic() 
	{
		super.setMagic(magic + 100);

	}
	
	@Override
	public void setWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapon(Weapon.LIGHTSABER);
	}


}