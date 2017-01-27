package verarbeiten;

import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import frames.Highscorefenster;

/**
 * Die Klasse "Tabelle" ist dafür verantwortlich, dass das <b>Higscorefenster richtig angezeigt</b> wird.<br>
 * 
 * @version 1.0
 * 
 * @author Thomas Mader-Ofer
 * @author Manuel Glantschnig
 * @author Jonas Hörtnagl
 * @author Cristina Erhart
 * 
 */
public class Tabelle
{
	private static final String DATEIPFAD = System.getProperty("user.dir") + "\\data\\dateien\\highscoretable.csv";

	/**
	 * Das Objekt "<i><b>oTabelle</b></i>" wurde der erstellt.
	 */
	private static Tabelle oTabelle;

	/**
	 * Das Objekt "<i><b>log</b></i>"  der Klasse <i>LogDB</i> wurde der erstellt.
	 */
	private LogDB log;

	/**
	 * Die Variable "<i><b>erziehtlerPunktestand</b></i>" wurde der erstellt.
	 */
	private double erzielterPunktestand;

	/**
	 * Die Arraylist "<i><b>tabellenEintraege</b></i>" vom Typ <i>String</i> wurde der erstellt.
	 */
	private ArrayList<String> tabellenEintraege;

	/**
	 * Die Arraylist "<i><b>alSpielrPunkte</b></i>" vom Typ <i>Double</i> wurde der erstellt.
	 */
	private ArrayList<Double> alSpielerPunkte;

	/**
	 * Die Arraylist "<i><b>alSpielerNamen</b></i>" vom Typ <i>String</i> wurde der erstellt.
	 */
	private ArrayList<String> alSpielerNamen;

	/**
	 * Der Konstruktor "<i><b>Tabelle</b>" speichert Arraylisten</i> in eigenen ariabelen und trifft <i>weitere Massnahmen</i>.<br>
	 */
	public Tabelle()
	{
		log = new LogDB(DATEIPFAD);
		erzielterPunktestand = 0;								//Der Variable "erzeihlterPunktestand" wird der Wert 0 (=null) zugewiesen.
		tabellenEintraege = log.getTabellenEintraege();
		alSpielerPunkte = new ArrayList<Double>();				//Die ArrayList "alSpielerPunkte" wird der Typ "Double" zugewiesen.
		alSpielerNamen = new ArrayList<String>();				//Die ArrayList "alSpielerNamen" wird der Typ "String" zugewiesen.

		eintraegeErfassen();									//Die Methode "eintraegeErfassen" wird aufgerufen.
		ranglisteLaden();										//Die Methode "ranglisteLaden" wird aufgerufen.

		oTabelle = this;
	}
	
	/**
	 * Die Methode <i>"<b>listenBereinigen</b>"</i> werden fuer den Fall,<br>
	 * das etwas in einer <i>bestimmten</i> <b>Liste</b> steht, diese <b>bereinigt</b> (= auf 0 gesetzt).
	 */
	private void listenBereinigen()
	{
		if (!alSpielerNamen.isEmpty())							//Wenn in der ArrayList "alSpielerNamen" etwas steht, wird folgendes ausgefuehrt.
			alSpielerNamen.clear();								//Die gesamte Liste wird geleert.
		if (!alSpielerPunkte.isEmpty())							//Wenn in der ArrayList "alSpielerPunkte" etwas steht, wird folgendes ausgefuehrt.
			alSpielerPunkte.clear();							//Die gesamte Liste wird geleert.
	}
	
	/**
	 * Die Methode <i>"<b>eintraegeErfassen</b>"</i> werden <i>alle Tabelleneintraege</i> in <b>Punkte</b> und <b>Spielernamen</b> aufgeteilt.<br>
	 */
	private void eintraegeErfassen()
	{
		for (int i = 1; i < tabellenEintraege.size(); i += 2)	//Die folgende Abfrage wird solange abgefragt, wie es Eintraege in der Highscoretabelle gibt.
		{
			if (!tabellenEintraege.get(i).isEmpty())			//Wenn in der Higscoretabelle an n-ter Stelle etwas steht, so wird folgendes ausgefuehrt.
				alSpielerPunkte.add(Double.parseDouble(tabellenEintraege.get(i)));	//Der Punktestand an n-ter Stelle wird in eine Zahl verwandelt und anschließend der ArrayList "alSpielerPunkte" hinzugefuegt.
		}
		
		for (int i = 0; i < tabellenEintraege.size(); i += 2)	//Die folgende Abfrage wird solange abgefragt, wie es Eintraege in der Highscoretabelle gibt.
		{
			if (!tabellenEintraege.get(i).isEmpty())			//Wenn in der Higscoretabelle an n-ter Stelle etwas steht, so wird folgendes ausgefuehrt.
				alSpielerNamen.add(tabellenEintraege.get(i));	//Der Punktestand an n-ter Stelle wird der ArrayList "alSpielerNamen" hinzugefuegt.
		}
	}

