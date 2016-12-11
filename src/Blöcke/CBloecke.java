package Blöcke;
import javax.swing.JPanel;

import Ball.Ball;
import frames.Hauptfenster;

public class CBloecke 
{
	public JPanel[] aPanels = new JPanel[51];
	private Ball oBall = new Ball();
	
	public void bloeckePos()
	{
		System.out.println("Blöcke");
		aPanels = Hauptfenster.getPanels();
		System.out.println(aPanels);
		
		for(int i =  aPanels.length; i>=0; i--)
		{
			System.out.println(""+aPanels[i]);
			
			if(oBall.getBallx()>= aPanels[i].getX())
			{
				aPanels[i].removeAll();
			}
			
			if(oBall.getBally()>= aPanels[i].getY())
			{
				aPanels[i].removeAll();
			}
			
			if(Hauptfenster.getBallHoehe()>= aPanels[i].getHeight())
			{
				aPanels[i].removeAll();
			}
			
			if(Hauptfenster.getBallBreite()>= aPanels[i].getWidth())
			{
				aPanels[i].removeAll();
			}
			
		}
		
	}
}
