package listeners;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import Ball.Ball;
import spieler.Spieler;

public class EnterHauptfenster extends KeyAdapter 
{
	private Ball oBall = new Ball();
	
	@Override
	public void keyPressed(KeyEvent event)
	{
		if (event.getKeyCode() == KeyEvent.VK_ENTER)
		{
			Spieler.setLeben(0); // NUR TEST!!!!!!
			
			System.out.println("ifEnter");
			oBall.BallBewegen();
		}
	}
}