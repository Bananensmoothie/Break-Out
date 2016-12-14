package frames;

import java.awt.BorderLayout;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Ball.Ball;
import Schlaeger.Schlaeger;
import interfaces.IFarben;
import interfaces.IFensterEigenschaften;
import interfaces.ISchriften;
import listeners.EnterHauptfenster;
import listeners.WindowListener;
import net.miginfocom.swing.MigLayout;
import spieler.Spieler;

public class Hauptfenster extends JFrame implements IFensterEigenschaften, IFarben, ISchriften
{
	private JPanel pSpielstand;
	private JPanel pRot1_1;
	private JPanel pRot1_2;
	private JPanel pRot1_3;
	private JPanel pRot1_4;
	private JPanel pRot1_5;
	private JPanel pRot1_6;
	private JPanel pRot1_7;
	private JPanel pRot1_8;
	private JPanel pRot1_9;
	private JPanel pRot1_10;
	private JPanel pOrange1_1;
	private JPanel pOrange1_2;
	private JPanel pOrange1_3;
	private JPanel pOrange1_4;
	private JPanel pOrange1_5;
	private JPanel pOrange1_6;
	private JPanel pOrange1_7;
	private JPanel pOrange1_8;
	private JPanel pOrange1_9;
	private JPanel pOrange1_10;
	private JPanel pGelb1_1;
	private JPanel pGelb1_2;
	private JPanel pGelb1_3;
	private JPanel pGelb1_4;
	private JPanel pGelb1_5;
	private JPanel pGelb1_6;
	private JPanel pGelb1_7;
	private JPanel pGelb1_8;
	private JPanel pGelb1_9;
	private JPanel pGelb1_10;
	private JPanel pGruen1_1;
	private JPanel pGruen1_2;
	private JPanel pGruen1_3;
	private JPanel pGruen1_4;
	private JPanel pGruen1_5;
	private JPanel pGruen1_6;
	private JPanel pGruen1_7;
	private JPanel pGruen1_8;
	private JPanel pGruen1_9;
	private JPanel pGruen1_10;
	private JPanel pBlau1_1;
	private JPanel pBlau1_2;
	private JPanel pBlau1_3;
	private JPanel pBlau1_4;
	private JPanel pBlau1_5;
	private JPanel pBlau1_6;
	private JPanel pBlau1_7;
	private JPanel pBlau1_8;
	private JPanel pBlau1_9;
	private JPanel pBlau1_10;
	
	private static JPanel[] aPanels = new JPanel[50];
	
	private JPanel pBenutzerebene;

	private static Hauptfenster oHauptfenster;
	private static JLabel lblSpielstandText;
	private static JLabel lblBall;
	private static JPanel pBall;
	private static JPanel cpHauptfenser;
	private static ImageIcon imBall = new ImageIcon(Hauptfenster.class.getResource("/images/Ball.png"));
	
	private Timer oTimer = new Timer();
	
	/**
	 * Create the frame.
	 */
	public Hauptfenster()
	{
		initializeFenster();
	}

