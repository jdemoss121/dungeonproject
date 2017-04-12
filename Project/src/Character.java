import java.util.Scanner;

public class Character {

	public static void main(String[] args) {
		String charRace;
		String charClass;
		
		int fortSave, refSave, willSave;
		int baseAttackBonus;
		int AC = 10;
		int CMB, CMD;
		int initiative;
		int HP;
		int exp;
		int skillRanks;
		
		
		String[] abilNames = new String[]{"Strength","Dexterity","Constitution","Intelligence","Wisdom", "Charisma"};
		int[] abilities = new int[6];
		int[] abilMods = new int[6];
		int[] baseSave = new int[3];
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter ability scores: ");
		for (int i=0; i < abilities.length; i++){
			System.out.println(abilNames[i] +": ");
			abilities[i] = input.nextInt();
		}
		
		for (int i=0; i < abilities.length; i++){
			abilMods[i] = (abilities[i] - 10)/2;
			if(i<=0||i>20)
			{
				System.out.println("Abilities out of bounds");
			}
		}
		
		initiative = abilMods[1];
		fortSave = baseSave[0] + abilMods[2];
		refSave = baseSave[1] + abilMods[1];
		willSave = baseSave[2] + abilMods[5];
		
		for (int i=0; i < abilities.length; i++){
			System.out.println(abilities[i]);
		}
		for (int i=0; i < abilMods.length; i++){
			System.out.println(abilMods[i]);
		}
				
		
	}

}