package frames;

import java.awt.BorderLayout;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import ball.Ball;
import interfaces.IFarben;
import interfaces.IFensterEigenschaften;
import interfaces.ISchriften;
import listeners.EnterHauptfenster;
import listeners.WindowListener;
import schlaeger.Schlaeger;
import spieler.Spieler;

public class Hauptfenster extends JFrame implements IFensterEigenschaften, IFarben, ISchriften
{
	private static final int GUI_SPALTEN = 10;
	private static final int GUI_ZEILEN = 10;
	
	private JPanel pSpielstand;
	private JPanel pBenutzerebene;
	
	private Timer oTimer;
	
	private static JPanel[][] aPanel = new JPanel[50][50];
	
	private static Hauptfenster oHauptfenster;
	private static JLabel lblSpielstandText;
	private static JLabel lblBall;
	private static JPanel pBall;
	private static JPanel cpHauptfenster;
	private static ImageIcon imBall = new ImageIcon(Hauptfenster.class.getResource("/images/Ball.png"));

	/**
	 * Create the frame.
	 */
	public Hauptfenster()
	{
		initializeFenster();
	}

	public static void arraygetPanels()
	{
		for (int iZeile = 0; iZeile < GUI_ZEILEN; iZeile++)
		{
			for (int iSpalte = 0; iSpalte < GUI_SPALTEN; iSpalte++)
			{
				Ball.setPanels(aPanel[iZeile][iSpalte], iZeile, iSpalte);
			}
		}
	}

	private void initializeFenster()
	{
		oHauptfenster = this;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addKeyListener(new EnterHauptfenster());
		addWindowListener(new WindowListener(this));
		setVisible(true);
		setFocusable(true);
		setResizable(false);
		setFocusable(true);
		setIconImage(FENSTER_SYMBOL);
		setTitle("Break\u002DOut");
		setSize(FENSTER_BREITE, FENSTER_HOEHE);
		setMinimumSize(MINIMALE_GROESSE);
		setMaximumSize(MAXIMALE_GROESSE);
		setLocation(FENSTER_POSITION);
		getContentPane().setLayout(new BorderLayout());

		setCpHauptfenster(new JPanel());
		
		getCpHauptfenster().setBackground(GUI_HINTERGRUND);
		getCpHauptfenster().setBorder(new EmptyBorder(5, 5, 5, 5));
		getCpHauptfenster().setLayout(null);
		
		oHauptfenster.add(getCpHauptfenster(), BorderLayout.CENTER);
		setVisible(true);	// nötig, damit der Schläger richtig angezeigt wird!!!

		lblSpielstandText = new JLabel(getSpielstandLabelText());
		lblSpielstandText.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpielstandText.setFont(SCHRIFT_NORMAL_FETT);
		lblSpielstandText.setForeground(WEISSE_SCHRIFT);
		
		pSpielstand = new JPanel();
		pSpielstand.setBackground(VIOLETT);
		pSpielstand.add(lblSpielstandText);
		getContentPane().add(pSpielstand, BorderLayout.NORTH);
		
		generateBloecke();

		lblBall = new JLabel();
		lblBall.setIcon(imBall);
		
		pBall = new JPanel();
		pBall.setBackground(GUI_HINTERGRUND);
		pBall.setSize(imBall.getIconWidth(), imBall.getIconHeight() + 10);
		pBall.add(lblBall);
		getCpHauptfenster().add(pBall);
		
		Ball.setStartPosition();

		pBenutzerebene = new JPanel();
		pBenutzerebene.setBackground(PINK);
		pBenutzerebene.setSize(200, 10);
		new Schlaeger(pBenutzerebene);
		getCpHauptfenster().add(pBenutzerebene);

		getContentPane().add(pSpielstand, BorderLayout.NORTH);
		getContentPane().add(getCpHauptfenster(), BorderLayout.CENTER);

		initializeSpiel();
		showSpielInformation();
	}

	private void initializeSpiel()
	{
		Spieler.setLeben(3);
		Spieler.setPunktestand(0);
	}

