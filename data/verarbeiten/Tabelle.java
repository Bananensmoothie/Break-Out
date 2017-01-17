package verarbeiten;

import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import frames.Highscorefenster;

/**
 * @author Manuel Glantschnig
 * @version 1.0
 */
public class Tabelle
{
	private static final String DATEIPFAD = System.getProperty("user.dir") + "\\data\\dateien\\highscoretable.csv";
	private static Tabelle oTabelle;
	private double erzielterPunktestand = 0;
	private LogDB log;
	private ArrayList<String> tabellenEintraege;
	private ArrayList<Double> alPunkteSortiert;
	private ArrayList<Double> alPunkteUnsortiert = new ArrayList<Double>();
	private ArrayList<String> alSpielerNamen = new ArrayList<String>();

	/**
	 * 
	 */
	public Tabelle()
	{
		log = new LogDB(DATEIPFAD);
		tabellenEintraege = log.getTabellenEintraege();

		ranglisteLaden();

		oTabelle = this;
	}

	/**
	 * 
	 */
	private void ranglisteLaden()
	{
		listenBereinigen();
		eintraegeErfassen();
		fillTabelle(alSpielerNamen, alPunkteUnsortiert);
	}
	
	/**
	 * 
	 */
	private void listenBereinigen()
	{
		if (alSpielerNamen != null)
			alSpielerNamen.clear();
		if (alPunkteSortiert != null)
			alPunkteSortiert.clear();
		if (alPunkteUnsortiert != null)
			alPunkteUnsortiert.clear();
	}
	
	/**
	 * 
	 */
	private void eintraegeErfassen()
	{
		for (int i = 1; i < tabellenEintraege.size(); i += 2)
		{
			if (tabellenEintraege.get(i) != null)
				alPunkteUnsortiert.add(Double.parseDouble(tabellenEintraege.get(i)));
		}
		
		for (int i = 0; i < tabellenEintraege.size(); i += 2)
		{
			if (tabellenEintraege.get(i) != null)
				alSpielerNamen.add(tabellenEintraege.get(i));
		}
	}
	
