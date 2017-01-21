package verarbeiten;

import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import frames.Highscorefenster;

/**
 * @version 1.0
 * 
 * @author Thomas Mader-Ofer
 * @author Manuel Glantschnig
 * @author Jonas Hörtnagl
 * @author Cristina Erhart
 */
public class Tabelle
{
	private static final String DATEIPFAD = System.getProperty("user.dir") + "\\data\\dateien\\highscoretable.csv";
	private static Tabelle oTabelle;
	
	private LogDB log;
	private double erzielterPunktestand;
	private ArrayList<String> tabellenEintraege;
	private ArrayList<Double> alSpielerPunkte;
	private ArrayList<String> alSpielerNamen;

	/**
	 * 
	 */
	public Tabelle()
	{
		log = new LogDB(DATEIPFAD);
		erzielterPunktestand = 0;
		tabellenEintraege = log.getTabellenEintraege();
		alSpielerPunkte = new ArrayList<Double>();
		alSpielerNamen = new ArrayList<String>();

		eintraegeErfassen();
		ranglisteLaden();

		oTabelle = this;
	}
	
	/**
	 * 
	 */
	private void listenBereinigen()
	{
		if (alSpielerNamen != null)
			alSpielerNamen.clear();
		if (alSpielerPunkte != null)
			alSpielerPunkte.clear();
	}
	
	/**
	 * 
	 */
	private void eintraegeErfassen()
	{
		for (int i = 1; i < tabellenEintraege.size(); i += 2)
		{
			if (tabellenEintraege.get(i) != null)
				alSpielerPunkte.add(Double.parseDouble(tabellenEintraege.get(i)));
		}
		
		for (int i = 0; i < tabellenEintraege.size(); i += 2)
		{
			if (tabellenEintraege.get(i) != null)
				alSpielerNamen.add(tabellenEintraege.get(i));
		}
	}
	
