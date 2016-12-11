package listeners;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import Ball.Ball;
import Schlaeger.Schlaeger;
import spieler.Spieler;

public class EnterHauptfenster extends KeyAdapter 
{
	private Ball oBall = new Ball();
	private int iLeben = 2;
	
	@Override
	public void keyPressed(KeyEvent event)
	{
		
		if (event.getKeyCode() == KeyEvent.VK_ENTER)
		{
			Spieler.setLeben(iLeben--); // NUR TEST!!!!!!
			
			System.out.println("ifEnter");
			oBall.BallBewegen();
		}
		if (event.getKeyCode() == KeyEvent.VK_LEFT)
		{
			Schlaeger.move(Schlaeger.LINKS_BEWEGEN);
		}
		if (event.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			Schlaeger.move(Schlaeger.RECHTS_BEWEGEN);
		}
	}
}