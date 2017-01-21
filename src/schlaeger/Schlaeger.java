package schlaeger;

import javax.swing.JPanel;

import frames.Hauptfenster;

/**
 * In der<i>"<b>Schlaeger</b>" - Klasse </i> werden die <b>Bewegungen</b> des <b>Schlaegers</b> gesteuert.<br>
 * <br>
 * Dieser <i>Schlaeger</i> ist vom Benutzer des Programms <b>steuerbar</b>.<br>
 * Er kann ihn allerdings nur in <b>X-Richtung</b> <i>verschieben</i>,<br>
 * in <b>Y-Richung</b> <i>nicht</i>.<br>
 * <br>
 * Der <i>Schlaeger</i> kann nur <b>innerhalb</b> des</i> <b>Spielfeldes gesteuert</b> <i>werden</i>,<br>
 * <b>ausserhalb</b> <i>des Spielfeldes </i><b>funktioniert</b><i> er </i><b>nicht</b>!
 * 
 * @version 1.0
 * 
 * @author Thomas Mader-Ofer
 * @author Manuel Glantschnig
 * @author Jonas Hörtnagl
 * @author Cristina Erhart
 * 
 */
public class Schlaeger
{
	/**
	 * Die <i>konstanten</i> Variable "<i><b>LINKS_BEWEGEN</b></i>" wurde der <i>Wert</i> <b>0</b> (=<i>null</i>) zugewiessen.
	 */
	public static final int LINKS_BEWEGEN = 0;
	/**
	 * Die <i>konstanten</i> Variable "<i><b>RECHTS_BEWEGEN</b></i>" wurde der <i>Wert</i> <b>1</b> zugewiessen.
	 */
	public static final int RECHTS_BEWEGEN = 1;
	
	/**
	 * Das JPanel "<i><b>oBezugsPanel</b></i>" wurde erstellt.
	 */
	private static JPanel oBezugsPanel;
	/**
	 * Die Variable "<i><b>iGeschwindigkeit</b></i>" wurde der <i>Wert</i> <b>10</b> zugewiessen.
	 */
	private static int iGeschwindigkeit = 10;
	/**
	 * Die Variable "<i><b>iPositionX</b></i>" wurde der <i>Wert</i> <b>0</b> (=<i>null</i>) zugewiessen.
	 */
	private static int iPositionX = 0;
	/**
	 * Die Variable "<i><b>iPositionY</b></i>" wurde der <i>Wert</i> <b>0</b> (=<i>null</i>) zugewiessen.
	 */
	private static int iPositionY = 0;

	/**
	 * Der Konstruktor "<i><b>Schlaeger</b></i> speichert den jeweiligen Baustein als Schlaeger und<br>
	 * ergreift weitere MAssnahmen.<br>
	 * <br>
	 * Dieser <i>Konstruktor</i> hat <b>einen Parameter</b>.
	 * 
	 * @param bezugsPanel Das <b>JPanel</b>, welches mit den Eigenschaften des Schlägers "ausgestattet" wird.
	 */
	public Schlaeger(JPanel bezugsPanel)
	{
		oBezugsPanel = bezugsPanel;																	//Der jeweilige Baustein wird gespeichert.
		setStartPosition();																			//Die Methode "setStartPosition" wird aufgerufen.
	}
	
	/**
	 * Die Methode <i>"<b>setStartPosition</b>"</i> <b>ermittelt</b> die <i>optimale</i> <b>Startposition</b> <i>des Schlaegers</i><br>
	 * und <b>weist</b> diese auch dem Schlaeger <b>zu</b>.
	 */
	public void setStartPosition()
	{
		iPositionX = (Hauptfenster.getSpielfeldBreite() / 2) - (oBezugsPanel.getWidth() / 2);		//Auf der X-Achse befindet sich der Schlaeger geunau in der Mitte des Spielfeldes.
		iPositionY = (Hauptfenster.getSpielfeldHoehe() / 10) * 9;									//Auf der Y-Achse befindet sich der Schlaeger fast ganz unten.
		
		oBezugsPanel.setLocation(iPositionX, iPositionY);											//Die Startposition des Schlaegers wird festgelegt.
	}

	/**
	 * Die Methode <i>"<b>move</b>"</i> wird benoetigt, um den <i>vom Benutzer <br>
	 * des Programms steuerbaren</i> <b>Schlaeger</b> zu <b>bewegen</b>.<br>
	 * <br>
	 * Diese <i>Methode</i> hat <b>einen Parameter</b>.
	 * 
	 * @param iRichtung
	 */
	public static void move(int iRichtung)
	{
		if (iRichtung == LINKS_BEWEGEN)																//Wenn man den Schlaeger nach links bewegen will, wird folgendes ausgefuehrt.
			{
			if (iPositionX >= 0)																	//Wenn der schlaeger droht links ueber den Spielfeldrand zu fliegen, wird folgendes ausgefuehrt.
			{
				iPositionX = iPositionX - iGeschwindigkeit;											//Die aktuelle Position auf der X-Achse wird mit der Geschwindigkeit subtrahiert.
				oBezugsPanel.setLocation(iPositionX, iPositionY);									//Die neue Position im Hauptfenster wird festgelegt.
			}
		}
		if (iRichtung == RECHTS_BEWEGEN)															//Wenn man den Schlaeger nach rechts bewegen will, wird folgendes ausgefuehrt.
		{
			if (iPositionX <= (Hauptfenster.getSpielfeldBreite() - oBezugsPanel.getWidth()))		//Wenn der Schlaeger sich innerhalb des Spielfeldes befindet, wird folgendes ausgefuehrt.
			{
				iPositionX = iPositionX + iGeschwindigkeit;											//Die aktuelle Position auf der X-Achse wird mit der Geschwindigkeit aufsummiert.
				oBezugsPanel.setLocation(iPositionX, iPositionY);									//Die neue Position im Hauptfenster wird festgelegt.
			}
		}
	}
	
	/**
	 * Die Methode <i>"<b>getX</b>"</i> <b>gibt</b> die <i>Position des Schlaegers</i> auf der <b>X-Achse</b><br>
	 * <i>beim Aufruf</i> <b>zurueck</b>.
	 * 
	 * @return Die <b>Position</b> des <b>Schlaeger</b>s auf der <i>X-Achse</i>.
	 */
	public static int getX()
	{
		return iPositionX;
	}
	
	/**
	 * Die Methode <i>"<b>getY</b>"</i> <b>gibt</b> die <i>Position des Schlaegers</i> auf der <b>Y-Achse</b><br>
	 * <i>beim Aufruf</i> <b>zurueck</b>.
	 * 
	 * @return Die <b>Position</b> des <b>Schlaeger</b>s auf der <i>Y-Achse</i>.
	 */
	public static int getY()
	{
		return iPositionY;
	}
	
	/**
	 * Die Methode <i>"<b>getBreite</b>" ermittelt</i> die <b>Breite des Schlaegers</b> und<br>
	 * <b>gibt</b> diese <i>beim Aufruf</i> <b>zurueck</b>.
	 * 
	 * @return Die <b>Breite</b> des <b>Schlaeger</b>s.
	 */
	public static int getBreite()
	{
		return oBezugsPanel.getWidth();
	}
}