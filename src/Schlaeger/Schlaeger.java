package Schlaeger;

import javax.swing.JPanel;

import frames.Hauptfenster;

public class Schlaeger
{
	public static final int LINKS_BEWEGEN = 0;
	public static final int RECHTS_BEWEGEN = 1;
	
	private static JPanel oBezugsPanel;
	private static int iGeschwindigkeit = 10;
	private static int iPositionX;
	private static int iPositionY;

	public Schlaeger(JPanel bezugsPanel, int iPositionX, int iPositionY)
	{
		oBezugsPanel = bezugsPanel;
		Schlaeger.iPositionX = iPositionX;
		Schlaeger.iPositionY = iPositionY;
	}

	/**
	 * Diese Methode wird verwendet um den Schlaeger zu bewegen
	 */
	public static void move(int iRichtung)
	{
		if (iRichtung == LINKS_BEWEGEN)
		{
			if (iPositionX >= 0)
			{
				iPositionX = iPositionX - iGeschwindigkeit;
				oBezugsPanel.setLocation(iPositionX, iPositionY);
			}
		}
		if (iRichtung == RECHTS_BEWEGEN)
		{
			if (iPositionX <= (Hauptfenster.getSpielfeldBreite() - oBezugsPanel.getWidth()))
			{
				iPositionX = iPositionX + iGeschwindigkeit;
				oBezugsPanel.setLocation(iPositionX, iPositionY);
			}
		}
	}
}