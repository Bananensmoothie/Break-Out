package verarbeiten;

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
	private ArrayList<String> tabellenEintraege;
	private LogDB log;
	private int zeile = 1;
	private double[] aPunkteSortiert;
	private double[] aPunkteUnsortiert = new double[50];

	public Tabelle()
	{
		log = new LogDB(DATEIPFAD);
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

	private double[] sortieren(double[] zuSortierendeFolge)
	{
		for (int folgenIndex = 0; folgenIndex < zuSortierendeFolge.length - 1; folgenIndex++)
		{
			for (int vergleichIndex = folgenIndex + 1; vergleichIndex < zuSortierendeFolge.length; vergleichIndex++)
			{
				if (zuSortierendeFolge[folgenIndex] < zuSortierendeFolge[vergleichIndex])
				{
					double einzusortierenderWert = zuSortierendeFolge[folgenIndex];
					zuSortierendeFolge[folgenIndex] = zuSortierendeFolge[vergleichIndex];
					zuSortierendeFolge[vergleichIndex] = einzusortierenderWert;
				}
			}
		}
		return zuSortierendeFolge;
	}

	public void aktuellenSpielerEintragen(String name, double punkte)
	{
		aPunkteUnsortiert[0] = punkte;
		for (int i = 1; i < tabellenEintraege.size(); i += 2)
		{
			if (tabellenEintraege.get(i) != null)
				aPunkteUnsortiert[i] = Double.parseDouble(tabellenEintraege.get(i));
		}
		aPunkteSortiert = sortieren(aPunkteUnsortiert);
		
		int positionsZahl = 0;
		for(int i = 0; i < aPunkteSortiert.length; i++)
		{
			if(aPunkteSortiert[i] == punkte)
			{
				positionsZahl = i;
			}
		}
		
		String hilfsspeicher;
		String erweiteterSpeicher;
		for (int z = 0; z < tabellenEintraege.size(); z = z + 2)
		{
			if (z == positionsZahl)
			{
				hilfsspeicher = tabellenEintraege.get(z);
				tabellenEintraege.add(z, name);
				erweiteterSpeicher = tabellenEintraege.get(z + 1);
				tabellenEintraege.add(z + 1, hilfsspeicher);
				hilfsspeicher = tabellenEintraege.get(z + 3);
				tabellenEintraege.add(z + 3, erweiteterSpeicher);
				erweiteterSpeicher = tabellenEintraege.get(z + 5);
				tabellenEintraege.add(z + 5, hilfsspeicher);
				hilfsspeicher = tabellenEintraege.get(z + 7);
				tabellenEintraege.add(z + 7, erweiteterSpeicher);
				erweiteterSpeicher = tabellenEintraege.get(z + 9);
				tabellenEintraege.add(z + 9, hilfsspeicher);
				hilfsspeicher = tabellenEintraege.get(z + 11);
				tabellenEintraege.add(z + 11, erweiteterSpeicher);
				erweiteterSpeicher = tabellenEintraege.get(z + 13);
				tabellenEintraege.add(z + 13, hilfsspeicher);
				hilfsspeicher = tabellenEintraege.get(z + 15);
				tabellenEintraege.add(z + 15, erweiteterSpeicher);
				erweiteterSpeicher = tabellenEintraege.get(z + 17);
				tabellenEintraege.add(z + 17, hilfsspeicher);
				hilfsspeicher = tabellenEintraege.get(z + 19);
				tabellenEintraege.add(z + 19, erweiteterSpeicher);
				erweiteterSpeicher = tabellenEintraege.get(z + 21);
				tabellenEintraege.add(z + 21, hilfsspeicher);
				hilfsspeicher = tabellenEintraege.get(z + 23);
				tabellenEintraege.add(z + 23, erweiteterSpeicher);
				erweiteterSpeicher = tabellenEintraege.get(z + 25);
				tabellenEintraege.add(z + 25, hilfsspeicher);
				hilfsspeicher = tabellenEintraege.get(z + 27);
				tabellenEintraege.add(z + 27, erweiteterSpeicher);

				System.out.println(tabellenEintraege);

				break;
			}
		}
		
		
		for (int j = 1; j <= 14; j++)
		{
			for (int i = 0; i < tabellenEintraege.size(); i += 2)
			{
				name = tabellenEintraege.get(i);

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
							Highscorefenster.getLblPunktePlatz1().setText(String.format("%,.0f", aPunkteSortiert[0]));
							Highscorefenster.getLblPunktePlatz1().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							zeile++;
							break;

						case 2:
							Highscorefenster.getLblPlatz2().setText(name);
							Highscorefenster.getLblPlatz2().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							Highscorefenster.getLblPunktePlatz2().setText(String.format("%,.0f", aPunkteSortiert[1]));
							Highscorefenster.getLblPunktePlatz2().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							zeile++;
							break;

						case 3:
							Highscorefenster.getLblPlatz3().setText(name);
							Highscorefenster.getLblPlatz3().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							Highscorefenster.getLblPunktePlatz3().setText(String.format("%,.0f", aPunkteSortiert[2]));
							Highscorefenster.getLblPunktePlatz3().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							zeile++;
							break;

						case 4:
							Highscorefenster.getLblPlatz4().setText(name);
							Highscorefenster.getLblPlatz4().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							Highscorefenster.getLblPunktePlatz4().setText(String.format("%,.0f", aPunkteSortiert[3]));
							Highscorefenster.getLblPunktePlatz4().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							zeile++;
							break;

						case 5:
							Highscorefenster.getLblPlatz5().setText(name);
							Highscorefenster.getLblPlatz5().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							Highscorefenster.getLblPunktePlatz5().setText(String.format("%,.0f", aPunkteSortiert[4]));
							Highscorefenster.getLblPunktePlatz5().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							zeile++;
							break;

						case 6:
							Highscorefenster.getLblPlatz6().setText(name);
							Highscorefenster.getLblPlatz6().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							Highscorefenster.getLblPunktePlatz6().setText(String.format("%,.0f", aPunkteSortiert[5]));
							Highscorefenster.getLblPunktePlatz6().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							zeile++;
							break;

						case 7:
							Highscorefenster.getLblPlatz7().setText(name);
							Highscorefenster.getLblPlatz7().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							Highscorefenster.getLblPunktePlatz7().setText(String.format("%,.0f", aPunkteSortiert[6]));
							Highscorefenster.getLblPunktePlatz7().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							zeile++;
							break;

						case 8:
							Highscorefenster.getLblPlatz8().setText(name);
							Highscorefenster.getLblPlatz8().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							Highscorefenster.getLblPunktePlatz8().setText(String.format("%,.0f", aPunkteSortiert[7]));
							Highscorefenster.getLblPunktePlatz8().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							zeile++;
							break;

						case 9:
							Highscorefenster.getLblPlatz9().setText(name);
							Highscorefenster.getLblPlatz9().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							Highscorefenster.getLblPunktePlatz9().setText(String.format("%,.0f", aPunkteSortiert[8]));
							Highscorefenster.getLblPunktePlatz9().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							zeile++;
							break;

						case 10:
							Highscorefenster.getLblPlatz10().setText(name);
							Highscorefenster.getLblPlatz10().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							Highscorefenster.getLblPunktePlatz10().setText(String.format("%,.0f", aPunkteSortiert[9]));
							Highscorefenster.getLblPunktePlatz10().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							zeile++;
							break;

						case 11:
							Highscorefenster.getLblPlatz11().setText(name);
							Highscorefenster.getLblPlatz11().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							Highscorefenster.getLblPunktePlatz11().setText(String.format("%,.0f", aPunkteSortiert[10]));
							Highscorefenster.getLblPunktePlatz11().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							zeile++;
							break;

						case 12:
							Highscorefenster.getLblPlatz12().setText(name);
							Highscorefenster.getLblPlatz12().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							Highscorefenster.getLblPunktePlatz12().setText(String.format("%,.0f", aPunkteSortiert[11]));
							Highscorefenster.getLblPunktePlatz12().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							zeile++;
							break;

						case 13:
							Highscorefenster.getLblPlatz13().setText(name);
							Highscorefenster.getLblPlatz13().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							Highscorefenster.getLblPunktePlatz13().setText(String.format("%,.0f", aPunkteSortiert[12]));
							Highscorefenster.getLblPunktePlatz13().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							zeile++;
							break;

						case 14:
							Highscorefenster.getLblPlatz14().setText(name);
							Highscorefenster.getLblPlatz14().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							Highscorefenster.getLblPunktePlatz14().setText(String.format("%,.0f", aPunkteSortiert[13]));
							Highscorefenster.getLblPunktePlatz14().setForeground(Highscorefenster.WEISSE_SCHRIFT);
							zeile++;
							break;
					}
				}
			}
		}
	}

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

	public static Tabelle getTabelle()
	{
		return oTabelle;
	}
}