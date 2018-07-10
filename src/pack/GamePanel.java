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
	Font titleFont;
 
	final int MENU_STATE = 0;

	final int GAME_STATE = 1;

	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Timer timer = new Timer(1000 / 60, this);


	public void startGame() {
		Font titleFont =new Font("Arial",Font.PLAIN,48);
		timer.start();
	}
public void updateMenuState() {
	
}
public  void updateGameState() {
	
}
public  void updateEndState() {
	
}

	public  void drawMenuState(Graphics g ) {
		
	 g.drawString("Hi", 10	, 4);
		 g.setColor(Color.BLACK);
		 g.setColor(Color.BLUE);

		g.fillRect(0, 0, SpaceInvaders1.width, SpaceInvaders1.height);    
	}
public void drawGameState(Graphics g) {
	g.setColor(Color.BLACK);

	g.fillRect(0, 0, SpaceInvaders1.width, SpaceInvaders1.height);
	}
public  void drawEndState(Graphics g) {
	g.setColor(Color.RED);

	g.fillRect(0, 0, SpaceInvaders1.width, SpaceInvaders1.height);
}
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
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Alien");
	}

}
