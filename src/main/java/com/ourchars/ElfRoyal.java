package com.ourchars;

import com.app.Weapons;
import com.app.Weapons.Weapon;
import com.interfaces.Royal;
import com.parents.Elf;

public class ElfRoyal extends Elf implements Royal {

	private Weapons royalWeapon = null;
	
	public ElfRoyal(Weapons royalWeapon) {
		super();
		this.royalWeapon = royalWeapon;
	}

	public ElfRoyal()
	{
		super();
	}
	
	public ElfRoyal(int health, int magic, String name, Weapon weapon)
	{
		super(health, magic, name, weapon);
	}

	@Override
	public void changehealth() 
	{
		super.setHealth(health - 5);

	}

	@Override
	public void changeMagic() 
	{
		super.setMagic(magic + 40);

	}

	@Override
	public void setWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapon(Weapon.SCROLL);
	}

	
}