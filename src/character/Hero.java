package character;

public class Hero extends Character {

	public Hero(String name, int attack, int defense, int hp, int mana, int xp, float stamina)
			throws Exception {
		super(name, attack, defense, hp, mana, xp, stamina);
	}
	
	public void printStatus() {
		String toPrint = "Status Hero: " + this.getName() + ", LVL: " + this.getLevel() + ", ATK: " + this.getAttack() + 
				", DEF: " + this.getDefense() + ", HP: " + this.getHp().getActual_value() + 
				"/" + this.getHp().getMax() + ", MANA: " + this.getMana().getActual_value() +
				"/" + this.getMana().getMax() + ", XP: " + this.getXp().getActual_value() + 
				"/" + this.getXp().getMax() + ", Stamina: " + this.getStamina();
		System.out.println(toPrint);
	}
}
