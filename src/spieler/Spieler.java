package spieler;

import frames.Hauptfenster;
import frames.Highscorefenster;
import verarbeiten.Tabelle;

/**
 * @author Manuel Glantschnig
 * @version 1.0
 */
public final class Spieler
{
	private static int leben = 3;
	private static double punktestand = 0;
	private static String spielername;

	public static String getSpielername()
	{
		return spielername;
	}

	public static void setSpielername(String spielername)
	{
		Spieler.spielername = spielername;
	}
	
	/**
	 * @return the leben
	 */
	public static int getLeben()
	{
		return leben;
	}
	
	/**
	 * @return the punktestand
	 */
	public static double getPunktestand()
	{
		return punktestand;
	}
	
	/**
	 * @param leben the leben to set
	 */
	public static void setLeben(int leben)
	{
		if (leben <= 0)
		{
			Hauptfenster.getHauptfenster().setVisible(false);
			new Highscorefenster();
			Tabelle.getTabelle().spielerEintragen(getSpielername(), getPunktestand());
			Hauptfenster.getHauptfenster().timerStoppen();
			Hauptfenster.getHauptfenster().dispose();
		}
		if (leben >= 3)
		{
			Spieler.leben = 3;
			Hauptfenster.updateSpielstandLabelText();
		}
		else
		{
			Spieler.leben = leben;
			Hauptfenster.updateSpielstandLabelText();
		}
	}
	
	/**
	 * @param punktestand the punktestand to set
	 */
	public static void setPunktestand(double punktestand)
	{
		if (punktestand <= 0)
		{
			Spieler.punktestand = 0;
			Hauptfenster.updateSpielstandLabelText();
		}
		else
		{
			Spieler.punktestand = punktestand;
			Hauptfenster.updateSpielstandLabelText();
		}
	}
}