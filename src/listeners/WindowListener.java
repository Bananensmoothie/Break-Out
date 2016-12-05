package listeners;

import java.awt.Component;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import frames.Hauptfenster;

/**
 * @author Manuel Glantschnig
 * @version 1.0
 */
public class WindowListener extends WindowAdapter
{
	private JFrame referenceFrame;
	
	public WindowListener(JFrame frame)
	{
		referenceFrame = frame;
		referenceFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}
	
	@Override
	public void windowClosing(WindowEvent weEvent)
	{
		Component parentComponent = referenceFrame;
		String warning = "M\u00F6chten Sie das Spiel wirklich beenden\u003F";
		String titel = "Spiel beenden\u003F";
		int optionType = JOptionPane.YES_NO_OPTION;
		int messageType = JOptionPane.QUESTION_MESSAGE;
		Object[] optionen = { "Beenden", "Abbrechen" };
		
		if (referenceFrame instanceof Hauptfenster)
		{
			warning += "\n\nDadurch geht Ihr gesamter Spielfortschritt verloren\u0021";
		}
		
		int optionPane = JOptionPane.showOptionDialog(parentComponent, warning, titel, optionType, messageType, null, optionen, optionen[0]);
		
		if (optionPane == JOptionPane.YES_OPTION)
		{
			System.exit(0);
		}
		
		else
		{
			return;
		}
	}
}