	/**
	 * 
	 * @param spielerNamen
	 * @param punkte
	 */
	private void fillTabelle(ArrayList<String> spielerNamen, ArrayList<Double> punkte)
	{
		boolean punkteWurdenNochNichtAngezeigt = true;
		Color schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;

		if (tabellenEintraege == null)
			return;

		for (int iZeile = 1; iZeile <= 14; iZeile++)
		{
			switch (iZeile)
			{
				case 1:
					if ((punkte.get(0) == erzielterPunktestand) && punkteWurdenSchonAngezeigt)
					{
						schriftFarbe = Color.RED;
						punkteWurdenSchonAngezeigt = false;
					}
					Highscorefenster.getLblPlatz1().setText(spielerNamen.get(0));
					Highscorefenster.getLblPlatz1().setForeground(schriftFarbe);
					Highscorefenster.getLblPunktePlatz1().setText(String.format("%,.0f", punkte.get(0)));
					Highscorefenster.getLblPunktePlatz1().setForeground(schriftFarbe);
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;
					break;

				case 2:
					if ((punkte.get(1) == erzielterPunktestand) && punkteWurdenSchonAngezeigt)
					{
						schriftFarbe = Color.RED;
						punkteWurdenSchonAngezeigt = false;
					}
					Highscorefenster.getLblPlatz2().setText(spielerNamen.get(1));
					Highscorefenster.getLblPlatz2().setForeground(schriftFarbe);
					Highscorefenster.getLblPunktePlatz2().setText(String.format("%,.0f", punkte.get(1)));
					Highscorefenster.getLblPunktePlatz2().setForeground(schriftFarbe);
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;
					break;

				case 3:
					if ((punkte.get(2) == erzielterPunktestand) && punkteWurdenSchonAngezeigt)
					{
						schriftFarbe = Color.RED;
						punkteWurdenSchonAngezeigt = false;
					}
					Highscorefenster.getLblPlatz3().setText(spielerNamen.get(2));
					Highscorefenster.getLblPlatz3().setForeground(schriftFarbe);
					Highscorefenster.getLblPunktePlatz3().setText(String.format("%,.0f", punkte.get(2)));
					Highscorefenster.getLblPunktePlatz3().setForeground(schriftFarbe);
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;
					break;

				case 4:
					if ((punkte.get(3) == erzielterPunktestand) && punkteWurdenSchonAngezeigt)
					{
						schriftFarbe = Color.RED;
						punkteWurdenSchonAngezeigt = false;
					}
					Highscorefenster.getLblPlatz4().setText(spielerNamen.get(3));
					Highscorefenster.getLblPlatz4().setForeground(schriftFarbe);
					Highscorefenster.getLblPunktePlatz4().setText(String.format("%,.0f", punkte.get(3)));
					Highscorefenster.getLblPunktePlatz4().setForeground(schriftFarbe);
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;
					break;

				case 5:
					if ((punkte.get(4) == erzielterPunktestand) && punkteWurdenSchonAngezeigt)
					{
						schriftFarbe = Color.RED;
						punkteWurdenSchonAngezeigt = false;
					}
					Highscorefenster.getLblPlatz5().setText(spielerNamen.get(4));
					Highscorefenster.getLblPlatz5().setForeground(schriftFarbe);
					Highscorefenster.getLblPunktePlatz5().setText(String.format("%,.0f", punkte.get(4)));
					Highscorefenster.getLblPunktePlatz5().setForeground(schriftFarbe);
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;
					break;

				case 6:
					if ((punkte.get(5) == erzielterPunktestand) && punkteWurdenSchonAngezeigt)
					{
						schriftFarbe = Color.RED;
						punkteWurdenSchonAngezeigt = false;
					}
					Highscorefenster.getLblPlatz6().setText(spielerNamen.get(5));
					Highscorefenster.getLblPlatz6().setForeground(schriftFarbe);
					Highscorefenster.getLblPunktePlatz6().setText(String.format("%,.0f", punkte.get(5)));
					Highscorefenster.getLblPunktePlatz6().setForeground(schriftFarbe);
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;
					break;

				case 7:
					if ((punkte.get(6) == erzielterPunktestand) && punkteWurdenSchonAngezeigt)
					{
						schriftFarbe = Color.RED;
						punkteWurdenSchonAngezeigt = false;
					}
					Highscorefenster.getLblPlatz7().setText(spielerNamen.get(6));
					Highscorefenster.getLblPlatz7().setForeground(schriftFarbe);
					Highscorefenster.getLblPunktePlatz7().setText(String.format("%,.0f", punkte.get(6)));
					Highscorefenster.getLblPunktePlatz7().setForeground(schriftFarbe);
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;
					break;

				case 8:
					if ((punkte.get(7) == erzielterPunktestand) && punkteWurdenSchonAngezeigt)
					{
						schriftFarbe = Color.RED;
						punkteWurdenSchonAngezeigt = false;
					}
					Highscorefenster.getLblPlatz8().setText(spielerNamen.get(7));
					Highscorefenster.getLblPlatz8().setForeground(schriftFarbe);
					Highscorefenster.getLblPunktePlatz8().setText(String.format("%,.0f", punkte.get(7)));
					Highscorefenster.getLblPunktePlatz8().setForeground(schriftFarbe);
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;
					break;

				case 9:
					if ((punkte.get(8) == erzielterPunktestand) && punkteWurdenSchonAngezeigt)
					{
						schriftFarbe = Color.RED;
						punkteWurdenSchonAngezeigt = false;
					}
					Highscorefenster.getLblPlatz9().setText(spielerNamen.get(8));
					Highscorefenster.getLblPlatz9().setForeground(schriftFarbe);
					Highscorefenster.getLblPunktePlatz9().setText(String.format("%,.0f", punkte.get(8)));
					Highscorefenster.getLblPunktePlatz9().setForeground(schriftFarbe);
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;
					break;

				case 10:
					if ((punkte.get(9) == erzielterPunktestand) && punkteWurdenSchonAngezeigt)
					{
						schriftFarbe = Color.RED;
						punkteWurdenSchonAngezeigt = false;
					}
					Highscorefenster.getLblPlatz10().setText(spielerNamen.get(9));
					Highscorefenster.getLblPlatz10().setForeground(schriftFarbe);
					Highscorefenster.getLblPunktePlatz10().setText(String.format("%,.0f", punkte.get(9)));
					Highscorefenster.getLblPunktePlatz10().setForeground(schriftFarbe);
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;
					break;

				case 11:
					if ((punkte.get(10) == erzielterPunktestand) && punkteWurdenSchonAngezeigt)
					{
						schriftFarbe = Color.RED;
						punkteWurdenSchonAngezeigt = false;
					}
					Highscorefenster.getLblPlatz11().setText(spielerNamen.get(10));
					Highscorefenster.getLblPlatz11().setForeground(schriftFarbe);
					Highscorefenster.getLblPunktePlatz11().setText(String.format("%,.0f", punkte.get(10)));
					Highscorefenster.getLblPunktePlatz11().setForeground(schriftFarbe);
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;
					break;

				case 12:
					if ((punkte.get(11) == erzielterPunktestand) && punkteWurdenSchonAngezeigt)
					{
						schriftFarbe = Color.RED;
						punkteWurdenSchonAngezeigt = false;
					}
					Highscorefenster.getLblPlatz12().setText(spielerNamen.get(11));
					Highscorefenster.getLblPlatz12().setForeground(schriftFarbe);
					Highscorefenster.getLblPunktePlatz12().setText(String.format("%,.0f", punkte.get(11)));
					Highscorefenster.getLblPunktePlatz12().setForeground(schriftFarbe);
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;
					break;

				case 13:
					if ((punkte.get(12) == erzielterPunktestand) && punkteWurdenSchonAngezeigt)
					{
						schriftFarbe = Color.RED;
						punkteWurdenSchonAngezeigt = false;
					}
					Highscorefenster.getLblPlatz13().setText(spielerNamen.get(12));
					Highscorefenster.getLblPlatz13().setForeground(schriftFarbe);
					Highscorefenster.getLblPunktePlatz13().setText(String.format("%,.0f", punkte.get(12)));
					Highscorefenster.getLblPunktePlatz13().setForeground(schriftFarbe);
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;
					break;

				case 14:
					if ((punkte.get(13) == erzielterPunktestand) && punkteWurdenSchonAngezeigt)
					{
						schriftFarbe = Color.RED;
						punkteWurdenSchonAngezeigt = false;
					}
					Highscorefenster.getLblPlatz14().setText(spielerNamen.get(13));
					Highscorefenster.getLblPlatz14().setForeground(schriftFarbe);
					Highscorefenster.getLblPunktePlatz14().setText(String.format("%,.0f", punkte.get(13)));
					Highscorefenster.getLblPunktePlatz14().setForeground(schriftFarbe);
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;
					break;
			}
		}
	}