	/**
	 * 
	 */
	private void ranglisteLaden()
	{
		if ((alSpielerNamen.isEmpty()) || (alSpielerPunkte.isEmpty()))
			return;
		
		boolean punkteWurdenNochNichtAngezeigt = true;
		Color schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;

		for (int iZeile = 1; iZeile <= 14; iZeile++)
		{
			switch (iZeile)
			{
				case 1:
					if ((alSpielerPunkte.get(0) == erzielterPunktestand) && punkteWurdenNochNichtAngezeigt)
					{
						schriftFarbe = Color.RED;
						punkteWurdenNochNichtAngezeigt = false;
					}
					Highscorefenster.getLblPlatz1().setText(alSpielerNamen.get(0));
					Highscorefenster.getLblPlatz1().setForeground(schriftFarbe);
					Highscorefenster.getLblPunktePlatz1().setText(String.format("%,.0f", alSpielerPunkte.get(0)));
					Highscorefenster.getLblPunktePlatz1().setForeground(schriftFarbe);
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;
					break;
					

				case 2:
					if ((alSpielerPunkte.get(1) == erzielterPunktestand) && punkteWurdenNochNichtAngezeigt)
					{
						schriftFarbe = Color.RED;
						punkteWurdenNochNichtAngezeigt = false;
					}
					Highscorefenster.getLblPlatz2().setText(alSpielerNamen.get(1));
					Highscorefenster.getLblPlatz2().setForeground(schriftFarbe);
					Highscorefenster.getLblPunktePlatz2().setText(String.format("%,.0f", alSpielerPunkte.get(1)));
					Highscorefenster.getLblPunktePlatz2().setForeground(schriftFarbe);
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;
					break;

				case 3:
					if ((alSpielerPunkte.get(2) == erzielterPunktestand) && punkteWurdenNochNichtAngezeigt)
					{
						schriftFarbe = Color.RED;
						punkteWurdenNochNichtAngezeigt = false;
					}
					Highscorefenster.getLblPlatz3().setText(alSpielerNamen.get(2));
					Highscorefenster.getLblPlatz3().setForeground(schriftFarbe);
					Highscorefenster.getLblPunktePlatz3().setText(String.format("%,.0f", alSpielerPunkte.get(2)));
					Highscorefenster.getLblPunktePlatz3().setForeground(schriftFarbe);
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;
					break;

				case 4:
					if ((alSpielerPunkte.get(3) == erzielterPunktestand) && punkteWurdenNochNichtAngezeigt)
					{
						schriftFarbe = Color.RED;
						punkteWurdenNochNichtAngezeigt = false;
					}
					Highscorefenster.getLblPlatz4().setText(alSpielerNamen.get(3));
					Highscorefenster.getLblPlatz4().setForeground(schriftFarbe);
					Highscorefenster.getLblPunktePlatz4().setText(String.format("%,.0f", alSpielerPunkte.get(3)));
					Highscorefenster.getLblPunktePlatz4().setForeground(schriftFarbe);
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;
					break;

				case 5:
					if ((alSpielerPunkte.get(4) == erzielterPunktestand) && punkteWurdenNochNichtAngezeigt)
					{
						schriftFarbe = Color.RED;
						punkteWurdenNochNichtAngezeigt = false;
					}
					Highscorefenster.getLblPlatz5().setText(alSpielerNamen.get(4));
					Highscorefenster.getLblPlatz5().setForeground(schriftFarbe);
					Highscorefenster.getLblPunktePlatz5().setText(String.format("%,.0f", alSpielerPunkte.get(4)));
					Highscorefenster.getLblPunktePlatz5().setForeground(schriftFarbe);
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;
					break;

				case 6:
					if ((alSpielerPunkte.get(5) == erzielterPunktestand) && punkteWurdenNochNichtAngezeigt)
					{
						schriftFarbe = Color.RED;
						punkteWurdenNochNichtAngezeigt = false;
					}
					Highscorefenster.getLblPlatz6().setText(alSpielerNamen.get(5));
					Highscorefenster.getLblPlatz6().setForeground(schriftFarbe);
					Highscorefenster.getLblPunktePlatz6().setText(String.format("%,.0f", alSpielerPunkte.get(5)));
					Highscorefenster.getLblPunktePlatz6().setForeground(schriftFarbe);
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;
					break;

				case 7:
					if ((alSpielerPunkte.get(6) == erzielterPunktestand) && punkteWurdenNochNichtAngezeigt)
					{
						schriftFarbe = Color.RED;
						punkteWurdenNochNichtAngezeigt = false;
					}
					Highscorefenster.getLblPlatz7().setText(alSpielerNamen.get(6));
					Highscorefenster.getLblPlatz7().setForeground(schriftFarbe);
					Highscorefenster.getLblPunktePlatz7().setText(String.format("%,.0f", alSpielerPunkte.get(6)));
					Highscorefenster.getLblPunktePlatz7().setForeground(schriftFarbe);
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;
					break;

				case 8:
					if ((alSpielerPunkte.get(7) == erzielterPunktestand) && punkteWurdenNochNichtAngezeigt)
					{
						schriftFarbe = Color.RED;
						punkteWurdenNochNichtAngezeigt = false;
					}
					Highscorefenster.getLblPlatz8().setText(alSpielerNamen.get(7));
					Highscorefenster.getLblPlatz8().setForeground(schriftFarbe);
					Highscorefenster.getLblPunktePlatz8().setText(String.format("%,.0f", alSpielerPunkte.get(7)));
					Highscorefenster.getLblPunktePlatz8().setForeground(schriftFarbe);
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;
					break;

				case 9:
					if ((alSpielerPunkte.get(8) == erzielterPunktestand) && punkteWurdenNochNichtAngezeigt)
					{
						schriftFarbe = Color.RED;
						punkteWurdenNochNichtAngezeigt = false;
					}
					Highscorefenster.getLblPlatz9().setText(alSpielerNamen.get(8));
					Highscorefenster.getLblPlatz9().setForeground(schriftFarbe);
					Highscorefenster.getLblPunktePlatz9().setText(String.format("%,.0f", alSpielerPunkte.get(8)));
					Highscorefenster.getLblPunktePlatz9().setForeground(schriftFarbe);
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;
					break;

				case 10:
					if ((alSpielerPunkte.get(9) == erzielterPunktestand) && punkteWurdenNochNichtAngezeigt)
					{
						schriftFarbe = Color.RED;
						punkteWurdenNochNichtAngezeigt = false;
					}
					Highscorefenster.getLblPlatz10().setText(alSpielerNamen.get(9));
					Highscorefenster.getLblPlatz10().setForeground(schriftFarbe);
					Highscorefenster.getLblPunktePlatz10().setText(String.format("%,.0f", alSpielerPunkte.get(9)));
					Highscorefenster.getLblPunktePlatz10().setForeground(schriftFarbe);
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;
					break;

				case 11:
					if ((alSpielerPunkte.get(10) == erzielterPunktestand) && punkteWurdenNochNichtAngezeigt)
					{
						schriftFarbe = Color.RED;
						punkteWurdenNochNichtAngezeigt = false;
					}
					Highscorefenster.getLblPlatz11().setText(alSpielerNamen.get(10));
					Highscorefenster.getLblPlatz11().setForeground(schriftFarbe);
					Highscorefenster.getLblPunktePlatz11().setText(String.format("%,.0f", alSpielerPunkte.get(10)));
					Highscorefenster.getLblPunktePlatz11().setForeground(schriftFarbe);
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;
					break;

				case 12:
					if ((alSpielerPunkte.get(11) == erzielterPunktestand) && punkteWurdenNochNichtAngezeigt)
					{
						schriftFarbe = Color.RED;
						punkteWurdenNochNichtAngezeigt = false;
					}
					Highscorefenster.getLblPlatz12().setText(alSpielerNamen.get(11));
					Highscorefenster.getLblPlatz12().setForeground(schriftFarbe);
					Highscorefenster.getLblPunktePlatz12().setText(String.format("%,.0f", alSpielerPunkte.get(11)));
					Highscorefenster.getLblPunktePlatz12().setForeground(schriftFarbe);
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;
					break;

				case 13:
					if ((alSpielerPunkte.get(12) == erzielterPunktestand) && punkteWurdenNochNichtAngezeigt)
					{
						schriftFarbe = Color.RED;
						punkteWurdenNochNichtAngezeigt = false;
					}
					Highscorefenster.getLblPlatz13().setText(alSpielerNamen.get(12));
					Highscorefenster.getLblPlatz13().setForeground(schriftFarbe);
					Highscorefenster.getLblPunktePlatz13().setText(String.format("%,.0f", alSpielerPunkte.get(12)));
					Highscorefenster.getLblPunktePlatz13().setForeground(schriftFarbe);
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;
					break;

				case 14:
					if ((alSpielerPunkte.get(13) == erzielterPunktestand) && punkteWurdenNochNichtAngezeigt)
					{
						schriftFarbe = Color.RED;
						punkteWurdenNochNichtAngezeigt = false;
					}
					Highscorefenster.getLblPlatz14().setText(alSpielerNamen.get(13));
					Highscorefenster.getLblPlatz14().setForeground(schriftFarbe);
					Highscorefenster.getLblPunktePlatz14().setText(String.format("%,.0f", alSpielerPunkte.get(13)));
					Highscorefenster.getLblPunktePlatz14().setForeground(schriftFarbe);
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;
					break;
			}
		}
	}

