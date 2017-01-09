package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import frames.Hauptfenster;
import frames.Highscorefenster;
import frames.Startfenster;
import verarbeiten.Tabelle;

/**
 * Im <i>Listener</i> <i>"<b>ButtonListener</b>"</i> werden die "<b>Knopfdruecke</b></i>" des <i>Startfensters</i><br>
 * und des <i>Highscorefensters</i> verwaltet.<br>
 * Bei diesen <i>Knopfdruecken</i> handelt es sich heirbei um die Knoepfe "<b>Spiel starten</b>", "<b>Highscoretabelle</b>" <br>
 * im Startfenster und dem Knopf " <b>Startfenster</b>" in der Highscoretabelle.<br>
 * <br>
 * Dieser Listener <i>implementiert</i> das Interface "<b>ActionListener</b>".<br>
 * 
 * @version 1.0
 * 
 * @author Thomas Mader-Ofer
 * @author Manuel Glantschnig
 * @author Jonas Hörtnagl
 * @author Cristina Erhart
 * 
 */
public class ButtonListener implements ActionListener
{
	/**
	 * Die Variable "<i><b>START_GAME</b></i>" wird auf <b>0</b> (= <i>null</i>) gesetzt.<br>
	 */
	public static final int START_GAME = 0;
	/**
	 * Die Variable "<i><b>SHOW_HIGHSCORES</b></i>" wird auf <b>1</b> gesetzt.<br>
	 */
	public static final int SHOW_HIGHSCORES = 1;
	/**
	 * Die Variable "<i><b>SHOW_STARTFENSTER</b></i>" wird auf <b>2</b> gesetzt.<br>
	 */
	public static final int SHOW_STARTFENSTER = 2;
	/**
	 * Die Variable "<i><b>taskOfButton</b></i>" wird erstellt.<br>
	 */
	private int taskOfButton;
	/**
	 * Das JFrame "<i><b>referenceFrame</b></i>" erstellt.<br>
	 */
	private JFrame referenceFrame;
	
	/**
	 * Die Methode "<i><b>ButtonListener</b></i>" <i>speichert</i> in welchem <b>Fenster</b><i> ein Knopf gedrueckt wurde</i> und <br>
	 * was der <i>Benutzer des Programms damit </i><b>erreichen</b><i> will</i>.<br>
	 * <br>
	 * Diese Methode hat <i>zwei Parameter</i>.<br>
	 * <br>
	 * 
	 * @param taskOfButton
	 * @param referenceFrame
	 */
	public ButtonListener(JFrame referenceFrame, int taskOfButton)
	{
		this.taskOfButton = taskOfButton;			//Die erwuenschte Aufgabe wird in "taskOfButton" gespeichert.
		this.referenceFrame = referenceFrame;		//Das entsprechende Fenster wird in "referenceFrame" gespeichert.
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (taskOfButton == START_GAME)				//Wenn die zu erfuellende Aufgabe das Spiel starten ist, so wird folgendes ausgefuehrt.
		{
			referenceFrame.setVisible(false);		//Das Startfenster wird unsichtbar gemacht.
			new Hauptfenster();						//Das Hauptfenster wird geoeffnet.
			referenceFrame.dispose();				//Das Startfenster wird geschlossen.
		}
		
		if (taskOfButton == SHOW_HIGHSCORES)		//Wenn die zu erfuellende Aufgabe die Highscoretabelle anzeigen ist, so wird folgendes ausgefuehrt.
		{
			referenceFrame.setVisible(false);		//Das Startfenster wird unsichtbar gemacht.
			new Highscorefenster();					//Das Highscorefenster wird geoeffnet.
			referenceFrame.dispose();				//Das Startfenster wird geschlossen.
		}
		
		if (taskOfButton == SHOW_STARTFENSTER)		//Wenn die zu erfuellende Aufgabe ins Startfenster wechseln ist, so wird folgendes ausgefuehrt.
		{
			Tabelle.getTabelle().ranglisteSpeichern();
			referenceFrame.setVisible(false);		//Das Highscorefenster wird unsichtbar gemacht
			new Startfenster();						//Das Startfenster wird geoeffnet.
			referenceFrame.dispose();				//Das Startfenster wird geschlossen.
		}
	}
}