	/**
	 * Die Methode <i>"<b>rangListeLaden</b>"</i> bearbeitet die <b>graphische Oberflaeche</b> der <i>Highscoretabelle</i>.
	 */
	private void ranglisteLaden()
	{
		if ((alSpielerNamen.isEmpty()) || (alSpielerPunkte.isEmpty()))					//Wenn in der ArrayList alSpielerNamen und der ArrayList alSpielerPunkte nichts enthalten ist, so wird folgendes ausefuehrt.
			return;																		//Es wird wieder in die Methode, in der die Metohde aufgerufen wurde, zurueckgesprungen.
		
		boolean punkteWurdenNochNichtAngezeigt = true;									//Die Variable "punkteWurdenNochNichtAngezeigt" wird auf "true" (= richtig) gesetzt.
		Color schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;							//Dem Highscorefenster wird eine weisse Schrift gegeben.

		for (int iZeile = 1; iZeile <= 14; iZeile++)									//Folgendes wird 14 mal ausgefuehrt.
		{
			switch (iZeile)																//Wenn i = 1, 2, 3, ... 13, 14 ist wird folgendes ausgefuehrt
			{
				case 1:																	//Wenn i = 1, wird folgendes ausgefuerht.
					if ((alSpielerPunkte.get(0) == erzielterPunktestand) && punkteWurdenNochNichtAngezeigt)		//Wenn der aktuelle Punktestand gleich dem gewaehlten Punktestand ist und dieser noch nicht angeweigt wurde, wird folgendes ausgefuehrt.
					{
						schriftFarbe = Color.RED;										//Die Schriftfarbe wird auf "rot" gesetzt.
						punkteWurdenNochNichtAngezeigt = false;							//Die Variable "punkteWurdenNochNichtGezaeht" wird auf false (= falsch) gesetzt.
					}
					Highscorefenster.getLblPlatz1().setText(alSpielerNamen.get(0));		//Der aktuelle Spielername wird auf das erste Label gesetzt.
					Highscorefenster.getLblPlatz1().setForeground(schriftFarbe);		//Dieses Label bekommt die Schriftfarbe, welche in der Variable "schriftFarbe" steht. 
					Highscorefenster.getLblPunktePlatz1().setText(String.format("%,.0f", alSpielerPunkte.get(0)));	//Der aktuelle Spielername wird auf das erste Label gesetzt.
					Highscorefenster.getLblPunktePlatz1().setForeground(schriftFarbe);	//Dieses Label bekommt die Schriftfarbe, welche in der Variable "schriftFarbe" steht. 
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;						//Die Schriftfarbe wird auf "weiss" gesetzt.
					break;																//Diese Bedingungen werden abgebrochen.
					

				case 2:																	//Wenn i = 2, wird folgendes ausgefuerht.
					if ((alSpielerPunkte.get(1) == erzielterPunktestand) && punkteWurdenNochNichtAngezeigt)		//Wenn der aktuelle Punktestand gleich dem gewaehlten Punktestand ist und dieser noch nicht angeweigt wurde, wird folgendes ausgefuehrt.
					{
						schriftFarbe = Color.RED;										//Die Schriftfarbe wird auf "rot" gesetzt.
						punkteWurdenNochNichtAngezeigt = false;							//Die Variable "punkteWurdenNochNichtGezaeht" wird auf false (= falsch) gesetzt.
					}
					Highscorefenster.getLblPlatz2().setText(alSpielerNamen.get(1));		//Der aktuelle Spielername wird auf das zweite Label gesetzt.
					Highscorefenster.getLblPlatz2().setForeground(schriftFarbe);		//Dieses Label bekommt die Schriftfarbe, welche in der Variable "schriftFarbe" steht. 
					Highscorefenster.getLblPunktePlatz2().setText(String.format("%,.0f", alSpielerPunkte.get(1)));	//Der aktuelle Punktestand wird auf das zweite Label gesetzt.
					Highscorefenster.getLblPunktePlatz2().setForeground(schriftFarbe);	//Dieses Label bekommt die Schriftfarbe, welche in der Variable "schriftFarbe" steht. 
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;						//Die Schriftfarbe wird auf "weiss" gesetzt.
					break;																//Diese Bedingungen werden abgebrochen.

				case 3:																	//Wenn i = 3, wird folgendes ausgefuerht.
					if ((alSpielerPunkte.get(2) == erzielterPunktestand) && punkteWurdenNochNichtAngezeigt)		//Wenn der aktuelle Punktestand gleich dem gewaehlten Punktestand ist und dieser noch nicht angeweigt wurde, wird folgendes ausgefuehrt.
					{
						schriftFarbe = Color.RED;										//Die Schriftfarbe wird auf "rot" gesetzt.
						punkteWurdenNochNichtAngezeigt = false;							//Die Variable "punkteWurdenNochNichtGezaeht" wird auf false (= falsch) gesetzt.
					}
					Highscorefenster.getLblPlatz3().setText(alSpielerNamen.get(2));		//Der aktuelle Spielername wird auf das dritte Label gesetzt.
					Highscorefenster.getLblPlatz3().setForeground(schriftFarbe);		//Dieses Label bekommt die Schriftfarbe, welche in der Variable "schriftFarbe" steht. 
					Highscorefenster.getLblPunktePlatz3().setText(String.format("%,.0f", alSpielerPunkte.get(2)));	//Der aktuelle Spielername wird auf das dritte Label gesetzt.
					Highscorefenster.getLblPunktePlatz3().setForeground(schriftFarbe);	//Dieses Label bekommt die Schriftfarbe, welche in der Variable "schriftFarbe" steht. 
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;						//Die Schriftfarbe wird auf "weiss" gesetzt.
					break;																//Diese Bedingungen werden abgebrochen.

				case 4:																	//Wenn i = 4, wird folgendes ausgefuerht.
					if ((alSpielerPunkte.get(3) == erzielterPunktestand) && punkteWurdenNochNichtAngezeigt)		//Wenn der aktuelle Punktestand gleich dem gewaehlten Punktestand ist und dieser noch nicht angeweigt wurde, wird folgendes ausgefuehrt.
					{
						schriftFarbe = Color.RED;										//Die Schriftfarbe wird auf "rot" gesetzt.
						punkteWurdenNochNichtAngezeigt = false;							//Die Variable "punkteWurdenNochNichtGezaeht" wird auf false (= falsch) gesetzt.
					}
					Highscorefenster.getLblPlatz4().setText(alSpielerNamen.get(3));		//Der aktuelle Spielername wird auf das vierte Label gesetzt.
					Highscorefenster.getLblPlatz4().setForeground(schriftFarbe);		//Dieses Label bekommt die Schriftfarbe, welche in der Variable "schriftFarbe" steht. 
					Highscorefenster.getLblPunktePlatz4().setText(String.format("%,.0f", alSpielerPunkte.get(3)));	//Der aktuelle Spielername wird auf das vierte Label gesetzt.
					Highscorefenster.getLblPunktePlatz4().setForeground(schriftFarbe);	//Dieses Label bekommt die Schriftfarbe, welche in der Variable "schriftFarbe" steht. 
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;						//Die Schriftfarbe wird auf "weiss" gesetzt.
					break;																//Diese Bedingungen werden abgebrochen.

				case 5:																	//Wenn i = 5, wird folgendes ausgefuerht.
					if ((alSpielerPunkte.get(4) == erzielterPunktestand) && punkteWurdenNochNichtAngezeigt)		//Wenn der aktuelle Punktestand gleich dem gewaehlten Punktestand ist und dieser noch nicht angeweigt wurde, wird folgendes ausgefuehrt.
					{
						schriftFarbe = Color.RED;										//Die Schriftfarbe wird auf "rot" gesetzt.
						punkteWurdenNochNichtAngezeigt = false;							//Die Variable "punkteWurdenNochNichtGezaeht" wird auf false (= falsch) gesetzt.
					}
					Highscorefenster.getLblPlatz5().setText(alSpielerNamen.get(4));		//Der aktuelle Spielername wird auf das fuenfte Label gesetzt.
					Highscorefenster.getLblPlatz5().setForeground(schriftFarbe);		//Dieses Label bekommt die Schriftfarbe, welche in der Variable "schriftFarbe" steht. 
					Highscorefenster.getLblPunktePlatz5().setText(String.format("%,.0f", alSpielerPunkte.get(4)));	//Der aktuelle Spielername wird auf das fuenft Label gesetzt.
					Highscorefenster.getLblPunktePlatz5().setForeground(schriftFarbe);	//Dieses Label bekommt die Schriftfarbe, welche in der Variable "schriftFarbe" steht. 
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;						//Die Schriftfarbe wird auf "weiss" gesetzt.
					break;																//Diese Bedingungen werden abgebrochen.

				case 6:																	//Wenn i = 6, wird folgendes ausgefuerht.
					if ((alSpielerPunkte.get(5) == erzielterPunktestand) && punkteWurdenNochNichtAngezeigt)		//Wenn der aktuelle Punktestand gleich dem gewaehlten Punktestand ist und dieser noch nicht angeweigt wurde, wird folgendes ausgefuehrt.
					{
						schriftFarbe = Color.RED;										//Die Schriftfarbe wird auf "rot" gesetzt.
						punkteWurdenNochNichtAngezeigt = false;							//Die Variable "punkteWurdenNochNichtGezaeht" wird auf false (= falsch) gesetzt.
					}
					Highscorefenster.getLblPlatz6().setText(alSpielerNamen.get(5));		//Der aktuelle Spielername wird auf das sechste Label gesetzt.
					Highscorefenster.getLblPlatz6().setForeground(schriftFarbe);		//Dieses Label bekommt die Schriftfarbe, welche in der Variable "schriftFarbe" steht. 
					Highscorefenster.getLblPunktePlatz6().setText(String.format("%,.0f", alSpielerPunkte.get(5)));	//Der aktuelle Spielername wird auf das sechste Label gesetzt.
					Highscorefenster.getLblPunktePlatz6().setForeground(schriftFarbe);	//Dieses Label bekommt die Schriftfarbe, welche in der Variable "schriftFarbe" steht. 
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;						//Die Schriftfarbe wird auf "weiss" gesetzt.
					break;																//Diese Bedingungen werden abgebrochen.

				case 7:																	//Wenn i = 7, wird folgendes ausgefuerht.
					if ((alSpielerPunkte.get(6) == erzielterPunktestand) && punkteWurdenNochNichtAngezeigt)		//Wenn der aktuelle Punktestand gleich dem gewaehlten Punktestand ist und dieser noch nicht angeweigt wurde, wird folgendes ausgefuehrt.
					{
						schriftFarbe = Color.RED;										//Die Schriftfarbe wird auf "rot" gesetzt.			//
						punkteWurdenNochNichtAngezeigt = false;							//Die Variable "punkteWurdenNochNichtGezaeht" wird auf false (= falsch) gesetzt.
					}
					Highscorefenster.getLblPlatz7().setText(alSpielerNamen.get(6));		//Der aktuelle Spielername wird auf das siebte Label gesetzt.
					Highscorefenster.getLblPlatz7().setForeground(schriftFarbe);		//Dieses Label bekommt die Schriftfarbe, welche in der Variable "schriftFarbe" steht. 
					Highscorefenster.getLblPunktePlatz7().setText(String.format("%,.0f", alSpielerPunkte.get(6)));	//Der aktuelle Spielername wird auf das siebte Label gesetzt.
					Highscorefenster.getLblPunktePlatz7().setForeground(schriftFarbe);	//Dieses Label bekommt die Schriftfarbe, welche in der Variable "schriftFarbe" steht. 
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;						//Die Schriftfarbe wird auf "weiss" gesetzt.
					break;																//Diese Bedingungen werden abgebrochen.

				case 8:																	//Wenn i = 8, wird folgendes ausgefuerht.
					if ((alSpielerPunkte.get(7) == erzielterPunktestand) && punkteWurdenNochNichtAngezeigt)		//Wenn der aktuelle Punktestand gleich dem gewaehlten Punktestand ist und dieser noch nicht angeweigt wurde, wird folgendes ausgefuehrt.
					{
						schriftFarbe = Color.RED;										//Die Schriftfarbe wird auf "rot" gesetzt.
						punkteWurdenNochNichtAngezeigt = false;							//Die Variable "punkteWurdenNochNichtGezaeht" wird auf false (= falsch) gesetzt.
					}
					Highscorefenster.getLblPlatz8().setText(alSpielerNamen.get(7));		//Der aktuelle Spielername wird auf das achte Label gesetzt.
					Highscorefenster.getLblPlatz8().setForeground(schriftFarbe);		//Dieses Label bekommt die Schriftfarbe, welche in der Variable "schriftFarbe" steht. 
					Highscorefenster.getLblPunktePlatz8().setText(String.format("%,.0f", alSpielerPunkte.get(7)));	//Der aktuelle Spielername wird auf das achte Label gesetzt.
					Highscorefenster.getLblPunktePlatz8().setForeground(schriftFarbe);	//Dieses Label bekommt die Schriftfarbe, welche in der Variable "schriftFarbe" steht. 
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;						//Die Schriftfarbe wird auf "weiss" gesetzt.
					break;																//Diese Bedingungen werden abgebrochen.

				case 9:																	//Wenn i = 9, wird folgendes ausgefuerht.
					if ((alSpielerPunkte.get(8) == erzielterPunktestand) && punkteWurdenNochNichtAngezeigt)		//Wenn der aktuelle Punktestand gleich dem gewaehlten Punktestand ist und dieser noch nicht angeweigt wurde, wird folgendes ausgefuehrt.
					{
						schriftFarbe = Color.RED;										//Die Schriftfarbe wird auf "rot" gesetzt.
						punkteWurdenNochNichtAngezeigt = false;							//Die Variable "punkteWurdenNochNichtGezaeht" wird auf false (= falsch) gesetzt.
					}
					Highscorefenster.getLblPlatz9().setText(alSpielerNamen.get(8));		//Der aktuelle Spielername wird auf das neunte Label gesetzt.
					Highscorefenster.getLblPlatz9().setForeground(schriftFarbe);		//Dieses Label bekommt die Schriftfarbe, welche in der Variable "schriftFarbe" steht. 
					Highscorefenster.getLblPunktePlatz9().setText(String.format("%,.0f", alSpielerPunkte.get(8)));	//Der aktuelle Spielername wird auf das neunte Label gesetzt.
					Highscorefenster.getLblPunktePlatz9().setForeground(schriftFarbe);	//Dieses Label bekommt die Schriftfarbe, welche in der Variable "schriftFarbe" steht. 
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;
					break;																//Diese Bedingungen werden abgebrochen.

				case 10:																//Wenn i = 10, wird folgendes ausgefuerht.
					if ((alSpielerPunkte.get(9) == erzielterPunktestand) && punkteWurdenNochNichtAngezeigt)		//Wenn der aktuelle Punktestand gleich dem gewaehlten Punktestand ist und dieser noch nicht angeweigt wurde, wird folgendes ausgefuehrt.
					{
						schriftFarbe = Color.RED;										//Die Schriftfarbe wird auf "rot" gesetzt.
						punkteWurdenNochNichtAngezeigt = false;							//Die Variable "punkteWurdenNochNichtGezaeht" wird auf false (= falsch) gesetzt.
					}
					Highscorefenster.getLblPlatz10().setText(alSpielerNamen.get(9));	//Der aktuelle Spielername wird auf das zehnte Label gesetzt.
					Highscorefenster.getLblPlatz10().setForeground(schriftFarbe);		//Dieses Label bekommt die Schriftfarbe, welche in der Variable "schriftFarbe" steht. 
					Highscorefenster.getLblPunktePlatz10().setText(String.format("%,.0f", alSpielerPunkte.get(9)));	//Der aktuelle Spielername wird auf das zehnte Label gesetzt.
					Highscorefenster.getLblPunktePlatz10().setForeground(schriftFarbe);	//Dieses Label bekommt die Schriftfarbe, welche in der Variable "schriftFarbe" steht. 
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;						//Die Schriftfarbe wird auf "weiss" gesetzt.
					break;																//Diese Bedingungen werden abgebrochen.

				case 11:																//Wenn i = 11, wird folgendes ausgefuerht.
					if ((alSpielerPunkte.get(10) == erzielterPunktestand) && punkteWurdenNochNichtAngezeigt)		//Wenn der aktuelle Punktestand gleich dem gewaehlten Punktestand ist und dieser noch nicht angeweigt wurde, wird folgendes ausgefuehrt.
					{
						schriftFarbe = Color.RED;										//Die Schriftfarbe wird auf "rot" gesetzt.
						punkteWurdenNochNichtAngezeigt = false;							//Die Variable "punkteWurdenNochNichtGezaeht" wird auf false (= falsch) gesetzt.
					}
					Highscorefenster.getLblPlatz11().setText(alSpielerNamen.get(10));	//Der aktuelle Spielername wird auf das elfte Label gesetzt.
					Highscorefenster.getLblPlatz11().setForeground(schriftFarbe);		//Dieses Label bekommt die Schriftfarbe, welche in der Variable "schriftFarbe" steht. 
					Highscorefenster.getLblPunktePlatz11().setText(String.format("%,.0f", alSpielerPunkte.get(10)));	//Der aktuelle Spielername wird auf das elfte Label gesetzt.
					Highscorefenster.getLblPunktePlatz11().setForeground(schriftFarbe);	//Dieses Label bekommt die Schriftfarbe, welche in der Variable "schriftFarbe" steht. 
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;						//Die Schriftfarbe wird auf "weiss" gesetzt.
					break;																//Diese Bedingungen werden abgebrochen.

				case 12:																//Wenn i = 12, wird folgendes ausgefuerht.
					if ((alSpielerPunkte.get(11) == erzielterPunktestand) && punkteWurdenNochNichtAngezeigt)		//Wenn der aktuelle Punktestand gleich dem gewaehlten Punktestand ist und dieser noch nicht angeweigt wurde, wird folgendes ausgefuehrt.
					{
						schriftFarbe = Color.RED;										//Die Schriftfarbe wird auf "rot" gesetzt.
						punkteWurdenNochNichtAngezeigt = false;							//Die Variable "punkteWurdenNochNichtGezaeht" wird auf false (= falsch) gesetzt.
					}
					Highscorefenster.getLblPlatz12().setText(alSpielerNamen.get(11));	//Der aktuelle Spielername wird auf das zwoelfte Label gesetzt.
					Highscorefenster.getLblPlatz12().setForeground(schriftFarbe);		//Dieses Label bekommt die Schriftfarbe, welche in der Variable "schriftFarbe" steht. 
					Highscorefenster.getLblPunktePlatz12().setText(String.format("%,.0f", alSpielerPunkte.get(11)));	//Der aktuelle Spielername wird auf das zwoelfte Label gesetzt.
					Highscorefenster.getLblPunktePlatz12().setForeground(schriftFarbe);	//Dieses Label bekommt die Schriftfarbe, welche in der Variable "schriftFarbe" steht. 
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;						//Die Schriftfarbe wird auf "weiss" gesetzt.
					break;																//Diese Bedingungen werden abgebrochen.

				case 13:																//Wenn i = 13, wird folgendes ausgefuerht.
					if ((alSpielerPunkte.get(12) == erzielterPunktestand) && punkteWurdenNochNichtAngezeigt)		//Wenn der aktuelle Punktestand gleich dem gewaehlten Punktestand ist und dieser noch nicht angeweigt wurde, wird folgendes ausgefuehrt.
					{
						schriftFarbe = Color.RED;										//Die Schriftfarbe wird auf "rot" gesetzt.
						punkteWurdenNochNichtAngezeigt = false;							//Die Variable "punkteWurdenNochNichtGezaeht" wird auf false (= falsch) gesetzt.
					}
					Highscorefenster.getLblPlatz13().setText(alSpielerNamen.get(12));	//Der aktuelle Spielername wird auf das dreizehnte Label gesetzt.
					Highscorefenster.getLblPlatz13().setForeground(schriftFarbe);		//Dieses Label bekommt die Schriftfarbe, welche in der Variable "schriftFarbe" steht. 
					Highscorefenster.getLblPunktePlatz13().setText(String.format("%,.0f", alSpielerPunkte.get(12)));	//Der aktuelle Spielername wird auf das dreizehte Label gesetzt.
					Highscorefenster.getLblPunktePlatz13().setForeground(schriftFarbe);	//Dieses Label bekommt die Schriftfarbe, welche in der Variable "schriftFarbe" steht. 
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;						//Die Schriftfarbe wird auf "weiss" gesetzt.
					break;																//Diese Bedingungen werden abgebrochen.

				case 14:																//Wenn i = 14, wird folgendes ausgefuerht.
					if ((alSpielerPunkte.get(13) == erzielterPunktestand) && punkteWurdenNochNichtAngezeigt)		//Wenn der aktuelle Punktestand gleich dem gewaehlten Punktestand ist und dieser noch nicht angeweigt wurde, wird folgendes ausgefuehrt.
					{
						schriftFarbe = Color.RED;										//Die Schriftfarbe wird auf "rot" gesetzt.
						punkteWurdenNochNichtAngezeigt = false;							//Die Variable "punkteWurdenNochNichtGezaeht" wird auf false (= falsch) gesetzt.
					}
					Highscorefenster.getLblPlatz14().setText(alSpielerNamen.get(13));	//Der aktuelle Spielername wird auf das vierzehnte Label gesetzt.
					Highscorefenster.getLblPlatz14().setForeground(schriftFarbe);		//Dieses Label bekommt die Schriftfarbe, welche in der Variable "schriftFarbe" steht. 
					Highscorefenster.getLblPunktePlatz14().setText(String.format("%,.0f", alSpielerPunkte.get(13)));	//Der aktuelle Spielername wird auf das vierzehnte Label gesetzt.
					Highscorefenster.getLblPunktePlatz14().setForeground(schriftFarbe);	//Dieses Label bekommt die Schriftfarbe, welche in der Variable "schriftFarbe" steht. 
					schriftFarbe = Highscorefenster.WEISSE_SCHRIFT;						//Die Schriftfarbe wird auf "weiss" gesetzt.
					break;																//Diese Bedingungen werden abgebrochen.
			}
		}
	}

