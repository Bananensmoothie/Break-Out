package Ball;

import javax.swing.RepaintManager;

import frames.Hauptfenster;

public class Ball 
{
	private static int xRichtung = -1;
	private static int yRichtung = -1;
	private static int iBallKoordinateHorizontal = Hauptfenster.getpBall().getX();
	private static int iBallKoordinateVertikal = Hauptfenster.getpBall().getY();
	
	public static void BallBewegen()
	{
		System.out.println( "BallBewegen");
		
		for(;;)
		{
			System.out.print("for ");
			if(iBallKoordinateHorizontal == 0)
			{
				xRichtung = xRichtung * -1;
				System.out.println("if 1");
			}
			
			if(iBallKoordinateVertikal == 0)
			{
				yRichtung = yRichtung * -1;
				System.out.println("if 2");
			}
			
			if(iBallKoordinateHorizontal == Hauptfenster.getiFrameGroesseX())
			{
				xRichtung = xRichtung * -1;
				System.out.println("if 3");
			}
			
			if(iBallKoordinateVertikal == Hauptfenster.getiFrameGroesseY())
			{
				yRichtung = yRichtung * -1;
				System.out.println("if 4");
			}
		
			iBallKoordinateHorizontal = iBallKoordinateHorizontal + xRichtung;
			iBallKoordinateVertikal = iBallKoordinateVertikal + yRichtung;
			
			repaint();
			
			
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

	private static void update() {
		// TODO Auto-generated method stub
		
	}

	private static void repaint() {
		// TODO Auto-generated method stub
		
	}
}
