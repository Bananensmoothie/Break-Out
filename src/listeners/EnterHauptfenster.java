package listeners;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import ball.Ball;
import frames.Hauptfenster;
import schlaeger.Schlaeger;

/**
 * Im <i>Listener</i> <i>"<b>EnterHauptfensterListener</b>"</i> wird abgefragt, ob die <i>Taste</i> "<b>ENTER</b>" oder <br>
 * die <b>rechte</b> oder die <b>linke Pfeiltaste</b> <i>gedruekt</i> wurde.<br>
 * Anschliessend werden die entsprechenden <i>Massnahmen ergriffen</i>.<br>
 * <br>
 * Dieser Listener <i>erbt</i> von der Klasse "<b>KeyAdapter</b>".<br>
 * 
 * @version 1.0
 * 
 * @author Thomas Mader-Ofer
 * @author Manuel Glantschnig
 * @author Jonas Hörtnagl
 * @author Cristina Erhart
 * 
 */
public class EnterHauptfenster extends KeyAdapter
{
	@Override
	public void keyPressed(KeyEvent event)
	{
		if (event.getKeyCode() == KeyEvent.VK_ENTER)					//Wenn die Taste "ENTER" gedrueckt wurde, wird folgendes ausgefuehrt.
		{
			if (Hauptfenster.isTimerAktiv())							//Wenn der Timer derzeit "lauft"  wird folgendes ausgefuehrt.
			{
				Hauptfenster.getHauptfenster().timerStoppen();			//Der Timer wird gestoppt.
				Hauptfenster.getHauptfenster().showSpielInformation();	//Die aktuellen Informationen zum laufenden Spiel werden angezeigt.
			}
			
			Ball.setStartPosition();									//Der Ball wird auf seine Startpostiotion gesetzt.
			Hauptfenster.getHauptfenster().timerStarten();				//Der Timer wird gestartet.
		}
		if (event.getKeyCode() == KeyEvent.VK_LEFT)						//Wenn die linke Pfeiltaste gedrueckt wurde, wird folgendes ausgefuehrt.
		{
			Schlaeger.move(Schlaeger.LINKS_BEWEGEN);					//Der Schlaeger (= Benutzerpanel) bewegt sich nach links.
		}
		if (event.getKeyCode() == KeyEvent.VK_RIGHT)					//Wenn die rechte Pfeiltaste gedrueckt wurde, wird folgendes ausgefuehrt.
		{
			Schlaeger.move(Schlaeger.RECHTS_BEWEGEN);					//Der Schlaeger (= Benutzerpanel) bewegt sich nach rechts.
		}
	}
}
