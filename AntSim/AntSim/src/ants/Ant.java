package ants;
import java.awt.Color;

public abstract class Ant {
	private CLASS type = null;
	private Color color = Color.white;
	private int posX, posY, speed, health, range;
	
	public Ant(CLASS type, Color color, int x, int y, int speed, int health, int range){
		this.type = type;
		this.color = color;
		this.posX = x;
		this.posY = y;
		this.health = health;
		this.range = range;
	}
	
	public CLASS getType(){
		return type;
	}
	
	public Color getColor(){
		return color;
	}
	
	public int[] getCoords(){
		return new int[]{posX, posY};
	}
	
	public int getX(){
		return posX;
	}
	
	public int getY(){
		return posY;
	}
	
	public void setX(int x){
		posX = x;
	}
	
	public void setY(int y){
		posY = y;
	}
	
	public int getSpeed(){
		return speed;
	}
	
	public int getHealth(){
		return health;
	}
	
	public void setHealth(int h){
		health = h;
	}
	
	public boolean inRange(Ant ant){
		int x = (int)Math.abs(ant.getX() - this.getX());
		int y = (int)Math.abs(ant.getY() - this.getY());
		if(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) <= range){
			return true;
		}
		
		return false;
	}
	
}
