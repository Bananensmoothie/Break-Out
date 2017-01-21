package main;

import java.awt.EventQueue;

import frames.Startfenster;

/**
 * Von dieser Klasse aus wird das <b>Spiel gestartet</b>.<br>
 * <i>In der main-Methode wird das Startfenster geöffent</i> und man kann daraufhin zu spielen beginnen.
 * 
 * @version 1.0
 * 
 * @author Thomas Mader-Ofer
 * @author Manuel Glantschnig
 * @author Jonas Hörtnagl
 * @author Cristina Erhart
 */
public class SpielStarten
{
	/**
	 * Die <i>main-Methode</i> <b>startet das Spiel</b> und der Spaß kann beginnen!
	 * @param args Laufzeitparameter werden in diesem Programm nicht benötigt
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					new Startfenster();	//ein neues Startfenster wird geöffnet
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
}