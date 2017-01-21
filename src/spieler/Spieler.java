package spieler;

import frames.Hauptfenster;
import frames.Highscorefenster;
import verarbeiten.Tabelle;

/**
 * In der<i>"<b>Spieler</b>" - Klasse </i> werden die <b>Leben</b>, der <b>Punktestand</b> und der <b>Spielername</b> <i>verwaltet</i><br>
 * und die <i>entsprechenden</i> <i>Massnahmen zur </i><b>Weiterverarbeitung</b> <i>ergriffen</i>.
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
	 * Die Variable "<i><b>leben</b></i>" wurde der <i>Wert</i> <b>3</b> zugewiessen.
	 */
	private static int leben = 3;
	/**
	 * Die Variable "<i><b>punktestand</b></i>" wurde der <i>Wert</i> <b>0</b> zugewiessen.
	 */
	private static double punktestand = 0;
	/**
	 * Die Variable "<i><b>spielername</b></i>" wurde erstellt.
	 */
	private static String spielername;

	/**
	 * Die <i>Getter-Methode</i> für den <b>Spielername</b> gibt die Variable <i>spielername</i> zurück.<br>
	 * 
	 * @return <b>spielername</b> - Die Variable <i>spielername</i> <b>beinhaltet</b> den <b>vom Benutzer festgelegten Spielernamen</b>.
	 */
	public static String getSpielername()
	{
		return spielername;
	}

	/**
	 * Die <i>Setter-Methode</i> für den <b>Spielername</b> setzt den <b>spielername</b> auf den vom Benutzer gewünschten Namen.
	 * 
	 * @param spielername Die Variable <i>spielername</i> <b>beinhaltet</b> den <b>vom Benutzer festgelegten Spielernamen</b>.
	 */
	public static void setSpielername(String spielername)
	{
		Spieler.spielername = spielername;
	}
	
	/**
	 * Die <i>Getter-Methode</i> für die <b>Leben des Spielers</b> gibt die Variable <i>leben</i> zurück.<br>
	 * 
	 * @return <b>leben</b> - Die Variable <i>leben</i> <b>beinhaltet</b> die <b>aktuelle Anzahl der Leben</b> des Spielers.
	 */
	public static int getLeben()
	{
		return leben;
	}
	
	/**
	 * Die <i>Setter-Methode</i> für die <b>Leben des Spielers</b> setzt die <b>leben</b> auf den gewünschten Wert.
	 * 
	 * @param leben Die Variable <i>leben</i> <b>beinhaltet</b> die <b>aktuelle Anzahl der Leben</b> des Spielers.
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
	 * Die <i>Getter-Methode</i> für den <b>Punktestand des Spielers</b> gibt die Variable <i>punktestand</i> zurück.<br>
	 * 
	 * @return <b>punktestand</b> - Die Variable <i>punktestand</i> <b>beinhaltet</b> den <b>aktuellen Punktestand</b> des Spielers.
	 */
	public static double getPunktestand()
	{
		return punktestand;
	}
	
	/**
	 * Die <i>Setter-Methode</i> für den <b>Punktestand des Spielers</b> setzt den <b>punktestand</b> auf den gewünschten Wert.
	 * 
	 * @param punktestand Die Variable <i>punktestand</i> <b>beinhaltet</b> den <b>aktuellen Punktestand</b> des Spielers.
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