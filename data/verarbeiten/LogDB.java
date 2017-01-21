package verarbeiten;

import java.util.ArrayList;

/**
 * Diese Klasse namens <b>LogDB verarbeitet</b> die <b>Datei</b> der <i>"Tools-Klasse"</i>.<br>
 * Diese <i>Datei</i> wird nun in <b>15 Zeilen aufgesplittet</b> und in <i>einer ArrayList gespeichert</i>.
 *
 * @version 1.0
 * 
 * @author Thomas Mader-Ofer
 * @author Manuel Glantschnig
 * @author Jonas Hörtnagl
 * @author Cristina Erhart
 */
public final class LogDB
{
	/**Eine ArrayList von Datentyp "String" mit dem Namen <b>"tabellenEintraege"</b> wird <b>erstellt</b>.*/
	private ArrayList<String> tabellenEintraege = new ArrayList<String>();
	
	/**
	 * Im Konstruktor wird die Methode <b>"splitEintraege" aufgerufen</b>.
	 * 
	 * @param dateiPfad
	 * In der Variable <i>"dateiPfad"</i> ist die <b>"csv-Datei"</b> der Toolsklasse <b>gespeichert</b>.
	 */
	public LogDB(String dateiPfad)
	{
		splitEintraege(dateiPfad);
	}
	
	/**
	 * Hier wird die <b>Datei der "Tools-Klasse"</b> in einer <b>ArrayList gespeichert</b>.
	 * Diese Datei wird <b>aufgespalten</b>, sobald sich ein <i>";" innerhalb der Textdatei</i> befindet.
	 * 
	 * @param dateiPfad
	 * In der Variable <i>"dateiPfad"</i> ist die <b>"csv-Datei"</b> der Toolsklasse <b>gespeichert</b>.
	 */
	private void splitEintraege(String dateiPfad)
	{
		/*Die für die Highscore-Tabelle relevante Datei (von der "Tools-Klasse") wird in der zuvor erstellten ArrayList gespeichert.*/
		ArrayList<String> log = Tools.readLogCSV(dateiPfad);
		
		/*Diese Arraylist wird nun in der Variable "zeile" gespeichert.*/
		for (String zeile : log)
		{
			/*Immer, wenn sich ein ";" in einer Zeile befindet wird dieser Teil gesplittet.
			 *Diese aufgespaltenen Zeilen werden anschließend in dem Array "teile" gespeichert.*/
			String[] teile = zeile.split(";");
			
			/* Immer, wenn die Länge der Zeile kleiner als die Variable "i" ist, wird folgendes ausgeführt.
			 * Die Variable "i" erhöht sich jedes Mal um 1.
			 * "i" hat als Startwert 0.*/
			for (int i = 0; i < teile.length; i++)
			{
				/*Der ArrayIist "tabellenEintraege" wird das Array "teile" hinzugefügt.*/
				tabellenEintraege.add(teile[i]);
			}
		}
	}

	/**
	 * In der folgenden Methode wird die <b>ArrayList "tabellenEintraege" zurückgegeben</b>.
	 * 
	 * @return <b>tabellenEintraege</b> - 
	 * In der ArrayList <i>"tabellenEintraege"</i> ist das Array <i>"teile" gespeichert</i>.
	 */
	public ArrayList<String> getTabellenEintraege()
	{
		/*Die ArrayList "tabellenEintraege" wird zurückgegeben.*/
		return tabellenEintraege;
	}
}