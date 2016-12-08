package listeners;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import Ball.Ball;

public class EnterHauptfenster extends KeyAdapter 
{
	@Override
	public void keyPressed(KeyEvent event)
	{
		if(event.getKeyCode() == KeyEvent.VK_ENTER)
		{
			System.out.println("ifEnter");
			Ball.BallBewegen();
		}
	}
}