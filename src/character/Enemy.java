package character;

import java.util.concurrent.ThreadLocalRandom;

import data.Amount;
import data.Item;

public abstract class Enemy extends Character {
	
	// random int in range of 1-10
	protected int randomNum = ThreadLocalRandom.current().nextInt(1, 10 + 1);

	public Enemy(String name, int attack, int defense, int hp, int mana, int xp, float stamina)
			throws Exception {
		super(name, attack, defense, hp, mana, xp, stamina);
		
	}
	
	public Enemy(String name, int level) throws Exception {
		setName(name);
		setLevel(level);
	}
}