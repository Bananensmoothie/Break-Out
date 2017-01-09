package frames;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import interfaces.IFarben;
import interfaces.IFensterEigenschaften;
import interfaces.ISchriften;
import listeners.ButtonListener;
import listeners.WindowListener;
import verarbeiten.Tabelle;

public class Highscorefenster extends JFrame implements IFensterEigenschaften, IFarben, ISchriften
{
	private JPanel cpHighsore;
	private JPanel pHighsore;
	private JPanel pHighsoreAusgabe;
	private JPanel pSpielernamen;
	private JPanel pPlatzierungen;
	private JPanel pPunkte;
	private JLabel lblHighscore;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_11;
	private static JLabel lblPlatz1;
	private static JLabel lblPlatz2;
	private static JLabel lblPlatz3;
	private static JLabel lblPlatz4;
	private static JLabel lblPlatz5;
	private static JLabel lblPlatz6;
	private static JLabel lblPlatz7;
	private static JLabel lblPlatz8;
	private static JLabel lblPlatz9;
	private static JLabel lblPlatz10;
	private static JLabel lblPlatz11;
	private static JLabel lblPlatz12;
	private static JLabel lblPlatz13;
	private static JLabel lblPlatz14;
	private static JLabel lblPunktePlatz1;
	private static JLabel lblPunktePlatz2;
	private static JLabel lblPunktePlatz3;
	private static JLabel lblPunktePlatz4;
	private static JLabel lblPunktePlatz5;
	private static JLabel lblPunktePlatz6;
	private static JLabel lblPunktePlatz7;
	private static JLabel lblPunktePlatz8;
	private static JLabel lblPunktePlatz9;
	private static JLabel lblPunktePlatz10;
	private static JLabel lblPunktePlatz11;
	private static JLabel lblPunktePlatz12;
	private static JLabel lblPunktePlatz13;
	private static JLabel lblPunktePlatz14;
	private static JButton btnZumStartfenster;

	/**
	 * Create the frame.
	 */
	public Highscorefenster()
	{
		initialize();
		new Tabelle();
	}

	private void initialize()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addWindowListener(new WindowListener(this));
		setVisible(true);
		setResizable(false);
		setIconImage(FENSTER_SYMBOL);
		setTitle("Highscore\u00B4s");
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

		lblHighscore = new JLabel("Highscore\u00B4s");
		lblHighscore.setFont(SCHRIFT_GROSS_FETT);
		lblHighscore.setForeground(HELL_GRAU);
		pHighsore.add(lblHighscore);

		pHighsoreAusgabe = new JPanel();
		pHighsoreAusgabe.setBackground(GUI_HINTERGRUND);
		pHighsoreAusgabe.setLayout(new BorderLayout());
		cpHighsore.add(pHighsoreAusgabe, BorderLayout.CENTER);
		
		pPlatzierungen = new JPanel();
		pPlatzierungen.setBackground(GUI_HINTERGRUND);
		pPlatzierungen.setLayout(new BoxLayout(pPlatzierungen, BoxLayout.Y_AXIS));
		pHighsoreAusgabe.add(pPlatzierungen, BorderLayout.WEST);
		
		pSpielernamen = new JPanel();
		pSpielernamen.setBackground(GUI_HINTERGRUND);
		pSpielernamen.setLayout(new BoxLayout(pSpielernamen, BoxLayout.Y_AXIS));
		pHighsoreAusgabe.add(pSpielernamen, BorderLayout.CENTER);
		
		pPunkte = new JPanel();
		pPunkte.setBackground(GUI_HINTERGRUND);
		pPunkte.setLayout(new BoxLayout(pPunkte, BoxLayout.Y_AXIS));
		pHighsoreAusgabe.add(pPunkte, BorderLayout.EAST);
		
		label_1 = new JLabel("1. ");
		label_1.setFont(SCHRIFT_GROSS_FETT);
		label_1.setForeground(WEISSE_SCHRIFT);
		pPlatzierungen.add(label_1);
		
		lblPlatz1 = new JLabel();
		lblPlatz1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlatz1.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz1.setForeground(WEISSE_SCHRIFT);
		pSpielernamen.add(lblPlatz1);
		
		lblPunktePlatz1 = new JLabel();
		lblPunktePlatz1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblPunktePlatz1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPunktePlatz1.setFont(SCHRIFT_GROSS_FETT);
		lblPunktePlatz1.setForeground(WEISSE_SCHRIFT);
		pPunkte.add(lblPunktePlatz1);
		
		label_2 = new JLabel("2. ");
		label_2.setFont(SCHRIFT_GROSS_FETT);
		label_2.setForeground(WEISSE_SCHRIFT);
		pPlatzierungen.add(label_2);
		
