package Ball;

import Bl�cke.CBloecke;
import frames.Hauptfenster;

public class Ball 
{
	private static int xRichtung = -1;
	private static int yRichtung = -1;
	CBloecke oBlock = new CBloecke();
	
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
		 
		System.out.println("BallBewegen");
		System.out.println("X-Koordinate: " + Hauptfenster.getLBLBall().getX());
		System.out.println("Y-Koordinate: " + Hauptfenster.getLBLBall().getY());
		System.out.print("for ");
			
		if(iBallKoordinateHorizontal <= 0)
		{
			xRichtung = xRichtung * -1;
			System.out.println("if 1");
		}
			
		if(iBallKoordinateVertikal <= 0)
		{
			yRichtung = yRichtung * -1;
			System.out.println("if 2");
		}
			
		if(iBallKoordinateHorizontal >= (Hauptfenster.getSpielfeldBreite() - Hauptfenster.getBallBreite()))
		{
			xRichtung = xRichtung * -1;
			System.out.println("if 3");
		}
		
		if(iBallKoordinateVertikal >= (Hauptfenster.getSpielfeldHoehe() - Hauptfenster.getBallHoehe()))
		{
			yRichtung = yRichtung * -1;
			System.out.println("if 4");
		}
		
		iBallKoordinateHorizontal = iBallKoordinateHorizontal + xRichtung;
		iBallKoordinateVertikal = iBallKoordinateVertikal + yRichtung;
		
		oBlock.bloeckePos();
		
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