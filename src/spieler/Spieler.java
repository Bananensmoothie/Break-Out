package spieler;

import frames.Hauptfenster;
import frames.Highscorefenster;
import verarbeiten.Tabelle;

/**
 * In der<i>"<b>Spieler</b>" - Klasse </i> werden die <b>Leben</b>, der <b>Punktestand</b> und der <b>Spielername</b> <i>verwaltet</i><br>
 * und die <i>entsprechenden</i> <i>Massnahmen zur </i><b>Weiterverarbeitung</b> <i>ergriffen</i>.<br>
 * 
 * @version 1.0
 * 
 * @author Thomas Mader-Ofer
 * @author Manuel Glantschnig
 * @author Jonas Hörtnagl
 * @author Cristina Erhart
 * 
 */
public final class Spieler
{
	/**
	 * Die Variable "<i><b>leben</b></i>" wurde der <i>Wert</i> <b>3</b> zugewiessen.<br>
	 */
	private static int leben = 3;
	/**
	 * Die Variable "<i><b>punktestand</b></i>" wurde der <i>Wert</i> <b>0</b> zugewiessen.<br>
	 */
	private static double punktestand = 0;
	/**
	 * Die Variable "<i><b>spielername</b></i>" wurde erstellt.<br>
	 */
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
			Hauptfenster.updateSpielstandLabelText();
			Hauptfenster.getHauptfenster().setVisible(false);
			new Highscorefenster();
			Tabelle.getTabelle().aktuellenSpielerEintragen(getSpielername(), getPunktestand());
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
		if(punktestand >= 300000000000L)
		{
			Hauptfenster.updateSpielstandLabelText();
			Hauptfenster.getHauptfenster().setVisible(false);
			new Highscorefenster();
			Tabelle.getTabelle().aktuellenSpielerEintragen(getSpielername(), 300000000000L);
			Hauptfenster.getHauptfenster().timerStoppen();
			Hauptfenster.getHauptfenster().dispose();
		}
		else
		{
			Spieler.punktestand = punktestand;
			Hauptfenster.updateSpielstandLabelText();
		}
	}
}