package com.app;

import java.util.Scanner;

import com.parents.*;
import com.ourchars.*;

public class App 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		boolean userInputCorrect = false;
		
//		CharacterClass ourElfjedi = new Elfjedi();
		
		do {
			
			System.out.println("Welcome to Silly D&D\n"
					+ "What would you like to play as?\n"
					+ "1. Human Wizard\n"
					+ "2. Elf Royal\n"
					+ "3. Twi'lek Jedi\n"
					+ "4. Smurf Warrior\n"
					+ "5. Turtle Ninja");
			
			String userInput = sc.nextLine();
			
			switch (userInput) 
			{
				case "1":
					//Call to humanWizard methods here
					break;
	
				case "2":
					//Call to elfRoayal methods here
					break;
	
				case "3":
					//Call to twilekJedi methods here
					break;
	
				case "4":
					//Call to smurfWarrior methods here
					break;
	
				case "5":
					//Call to turtleNinja methods here
					break;
	
				default:
					userInputCorrect = true;
					System.out.println("You've made an invalid selection.\n"
							+ "1, 2, 3, 4, 5 are your choices.\n");
					break;
			}
		} while (userInputCorrect);
	}
}
