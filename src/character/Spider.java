package character;

import data.Amount;
import data.Item;

public class Spider extends Enemy {

	public Spider(String name, int level) throws Exception {
		
		super(name, level);
		setAttack(level * 80);
		setDefense(level * 60);
		setHp(level * 300);
		setMana(level * 250);
		setXp(level * 200);
		setStamina(level * 80);
		
		if (randomNum % 2 == 0) {
			addItem(Item.BOOTS);
		} else {
			addItem(Item.MANA_POTION);
		}
	}
}
