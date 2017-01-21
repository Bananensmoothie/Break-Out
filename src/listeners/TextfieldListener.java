package listeners;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import frames.Startfenster;
import spieler.Spieler;

/**
 * Im <i>Listener</i> <i>"<b>TextfieldListener</b>"</i> wird der <i>eingegebene</i> <b>Spielername</b> des Benuetzer des Spiels <i>gespeichert</i> und <br>
 * an das <b>Hauptfenster</b> und das <b>Highscorefenster</b> <i>geschickt</i>, um diesen dort anzuzeigen.<br>
 * <br>
 * Dieser Listener <i>erbt</i> von der Klasse <b>KeyAdapter</b> und <i>implementiert</i> das Interface "<b>FocusListener</b>".
 * 
 * @version 1.0
 * 
 * @author Thomas Mader-Ofer
 * @author Manuel Glantschnig
 * @author Jonas Hörtnagl
 * @author Cristina Erhart
 * 
 */
public final class TextfieldListener extends KeyAdapter implements FocusListener
{
	/**
	 * Die Variable "<i><b>hinweisTextfieldText</b></i> wurde erstellt.<br>
	 */
	private static String hinweisTextfieldText;
	/**
	 * Die Variable "<i><b>maxZeichenLaenge</b></i> wurde auf den Wert <b>22</b> gesetzt.<br>
	 */
	private int maxZeichenLaenge = 22;
	/**
	 * Das JFrame "<i><b>referenceFrame</b></i> wurde erstellt.<br>
	 */
	private JFrame referenceFrame;
	/**
	 * Das JTextField "<i><b>referenceTextFrame</b></i> wurde erstellt.<br>
	 */
	private JTextField referenceTextField;
	
	/**
	 * Der Konstruktor "<i><b>TextFieldListener</b></i>" <i>speichert</i> den eingegebenen <b>Spielernamen</b> und <i>ersetzt</i> somit den <b>Standardwert</b> <i>null</i>.<br>
	 * <br>
	 * Dieser Konstruktor hat <i>zwei Parameter</i>.
	 * 
	 * @param frame Das <b>JFrame</b>, welches mit dem TextfieldListener "ausgestattet" wird.
	 * @param textField Das <b>JTextField</b>, welches mit dem TextfieldListener "ausgestattet" wird.
	 */
	public TextfieldListener(JFrame frame, JTextField textField)
	{
		referenceFrame = frame;										//Das Fenster in dem der Spielername einegegeben wurde wird gespeichert.
		referenceTextField = textField;								//Das Textfeld in dem der Spielername einegegeben wurde wird gespeichert.
		
		if (referenceTextField.getText().isEmpty())					//Wenn nichts im Textfeld steht, so soll folgendes ausgefuehrt werden.
		{
			hinweisTextfieldText = null;							//Es soll nichts in "hinweisTextfieldText gespeichert werden.
		}
		else														//Ansonsten soll folgendes ausgefuehrt werden.
		{
			hinweisTextfieldText = referenceTextField.getText();	//Der eingegebene Spielername soll gespeichert werden.
		}
	}
	
