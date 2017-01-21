package verarbeiten;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Diese Klasse namens <b>Tools liest</b> mithilfe eines sog. BufferedReader eine <b>csv-Datei ein</b>.<br>
 * Diese <i>csv-Datei</i> wird anschließend der <i>Klasse</i> <b>"LogDB"</b> zur <i>Weiterverarbeitung</i> <b>übergeben</b>.
 * 
 * @version 1.0
 * 
 * @author Thomas Mader-Ofer
 * @author Manuel Glantschnig
 * @author Jonas Hörtnagl
 * @author Cristina Erhart
 */
public final class Tools
{
	/**
	 * In der nachstehenden Methode namens <b>readLogCSV</b> wird die für die Highscore-Tabelle<br>
	 * relevante <b>csv-Datei eingelesen</b> und <b>für</b> die <b>weitere Verarbeitung vorbereitet</b>.
	 * 
	 * @param dateiPfad
	 * In der Variable <i>"dateiPfad"</i> ist die <b>"csv-Datei"</b> gespeichert.
	 * 
	 * @return <b>log</b> - 
	 * In der Variable <i>"log</i> ist die <b>verarbeitete csv-Datei</b> gespeichert.
	 */
	public static ArrayList<String> readLogCSV(String dateiPfad)
	{
		/*Die ArrayList "log" (vom Datentyp "String") wird erstellt.*/
		ArrayList<String> log = new ArrayList<String>();
		
		/* Im folgenden Abschnitt wird ein sogenannter "BufferedReader" mit dem Namen "reader" erzeugt.
		 * Dieser Reader liest die "csv-Datei" ein und verarbeitet diese so, dass man mit dieser Datei
		 * weitere Maßnahmen ergreifen kann.*/
		try (BufferedReader reader = new BufferedReader(new FileReader(dateiPfad)))
		{
			/* Eine Variable namens "zeile" (vom Datentyp "String") wird erstellt.
			 * In dieser Variable ist der Wert "null" gespeichert.*/
			String zeile = null;
			
			/* Die eingelesene Datei wird in der Variable "zeile" gespeichert.
			 * Solange "zeile" nicht den Wert "null" hat, wird "zeile" in der ArrayList "log" gespeichert. 
			 * Also immer, wenn sich etwas neues in der eingelesenen Datei befindet, wird dieser "Teil" der
			 * ArrayList "log" hizugefügt.*/
			while ((zeile = reader.readLine()) != null)
			{
				/* Der ArrayList "log" wird der Wert der Variable "zeile" hinzugefügt.*/
				log.add(zeile);
			}
		}
		/* Funktioniert dies nicht, so wird folgender Teil ausgeführt.
		 * Im kommenden Abschnitt wird eine Exception geworfen.
		 * Eine Exception ist im Grunde genommen nichts anderes als eine Fehlermeldung,
		 * die am Bildschirm sichtbar angezeigt wird.
		 * Diese Fehlermeldung wird also auch für den Benutzer des Spiels sichtbar.*/
		catch (IOException exception)
		{
			/* Eine Exception wird geworfen bzw. angezeigt.*/
			exception.printStackTrace();
		}
		
		/* Die ArrayList "log" wird zurückgegeben.*/
		return log;
	}
}