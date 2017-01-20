package listeners;

import java.awt.Component;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import frames.Hauptfenster;
import frames.Highscorefenster;
import verarbeiten.Tabelle;

/**
 * Im <i>Listener</i> <i>"<b>WindowListener</b>"</i> werden die <i>Standart<b>werte</b></i> fuer die jeweiligen <b>Fenster</b> getroffen.<br>
 * Diese <i>Werte</i> beinhalten zum Beispiel <b>Groesse</b> <i>der Fenster</i>, <b>Warnungen</b>, <b>Bedingungen</b> <i>zum Fensterschliessen...</i><br>
 * <br>
 * Dieser Listener <i>erbt</i> von der Klasse <b>WindowAdapater</b>.<br>
 * 
 * @version 1.0
 * 
 * @author Thomas Mader-Ofer
 * @author Manuel Glantschnig
 * @author Jonas H�rtnagl
 * @author Cristina Erhart
 * 
 */
public class WindowListener extends WindowAdapter
{
	/**
	 * Das JFrame "<i><b>referenceFrame</b>wurde erstellt.<br>
	 */
	private JFrame referenceFrame;
	/**
	 * Der Konstruktor "<i><b>WindowListener</b></i> sagt, dass man mit dem <i>Button</i> <b>rechts oben</b> <br>
	 * (<i>das rote "X" zum Schliessen des Fensters</i>) das entsprechende <i>Fenster</i> <b>nicht schliessen</b> <i>kann</i>.<br>
	 * <br>
	 * Dieser <i>Konstruktor</i> hat <b>einen Parameter</b>.<br>
	 * 
	 * @param frame
	 */
	public WindowListener(JFrame frame)
	{
		referenceFrame = frame;														//Das entsprechende Fenster, in dem man sich als Benutzer gerade befindet, wird in "referenceFrame" gespeichert.
		referenceFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);		//Wenn dieser rote Button gedrueckt wird, passiert nichts.
	}
	
	@Override
	public void windowClosing(WindowEvent weEvent)
	{
		Component parentComponent = referenceFrame;
		String warning = "M\u00F6chten Sie das Spiel wirklich beenden\u003F";		//Eine Warnung wird angezeigt.
		String titel = "Spiel beenden\u003F";										//Der Titel der Warnung lautet "Spiel beenden".
		int optionType = JOptionPane.YES_NO_OPTION;									//Der Benutzer des Programms kann zwischen Moeglichkeiten waehlen.
		int messageType = JOptionPane.QUESTION_MESSAGE;
		Object[] optionen = { "Beenden", "Abbrechen" };								//Der Benutzer des Programms kann zwischen "Beenden" und "Abbrechen" waehlen.
		
		if (referenceFrame instanceof Hauptfenster)									//Wenn man das Spiel vom Hauptfenster aus schliessen will, wird folgendes ausgefuehrt.
		{
			warning += "\n\nDadurch geht Ihr gesamter Spielfortschritt verloren\u0021";	//Es wird zusaetzlich zur Warnung ein Hinweistext angezeigt.
		}
		
		if (referenceFrame instanceof Highscorefenster)								//Wenn man das Spiel vom Highscorefenster aus schliessen will, wird folgendes ausgefuehrt.
		{
			Tabelle.getTabelle().ranglisteSpeichern();								//Die Rangliste wird gespeichert.
		}
		
		int optionPane = JOptionPane.showOptionDialog(parentComponent, warning, titel, optionType, messageType, null, optionen, optionen[0]);
		
		if (optionPane == JOptionPane.YES_OPTION)									//Wenn der Benutzer des Programms "Beenden" klickt, wird folgendes ausgefuehrt.
		{
			System.exit(0);															//Das Spiel wird beendet.
		}
		else																		//Ansonsten wird folgendes ausgefuehrt.
		{
			return;																	//Die Warnung schliesst sich und man kann ganz normal weiterspielen.
		}
	}
}