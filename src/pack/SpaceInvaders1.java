
package pack;

import java.awt.Dimension;

import javax.swing.JFrame;

public class SpaceInvaders1 {
	public JFrame frame = new JFrame();
	GamePanel GP = new GamePanel();
	static int height = 800;
	static int width = 500;

	public static void main(String[] args) {
		SpaceInvaders1 invader = new SpaceInvaders1();
		invader.setup();

	}

	public void setup() {
		frame.getContentPane().setPreferredSize(new Dimension(width, height));

		frame.pack();
		frame.add(GP);
		frame.addKeyListener(GP);
		frame.setVisible(true);
		GP.startGame();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