		lblPlatz2 = new JLabel();
		lblPlatz2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlatz2.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz2.setForeground(WEISSE_SCHRIFT);
		pSpielernamen.add(lblPlatz2);
		
		lblPunktePlatz2 = new JLabel();
		lblPunktePlatz2.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblPunktePlatz2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPunktePlatz2.setFont(SCHRIFT_GROSS_FETT);
		lblPunktePlatz2.setForeground(WEISSE_SCHRIFT);
		pPunkte.add(lblPunktePlatz2);
		
		label_3 = new JLabel("3. ");
		label_3.setFont(SCHRIFT_GROSS_FETT);
		label_3.setForeground(WEISSE_SCHRIFT);
		pPlatzierungen.add(label_3);
		
		lblPlatz3 = new JLabel();
		lblPlatz3.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlatz3.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz3.setForeground(WEISSE_SCHRIFT);
		pSpielernamen.add(lblPlatz3);
		
		lblPunktePlatz3 = new JLabel();
		lblPunktePlatz3.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblPunktePlatz3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPunktePlatz3.setFont(SCHRIFT_GROSS_FETT);
		lblPunktePlatz3.setForeground(WEISSE_SCHRIFT);
		pPunkte.add(lblPunktePlatz3);
		
		label_4 = new JLabel("4. ");
		label_4.setFont(SCHRIFT_GROSS_FETT);
		label_4.setForeground(WEISSE_SCHRIFT);
		pPlatzierungen.add(label_4);
		
		lblPlatz4 = new JLabel();
		lblPlatz4.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlatz4.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz4.setForeground(WEISSE_SCHRIFT);
		pSpielernamen.add(lblPlatz4);
		
		lblPunktePlatz4 = new JLabel();
		lblPunktePlatz4.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblPunktePlatz4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPunktePlatz4.setFont(SCHRIFT_GROSS_FETT);
		lblPunktePlatz4.setForeground(WEISSE_SCHRIFT);
		pPunkte.add(lblPunktePlatz4);
		
		label_5 = new JLabel("5. ");
		label_5.setFont(SCHRIFT_GROSS_FETT);
		label_5.setForeground(WEISSE_SCHRIFT);
		pPlatzierungen.add(label_5);
		
		lblPlatz5 = new JLabel();
		lblPlatz5.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlatz5.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz5.setForeground(WEISSE_SCHRIFT);
		pSpielernamen.add(lblPlatz5);
		
		lblPunktePlatz5 = new JLabel();
		lblPunktePlatz5.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblPunktePlatz5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPunktePlatz5.setFont(SCHRIFT_GROSS_FETT);
		lblPunktePlatz5.setForeground(WEISSE_SCHRIFT);
		pPunkte.add(lblPunktePlatz5);
		
		label_6 = new JLabel("6. ");
		label_6.setFont(SCHRIFT_GROSS_FETT);
		label_6.setForeground(WEISSE_SCHRIFT);
		pPlatzierungen.add(label_6);
		
		lblPlatz6 = new JLabel();
		lblPlatz6.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlatz6.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz6.setForeground(WEISSE_SCHRIFT);
		pSpielernamen.add(lblPlatz6);
		
		lblPunktePlatz6 = new JLabel();
		lblPunktePlatz6.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblPunktePlatz6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPunktePlatz6.setFont(SCHRIFT_GROSS_FETT);
		lblPunktePlatz6.setForeground(WEISSE_SCHRIFT);
		pPunkte.add(lblPunktePlatz6);
		
		label_7 = new JLabel("7. ");
		label_7.setFont(SCHRIFT_GROSS_FETT);
		label_7.setForeground(WEISSE_SCHRIFT);
		pPlatzierungen.add(label_7);
		
		lblPlatz7 = new JLabel();
		lblPlatz7.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlatz7.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz7.setForeground(WEISSE_SCHRIFT);
		pSpielernamen.add(lblPlatz7);
		
		lblPunktePlatz7 = new JLabel();
		lblPunktePlatz7.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblPunktePlatz7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPunktePlatz7.setFont(SCHRIFT_GROSS_FETT);
		lblPunktePlatz7.setForeground(WEISSE_SCHRIFT);
		pPunkte.add(lblPunktePlatz7);
		
		label_8 = new JLabel("8. ");
		label_8.setFont(SCHRIFT_GROSS_FETT);
		label_8.setForeground(WEISSE_SCHRIFT);
		pPlatzierungen.add(label_8);
		
		lblPlatz8 = new JLabel();
		lblPlatz8.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlatz8.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz8.setForeground(WEISSE_SCHRIFT);
		pSpielernamen.add(lblPlatz8);
		
