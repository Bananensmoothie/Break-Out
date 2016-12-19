package ball;

import frames.Hauptfenster;

public class Ball 
{
	private static int xRichtung = -1;
	private static int yRichtung = -1;
	
	public int getBallx()
	{
		return Hauptfenster.getLBLBall().getX();
	}
	
	public int getBally()
	{
		return Hauptfenster.getLBLBall().getY();
	}
	
	public void BallBewegen()
	{
		int iBallKoordinateHorizontal = Hauptfenster.getLBLBall().getX();
		int iBallKoordinateVertikal = Hauptfenster.getLBLBall().getY();
			
		if(iBallKoordinateHorizontal <= 0)
		{
			xRichtung = xRichtung * -1;
		}
			
		if(iBallKoordinateVertikal <= 0)
		{
			yRichtung = yRichtung * -1;
		}
			
		if(iBallKoordinateHorizontal >= (Hauptfenster.getSpielfeldBreite() - Hauptfenster.getBallBreite()))
		{
			xRichtung = xRichtung * -1;
		}
		
		if(iBallKoordinateVertikal >= (Hauptfenster.getSpielfeldHoehe() - Hauptfenster.getBallHoehe()))
		{
			yRichtung = yRichtung * -1;
		}
		
		iBallKoordinateHorizontal = iBallKoordinateHorizontal + xRichtung;
		iBallKoordinateVertikal = iBallKoordinateVertikal + yRichtung;
		
		Hauptfenster.getLBLBall().setLocation(iBallKoordinateHorizontal, iBallKoordinateVertikal);
		
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