	/**
	 * Die Methode "<i><b>sortTabelle</b></i>"  <i>sortiert</i> die <i>Highscoretabelle</i> nach den <i>Punkten</i>.
	 */
	private void sortTabelle()
	{
		for (int folgenIndex = 0; folgenIndex < alSpielerPunkte.size() - 1; folgenIndex++)			//Folgendes wird solange ausgefuehrt, wie die ArrayList "alSpielerPunkte"gross ist.
		{
			for (int vergleichIndex = folgenIndex + 1; vergleichIndex < alSpielerPunkte.size(); vergleichIndex++)			//Folgendes wird solange ausgefuehrt, wie die ArrayList "alSpielerPunkte"gross ist.
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
	 * Die Methode "aktuellenSpielrEintragen" <i>fuegt</i> den aktuellen <b>Spielernamen</b> mit seinem <b>Punktestand</b> <i>ein</i>.<br>
	 * 
	 * @param name Der einzutragende Spielername.
	 * @param punkte Die erzielten Punkte.
	 */
	public void aktuellenSpielerEintragen(String name, double punkte)
	{
		erzielterPunktestand = punkte;			//Der aktuelle Punktestand wird in der Variable "erzielterPunktestand" gespeichert.
		
		listenBereinigen();						//Die Methode "ListeBereinigen" wird aufgerufen.
		
		alSpielerPunkte.add(punkte);			//Der aktuelle Punktestand wird in der ArrayList "alSpielerPunkte" gespeichert.
		alSpielerNamen.add(name);				//Der aktuelle Spielername wird in der ArrayList "alSpielerNamen" gespeichert.
		
		eintraegeErfassen();					//Die Methode "eintraegeErfassen" wird aufgerufen.
		sortTabelle();							//Die Methode "sortTabelle" wird aufgerufen.
		ranglisteLaden();						//Die Methode "randlisteLaden" wird aufgerufen.
	}

	/**
	 * In der Methode <i><b>"ranglisteSpeichern"</b></i> wird die gesamte Highscoretabelle gespeichert.
	 */
	public void ranglisteSpeichern()
	{
		if ((alSpielerNamen.isEmpty()) || (alSpielerPunkte.isEmpty()))				//Wenn in der ArrayList "alSpielerNamen" und alSpielerPunkte" nichts enthalten ist, wird folgendes ausgefuehrt.
			return;											//Diese Methode wird abgebrochen.
		
		File highscoreCSV = new File(DATEIPFAD);

		try (FileWriter writer = new FileWriter(highscoreCSV))
		{
			String text = Highscorefenster.getLblPlatz1().getText()  + ";" + Highscorefenster.getLblPunktePlatz1().getText().replace(".", "")  + "\n"			//Das erste SpielernamenLabel und das erste PunktestandLabel wird geschrieben.
						+ Highscorefenster.getLblPlatz2().getText()  + ";" + Highscorefenster.getLblPunktePlatz2().getText().replace(".", "")  + "\n"			//Das zweite SpielernamenLabel und das zweite PunktestandLabel wird geschrieben.
						+ Highscorefenster.getLblPlatz3().getText()  + ";" + Highscorefenster.getLblPunktePlatz3().getText().replace(".", "")  + "\n"			//Das dritte SpielernamenLabel und das dritte PunktestandLabel wird geschrieben.
						+ Highscorefenster.getLblPlatz4().getText()  + ";" + Highscorefenster.getLblPunktePlatz4().getText().replace(".", "")  + "\n"			//Das vierte SpielernamenLabel und das vierte PunktestandLabel wird geschrieben.
						+ Highscorefenster.getLblPlatz5().getText()  + ";" + Highscorefenster.getLblPunktePlatz5().getText().replace(".", "")  + "\n"			//Das fuenfte SpielernamenLabel und das fuenfte PunktestandLabel wird geschrieben.
						+ Highscorefenster.getLblPlatz6().getText()  + ";" + Highscorefenster.getLblPunktePlatz6().getText().replace(".", "")  + "\n"			//Das sechste SpielernamenLabel und das sechste PunktestandLabel wird geschrieben.
						+ Highscorefenster.getLblPlatz7().getText()  + ";" + Highscorefenster.getLblPunktePlatz7().getText().replace(".", "")  + "\n"			//Das siebte SpielernamenLabel und das siebte PunktestandLabel wird geschrieben.
						+ Highscorefenster.getLblPlatz8().getText()  + ";" + Highscorefenster.getLblPunktePlatz8().getText().replace(".", "")  + "\n"			//Das achte SpielernamenLabel und das achte PunktestandLabel wird geschrieben.
						+ Highscorefenster.getLblPlatz9().getText()  + ";" + Highscorefenster.getLblPunktePlatz9().getText().replace(".", "")  + "\n"			//Das neunte SpielernamenLabel und das neunte PunktestandLabel wird geschrieben.
						+ Highscorefenster.getLblPlatz10().getText() + ";" + Highscorefenster.getLblPunktePlatz10().getText().replace(".", "") + "\n"			//Das zehnte SpielernamenLabel und das zehnte PunktestandLabel wird geschrieben.
						+ Highscorefenster.getLblPlatz11().getText() + ";" + Highscorefenster.getLblPunktePlatz11().getText().replace(".", "") + "\n"			//Das elfte SpielernamenLabel und das elfte PunktestandLabel wird geschrieben.
						+ Highscorefenster.getLblPlatz12().getText() + ";" + Highscorefenster.getLblPunktePlatz12().getText().replace(".", "") + "\n"			//Das zwoelfte SpielernamenLabel und das zwoelfte PunktestandLabel wird geschrieben.
						+ Highscorefenster.getLblPlatz13().getText() + ";" + Highscorefenster.getLblPunktePlatz13().getText().replace(".", "") + "\n"			//Das dreizehnte SpielernamenLabel und das dreizehnte PunktestandLabel wird geschrieben.
						+ Highscorefenster.getLblPlatz14().getText() + ";" + Highscorefenster.getLblPunktePlatz14().getText().replace(".", "") + "\n"			//Das vierzehnte SpielernamenLabel und das vierzehnte PunktestandLabel wird geschrieben.
						+ "platzhalter" 							 + ";" + "0";
			writer.write(text);								//Der Text wird geschrieben.
		}
		catch (Exception e)									//Funktioniert dies nicht, so wird folgendes ausgefuehrt.
		{
			e.printStackTrace();							//Eine Fehlermeldung wird am Bildschrim sichtbar.
		}
	}

	/**
	 * In der Methode "getTabelle" wird das Objekt "oTabelle" zururckgegeben.<br>
	 * 
	 * @return Ein Objekt der Klasse "Tabelle".
	 */
	public static Tabelle getTabelle()
	{
		return oTabelle;
	}
}