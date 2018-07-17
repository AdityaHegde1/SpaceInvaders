package pack;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	
 
	final int MENU_STATE = 0;

	final int GAME_STATE = 1;

	final int END_STATE = 2;
	Font titleFont =new Font("Arial",Font.PLAIN,50);
	Spaceship ship1 = new Spaceship(250,700,50,50);
	int currentState = MENU_STATE;
	Timer timer = new Timer(1000 / 60, this);


	public void startGame() {
	
		timer.start();
	}
public void updateMenuState() {
	
}
public  void updateGameState() {
	ship1.update();
}
public  void updateEndState() {
	
}
	public  void drawMenuState(Graphics g ) { 
		
		 g.setColor(Color.BLUE);
		 g.fillRect(0, 0, SpaceInvaders1.width, SpaceInvaders1.height);
			
		 g.setFont(titleFont);
		 g.setColor(Color.YELLOW);
	
	 g.drawString("Space Invaders", 100	, 100);
	 g.drawString("Press Enter to Start", 25, 250);
	 g.drawString("Press Space for Help", 25,400);

		
	
	}
public void drawGameState(Graphics g) {
	g.setColor(Color.BLACK);
	 g.fillRect(0, 0, SpaceInvaders1.width, SpaceInvaders1.height);
		
	 g.setFont(titleFont);
	 g.setColor(Color.BLACK);
 
	 ship1.draw(g);
	
	}
public  void drawEndState(Graphics g) {
	g.setColor(Color.RED); g.fillRect(0, 0, SpaceInvaders1.width, SpaceInvaders1.height);
	
 g.setFont(titleFont);
 g.setColor(Color.BLACK);

g.drawString("You Died", 100	, 100);
g.drawString("Game Over", 100, 60);}

	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
				
				repaint();
				if 
				(currentState == MENU_STATE){

	                updateMenuState();

	        } if(currentState == GAME_STATE){

	                updateGameState();

	        } if(currentState == END_STATE){

	                updateEndState();

	        }



	}




	@Override

	public void paintComponent(Graphics g) {

		
		 if(currentState == MENU_STATE){

             drawMenuState(g);

     }else if(currentState == GAME_STATE){

            drawGameState(g);

     }else if(currentState == END_STATE){

             drawEndState(g);

     }


	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("my name is ");
		if (e.getKeyCode()==KeyEvent.VK_ENTER) {
			currentState++;
			if(currentState > END_STATE){

                currentState = MENU_STATE;

        }
			
				
			}
		if (e.getKeyCode()== KeyEvent.VK_UP) {
			ship1.Y-=25;
			
			
				
			
			
		}
		if (e.getKeyCode()== KeyEvent.VK_DOWN) {
			ship1.Y+=25;
	}
		if (e.getKeyCode()== KeyEvent.VK_LEFT) {
			ship1.X-=25;
	}
		if (e.getKeyCode()== KeyEvent.VK_RIGHT) {
			ship1.X+=25;
		}}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Alien");
	}

}