	private void showSpielInformation()
	{
		JOptionPane.showMessageDialog(	getHauptfenster(), "Zum Starten des Spiels\u002C oder wenn Sie ein Leben verlieren ENTER dr\u00FCcken\u002E\n"
		                              					 + "\n"
														 + "\u0021 \u0021 \u0021 ACHTUNG \u0021 \u0021 \u0021\n"
														 + "Bei Bet\u00E4tigung der ENTER\u002DTaste fliegt der Ball automatisch los\u0021",
										"Information", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private void generateBloecke()
	{
		int xPos = 5;
		int yPos = 5;
		
		for (int iZeile = 0; iZeile < GUI_ZEILEN; iZeile++)
		{
			for (int iSpalte = 0; iSpalte < GUI_SPALTEN; iSpalte++)
			{
				switch (iZeile)
				{
					case 0:
						JPanel pRot = new JPanel();
						pRot.setLocation(xPos, yPos);
						pRot.setSize(105, 50);
						pRot.setBackground(ROT);
						aPanel[iZeile][iSpalte] = pRot;
						getCpHauptfenster().add(pRot);
						xPos += 109;
						break;

					case 1:
						JPanel pOrange = new JPanel();
						pOrange.setLocation(xPos, yPos);
						pOrange.setSize(105, 50);
						pOrange.setBackground(ORANGE);
						aPanel[iZeile][iSpalte] = pOrange;
						getCpHauptfenster().add(pOrange);
						xPos += 109;
						break;

					case 2:
						JPanel pGelb = new JPanel();
						pGelb.setLocation(xPos, yPos);
						pGelb.setSize(105, 50);
						pGelb.setBackground(GELB);
						aPanel[iZeile][iSpalte] = pGelb;
						getCpHauptfenster().add(pGelb);
						xPos += 109;
						break;

					case 3:
						JPanel pGruen = new JPanel();
						pGruen.setLocation(xPos, yPos);
						pGruen.setSize(105, 50);
						pGruen.setBackground(GRUEN);
						aPanel[iZeile][iSpalte] = pGruen;
						getCpHauptfenster().add(pGruen);
						xPos += 109;
						break;

					case 4:
						JPanel pBlau = new JPanel();
						pBlau.setLocation(xPos, yPos);
						pBlau.setSize(105, 50);
						pBlau.setBackground(HELL_BLAU);
						aPanel[iZeile][iSpalte] = pBlau;
						getCpHauptfenster().add(pBlau);
						xPos += 109;
						break;
				}
			}
			xPos = 5;
			yPos += 55;
		}
	}

	private void setCpHauptfenster(JPanel cpHauptfenster)
	{
		Hauptfenster.cpHauptfenster = cpHauptfenster;
	}

	private static String getSpielstandLabelText()
	{
		return "Name: "+ Spieler.getSpielername() + "               ||               Leben: " + Spieler.getLeben()
				+ "               ||               Punkte: " + String.format("%,.0f", Spieler.getPunktestand());
	}

	public void timerStarten()
	{
		oTimer = new Timer();
		TimerTask oTimerTask = new Task();
		oTimer.schedule(oTimerTask, 0, 5);
	}

	public void timerStoppen()
	{
		oTimer.cancel();
		oTimer.purge();
	}

	public static void updateSpielstandLabelText()
	{
		lblSpielstandText.setText(getSpielstandLabelText());
	}

	public static Hauptfenster getHauptfenster()
	{
		return oHauptfenster;
	}

	public static JPanel getBall()
	{
		return pBall;
	}

	public static int getSpielfeldBreite()
	{
		return getCpHauptfenster().getWidth();
	}

	public static int getBallBreite()
	{
		return pBall.getWidth();
	}

	public static int getBallHoehe()
	{
		return pBall.getHeight();
	}

	public static int getSpielfeldHoehe()
	{
		return getCpHauptfenster().getHeight();
	}

	public static JPanel getCpHauptfenster()
	{
		return cpHauptfenster;
	}

	// **************************************

	private class Task extends TimerTask
	{
		@Override
		public void run()
		{
			Ball.bewegen();
		}
	}
}