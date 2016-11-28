package frames;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import interfaces.IFarben;
import interfaces.IFensterEigenschaften;
import interfaces.ISchriften;
import listeners.WindowListener;
import net.miginfocom.swing.MigLayout;

public class Hauptfenster extends JFrame implements IFensterEigenschaften, IFarben, ISchriften
{
	private JLabel lblName;
	private JLabel lblLeben;
	private JLabel lblPunkte;
	private JPanel cpHauptfenser;
	private JPanel pName;
	private JPanel PLeben;
	private JPanel pPunkte;
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
	private JPanel pBall;
	private JPanel pBenutzerebene;
	
	/**
	 * Create the frame.
	 */
	public Hauptfenster()
	{
		initialize();
	}

	private void initialize()
	{
		addWindowListener(new WindowListener(this));
		setVisible(true);
		setIconImage(FENSTER_SYMBOL);
		setTitle("Break\u002DOut");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setSize(FENSTER_BREITE, FENSTER_HOEHE);
		setMinimumSize(MINIMALE_GROESSE);
		setMaximumSize(MAXIMALE_GROESSE);
		setLocation(FENSTER_POSITION);
		
		cpHauptfenser = new JPanel();
		cpHauptfenser.setBackground(GUI_HINTERGRUND);
		cpHauptfenser.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(cpHauptfenser);
		cpHauptfenser.setLayout(new MigLayout("", "[grow][grow][grow][grow][grow][grow][grow][grow][grow][grow]",
				"[grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow]"));

		pName = new JPanel();
		pName.setBackground(VIOLETT);
		cpHauptfenser.add(pName, "cell 0 0 4 1,growx,aligny top");

		lblName = new JLabel("Name\u003A ");
		lblName.setFont(SCHRIFT_NORMAL_FETT);
		lblName.setForeground(WEISSE_SCHRIFT);
		pName.add(lblName);

		PLeben = new JPanel();
		PLeben.setBackground(VIOLETT);
		cpHauptfenser.add(PLeben, "cell 4 0 3 1,growx,aligny top");

		lblLeben = new JLabel("Leben\u003A ");
		lblLeben.setFont(SCHRIFT_NORMAL_FETT);
		lblLeben.setForeground(WEISSE_SCHRIFT);
		PLeben.add(lblLeben);

		pPunkte = new JPanel();
		pPunkte.setBackground(VIOLETT);
		cpHauptfenser.add(pPunkte, "cell 7 0 3 1,growx,aligny top");

		lblPunkte = new JLabel("Punkte\u003A ");
		lblPunkte.setFont(SCHRIFT_NORMAL_FETT);
		lblPunkte.setForeground(WEISSE_SCHRIFT);
		pPunkte.add(lblPunkte);

		pRot1_1 = new JPanel();
		pRot1_1.setBackground(ROT);
		cpHauptfenser.add(pRot1_1, "cell 0 1,grow");

		pRot1_2 = new JPanel();
		pRot1_2.setBackground(ROT);
		cpHauptfenser.add(pRot1_2, "cell 1 1,grow");

		pRot1_3 = new JPanel();
		pRot1_3.setBackground(ROT);
		cpHauptfenser.add(pRot1_3, "cell 2 1,grow");

		pRot1_4 = new JPanel();
		pRot1_4.setBackground(ROT);
		cpHauptfenser.add(pRot1_4, "cell 3 1,grow");

		pRot1_5 = new JPanel();
		pRot1_5.setBackground(ROT);
		cpHauptfenser.add(pRot1_5, "cell 4 1,grow");

		pRot1_6 = new JPanel();
		pRot1_6.setBackground(ROT);
		cpHauptfenser.add(pRot1_6, "cell 5 1,grow");

		pRot1_7 = new JPanel();
		pRot1_7.setBackground(ROT);
		cpHauptfenser.add(pRot1_7, "cell 6 1,grow");

		pRot1_8 = new JPanel();
		pRot1_8.setBackground(ROT);
		cpHauptfenser.add(pRot1_8, "cell 7 1,grow");

		pRot1_9 = new JPanel();
		pRot1_9.setBackground(ROT);
		cpHauptfenser.add(pRot1_9, "cell 8 1,grow");

		pRot1_10 = new JPanel();
		pRot1_10.setBackground(ROT);
		cpHauptfenser.add(pRot1_10, "cell 9 1,grow");

		pOrange1_1 = new JPanel();
		pOrange1_1.setBackground(ORANGE);
		cpHauptfenser.add(pOrange1_1, "cell 0 2,grow");

		pOrange1_2 = new JPanel();
		pOrange1_2.setBackground(ORANGE);
		cpHauptfenser.add(pOrange1_2, "cell 1 2,grow");

		pOrange1_3 = new JPanel();
		pOrange1_3.setBackground(ORANGE);
		cpHauptfenser.add(pOrange1_3, "cell 2 2,grow");

		pOrange1_4 = new JPanel();
		pOrange1_4.setBackground(ORANGE);
		cpHauptfenser.add(pOrange1_4, "cell 3 2,grow");

		pOrange1_5 = new JPanel();
		pOrange1_5.setBackground(ORANGE);
		cpHauptfenser.add(pOrange1_5, "cell 4 2,grow");

		pOrange1_6 = new JPanel();
		pOrange1_6.setBackground(ORANGE);
		cpHauptfenser.add(pOrange1_6, "cell 5 2,grow");

		pOrange1_7 = new JPanel();
		pOrange1_7.setBackground(ORANGE);
		cpHauptfenser.add(pOrange1_7, "cell 6 2,grow");

		pOrange1_8 = new JPanel();
		pOrange1_8.setBackground(ORANGE);
		cpHauptfenser.add(pOrange1_8, "cell 7 2,grow");

		pOrange1_9 = new JPanel();
		pOrange1_9.setBackground(ORANGE);
		cpHauptfenser.add(pOrange1_9, "cell 8 2,grow");

		pOrange1_10 = new JPanel();
		pOrange1_10.setBackground(ORANGE);
		cpHauptfenser.add(pOrange1_10, "cell 9 2,grow");

		pGelb1_1 = new JPanel();
		pGelb1_1.setBackground(GELB);
		cpHauptfenser.add(pGelb1_1, "cell 0 3,grow");

		pGelb1_2 = new JPanel();
		pGelb1_2.setBackground(GELB);
		cpHauptfenser.add(pGelb1_2, "cell 1 3,grow");

		pGelb1_3 = new JPanel();
		pGelb1_3.setBackground(GELB);
		cpHauptfenser.add(pGelb1_3, "cell 2 3,grow");

		pGelb1_4 = new JPanel();
		pGelb1_4.setBackground(GELB);
		cpHauptfenser.add(pGelb1_4, "cell 3 3,grow");

		pGelb1_5 = new JPanel();
		pGelb1_5.setBackground(GELB);
		cpHauptfenser.add(pGelb1_5, "cell 4 3,grow");

		pGelb1_6 = new JPanel();
		pGelb1_6.setBackground(GELB);
		cpHauptfenser.add(pGelb1_6, "cell 5 3,grow");

		pGelb1_7 = new JPanel();
		pGelb1_7.setBackground(GELB);
		cpHauptfenser.add(pGelb1_7, "cell 6 3,grow");

		pGelb1_8 = new JPanel();
		pGelb1_8.setBackground(GELB);
		cpHauptfenser.add(pGelb1_8, "cell 7 3,grow");

		pGelb1_9 = new JPanel();
		pGelb1_9.setBackground(GELB);
		cpHauptfenser.add(pGelb1_9, "cell 8 3,grow");

		pGelb1_10 = new JPanel();
		pGelb1_10.setBackground(GELB);
		cpHauptfenser.add(pGelb1_10, "cell 9 3,grow");

		pGruen1_1 = new JPanel();
		pGruen1_1.setBackground(GRUEN);
		cpHauptfenser.add(pGruen1_1, "cell 0 4,grow");

		pGruen1_2 = new JPanel();
		pGruen1_2.setBackground(GRUEN);
		cpHauptfenser.add(pGruen1_2, "cell 1 4,grow");

		pGruen1_3 = new JPanel();
		pGruen1_3.setBackground(GRUEN);
		cpHauptfenser.add(pGruen1_3, "cell 2 4,grow");

		pGruen1_4 = new JPanel();
		pGruen1_4.setBackground(GRUEN);
		cpHauptfenser.add(pGruen1_4, "cell 3 4,grow");

		pGruen1_5 = new JPanel();
		pGruen1_5.setBackground(GRUEN);
		cpHauptfenser.add(pGruen1_5, "cell 4 4,grow");

		pGruen1_6 = new JPanel();
		pGruen1_6.setBackground(GRUEN);
		cpHauptfenser.add(pGruen1_6, "cell 5 4,grow");

		pGruen1_7 = new JPanel();
		pGruen1_7.setBackground(GRUEN);
		cpHauptfenser.add(pGruen1_7, "cell 6 4,grow");

		pGruen1_8 = new JPanel();
		pGruen1_8.setBackground(GRUEN);
		cpHauptfenser.add(pGruen1_8, "cell 7 4,grow");

		pGruen1_9 = new JPanel();
		pGruen1_9.setBackground(GRUEN);
		cpHauptfenser.add(pGruen1_9, "cell 8 4,grow");

		pGruen1_10 = new JPanel();
		pGruen1_10.setBackground(GRUEN);
		cpHauptfenser.add(pGruen1_10, "cell 9 4,grow");

		pBlau1_1 = new JPanel();
		pBlau1_1.setBackground(HELL_BLAU);
		cpHauptfenser.add(pBlau1_1, "cell 0 5,grow");

		pBlau1_2 = new JPanel();
		pBlau1_2.setBackground(HELL_BLAU);
		cpHauptfenser.add(pBlau1_2, "cell 1 5,grow");

		pBlau1_3 = new JPanel();
		pBlau1_3.setBackground(HELL_BLAU);
		cpHauptfenser.add(pBlau1_3, "cell 2 5,grow");

		pBlau1_4 = new JPanel();
		pBlau1_4.setBackground(HELL_BLAU);
		cpHauptfenser.add(pBlau1_4, "cell 3 5,grow");

		pBlau1_5 = new JPanel();
		pBlau1_5.setBackground(HELL_BLAU);
		cpHauptfenser.add(pBlau1_5, "cell 4 5,grow");

		pBlau1_6 = new JPanel();
		pBlau1_6.setBackground(HELL_BLAU);
		cpHauptfenser.add(pBlau1_6, "cell 5 5,grow");

		pBlau1_7 = new JPanel();
		pBlau1_7.setBackground(HELL_BLAU);
		cpHauptfenser.add(pBlau1_7, "cell 6 5,grow");

		pBlau1_8 = new JPanel();
		pBlau1_8.setBackground(HELL_BLAU);
		cpHauptfenser.add(pBlau1_8, "cell 7 5,grow");

		pBlau1_9 = new JPanel();
		pBlau1_9.setBackground(HELL_BLAU);
		cpHauptfenser.add(pBlau1_9, "cell 8 5,grow");

		pBlau1_10 = new JPanel();
		pBlau1_10.setBackground(HELL_BLAU);
		cpHauptfenser.add(pBlau1_10, "cell 9 5,grow");

		pBall = new JPanel();
		pBall.setBackground(HELL_GRAU);
		cpHauptfenser.add(pBall, "cell 4 10,grow");

		pBenutzerebene = new JPanel();
		pBenutzerebene.setBackground(PINK);
		cpHauptfenser.add(pBenutzerebene, "flowx,cell 4 11 2 1,growx,aligny bottom");
	}
}