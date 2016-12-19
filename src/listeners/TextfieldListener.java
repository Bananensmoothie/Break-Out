package listeners;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import frames.Startfenster;
import spieler.Spieler;

/**
 * @author Manuel Glantschnig
 * @version 1.0
 */
public final class TextfieldListener extends KeyAdapter implements FocusListener
{
	private static String hinweisTextfieldText;
	
	private int maxZeichenLaenge = 20;
	private JFrame referenceFrame;
	private JTextField referenceTextField;
	
	public TextfieldListener(JFrame frame, JTextField textField)
	{
		referenceFrame = frame;
		referenceTextField = textField;
		
		if (referenceTextField.getText().isEmpty())
		{
			hinweisTextfieldText = null;
		}
		else
		{
			hinweisTextfieldText = referenceTextField.getText();
		}
	}
	
	@Override
	public void keyPressed(KeyEvent keyEvent)
	{
		if (keyEvent.getKeyCode() == KeyEvent.VK_ENTER)
		{
			if (referenceTextField.getText().isEmpty())
			{
				JOptionPane.showMessageDialog(referenceFrame, "Bitte geben Sie einen g\u00FCltigen Spielernamen ein\u0021\n"
															+ "Der Spielername darf nur Buchstaben und Zahlen enthalten\u002E",
															  "Ung\u00FCltiger Name", JOptionPane.ERROR_MESSAGE);
				referenceTextField.setText(null);
				return;
			}
			
			if (referenceTextField.getText().contains(" ") && (referenceTextField.getText().length() < maxZeichenLaenge))
			{
				JOptionPane.showMessageDialog(referenceFrame, "Bitte geben Sie einen Spielernamen ohne Leerzeichen ein\u0021\n"
															+ "Der Spielername darf keine Leerzeichen enthalten\u002E",
															  "Ung\u00FCltiger Name", JOptionPane.ERROR_MESSAGE);
				referenceTextField.setText(null);
				return;
			}
			
			if (referenceTextField.getText().length() > maxZeichenLaenge)
			{
				JOptionPane.showMessageDialog(referenceFrame, "Bitte geben Sie einen k\u00FCrzeren Spielernamen ein\u0021\n"
															+ "Der Spielername darf maximal " + maxZeichenLaenge + " Zeichen lang sein\u002E",
															  "Zu langer Name", JOptionPane.WARNING_MESSAGE);
				referenceTextField.setText(null);
				return;
			}
			
			if (!referenceTextField.getText().matches("[a-zA-Z[0-9]]+") && (referenceTextField.getText().length() < maxZeichenLaenge))
			{
				JOptionPane.showMessageDialog(referenceFrame, "Bitte geben Sie einen Spielernamen ohne Sonderzeichen ein\u0021\n"
															+ "Der Spielername darf keine Sonderzeichen enthalten\u002E",
															  "Ung\u00FCltiger Name", JOptionPane.ERROR_MESSAGE);
				referenceTextField.setText(null);
				return;
			}
			
			if (referenceTextField.getText().matches("[a-zA-Z[0-9]]+"))
			{
				hinweisTextfieldText = referenceTextField.getText();
				Spieler.setSpielername(referenceTextField.getText());
				Startfenster.getTxtSpielername().setText(hinweisTextfieldText);
				Startfenster.getTxtSpielername().setEnabled(false);
				Startfenster.getBtnSpielStarten().setEnabled(true);
			}
		}
	}

	@Override
	public void focusGained(FocusEvent feEvent)
	{
		Startfenster.getTxtSpielername().setText(null);
	}

	@Override
	public void focusLost(FocusEvent feEvent)
	{
		Startfenster.getTxtSpielername().setText(hinweisTextfieldText);
	}
}