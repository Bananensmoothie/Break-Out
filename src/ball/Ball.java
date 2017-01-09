package ball;

import frames.Hauptfenster;
import schlaeger.Schlaeger;
import spieler.Spieler;
import javax.swing.JPanel;

/**
 * In der<i>"<b>Ball</b>" - Klasse </i> werden die <b>Bewegungen</b> des, wie ein Baseball aussehender, <b>Ball</b> gesteuert.<br>
 * <br>
 * Dieser Ball fängt im <i> Hauptfenster</i> des Spiels <b>selbstständig</b> an sich zu <b>bewegen</b>,<br>
 * sobald man in diesem Fenster die Taste <i>ENTER</i> drückt.<br>
 * <br>
 * Der Ball <b>aendert</b> seine <b>Richtung</b>, wenn er auf eine der <i>bunten Bausteine</i>,<br> 
 * auf <i>eine Wand</i> (unterste Wand ist hierbei ausgenommen), oder auf das steuerbare <i>Benutzerpanel</i> trifft.<br>
 * 
 * @version 1.0
 * 
 * @author Thomas Mader-Ofer
 * @author Manuel Glantschnig
 * @author Jonas Hörtnagl
 * @author Cristina Erhart
 * 
 */
public final class Ball
{
	/**
	 * Die Variable <i><b>xRichtung</b></i> speichert den Wert <b>-1</b>.<br>
	 * <i>xRichung</i> wird benötigt, um die <b>Richtung</b> des <b>Ball</b>es bezgl. der <b>X-Richtung</b> zu <b>aendern</b>.<br>
	 * <br>
	 * <b>BSP:</b> Kam der Ball <i>vor</i> einem <i>Aufprall von links</i>, so soll er <i>nach</i> dem <i>Aufprall nach rechts fliegen</i>.<br>
	 */
	private static int xRichtung = -1;
	/**
	 * Die Variable <i><b>yRichtung</b></i> speichert den Wert <b>-1</b>.<br>
	 * <i>yRichung</i> wird benötigt, um die <b>Richtung</b> des <b>Ball</b>es bezgl. der <b>Y-Richtung</b> zu <b>aendern</b>.<br>
	 * <br>
	 * <b>BSP:</b> Kam der Ball <i>vor</i> einem <i>Aufprall von unten</i>, so soll er <i>nach</i> dem <i>Aufprall nach oben fliegen</i>.<br>
	 */
	private static int yRichtung = -1;
	/**
	 * Die Variable <i><b>iPositionX</b></i> speichert den Wert <b>0</b>.<br>
	 * <i>iPositionX</i> gibt die <b>Position</b> (=Wert) des <b>Ball</b>es auf der <b>X-Koordinate</b> an.<br>
	 */
	private static int iPositionX = 0;
	/**
	 * Die Variable <i><b>iPositionY</b></i> speichert den Wert <b>0</b>.<br>
	 * <i>iPositionY</i> gibt die <b>Position</b> (=Wert) des <b>Ball</b>es auf der <b>Y-Koordinate</b> an.<br>
	 */
	private static int iPositionY = 0;
	/**
	 * Die Variable <i><b>aPanel</b></i> steht später für das "<b>2D-Array</b>,<br>
	 * das die bunten <b>Bausteine</b> am <b>oberen Rand des Hauptfensters</b> beinhaltet</b>.<br>
	 * Zunächst wird nur das Array <i>aPanel</i> <i>ohne Inhalt</i> erzeugt.<br>
	 */
	private static JPanel[][] aPanel;

	/**
	 * Die Methode "<i><b>setStartPosition</b></i>" gibt dem <b>Ball</b> zu <b>Beginn des Spiels</b> seine "<b>Startposition</b>".<br>
	 * Diese <i>Startposition</i> wird bei jedem Mal, wenn der Benuetzer des Programms ein <b>Leben</b><br>
	 * <b>verliert</b> wieder als <b>Startposition</b> verwendet. <br>
	 * <br>
	 * Die <i>Startposition</i> befindet sich <i>mittig auf dem Benutzerpanel</i>.
	 */
	public static void setStartPosition()
	{
		iPositionX = (Hauptfenster.FENSTER_BREITE / 2) - (Hauptfenster.getBallBreite() / 2);		//Die Startposition des Balls auf der X-Achse wird ermittelt und in iPositionX gespeichert.
		iPositionY = (Hauptfenster.FENSTER_HOEHE / 2);												//Die Startposition des Balls auf der Y-Achse wird ermittelt und in iPositionY gespeichert.

		Hauptfenster.getBall().setLocation(iPositionX, iPositionY);									//Die Startposition des Balls wird gesetzt.
	}

