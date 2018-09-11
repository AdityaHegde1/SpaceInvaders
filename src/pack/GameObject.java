package pack;

import java.awt.Graphics;

public class GameObject {
	 int x;
	boolean isAlive;
	 int y;

	int width;

	int height;

	public GameObject(int X, int Y, int width, int height) {
		x = X;
		y = Y;
	}

	public void update() {

	}

	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		g.fillRect(x, y, 100, 100);

	}

}