		lblPunktePlatz8 = new JLabel();
		lblPunktePlatz8.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblPunktePlatz8.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPunktePlatz8.setFont(SCHRIFT_GROSS_FETT);
		lblPunktePlatz8.setForeground(WEISSE_SCHRIFT);
		pPunkte.add(lblPunktePlatz8);
		
		label_9 = new JLabel("9. ");
		label_9.setFont(SCHRIFT_GROSS_FETT);
		label_9.setForeground(WEISSE_SCHRIFT);
		pPlatzierungen.add(label_9);
		
		lblPlatz9 = new JLabel();
		lblPlatz9.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlatz9.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz9.setForeground(WEISSE_SCHRIFT);
		pSpielernamen.add(lblPlatz9);
		
		lblPunktePlatz9 = new JLabel();
		lblPunktePlatz9.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblPunktePlatz9.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPunktePlatz9.setFont(SCHRIFT_GROSS_FETT);
		lblPunktePlatz9.setForeground(WEISSE_SCHRIFT);
		pPunkte.add(lblPunktePlatz9);
		
		label_10 = new JLabel("10. ");
		label_10.setFont(SCHRIFT_GROSS_FETT);
		label_10.setForeground(WEISSE_SCHRIFT);
		pPlatzierungen.add(label_10);
		
		lblPlatz10 = new JLabel();
		lblPlatz10.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlatz10.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz10.setForeground(WEISSE_SCHRIFT);
		pSpielernamen.add(lblPlatz10);
		
		lblPunktePlatz10 = new JLabel();
		lblPunktePlatz10.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblPunktePlatz10.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPunktePlatz10.setFont(SCHRIFT_GROSS_FETT);
		lblPunktePlatz10.setForeground(WEISSE_SCHRIFT);
		pPunkte.add(lblPunktePlatz10);
		
		label_11 = new JLabel("11. ");
		label_11.setFont(SCHRIFT_GROSS_FETT);
		label_11.setForeground(WEISSE_SCHRIFT);
		pPlatzierungen.add(label_11);
		
		lblPlatz11 = new JLabel();
		lblPlatz11.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlatz11.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz11.setForeground(WEISSE_SCHRIFT);
		pSpielernamen.add(lblPlatz11);
		
		lblPunktePlatz11 = new JLabel();
		lblPunktePlatz11.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblPunktePlatz11.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPunktePlatz11.setFont(SCHRIFT_GROSS_FETT);
		lblPunktePlatz11.setForeground(WEISSE_SCHRIFT);
		pPunkte.add(lblPunktePlatz11);
		
		label_12 = new JLabel("12. ");
		label_12.setFont(SCHRIFT_GROSS_FETT);
		label_12.setForeground(WEISSE_SCHRIFT);
		pPlatzierungen.add(label_12);
		
		lblPlatz12 = new JLabel();
		lblPlatz12.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlatz12.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz12.setForeground(WEISSE_SCHRIFT);
		pSpielernamen.add(lblPlatz12);
		
		lblPunktePlatz12 = new JLabel();
		lblPunktePlatz12.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblPunktePlatz12.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPunktePlatz12.setFont(SCHRIFT_GROSS_FETT);
		lblPunktePlatz12.setForeground(WEISSE_SCHRIFT);
		pPunkte.add(lblPunktePlatz12);
		
		label_13 = new JLabel("13. ");
		label_13.setFont(SCHRIFT_GROSS_FETT);
		label_13.setForeground(WEISSE_SCHRIFT);
		pPlatzierungen.add(label_13);
		
		lblPlatz13 = new JLabel();
		lblPlatz13.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlatz13.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz13.setForeground(WEISSE_SCHRIFT);
		pSpielernamen.add(lblPlatz13);
		
		lblPunktePlatz13 = new JLabel();
		lblPunktePlatz13.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblPunktePlatz13.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPunktePlatz13.setFont(SCHRIFT_GROSS_FETT);
		lblPunktePlatz13.setForeground(WEISSE_SCHRIFT);
		pPunkte.add(lblPunktePlatz13);
		
		label_14 = new JLabel("14. ");
		label_14.setFont(SCHRIFT_GROSS_FETT);
		label_14.setForeground(WEISSE_SCHRIFT);
		pPlatzierungen.add(label_14);
		
		lblPlatz14 = new JLabel();
		lblPlatz14.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlatz14.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz14.setForeground(WEISSE_SCHRIFT);
		pSpielernamen.add(lblPlatz14);
		
		lblPunktePlatz14 = new JLabel();
		lblPunktePlatz14.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblPunktePlatz14.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPunktePlatz14.setFont(SCHRIFT_GROSS_FETT);
		lblPunktePlatz14.setForeground(WEISSE_SCHRIFT);
		pPunkte.add(lblPunktePlatz14);
		