	/**
	 * Die <b>keyPressed-Methode</b> fängt alle <b>Tastendrücke</b>, die bei der <i>Eingabe des Benutzernamens betätigt werden</i>, ab und <b>ergreift entsprechende Maßnahmen</b>.<br>
	 * <br>
	 * Solche Maßnahmen wären zum Beispiel, wenn das <i>Textfeld leer</i> bleibt wird ein <i>Fehler</i> ausgegeben oder<br>
	 * wenn ein <i>Leerzeichen eingegeben</i> wurde wird eine <i>Fehlermeldung</i> ausgegeben.
	 * 
	 * @param keyEvent Die Variable "<b>keyEvent</b>" speichert die <b>bereits gedrückten Tastendrücke</b>.
	 */
	@Override
	public void keyPressed(KeyEvent keyEvent)
	{
		if (keyEvent.getKeyCode() == KeyEvent.VK_ENTER)																					//Wenn die Taste "ENTER" gedrueckt wird, soll folgendes ausgefuehrt werden.
		{
			if (referenceTextField.getText().isEmpty())																					//Wenn im entsprechendem Textfeld nichts steht soll folgendes ausgefuehrt werden.
			{
				JOptionPane.showMessageDialog(referenceFrame, "Bitte geben Sie einen g\u00FCltigen Spielernamen ein\u0021\n"			//Ein Hinweistext wird ausgegeben.
															+ "Der Spielername darf nur Buchstaben und Zahlen enthalten\u002E",
															  "Ung\u00FCltiger Name", JOptionPane.ERROR_MESSAGE);
				referenceTextField.setText(null);																						//Falls im Textfeld nun etwas stehen sollte, wird dies geloescht.
				return;
			}
			
			if (referenceTextField.getText().contains(" ") && (referenceTextField.getText().length() < maxZeichenLaenge))				//Wenn der Spielername Leerzeichen beinhaltet, wird folgendes ausgefuehrt.
			{
				JOptionPane.showMessageDialog(referenceFrame, "Bitte geben Sie einen Spielernamen ohne Leerzeichen ein\u0021\n"			//Ein Hinweistext wird ausgegeben.
															+ "Der Spielername darf keine Leerzeichen enthalten\u002E",
															  "Ung\u00FCltiger Name", JOptionPane.ERROR_MESSAGE);
				referenceTextField.setText(null);																						//Falls im Textfeld nun etwas stehen sollte, wird dies geloescht.	
				return;
			}
			
			if (referenceTextField.getText().length() > maxZeichenLaenge)																//Falls der Spielername mehr als 20 Zeichen beinhaltet, so wird folgendes ausgefuehrt.
			{
				JOptionPane.showMessageDialog(referenceFrame, "Bitte geben Sie einen k\u00FCrzeren Spielernamen ein\u0021\n"			//Ein Hinweistext wird ausgegeben.
															+ "Der Spielername darf maximal " + maxZeichenLaenge + " Zeichen lang sein\u002E",
															  "Zu langer Name", JOptionPane.WARNING_MESSAGE);
				referenceTextField.setText(null);																						//Falls im Textfeld nun etwas stehen sollte, wird dies geloescht.
				return;
			}
			
			if (!referenceTextField.getText().matches("[a-zA-Z[0-9]]+") && (referenceTextField.getText().length() < maxZeichenLaenge))	//Wenn der Spielername irgendwelche Sonderzeichen beinhaltet, wird folgebndes ausgegeben.
			{
				JOptionPane.showMessageDialog(referenceFrame, "Bitte geben Sie einen Spielernamen ohne Sonderzeichen ein\u0021\n"		//Ein Hinweistext wird ausgegben.
															+ "Der Spielername darf keine Sonderzeichen enthalten\u002E",
															  "Ung\u00FCltiger Name", JOptionPane.ERROR_MESSAGE);
				referenceTextField.setText(null);																						//Falls im Textfeld nun etwas stehen sollte, wird dies geloescht.
				return;
			}
			
			if (referenceTextField.getText().matches("[a-zA-Z[0-9]]+"))																	//Falls alle Bedingungen erfuellt sind, wird folgendes ausgefuehrt.
			{
				hinweisTextfieldText = referenceTextField.getText();																	//Der eingegebene Spielername, wird in der Variable "hinweisTextfieldText" gespeichert.
				Spieler.setSpielername(referenceTextField.getText());																	//Der Spielername wird gespeichert.
				Startfenster.getTxtSpielername().setText(hinweisTextfieldText);
				Startfenster.getTxtSpielername().setEnabled(false);																		//Den Spielrnamen kann man nun nicht mehr aendern.
				Startfenster.getBtnSpielStarten().setEnabled(true);																		//Der Button Spielstarten wird nun anwaehlbar.
			}
		}
	}

	/**
	 * Die <b>focusGained-Methode</b> wird aufgerufen, wenn das Spielernamenfeld im Fokus steht.
	 * 
	 * @param feEvent Die Variable <i>feEvent</i> ermittelt ob der <b>Fokus auf dem Spielernamenfeld</b> liegt.
	 */
	@Override
	public void focusGained(FocusEvent feEvent)
	{
		Startfenster.getTxtSpielername().setText(null);
	}

	/**
	 * Die <b>focusLost-Methode</b> wird aufgerufen, wenn das Spielernamenfeld nicht mehr im Fokus steht.
	 * 
	 * @param feEvent Die Variable <i>feEvent</i> ermittelt ob der <b>Fokus auf dem Spielernamenfeld</b> liegt.
	 */
	@Override
	public void focusLost(FocusEvent feEvent)
	{
		Startfenster.getTxtSpielername().setText(hinweisTextfieldText);
	}
}