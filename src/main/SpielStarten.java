package main;

import java.awt.EventQueue;

import frames.Startfenster;

/**
 * @author Manuel Glantschnig
 * @version 1.0
 */
public class SpielStarten
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					new Startfenster();
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
}