		btnZumStartfenster = new JButton("Zum Startfenster");
		btnZumStartfenster.setVerticalAlignment(SwingConstants.BOTTOM);
		btnZumStartfenster.setFont(SCHRIFT_GROSS_FETT);
		btnZumStartfenster.addActionListener(new ButtonListener(this, ButtonListener.SHOW_STARTFENSTER));
		pHighsoreAusgabe.add(btnZumStartfenster, BorderLayout.SOUTH);
	}

	/**
	 * @return the lblPlatz1
	 */
	public static JLabel getLblPlatz1()
	{
		return lblPlatz1;
	}

	/**
	 * @return the lblPlatz2
	 */
	public static JLabel getLblPlatz2()
	{
		return lblPlatz2;
	}

	/**
	 * @return the lblPlatz3
	 */
	public static JLabel getLblPlatz3()
	{
		return lblPlatz3;
	}

	/**
	 * @return the lblPlatz4
	 */
	public static JLabel getLblPlatz4()
	{
		return lblPlatz4;
	}

	/**
	 * @return the lblPlatz5
	 */
	public static JLabel getLblPlatz5()
	{
		return lblPlatz5;
	}

	/**
	 * @return the lblPlatz6
	 */
	public static JLabel getLblPlatz6()
	{
		return lblPlatz6;
	}

	/**
	 * @return the lblPlatz7
	 */
	public static JLabel getLblPlatz7()
	{
		return lblPlatz7;
	}

	/**
	 * @return the lblPlatz8
	 */
	public static JLabel getLblPlatz8()
	{
		return lblPlatz8;
	}

	/**
	 * @return the lblPlatz9
	 */
	public static JLabel getLblPlatz9()
	{
		return lblPlatz9;
	}

	/**
	 * @return the lblPlatz10
	 */
	public static JLabel getLblPlatz10()
	{
		return lblPlatz10;
	}

	/**
	 * @return the lblPlatz11
	 */
	public static JLabel getLblPlatz11()
	{
		return lblPlatz11;
	}

	/**
	 * @return the lblPlatz12
	 */
	public static JLabel getLblPlatz12()
	{
		return lblPlatz12;
	}

	/**
	 * @return the lblPlatz13
	 */
	public static JLabel getLblPlatz13()
	{
		return lblPlatz13;
	}

	/**
	 * @return the lblPlatz14
	 */
	public static JLabel getLblPlatz14()
	{
		return lblPlatz14;
	}

	/**
	 * @return the lblPunktePlatz1
	 */
	public static JLabel getLblPunktePlatz1()
	{
		return lblPunktePlatz1;
	}

	/**
	 * @return the lblPunktePlatz2
	 */
	public static JLabel getLblPunktePlatz2()
	{
		return lblPunktePlatz2;
	}

	/**
	 * @return the lblPunktePlatz3
	 */
	public static JLabel getLblPunktePlatz3()
	{
		return lblPunktePlatz3;
	}

	/**
	 * @return the lblPunktePlatz4
	 */
	public static JLabel getLblPunktePlatz4()
	{
		return lblPunktePlatz4;
	}

	/**
	 * @return the lblPunktePlatz5
	 */
	public static JLabel getLblPunktePlatz5()
	{
		return lblPunktePlatz5;
	}

	/**
	 * @return the lblPunktePlatz6
	 */
	public static JLabel getLblPunktePlatz6()
	{
		return lblPunktePlatz6;
	}

	/**
	 * @return the lblPunktePlatz7
	 */
	public static JLabel getLblPunktePlatz7()
	{
		return lblPunktePlatz7;
	}

	/**
	 * @return the lblPunktePlatz8
	 */
	public static JLabel getLblPunktePlatz8()
	{
		return lblPunktePlatz8;
	}

	/**
	 * @return the lblPunktePlatz9
	 */
	public static JLabel getLblPunktePlatz9()
	{
		return lblPunktePlatz9;
	}

	/**
	 * @return the lblPunktePlatz10
	 */
	public static JLabel getLblPunktePlatz10()
	{
		return lblPunktePlatz10;
	}

	/**
	 * @return the lblPunktePlatz11
	 */
	public static JLabel getLblPunktePlatz11()
	{
		return lblPunktePlatz11;
	}

	/**
	 * @return the lblPunktePlatz12
	 */
	public static JLabel getLblPunktePlatz12()
	{
		return lblPunktePlatz12;
	}

	/**
	 * @return the lblPunktePlatz13
	 */
	public static JLabel getLblPunktePlatz13()
	{
		return lblPunktePlatz13;
	}

	/**
	 * @return the lblPunktePlatz14
	 */
	public static JLabel getLblPunktePlatz14()
	{
		return lblPunktePlatz14;
	}
}