	/**
	 * 
	 * @param zuSortierendeFolge
	 * @return
	 */
	private ArrayList<Double> sortieren(ArrayList<Double> zuSortierendeFolge)
	{
		for (int folgenIndex = 0; folgenIndex < zuSortierendeFolge.size() - 1; folgenIndex++)
		{
			for (int vergleichIndex = folgenIndex + 1; vergleichIndex < zuSortierendeFolge.size(); vergleichIndex++)
			{
				if (zuSortierendeFolge.get(folgenIndex) < zuSortierendeFolge.get(vergleichIndex))
				{
					double einzusortierenderWert = zuSortierendeFolge.get(folgenIndex);
					String name = alSpielerNamen.get(folgenIndex);
					
					zuSortierendeFolge.set(folgenIndex, zuSortierendeFolge.get(vergleichIndex));
					alSpielerNamen.set(folgenIndex, alSpielerNamen.get(vergleichIndex));
					
					zuSortierendeFolge.set(vergleichIndex, einzusortierenderWert);
					alSpielerNamen.set(vergleichIndex, name);
				}
			}
		}
		return zuSortierendeFolge;
	}

	/**
	 * 
	 * @param name
	 * @param punkte
	 */
	public void aktuellenSpielerEintragen(String name, double punkte)
	{
		erzielterPunktestand = punkte;
		
		listenBereinigen();
		
		alPunkteUnsortiert.add(punkte);
		alSpielerNamen.add(name);
		
		eintraegeErfassen();
		
		alPunkteSortiert = sortieren(alPunkteUnsortiert);
		
		fillTabelle(alSpielerNamen, alPunkteSortiert);
	}

	/**
	 * 
	 */
	public void ranglisteSpeichern()
	{
		File highscoreCSV = new File(DATEIPFAD);

		try (FileWriter writer = new FileWriter(highscoreCSV))
		{
			String text = Highscorefenster.getLblPlatz1().getText()  + ";" + Highscorefenster.getLblPunktePlatz1().getText().replace(".", "")  + "\n"
						+ Highscorefenster.getLblPlatz2().getText()  + ";" + Highscorefenster.getLblPunktePlatz2().getText().replace(".", "")  + "\n"
						+ Highscorefenster.getLblPlatz3().getText()  + ";" + Highscorefenster.getLblPunktePlatz3().getText().replace(".", "")  + "\n"
						+ Highscorefenster.getLblPlatz4().getText()  + ";" + Highscorefenster.getLblPunktePlatz4().getText().replace(".", "")  + "\n"
						+ Highscorefenster.getLblPlatz5().getText()  + ";" + Highscorefenster.getLblPunktePlatz5().getText().replace(".", "")  + "\n"
						+ Highscorefenster.getLblPlatz6().getText()  + ";" + Highscorefenster.getLblPunktePlatz6().getText().replace(".", "")  + "\n"
						+ Highscorefenster.getLblPlatz7().getText()  + ";" + Highscorefenster.getLblPunktePlatz7().getText().replace(".", "")  + "\n"
						+ Highscorefenster.getLblPlatz8().getText()  + ";" + Highscorefenster.getLblPunktePlatz8().getText().replace(".", "")  + "\n"
						+ Highscorefenster.getLblPlatz9().getText()  + ";" + Highscorefenster.getLblPunktePlatz9().getText().replace(".", "")  + "\n"
						+ Highscorefenster.getLblPlatz10().getText() + ";" + Highscorefenster.getLblPunktePlatz10().getText().replace(".", "") + "\n"
						+ Highscorefenster.getLblPlatz11().getText() + ";" + Highscorefenster.getLblPunktePlatz11().getText().replace(".", "") + "\n"
						+ Highscorefenster.getLblPlatz12().getText() + ";" + Highscorefenster.getLblPunktePlatz12().getText().replace(".", "") + "\n"
						+ Highscorefenster.getLblPlatz13().getText() + ";" + Highscorefenster.getLblPunktePlatz13().getText().replace(".", "") + "\n"
						+ Highscorefenster.getLblPlatz14().getText() + ";" + Highscorefenster.getLblPunktePlatz14().getText().replace(".", "") + "\n"
						+ "platzhalter" 							 + ";" + "0";
			writer.write(text);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @return
	 */
	public static Tabelle getTabelle()
	{
		return oTabelle;
	}
}
