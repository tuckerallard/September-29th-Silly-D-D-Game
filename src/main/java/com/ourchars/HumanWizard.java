package com.ourchars;

import com.app.Weapons;
import com.app.Weapons.Weapon;
import com.interfaces.Wizard;
import com.parents.Human;

public class HumanWizard extends Human implements Wizard 
{
	
	public HumanWizard()
	{
		super();
	}
	
	public HumanWizard(int health, int magic, String name, Weapon weapon)
	{
		super(health, magic, name, weapon);
	}

	@Override
	public void changehealth() 
	{
		super.setHealth(health + 0);

	}

	@Override
	public void changeMagic() 
	{
		super.setMagic(magic + 200);

	}
	
	@Override
	public void setWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapon(Weapon.WAND);
	}

	public static HumanWizard makeHumanWizard()
	{
		HumanWizard ourHumanWizard = new HumanWizard();
		
		ourHumanWizard.changehealth();
//		ourHumanWizard.setHealth(0);
//		ourHumanWizard.setMagic(0);
		ourHumanWizard.changeMagic();
		ourHumanWizard.setName(null);
		ourHumanWizard.setWeapon(null);
		
		return ourHumanWizard;

	}
}