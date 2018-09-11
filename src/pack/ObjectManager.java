
package pack;

import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager  {
	
	Spaceship Ship1;
	public ObjectManager(Spaceship Ship1 ) {
		

		// TODO Auto-generated constructor stub
	}

	
	static ArrayList<Projectile> Projectiles = new ArrayList();

	
	public void update() {
		Ship1.update();
		
		
		for (int i = 0; i < Projectiles.size(); i++) {
			Projectiles.get(i).update();
		}
	}

	public static void AddProjectile(Projectile a) {
		Projectiles.addAll(Projectiles);
	}

	public void draw(Graphics g) {
		Ship1.draw(g);
		for (int i = 0; i < Projectiles.size(); i++) {
			Projectiles.get(i).draw(g);
		}

	}
}
