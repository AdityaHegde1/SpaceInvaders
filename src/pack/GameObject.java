package pack;

import java.awt.Graphics;

public class GameObject {
	static int X;
	boolean isAlive;
	static int Y;

	int width;

	int height;

	public GameObject(int x, int y, int width, int height) {
		X = x;
		Y = y;
	}

	public void update() {

	}

	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		g.fillRect(X, Y, 100, 100);

	}

}
