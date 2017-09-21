package ants;

import java.awt.Color;

public class Worker extends Ant{
	
	public Worker(Color color, int x, int y){
		super(CLASS.WORKER, color, x, y, 5, 30,1);
	}
}
