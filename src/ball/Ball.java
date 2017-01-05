package ball;

import frames.Hauptfenster;
import schlaeger.Schlaeger;
import spieler.Spieler;
import javax.swing.JPanel;

public final class Ball
{
	private static int xRichtung = 1;
	private static int yRichtung = 1;
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

	public static JPanel[][] setPanels(JPanel aPanels, int i, int x)
	{
		aPanel[i][x] = aPanels;
		return aPanel;
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

//		for (int i = 0; i < 5; i++)
//		{
//			for (int x = 0; x < 10; x++)
//			{
//				System.out.println(x);
//				if (getBallX() >= aPanel[i][x].getX() && getBallX() <= aPanel[i][x].getX() + 105)
//				{
//					aPanel[i][x].setVisible(false);
//					aPanel[i][x].removeAll();
//					xRichtung = xRichtung * -1;
//					Hauptfenster.getCpHauptfenster().repaint();
//					System.out.println("Vielen Tag ich Funktioniere!1");
//					Spieler.setPunktestand(Spieler.getPunktestand() + 200);
//
//				}
//				if (getBallY() >= aPanel[i][x].getY() && getBallY() <= aPanel[i][x].getY() + 105)
//				{
//					aPanel[i][x].setVisible(false);
//					aPanel[i][x].removeAll();
//					Hauptfenster.getCpHauptfenster().repaint();
//					yRichtung = yRichtung * -1;
//					Spieler.setPunktestand(Spieler.getPunktestand() + 200);
//					System.out.println("Vielen Tag ich Funktioniere!2");
//
//				}
//			}
//		}

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
		
		/* Manuel Glantschnig */
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