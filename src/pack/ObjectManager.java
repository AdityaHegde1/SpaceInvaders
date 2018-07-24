package pack;

import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager extends GameObject {
	public ObjectManager(int x, int y, int width, int height) {
		super(x, y, width, height);

		// TODO Auto-generated constructor stub
	}

	Spaceship ship1 = new Spaceship(0, 0, 0, 0);
	ArrayList<Projectile> Projectiles = new ArrayList();

	public final void main(Spaceship ship1) {

	}

	public void update() {
		ship1.update();
		if (Y < 0) {
			isAlive = false;
		}
		for (int i = 0; i < Projectiles.size(); i++) {
			Projectiles.get(i).update();
		}
	}

	public static void AddProjectile(Projectile a) {
		Projectiles.add(projectile1);
	}

	public void draw(Graphics g) {
		ship1.draw(g);
		for (int i = 0; i < Projectiles.size(); i++) {
			Projectiles.get(i).draw(g);
		}

	}
}