	/**
	 * 
	 */
	private void sortTabelle()
	{
		for (int folgenIndex = 0; folgenIndex < alSpielerPunkte.size() - 1; folgenIndex++)
		{
			for (int vergleichIndex = folgenIndex + 1; vergleichIndex < alSpielerPunkte.size(); vergleichIndex++)
			{
				if (alSpielerPunkte.get(folgenIndex) < alSpielerPunkte.get(vergleichIndex))
				{
					double einzusortierenderWert = alSpielerPunkte.get(folgenIndex);
					String name = alSpielerNamen.get(folgenIndex);
					
					alSpielerPunkte.set(folgenIndex, alSpielerPunkte.get(vergleichIndex));
					alSpielerNamen.set(folgenIndex, alSpielerNamen.get(vergleichIndex));
					
					alSpielerPunkte.set(vergleichIndex, einzusortierenderWert);
					alSpielerNamen.set(vergleichIndex, name);
				}
			}
		}
	}

	/**
	 * 
	 * @param name der einzutragende Spielername
	 * @param punkte die erzielten Punkte
	 */
	public void aktuellenSpielerEintragen(String name, double punkte)
	{
		erzielterPunktestand = punkte;
		
		listenBereinigen();
		
		alSpielerPunkte.add(punkte);
		alSpielerNamen.add(name);
		
		eintraegeErfassen();
		sortTabelle();
		ranglisteLaden();
	}

	/**
	 * 
	 */
	public void ranglisteSpeichern()
	{
		if ((alSpielerNamen.isEmpty()) || (alSpielerPunkte.isEmpty()))
			return;
		
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
	 * @return ein Objekt der Klasse "Tabelle"
	 */
	public static Tabelle getTabelle()
	{
		return oTabelle;
	}
}