	/**
	 * In der Methode "<i><b>bewegen</b></i>" sind die entsprechenden <i>Abfragen</i> für die reibungslose <b>Bewegung des Balls</b> zu finden.<br>
	 */
	public static void bewegen()
	{
		int iBallPosX = getBallX();										//Die Variable "iBallPosX" speichert das Aufrufen der "getBallX"-Methode.
		int iBallPosY = getBallY();										//Die Variable "iBallPosY" speichert das Aufrufen der "getBallY"-Methode.
		int iBallHoehe = Hauptfenster.getBallHoehe();					//Die Variable "iBallHoehe" speichert das Aufrufen der "getBallHoehe"-Methode in der Klasse "Hauptfenster".
		int iBallBreite = Hauptfenster.getBallBreite();					//Die Variable "iBallBreite" speichert das Aufrufen der "getBallBreite"-Methode in der Klasse "Hauptfenster".
		int iSchlaegerPosX = Schlaeger.getX();							//Die Variable "iSchlaegerPosX" speichert das Aufrufen der "getX"-Methode in der Klasse "Schlaeger".
		int iSchlaegerPosY = Schlaeger.getY();							//Die Variable "iSchlaegerPosY" speichert das Aufrufen der "getY"-Methode in der Klasse "Schlaeger".
	
		int iSchlaegerBreite = Schlaeger.getBreite();					//Die Variable "iSchlaegerBreite" speichert das Aufrufen der "getBreite"-Methode in der Klasse "Schlaeger".
		int iSpielfeldBreite = Hauptfenster.getSpielfeldBreite();		//Die Variable "iSpielfeldBreite" speichert das Aufrufen der "getSpielfeldBreite"-Methode in der Klasse "Hauptfenster".
		
		aPanel = Hauptfenster.getAPanels();								//Die Variable "aPanels" speichert das Aufrufen der "getAPanels"-Methode in der Klasse "Hauptfenster".

		
		for (int iZeile = 0; iZeile < 5; iZeile++)													//Eine "for"-Schleife, die jede Zeile der Bausteine betrachtet wird erstellt. Diese laeft 5 (= 5 Zeilen) mal durch.
		{
			for (int iSpalte = 0; iSpalte < 10; iSpalte++)											//Eine "for"-Schleife, die jede Spalte der Bausteine betrachtet wird erstellt. Diese laeft 10 (= 10 Spalten)mal durch.
				{
				if ((iBallPosY >= aPanel[iZeile][iSpalte].getY()) 									//Die Abfrage, ob die Position des Balls auf der Y-Achse kleiner gleich der Position des jeweiligen Bausteins auf der Y-Achse ist,
					&& (iBallPosY <= (aPanel[iZeile][iSpalte].getY() + 55))							//ob die Position des Balls auf der Y-Achse groesser gleich der Position des darauf folgenden Bausteins auf der Y-Achse ist und
					&& aPanel[iZeile][iSpalte].isVisible())											//ob der jeweilige Baustein für den Bunuetzer des Programms sichtbar ist, wurde hier erstellt.
																									//Wenn dies der Fall ist, wird folgendes ausgefuehrt.
				{
					if ((iBallPosX >= aPanel[iZeile][iSpalte].getX()) 								//Die Abfrage, ob die Position des Balls auf der X-Achse kleiner gleich der Position des jeweiligen Bausteins auf der X-Achse ist,
						&& (iBallPosX <= (aPanel[iZeile][iSpalte].getX() + 109))					//ob die Position des Balls auf der X-Achse gleiner gleich der Position des darauf folgenden Bausteins auf der X-Achse ist und
						&& aPanel[iZeile][iSpalte].isVisible())										//ob der jeweilige Baustein für den Bunuetzer des Programms sichtbar ist, wurde hier erstellt.
																									//Wenn dies der Fall ist, wird folgendes ausgefuehrt.
					{
						aPanel[iZeile][iSpalte].setVisible(false);									//Der entsprechende Baustein wird unsichtbar gemacht.
						Hauptfenster.getCpHauptfenster().repaint();									//Die Oberflaeche des Hauptfensters wird neu gezeichnet.

						if (aPanel[iZeile][iSpalte].getBackground() == Hauptfenster.HELL_BLAU)		//Wenn die Hintergrundfarbe des jeweiligen Bausteins "hellblau" betraegt, wird folgendes ausgefuehrt.
						{
							Spieler.setPunktestand(Spieler.getPunktestand() + 2000000);				//Der Punktestand des aktuellen Spielers wird um 2000000 erhoet.
						}

						if (aPanel[iZeile][iSpalte].getBackground() == Hauptfenster.GRUEN)			//Wenn die Hintergrundfarbe des jeweiligen Bausteins "gruen" betraegt, wird folgendes ausgefuehrt.
						{
							Spieler.setPunktestand(Spieler.getPunktestand() + 4000000);				//Der Punktestand des aktuellen Spielers wird um 4000000 erhoet.
						}

						if (aPanel[iZeile][iSpalte].getBackground() == Hauptfenster.GELB)			//Wenn die Hintergrundfarbe des jeweiligen Bausteins "gelb" betraegt, wird folgendes ausgefuehrt.
						{
							Spieler.setPunktestand(Spieler.getPunktestand() + 6000000);				//Der Punktestand des aktuellen Spielers wird um 6000000 erhoet.
						}

						if (aPanel[iZeile][iSpalte].getBackground() == Hauptfenster.ORANGE)			//Wenn die Hintergrundfarbe des jeweiligen Bausteins "orange" betraegt, wird folgendes ausgefuehrt.
						{
							Spieler.setPunktestand(Spieler.getPunktestand() + 8000000);				//Der Punktestand des aktuellen Spielers wird um 8000000 erhoet.
						}

						if (aPanel[iZeile][iSpalte].getBackground() == Hauptfenster.ROT)			//Wenn die Hintergrundfarbe des jeweiligen Bausteins "rot" betraegt, wird folgendes ausgefuehrt.
						{
							Spieler.setPunktestand(Spieler.getPunktestand() + 10000000);			//Der Punktestand des aktuellen Spielers wird um 10000000 erhoet.
						}

						yRichtung = yRichtung * -1;													//Die Richtung des Balls bezgl. der Y-Richtung wird geaendern.
					}
				}
			}
		}

		if (iBallPosX <= 0)											//Wenn der Ball droht links vom ueber das Spielfeld hinauszufliegen, wird folgendes ausgefuert.
		{
			xRichtung = xRichtung * -1;								//Die Richtung des Balls bezgl. der X-Richtung wird geaendern.
		}

		if (iBallPosY <= 0)											//Wenn der Ball droht oben vom ueber das Spielfeld hinauszufliegen, wird folgendes ausgefuert.
		{
			yRichtung = yRichtung * -1;								//Die Richtung des Balls bezgl. der Y-Richtung wird geaendern
		}

		if (iBallPosX >= (iSpielfeldBreite - iBallBreite))			//Wenn der Ball droht rechts vom ueber das Spielfeld hinauszufliegen, wird folgendes ausgefuert.
		{
			xRichtung = xRichtung * -1;								//Die Richtung des Balls bezgl. der X-Richtung wird geaendern.
		}

		if (iBallPosY >= (iSchlaegerPosY - iBallHoehe))				//Wenn sich der Ball ueber dem Schlaeger befindet, wird folgendes ausgefuert.
		{
			if ((iBallPosX > iSchlaegerPosX) &&						//Wenn sich die Position des Balls bzgl. der X-Achse innerhalb der Grenzen 
				(iBallPosX < (iSchlaegerPosX + (iSchlaegerBreite - iBallBreite))))	//des Benutzerpanels befinden, wird folgendes ausgefuert.
			{
				yRichtung = yRichtung * -1;							//Die Richtung des Balls bezgl. der Y-Richtung wird geaendern.
			}
		}

		if ((iBallPosY - iBallHoehe) >= iSchlaegerPosY)				//Wenn die Y-Koordinate des Balls unterhalb der Y-Koordinate des Benutzerpanels liegt, wird folgendes ausgefuert.
		{
			Spieler.setLeben(Spieler.getLeben() - 1);				//Ein "Leben" wird abgezogen.
			Hauptfenster.getHauptfenster().timerStoppen();			//Der Timer wird gestoppt.
		}

		iBallPosX = iBallPosX + xRichtung;							//Die Position des Balls bzgl. der X-Koordinate wird mit dem WErt der Variable xRichtung aufsummiert.
		iBallPosY = iBallPosY + yRichtung;							//Die Position des Balls bzgl. der Y-Koordinate wird mit dem WErt der Variable yRichtung aufsummiert.

		Hauptfenster.getBall().setLocation(iBallPosX, iBallPosY);	//Der Ball bekommt am Hauptfenster eine neue Position zugewiessen.

		try										//Folgendes Wird versucht.
		{
			Thread.sleep(5);					//Es soll 5 Millisekunden gewartet werden.
		}
		/* Funktioniert dies nicht, so wird folgender Teil ausgeführt.
		 * Im kommenden Abschnitt wird eine Exception geworfen.
		 * Eine Exception ist im Grunde genommen nichts anderes als eine Fehlermeldung, die am Bildschirm sichtbar angezeigt wird.
		 * Diese Fehlermeldung wird also auch für den Benutzer des Spiels sichtbar.*/
		catch (InterruptedException e)
		{
			e.printStackTrace(); 				//Eine Exception wird geworfen.
		}
	}
	
	/**
	 * In der Methode "<i><b>getBallX</b></i>"  wird der <i>aktuelle X-Wert</i> des <i>Ball</i>s am Hauptfenster zurueckgegeben.<br>
	 * 
	 * @return aktuelle X-Koordinate des Balls
	 */
	public static int getBallX()
	{
		return Hauptfenster.getBall().getX();		//Die X-Koordinate des Balls wird zurueckgegeben.
	}

	/**
	 * In der Methode "<i><b>getBallY</b></i>"  wird der <i>aktuelle Y-Wert</i> des <i>Ball</i>s am Hauptfenster zurueckgegeben.<br>
	 * 
	 * @return aktuelle Y-Koordinate des Balls
	 */
	public static int getBallY()
	{
		return Hauptfenster.getBall().getY();		//Die Y-Koordinate des Balls wird zurueckgegeben.
	}
}
