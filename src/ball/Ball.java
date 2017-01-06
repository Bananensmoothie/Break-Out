package ball;

import frames.Hauptfenster;
import schlaeger.Schlaeger;
import spieler.Spieler;
import javax.swing.JPanel;

public final class Ball
{
	private static int xRichtung = -1;
	private static int yRichtung = -1;
	private static int iPositionX = 0;
	private static int iPositionY = 0;
	private static JPanel[][] aPanel;

	public static int getBallX()
	{
		return Hauptfenster.getBall().getX();
	}

	public static int getBallY()
	{
		return Hauptfenster.getBall().getY();
	}

	public static void setStartPosition()
	{
		iPositionX = (Hauptfenster.FENSTER_BREITE / 2) - (Hauptfenster.getBallBreite() / 2);
		iPositionY = (Hauptfenster.FENSTER_HOEHE / 2);

		Hauptfenster.getBall().setLocation(iPositionX, iPositionY);
	}

	public static void bewegen()
	{
		int iBallPosX = getBallX();
		int iBallPosY = getBallY();
		int iBallHoehe = Hauptfenster.getBallHoehe();
		int iBallBreite = Hauptfenster.getBallBreite();
		int iSchlaegerPosX = Schlaeger.getX();
		int iSchlaegerPosY = Schlaeger.getY();

		int iSchlaegerBreite = Schlaeger.getBreite();
		int iSpielfeldBreite = Hauptfenster.getSpielfeldBreite();

		aPanel = Hauptfenster.getAPanels();

		for (int iZeile = 0; iZeile < 5; iZeile++)
		{
			for (int iSpalte = 0; iSpalte < 10; iSpalte++)
			{
//				System.out.println("X: " + aPanel[iZeile][iSpalte].getX());
//				System.out.println("Y: " + aPanel[iZeile][iSpalte].getY());

				if ((iBallPosY >= aPanel[iZeile][iSpalte].getY())&& (iBallPosY <= (aPanel[iZeile][iSpalte].getY() + 55))
					&& aPanel[iZeile][iSpalte].isVisible())
				{
					if ((iBallPosX >= aPanel[iZeile][iSpalte].getX())&& (iBallPosX <= (aPanel[iZeile][iSpalte].getX() + 109))
						&& aPanel[iZeile][iSpalte].isVisible())
					{
						aPanel[iZeile][iSpalte].setVisible(false);
						Hauptfenster.getCpHauptfenster().repaint();

						if (aPanel[iZeile][iSpalte].getBackground() == Hauptfenster.HELL_BLAU)
						{
							Spieler.setPunktestand(Spieler.getPunktestand() + 2000000);
						}

						if (aPanel[iZeile][iSpalte].getBackground() == Hauptfenster.GRUEN)
						{
							Spieler.setPunktestand(Spieler.getPunktestand() + 4000000);
						}

						if (aPanel[iZeile][iSpalte].getBackground() == Hauptfenster.GELB)
						{
							Spieler.setPunktestand(Spieler.getPunktestand() + 6000000);
						}

						if (aPanel[iZeile][iSpalte].getBackground() == Hauptfenster.ORANGE)
						{
							Spieler.setPunktestand(Spieler.getPunktestand() + 8000000);
						}

						if (aPanel[iZeile][iSpalte].getBackground() == Hauptfenster.ROT)
						{
							Spieler.setPunktestand(Spieler.getPunktestand() + 10000000);
						}

						yRichtung = yRichtung * -1;
					}
				}
			}
		}

		if (iBallPosX <= 0)
		{
			xRichtung = xRichtung * -1;
		}

		if (iBallPosY <= 0)
		{
			yRichtung = yRichtung * -1;
		}

		if (iBallPosX >= (iSpielfeldBreite - iBallBreite))
		{
			xRichtung = xRichtung * -1;
		}

		if (iBallPosY >= (iSchlaegerPosY - iBallHoehe))
		{
			if ((iBallPosX > iSchlaegerPosX) && (iBallPosX < (iSchlaegerPosX + (iSchlaegerBreite - iBallBreite))))
			{
				yRichtung = yRichtung * -1;
			}
		}

		if ((iBallPosY - iBallHoehe) >= iSchlaegerPosY)
		{
			Spieler.setLeben(Spieler.getLeben() - 1);
			Hauptfenster.getHauptfenster().timerStoppen();
		}

		iBallPosX = iBallPosX + xRichtung;
		iBallPosY = iBallPosY + yRichtung;

		Hauptfenster.getBall().setLocation(iBallPosX, iBallPosY);

		try
		{
			Thread.sleep(5);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}