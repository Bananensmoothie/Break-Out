package frames;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

public class Highscorefenster extends JFrame
{
	private JPanel cpHighsore;
	private JPanel pHighsore;
	private JLabel lblHigesore;
	private JPanel pHighsoreAusgabe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Highscorefenster frame = new Highscorefenster();
					frame.setVisible(true);
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
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Highscorefenster.class.getResource("/images/Logo.jpg")));
		
		setTitle("Higesore`s");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 700);
		cpHighsore = new JPanel();
		cpHighsore.setBackground(Color.DARK_GRAY);
		cpHighsore.setBorder(new EmptyBorder(5, 5, 5, 5));
		cpHighsore.setLayout(new BorderLayout(0, 0));
		setContentPane(cpHighsore);
		
		pHighsore = new JPanel();
		pHighsore.setBackground(new Color(138, 43, 226));
		cpHighsore.add(pHighsore, BorderLayout.NORTH);
		
		lblHigesore = new JLabel("Highesore\u00B4s");
		lblHigesore.setFont(new Font("Tempus Sans ITC", Font.BOLD, 30));
		lblHigesore.setForeground(new Color(255, 240, 245));
		pHighsore.add(lblHigesore);
		
		pHighsoreAusgabe = new JPanel();
		pHighsoreAusgabe.setBackground(Color.DARK_GRAY);
		cpHighsore.add(pHighsoreAusgabe, BorderLayout.CENTER);
	}
}
