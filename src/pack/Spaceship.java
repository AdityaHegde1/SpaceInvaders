package pack;

import java.awt.Color;
import java.awt.Graphics;

public class Spaceship extends GameObject {
int speed = 5;
	public Spaceship(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	
	
	public void update()
	{
	   

	}
	public void draw (Graphics g) {
		 g.setColor(Color.BLUE);

	 g.fillRect(x,y, 20,40);

	}
}
