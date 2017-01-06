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
	private ArrayList<String> tabellenEintraege;
	private LogDB log;
	private int zeile = 1;

	public Tabelle()
	{
		log = new LogDB(System.getProperty("user.dir") + "\\data\\dateien\\highscoretable.csv");
		tabellenEintraege = log.getTabellenEintraege();

		ranglisteLaden();
		
		oTabelle = this;
	}

	private void ranglisteLaden()
	{
		String name;
		double punkte;

		for (int j = 1; j <= 14; j++)
		{
			for (int i = 0; i < tabellenEintraege.size(); i += 2)
			{
				name = tabellenEintraege.get(i);
				punkte = Double.parseDouble(tabellenEintraege.get(i + 1));

				if (tabellenEintraege.get(i) == null)
					break;
				
				if (zeile > 14)
					zeile = 1;

				else
				{
					switch (zeile)
					{
						case 1:
							Highscorefenster.getLblPlatz1().setText(name);
							Highscorefenster.getLblPlatz1().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							Highscorefenster.getLblPunktePlatz1().setText(String.format("%,.0f", punkte));
							Highscorefenster.getLblPunktePlatz1().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							zeile++;
							break;

						case 2:
							Highscorefenster.getLblPlatz2().setText(name);
							Highscorefenster.getLblPlatz2().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							Highscorefenster.getLblPunktePlatz2().setText(String.format("%,.0f", punkte));
							Highscorefenster.getLblPunktePlatz2().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							zeile++;
							break;

						case 3:
							Highscorefenster.getLblPlatz3().setText(name);
							Highscorefenster.getLblPlatz3().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							Highscorefenster.getLblPunktePlatz3().setText(String.format("%,.0f", punkte));
							Highscorefenster.getLblPunktePlatz3().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							zeile++;
							break;

						case 4:
							Highscorefenster.getLblPlatz4().setText(name);
							Highscorefenster.getLblPlatz4().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							Highscorefenster.getLblPunktePlatz4().setText(String.format("%,.0f", punkte));
							Highscorefenster.getLblPunktePlatz4().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							zeile++;
							break;

						case 5:
							Highscorefenster.getLblPlatz5().setText(name);
							Highscorefenster.getLblPlatz5().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							Highscorefenster.getLblPunktePlatz5().setText(String.format("%,.0f", punkte));
							Highscorefenster.getLblPunktePlatz5().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							zeile++;
							break;

						case 6:
							Highscorefenster.getLblPlatz6().setText(name);
							Highscorefenster.getLblPlatz6().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							Highscorefenster.getLblPunktePlatz6().setText(String.format("%,.0f", punkte));
							Highscorefenster.getLblPunktePlatz6().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							zeile++;
							break;

						case 7:
							Highscorefenster.getLblPlatz7().setText(name);
							Highscorefenster.getLblPlatz7().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							Highscorefenster.getLblPunktePlatz7().setText(String.format("%,.0f", punkte));
							Highscorefenster.getLblPunktePlatz7().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							zeile++;
							break;

						case 8:
							Highscorefenster.getLblPlatz8().setText(name);
							Highscorefenster.getLblPlatz8().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							Highscorefenster.getLblPunktePlatz8().setText(String.format("%,.0f", punkte));
							Highscorefenster.getLblPunktePlatz8().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							zeile++;
							break;

						case 9:
							Highscorefenster.getLblPlatz9().setText(name);
							Highscorefenster.getLblPlatz9().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							Highscorefenster.getLblPunktePlatz9().setText(String.format("%,.0f", punkte));
							Highscorefenster.getLblPunktePlatz9().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							zeile++;
							break;

						case 10:
							Highscorefenster.getLblPlatz10().setText(name);
							Highscorefenster.getLblPlatz10().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							Highscorefenster.getLblPunktePlatz10().setText(String.format("%,.0f", punkte));
							Highscorefenster.getLblPunktePlatz10().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							zeile++;
							break;

						case 11:
							Highscorefenster.getLblPlatz11().setText(name);
							Highscorefenster.getLblPlatz11().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							Highscorefenster.getLblPunktePlatz11().setText(String.format("%,.0f", punkte));
							Highscorefenster.getLblPunktePlatz11().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							zeile++;
							break;

						case 12:
							Highscorefenster.getLblPlatz12().setText(name);
							Highscorefenster.getLblPlatz12().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							Highscorefenster.getLblPunktePlatz12().setText(String.format("%,.0f", punkte));
							Highscorefenster.getLblPunktePlatz12().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							zeile++;
							break;

						case 13:
							Highscorefenster.getLblPlatz13().setText(name);
							Highscorefenster.getLblPlatz13().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							Highscorefenster.getLblPunktePlatz13().setText(String.format("%,.0f", punkte));
							Highscorefenster.getLblPunktePlatz13().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							zeile++;
							break;

						case 14:
							Highscorefenster.getLblPlatz14().setText(name);
							Highscorefenster.getLblPlatz14().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							Highscorefenster.getLblPunktePlatz14().setText(String.format("%,.0f", punkte));
							Highscorefenster.getLblPunktePlatz14().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							zeile++;
							break;
					}
				}
			}
		}
	}

	public void aktuellenSpielerEintragen(String name, double punkte)
	{
		zeile++;
		Highscorefenster.getLblPlatz1().setText(name);
		Highscorefenster.getLblPlatz1().setForeground(Color.RED);
		Highscorefenster.getLblPunktePlatz1().setText(String.format("%,.0f", punkte));
		Highscorefenster.getLblPunktePlatz1().setForeground(Color.RED);
	}
	
	public void ranglisteSpeichern()
	{
		
	}

	public static Tabelle getTabelle()
	{
		return oTabelle;
	}
}