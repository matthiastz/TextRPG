package data;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import character.Enemy;
import character.Hero;
import character.Hyena;
import character.Oger;
import character.Spider;

/**
 * This will hold all the relevant characters and progress the game in
 * a loop, until a condition is reached. The Hero will continue to kill
 * enemies and grab their loot. 
 * 
 * @author matthias
 *
 */
public class GameProgress {
	private Hero hero;
	private List<Enemy> enemies;
	
	private int randomNumHyena;
	private int randomNumOger;
	private int randomNumSpider;
	
	
	// init
	public GameProgress(String playerName) throws Exception {
		
		hero = new Hero(playerName, 25, 20, 100, 75, 100, 5);
		enemies = new LinkedList<>();

		// random int in range of 1-3
		randomNumHyena = ThreadLocalRandom.current().nextInt(1, 3 + 1);
		randomNumOger = ThreadLocalRandom.current().nextInt(1, 3 + 1);
		randomNumSpider = ThreadLocalRandom.current().nextInt(1, 3 + 1);
		
		for (int i = 0; i < randomNumHyena; i++) {
			enemies.add(new Hyena("Hyena Bot", 1));
		}
		for (int i = 0; i < randomNumOger; i++) {
			enemies.add(new Oger("Oger Bot", 1));
		}
		for (int i = 0; i < randomNumSpider; i++) {
			enemies.add(new Spider("Spider Bot", 1));
		}
		
	}
	
	// game loop
	public void gameLoop() throws Exception {
		
		while (hero.getLevel() <= 100) {
			fightEnemy();
			hero.printStatus();
			Thread.sleep(1500);
			System.out.print("\n");
		}
	}
	
	// fight, remove 1 enemy, add new 1
	private void fightEnemy() throws Exception {
		int enemyNum = ThreadLocalRandom.current().nextInt(0, enemies.size());
		Enemy toFight = enemies.get(enemyNum);
		Enemy newEnemy;
		
		hero.addXp(toFight.getXp().getMax()); // get the xp from the enemy
		int level = hero.getLevel();

		// create new enemy
		if (toFight instanceof Hyena) {
			newEnemy = new Hyena("Hyena Bot", level);
			System.out.println("Killed an Hyena LVL: " + toFight.getLevel());
		} else if (toFight instanceof Oger) {
			newEnemy = new Oger("Oger Bot", level);
			System.out.println("Killed an Oger LVL: " + toFight.getLevel());
		} else {
			newEnemy = new Spider("Spider Bot", level);
			System.out.println("Killed an Spider LVL: " + toFight.getLevel());
		}
		
		// get all items from the enemy bot
		System.out.print("Picked up: ");
		for (int i = 0; i < toFight.getItems().size(); i++) {
			Item item = toFight.getItems().get(i);
			hero.addItem(item);
			System.out.print(item.name() + " ");	
		}
		System.out.print("\n");
		
		// update enemy list
		enemies.remove(enemyNum);
		enemies.add(newEnemy);
	}
}
