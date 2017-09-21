package ants;

import java.awt.Color;

public class Warrior extends Ant{
	private int damage = 10;
	
	public Warrior(Color color, int x, int y, int health) {
		super(CLASS.WARRIOR, color, x, y, 7, health,3);
	}
	
	private boolean attack(Ant ant){
		if(ant.inRange(ant)){
			ant.setHealth(ant.getHealth() - damage);
			return true;
		}
		return false;
	}

}
