package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.character.Hero;

public class HeroTest {

	
	
	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void test_HeroConstructor() throws Exception {
		
		// TODO: setup()
		String heroName = "Matthias";
		int heroAttack = 25;
		int heroDefense = 20;
		int heroHp = 100;
		int heroMana = 75;
		int heroXp = 100;
		float heroStamina = 5;
		Hero hero = new Hero(heroName, heroAttack, heroDefense, heroHp, heroMana, heroXp, heroStamina);
		
		assertEquals(hero.getName(), heroName);
		
		
	}
	

}
