package Launcher;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ants.Ant;
import ants.Queen;

public class Display extends JPanel{
	
	public Display(String string, int w, int h, ArrayList<Ant> ants){
		JFrame frame = new JFrame(string);
		frame.setMinimumSize(new Dimension(w, h));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel(){
			@Override
		    protected void paintComponent(Graphics g) {
		        super.paintComponent(g);
		        Ant ant;
		        for(int i = 0; i < ants.size(); i++){
		        	if(ants.get(i) instanceof Queen){
		        		ant = (Queen)ants.get(i);
		        		g.drawRect(ant.getX(), ant.getY(), 10, 10);
		        	}
		        }
		    }

		};
	}
}