	private void initializeFenster()
	{
		oHauptfenster = this;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addKeyListener(new EnterHauptfenster());
		addWindowListener(new WindowListener(this));
		setVisible(true);
		setFocusable(true);
		setIconImage(FENSTER_SYMBOL);
		setTitle("Break\u002DOut");
		setSize(FENSTER_BREITE, FENSTER_HOEHE);
		setMinimumSize(MINIMALE_GROESSE);
		setMaximumSize(MAXIMALE_GROESSE);
		setLocation(FENSTER_POSITION);
		getContentPane().setLayout(new BorderLayout());
		
		cpHauptfenser = new JPanel();
		setFocusable(true);
		cpHauptfenser.setBackground(GUI_HINTERGRUND);
		cpHauptfenser.setBorder(new EmptyBorder(5, 5, 5, 5));
		cpHauptfenser.setLayout(new MigLayout("", "[grow][grow][grow][grow][grow][grow][grow][grow][grow][grow]", "[grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow]"));

		pSpielstand = new JPanel();
		pSpielstand.setBackground(VIOLETT);
		
		lblSpielstandText = new JLabel(getSpielstandLabelText());
		lblSpielstandText.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpielstandText.setFont(SCHRIFT_NORMAL_FETT);
		lblSpielstandText.setForeground(WEISSE_SCHRIFT);
		pSpielstand.add(lblSpielstandText);
		
		pRot1_1 = new JPanel();
		pRot1_1.setBackground(ROT);
		cpHauptfenser.add(pRot1_1, "cell 0 0,grow");

		pRot1_2 = new JPanel();
		pRot1_2.setBackground(ROT);
		pRot1_2.setLocation(pRot1_2.getX(), pRot1_2.getY());
		cpHauptfenser.add(pRot1_2, "cell 1 0,grow");

		pRot1_3 = new JPanel();
		pRot1_3.setBackground(ROT);
		cpHauptfenser.add(pRot1_3, "cell 2 0,grow");

		pRot1_4 = new JPanel();
		pRot1_4.setBackground(ROT);
		cpHauptfenser.add(pRot1_4, "cell 3 0,grow");

		pRot1_5 = new JPanel();
		pRot1_5.setBackground(ROT);
		cpHauptfenser.add(pRot1_5, "cell 4 0,grow");

		pRot1_6 = new JPanel();
		pRot1_6.setBackground(ROT);
		cpHauptfenser.add(pRot1_6, "cell 5 0,grow");

		pRot1_7 = new JPanel();
		pRot1_7.setBackground(ROT);
		cpHauptfenser.add(pRot1_7, "cell 6 0,grow");

		pRot1_8 = new JPanel();
		pRot1_8.setBackground(ROT);
		cpHauptfenser.add(pRot1_8, "cell 7 0,grow");

		pRot1_9 = new JPanel();
		pRot1_9.setBackground(ROT);
		cpHauptfenser.add(pRot1_9, "cell 8 0,grow");

		pRot1_10 = new JPanel();
		pRot1_10.setBackground(ROT);
		cpHauptfenser.add(pRot1_10, "cell 9 0,grow");

		pOrange1_1 = new JPanel();
		pOrange1_1.setBackground(ORANGE);
		cpHauptfenser.add(pOrange1_1, "cell 0 1,grow");

		pOrange1_2 = new JPanel();
		pOrange1_2.setBackground(ORANGE);
		cpHauptfenser.add(pOrange1_2, "cell 1 1,grow");

		pOrange1_3 = new JPanel();
		pOrange1_3.setBackground(ORANGE);
		cpHauptfenser.add(pOrange1_3, "cell 2 1,grow");

		pOrange1_4 = new JPanel();
		pOrange1_4.setBackground(ORANGE);
		cpHauptfenser.add(pOrange1_4, "cell 3 1,grow");

		pOrange1_5 = new JPanel();
		pOrange1_5.setBackground(ORANGE);
		cpHauptfenser.add(pOrange1_5, "cell 4 1,grow");

		pOrange1_6 = new JPanel();
		pOrange1_6.setBackground(ORANGE);
		cpHauptfenser.add(pOrange1_6, "cell 5 1,grow");

		pOrange1_7 = new JPanel();
		pOrange1_7.setBackground(ORANGE);
		cpHauptfenser.add(pOrange1_7, "cell 6 1,grow");
		
		pOrange1_8 = new JPanel();
		pOrange1_8.setBackground(ORANGE);
		cpHauptfenser.add(pOrange1_8, "cell 7 1,grow");

		pOrange1_9 = new JPanel();
		pOrange1_9.setBackground(ORANGE);
		cpHauptfenser.add(pOrange1_9, "cell 8 1,grow");

		pOrange1_10 = new JPanel();
		pOrange1_10.setBackground(ORANGE);
		cpHauptfenser.add(pOrange1_10, "cell 9 1,grow");

		pGelb1_1 = new JPanel();
		pGelb1_1.setBackground(GELB);
		cpHauptfenser.add(pGelb1_1, "cell 0 2,grow");

		pGelb1_2 = new JPanel();
		pGelb1_2.setBackground(GELB);
		cpHauptfenser.add(pGelb1_2, "cell 1 2,grow");

		pGelb1_3 = new JPanel();
		pGelb1_3.setBackground(GELB);
		cpHauptfenser.add(pGelb1_3, "cell 2 2,grow");

		pGelb1_4 = new JPanel();
		pGelb1_4.setBackground(GELB);
		cpHauptfenser.add(pGelb1_4, "cell 3 2,grow");

		pGelb1_5 = new JPanel();
		pGelb1_5.setBackground(GELB);
		cpHauptfenser.add(pGelb1_5, "cell 4 2,grow");
		
		pGelb1_6 = new JPanel();
		pGelb1_6.setBackground(GELB);
		cpHauptfenser.add(pGelb1_6, "cell 5 2,grow");

		pGelb1_7 = new JPanel();
		pGelb1_7.setBackground(GELB);
		cpHauptfenser.add(pGelb1_7, "cell 6 2,grow");

		pGelb1_8 = new JPanel();
		pGelb1_8.setBackground(GELB);
		cpHauptfenser.add(pGelb1_8, "cell 7 2,grow");

		pGelb1_9 = new JPanel();
		pGelb1_9.setBackground(GELB);
		cpHauptfenser.add(pGelb1_9, "cell 8 2,grow");

		pGelb1_10 = new JPanel();
		pGelb1_10.setBackground(GELB);
		cpHauptfenser.add(pGelb1_10, "cell 9 2,grow");

		pGruen1_1 = new JPanel();
		pGruen1_1.setBackground(GRUEN);
		cpHauptfenser.add(pGruen1_1, "cell 0 3,grow");

		pGruen1_2 = new JPanel();
		pGruen1_2.setBackground(GRUEN);
		cpHauptfenser.add(pGruen1_2, "cell 1 3,grow");

		pGruen1_3 = new JPanel();
		pGruen1_3.setBackground(GRUEN);
		cpHauptfenser.add(pGruen1_3, "cell 2 3,grow");

		pGruen1_4 = new JPanel();
		pGruen1_4.setBackground(GRUEN);
		cpHauptfenser.add(pGruen1_4, "cell 3 3,grow");

		pGruen1_5 = new JPanel();
		pGruen1_5.setBackground(GRUEN);
		cpHauptfenser.add(pGruen1_5, "cell 4 3,grow");

		pGruen1_6 = new JPanel();
		pGruen1_6.setBackground(GRUEN);
		cpHauptfenser.add(pGruen1_6, "cell 5 3,grow");
		
		pGruen1_7 = new JPanel();
		pGruen1_7.setBackground(GRUEN);
		cpHauptfenser.add(pGruen1_7, "cell 6 3,grow");

		pGruen1_8 = new JPanel();
		pGruen1_8.setBackground(GRUEN);
		cpHauptfenser.add(pGruen1_8, "cell 7 3,grow");

		pGruen1_9 = new JPanel();
		pGruen1_9.setBackground(GRUEN);
		cpHauptfenser.add(pGruen1_9, "cell 8 3,grow");

		pGruen1_10 = new JPanel();
		pGruen1_10.setBackground(GRUEN);
		cpHauptfenser.add(pGruen1_10, "cell 9 3,grow");

		pBlau1_1 = new JPanel();
		pBlau1_1.setBackground(HELL_BLAU);
		cpHauptfenser.add(pBlau1_1, "cell 0 4,grow");

		pBlau1_2 = new JPanel();
		pBlau1_2.setBackground(HELL_BLAU);
		cpHauptfenser.add(pBlau1_2, "cell 1 4,grow");
		
		pBlau1_3 = new JPanel();
		pBlau1_3.setBackground(HELL_BLAU);
		cpHauptfenser.add(pBlau1_3, "cell 2 4,grow");

		pBlau1_4 = new JPanel();
		pBlau1_4.setBackground(HELL_BLAU);
		cpHauptfenser.add(pBlau1_4, "cell 3 4,grow");

		pBlau1_5 = new JPanel();
		pBlau1_5.setBackground(HELL_BLAU);
		cpHauptfenser.add(pBlau1_5, "cell 4 4,grow");

		pBlau1_6 = new JPanel();
		pBlau1_6.setBackground(HELL_BLAU);
		cpHauptfenser.add(pBlau1_6, "cell 5 4,grow");

		pBlau1_7 = new JPanel();
		pBlau1_7.setBackground(HELL_BLAU);
		cpHauptfenser.add(pBlau1_7, "cell 6 4,grow");

		pBlau1_8 = new JPanel();
		pBlau1_8.setBackground(HELL_BLAU);
		cpHauptfenser.add(pBlau1_8, "cell 7 4,grow");

		pBlau1_9 = new JPanel();
		pBlau1_9.setBackground(HELL_BLAU);
		cpHauptfenser.add(pBlau1_9, "cell 8 4,grow");

		pBlau1_10 = new JPanel();
		pBlau1_10.setBackground(HELL_BLAU);
		cpHauptfenser.add(pBlau1_10, "cell 9 4,grow");

		lblBall = new JLabel();
		lblBall.setIcon(imBall);
		cpHauptfenser.add(lblBall, "cell 4 8,alignx center,aligny center");

		pBenutzerebene = new JPanel();
		pBenutzerebene.setBackground(PINK);
		cpHauptfenser.add(pBenutzerebene, "flowx,cell 4 9 2 1,growx,aligny bottom");
		
		getContentPane().add(pSpielstand, BorderLayout.NORTH);
		getContentPane().add(cpHauptfenser, BorderLayout.CENTER);
	}
	
