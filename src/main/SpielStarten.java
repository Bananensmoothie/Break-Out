package main;

import java.awt.EventQueue;

import frames.Startfenster;

/**
 * Von dieser Klasse aus wird das <b>Spiel gestartet</b>.<br>
 * <i>In der main-Methode wird das Startfenster ge�ffent</i> und man kann daraufhin zu spielen beginnen.
 * 
 * @version 1.0
 * 
 * @author Thomas Mader-Ofer
 * @author Manuel Glantschnig
 * @author Jonas H�rtnagl
 * @author Cristina Erhart
 */
public class SpielStarten
{
	/**
	 * Die <i>main-Methode</i> <b>startet das Spiel</b> und der Spa� kann beginnen!
	 * @param args Laufzeitparameter werden in diesem Programm nicht ben�tigt
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try											//Folgendes wird versucht...
				{
					new Startfenster();						//Die Klasse Startfenster wird aufgerufen.
				}
				catch (Exception e)							//Wenn dies nicht funktioniert, so wird folgendes ausgefuehrt.
				{
					e.printStackTrace();					//Eine Fehlermeldung wird ausgegeben.
				}
			}
		});
	}
}