package character;

import data.Amount;
import data.Item;

public class Hyena extends Enemy {

	public Hyena(String name, int level) throws Exception {
		
		super(name, level);
		setAttack(level * 100);
		setDefense(level * 70);
		setHp(level * 200);
		setMana(level * 200);
		setXp(level * 100);
		setStamina(level * 60);
		
		if (randomNum % 2 == 0) {
			addItem(Item.HP_POTION);
			addItem(Item.ARMOR);
		} else {
			addItem(Item.MANA_POTION);
			addItem(Item.ARMOR);
		}
	}

}