	private void initializeSpiel()
	{
		new Schlaeger(pBenutzerebene);
		Spieler.setLeben(3);
		Spieler.setPunktestand(0);
	}
	
	private static String getSpielstandLabelText()
	{
		return "Name: "+ Startfenster.getSpielername() + "               ||               Leben: " + Spieler.getLeben()
				+ "               ||               Punkte: " + String.format("%,.0f", Spieler.getPunktestand());
	}

	public void timerStarten()
	{
		TimerTask oTimerTask = new Task();
		oTimer.schedule(oTimerTask, 0, 5);
		initializeSpiel();
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

	// *******************************
		
	public JPanel getpBall()
	{
		return pBall;
	}

	public void setpBall(int pBallx, int pBally)
	{
		pBall.setLocation(pBallx, pBally);
		System.out.println("setpBall");
		cpHauptfenser.repaint();
	}
	
	// *****************************

	public static int getSpielfeldBreite()
	{
		return cpHauptfenser.getWidth();
	}
	
	public static int getBallBreite()
	{
		return imBall.getIconWidth();
	}
	
	public static int getSpielfeldHoehe()
	{
		return cpHauptfenser.getHeight();
	}

	public static int getBallHoehe()
	{
		return imBall.getIconHeight();
	}

	public static JLabel getLBLBall()
	{
		return lblBall;
	}
	
	public JPanel[] getPanels()
	{
		aPanels[0] = pRot1_1;
		aPanels[1] = pRot1_2;
		aPanels[2] = pRot1_3;
		aPanels[3] = pRot1_4;
		aPanels[4] = pRot1_5;
		aPanels[5] = pRot1_6;
		aPanels[6] = pRot1_7;
		aPanels[7] = pRot1_8;
		aPanels[8] = pRot1_9;
		aPanels[9] = pRot1_10;
		aPanels[10] = pOrange1_1;
		aPanels[11] = pOrange1_2;
		aPanels[12] = pOrange1_3;
		aPanels[13] = pOrange1_4;
		aPanels[14] = pOrange1_5;
		aPanels[15] = pOrange1_6;
		aPanels[16] = pOrange1_7;
		aPanels[17] = pOrange1_8;
		aPanels[18] = pOrange1_9;
		aPanels[19] = pOrange1_10;
		aPanels[20] = pGelb1_1;
		aPanels[21] = pGelb1_2;
		aPanels[22] = pGelb1_3;
		aPanels[23] = pGelb1_4;
		aPanels[24] = pGelb1_5;
		aPanels[25] = pGelb1_6;
		aPanels[26] = pGelb1_7;
		aPanels[27] = pGelb1_8;
		aPanels[28] = pGelb1_9;
		aPanels[29] = pGelb1_10;
		aPanels[30] = pGruen1_1;
		aPanels[31] = pGruen1_2;
		aPanels[32] = pGruen1_3;
		aPanels[33] = pGruen1_4;
		aPanels[34] = pGruen1_5;
		aPanels[35] = pGruen1_6;
		aPanels[36] = pGruen1_7;
		aPanels[37] = pGruen1_8;
		aPanels[38] = pGruen1_9;
		aPanels[39] = pGruen1_10;
		aPanels[40] = pBlau1_1;
		aPanels[41] = pBlau1_2;
		aPanels[42] = pBlau1_3;
		aPanels[43] = pBlau1_4;
		aPanels[44] = pBlau1_5;
		aPanels[45] = pBlau1_6;
		aPanels[46] = pBlau1_7;
		aPanels[47] = pBlau1_8;
		aPanels[48] = pBlau1_9;
		aPanels[49] = pBlau1_10;
		
		return aPanels;
	}
	
//**************************************	
	private class Task extends TimerTask
	{
		Ball oBall = new Ball();

		@Override
		public void run()
		{
			oBall.BallBewegen();
			bloeckePos();
		}
		
		public void bloeckePos()
		{
			System.out.println("Blöcke");
			
			if(oBall.getBallx() == aPanels[1].getX())
			{
				aPanels[1].setVisible(false);
			}
//			
//			System.out.println(aPanels);
//			
//			for(int i =  aPanels.length -1; i>0; i--)
//			{
//				System.out.println(""+aPanels[i]);
//				
//				if(oBall.getBallx()>= aPanels[i].getX())
//				{
//					aPanels[i].removeAll();
//				}
//				
//				if(oBall.getBally()>= aPanels[i].getY())
//				{
//					aPanels[i].removeAll();
//				}
//			}
		}
	}
}