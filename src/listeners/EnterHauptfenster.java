package listeners;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import frames.Hauptfenster;
import schlaeger.Schlaeger;

public class EnterHauptfenster extends KeyAdapter 
{
	@Override
	public void keyPressed(KeyEvent event)
	{
		if (event.getKeyCode() == KeyEvent.VK_ENTER)
		{
			System.out.println("ifEnter");
			Hauptfenster.getHauptfenster().timerStarten();
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