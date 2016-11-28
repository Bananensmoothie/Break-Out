package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import frames.Hauptfenster;
import frames.Highscorefenster;
import frames.Startfenster;

/**
 * @author Manuel Glantschnig
 * @version 1.0
 */
public class ButtonListener implements ActionListener
{
	public static final int START_GAME = 0;
	public static final int SHOW_HIGHSCORES = 1;
	public static final int SHOW_STARTFENSTER = 2;
	private int taskOfButton;
	private JFrame referenceFrame;
	
	/**
	 * @param taskOfButton
	 * @param referenceFrame
	 */
	public ButtonListener(JFrame referenceFrame, int taskOfButton)
	{
		this.taskOfButton = taskOfButton;
		this.referenceFrame = referenceFrame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (taskOfButton == START_GAME)
		{
			referenceFrame.setVisible(false);
			new Hauptfenster();
			referenceFrame.dispose();
		}
		
		if (taskOfButton == SHOW_HIGHSCORES)
		{
			referenceFrame.setVisible(false);
			new Highscorefenster();
			referenceFrame.dispose();
		}
		
		if (taskOfButton == SHOW_STARTFENSTER)
		{
			referenceFrame.setVisible(false);
			new Startfenster();
			referenceFrame.dispose();
		}
	}
}