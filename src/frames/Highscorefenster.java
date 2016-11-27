package frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import interfaces.IFarben;
import interfaces.IFensterEigenschaften;
import interfaces.ISchriften;

public class Highscorefenster extends JFrame implements IFensterEigenschaften, IFarben, ISchriften
{
	private JLabel lblHigesore;
	private JPanel cpHighsore;
	private JPanel pHighsore;
	private JPanel pHighsoreAusgabe;
	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					new Highscorefenster();
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Highscorefenster()
	{
		initialize();
	}
	
	private void initialize()
	{
		setVisible(true);
		setResizable(false);
		setIconImage(FENSTER_SYMBOL);
		setTitle("Highscore\u00B4s");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(FENSTER_BREITE, FENSTER_HOEHE);
		setMinimumSize(MINIMALE_GROESSE);
		setMaximumSize(MAXIMALE_GROESSE);
		setLocation(FENSTER_POSITION);
		
		cpHighsore = new JPanel();
		cpHighsore.setBackground(GUI_HINTERGRUND);
		cpHighsore.setBorder(new EmptyBorder(5, 5, 5, 5));
		cpHighsore.setLayout(new BorderLayout(0, 0));
		setContentPane(cpHighsore);

		pHighsore = new JPanel();
		pHighsore.setBackground(VIOLETT);
		cpHighsore.add(pHighsore, BorderLayout.NORTH);

		lblHigesore = new JLabel("Highesore\u00B4s");
		lblHigesore.setFont(SCHRIFT_GROSS_FETT);
		lblHigesore.setForeground(HELL_GRAU);
		pHighsore.add(lblHigesore);

		pHighsoreAusgabe = new JPanel();
		pHighsoreAusgabe.setBackground(GUI_HINTERGRUND);
		cpHighsore.add(pHighsoreAusgabe, BorderLayout.CENTER);
	}
}