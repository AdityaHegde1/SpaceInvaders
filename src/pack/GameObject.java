package pack;

import java.awt.Graphics;

public class GameObject {
	int X;

	int Y;

	int width;

	int height;

	public GameObject(int x, int y, int width, int height) {
		x = 20;
		y = 100000;
	}

	public void update() {
		X += 10;
		Y -= 100;
	}

	public void draw(Graphics g) {
		// TODO Auto-generated method stub

		g.fillRect(10, 10, 100, 100);

	}
}
