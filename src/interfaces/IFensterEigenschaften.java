package interfaces;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import frames.Startfenster;

public interface IFensterEigenschaften
{
	int FENSTER_BREITE = 1100;
	int FENSTER_HOEHE = 700;
	int MIN_BREITE = 500;
	int MIN_HOEHE = 600;
	int MAX_BREITE = 3440;
	int MAX_HOEHE = 2160;
	int BILDSCHIRM_BREITE = Toolkit.getDefaultToolkit().getScreenSize().width;
	int BILDSCHIRM_HOEHE = Toolkit.getDefaultToolkit().getScreenSize().height;
	Dimension MINIMALE_GROESSE = new Dimension(MIN_BREITE, MIN_HOEHE);
	Dimension MAXIMALE_GROESSE = new Dimension(MAX_BREITE, MAX_HOEHE);
	Point FENSTER_POSITION = new Point((BILDSCHIRM_BREITE - FENSTER_BREITE) / 2, (BILDSCHIRM_HOEHE - FENSTER_HOEHE) / 2);
	Image FENSTER_SYMBOL = Toolkit.getDefaultToolkit().getImage(Startfenster.class.getResource("/images/Logo.jpg"));
}