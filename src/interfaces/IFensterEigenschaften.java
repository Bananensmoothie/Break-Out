package interfaces;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import frames.Startfenster;

/**
 * Im Interface <i>"<b>IFensterEingenschaften</b>"</i> werden die "<i>Standart<b>werte</b></i>" fuer <br>
 * den <i>spaeteren Gebrauch</i> <b>getroffen und festgehalten</b>.<br>
 * 
 * @version 1.0
 * 
 * @author Thomas Mader-Ofer
 * @author Manuel Glantschnig
 * @author Jonas Hörtnagl
 * @author Cristina Erhart
 * 
 */
public interface IFensterEigenschaften
{
	/**
	 * Die <i>Fensterbreite</i> namens "<i><b>FESTER_BREITE</b></i>" wird auf <b>1100</b> gesetzt.<br>
	 */
	int FENSTER_BREITE = 1100;
	/**
	 * Die <i>Fensterhoehe</i> namens "<i><b>FESTER_HOEHE</b></i>" wird auf <b>710</b> gesetzt.<br>
	 */
	int FENSTER_HOEHE = 710;
	/**
	 * Die <i>Mindestbreite</i> namens "<i><b>MIN_BREITE</b></i>" wird auf <b>500</b> gesetzt.<br>
	 */
	int MIN_BREITE = 500;
	/**
	 * Die <i>Mindesthoehe</i> namens "<i><b>MIN_HOEHE</b></i>" wird auf <b>600</b> gesetzt.<br>
	 */
	int MIN_HOEHE = 600;
	/**
	 * Die <i>maximale Breite</i> namens "<i><b>MAX_BREITE</b></i>" wird auf <b>3440</b> gesetzt.<br>
	 */
	int MAX_BREITE = 3440;
	/**
	 * Die <i>maximale Hoehe</i> namens "<i><b>MAX_HOEHE</b></i>" wird auf <b>2160</b> gesetzt.<br>
	 */
	int MAX_HOEHE = 2160;
	/**
	 * Die <i>Bildschirmbreite</i> namens "<i><b>BILDSCHIRM_BREITE</b></i>" wird definiert.<br>
	 */
	int BILDSCHIRM_BREITE = Toolkit.getDefaultToolkit().getScreenSize().width;
	/**
	 * Die <i>Bildschirmhoehe</i> namens "<i><b>BILDSCHIRM_HOEHE</b></i>" wird definiert.<br>
	 */
	int BILDSCHIRM_HOEHE = Toolkit.getDefaultToolkit().getScreenSize().height;
	/**
	 * Die <i>Mindestgroesse</i> namens "<i><b>MINIMALE_GROESSE</b></i>" wird mit den <i>Mindestwerten</i> "<b>MIN_BREITE</b>" und "<b>MIN_HOEHE</b>" definiert.<br>
	 */
	Dimension MINIMALE_GROESSE = new Dimension(MIN_BREITE, MIN_HOEHE);
	/**
	 * Die <i>maximale Groesse</i> namens "<i><b>MAXIMALE_GROESSE</b></i>" wird mit den <i>Maximalwerten</i> "<b>MAX_BREITE</b>" und "<b>MAX_HOEHE</b>" definiert.<br>
	 */
	Dimension MAXIMALE_GROESSE = new Dimension(MAX_BREITE, MAX_HOEHE);
	/**
	 * Die <i>Position des Fesnsters</i> namens "<i><b>FENSTER_POSITION</b></i>" <b>mittig</b> positioniert.<br>
	 */
	Point FENSTER_POSITION = new Point((BILDSCHIRM_BREITE - FENSTER_BREITE) / 2, (BILDSCHIRM_HOEHE - FENSTER_HOEHE) / 2);

	/**
	 * Die <i>Titelbild</i> namens "<i><b>FENSTER_SYMBOL</b></i>" wird definiert.<br>
	 * Es ist <b>links oben</b> <i>in der Ecke</i> zu sehen.<br>
	 */
	Image FENSTER_SYMBOL = Toolkit.getDefaultToolkit().getImage(Startfenster.class.getResource("/images/Logo.jpg"));
}