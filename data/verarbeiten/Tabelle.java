package verarbeiten;

import java.awt.Color;
import java.util.ArrayList;

import frames.Highscorefenster;

/**
 * @author Manuel Glantschnig
 * @version 1.0
 */
public class Tabelle
{
	private static Tabelle oTabelle;
	private LogDB log;
	private ArrayList<String> tabellenEintraege;
	private ArrayList<Object> rangListe;
	
	public Tabelle()
	{
		oTabelle = this;
		tabelleLaden();
	}
	
	public void tabelleLaden()
	{
		log = new LogDB(System.getProperty("user.dir") + "\\data\\dateien\\highscoretable.csv");
		tabellenEintraege = log.getTabellenEintraege();

		test();
	}
	
	private void test()
	{
		
	}
	
	public void spielerEintragen(String name, double punkte)
	{
		Highscorefenster.getLblPlatz1().setText(name);
		Highscorefenster.getLblPlatz1().setForeground(Color.RED);
		Highscorefenster.getLblPunktePlatz1().setText("" + punkte);
		Highscorefenster.getLblPunktePlatz1().setForeground(Color.RED);
	}

	public static Tabelle getTabelle()
	{
		return oTabelle;
	}
}