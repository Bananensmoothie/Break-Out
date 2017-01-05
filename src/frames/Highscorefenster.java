package frames;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import interfaces.IFarben;
import interfaces.IFensterEigenschaften;
import interfaces.ISchriften;
import listeners.ButtonListener;
import listeners.WindowListener;
import net.miginfocom.swing.MigLayout;
import verarbeiten.LogDB;
import verarbeiten.Tabelle;

public class Highscorefenster extends JFrame implements IFensterEigenschaften, IFarben, ISchriften
{
//	private LogDB log;
//	private ArrayList<String> tabellenEintraege;
	
	private JPanel cpHighsore;
	private JPanel pHighsore;
	private JPanel pHighsoreAusgabe;
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
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JButton btnZumStartfenster;
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
		cpHighsore.add(pHighsoreAusgabe, BorderLayout.CENTER);
		pHighsoreAusgabe.setLayout(new MigLayout("", "[][][456.00]", "[][][][][][][][][][][][][][][][][][][]"));
		//--------------------------------------------
		label_1 = new JLabel("1. ");
		label_1.setFont(SCHRIFT_GROSS_FETT);
		label_1.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(label_1, "cell 0 0");
		
		lblPlatz1 = new JLabel("WWWWWWWWWWWWWWWWWWWW");
		lblPlatz1.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz1.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPlatz1, "cell 1 0,alignx left,aligny center");
		
		lblPunktePlatz1 = new JLabel("999.999.999.999.999.999");
		lblPunktePlatz1.setFont(SCHRIFT_GROSS_FETT);
		lblPunktePlatz1.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPunktePlatz1, "cell 2 0,alignx right,aligny center");
		//--------------------------------------------
		label_2 = new JLabel("2. ");
		label_2.setFont(SCHRIFT_GROSS_FETT);
		label_2.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(label_2, "cell 0 1");
		
		lblPlatz2 = new JLabel("New label");
		lblPlatz2.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz2.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPlatz2, "cell 1 1,alignx left,aligny center");

		lblPunktePlatz2 = new JLabel("New label");
		lblPunktePlatz2.setFont(SCHRIFT_GROSS_FETT);
		lblPunktePlatz2.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPunktePlatz2, "cell 2 1,alignx right,aligny center");
		//--------------------------------------------
		label_3 = new JLabel("3. ");
		label_3.setFont(SCHRIFT_GROSS_FETT);
		label_3.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(label_3, "cell 0 2");
		
		lblPlatz3 = new JLabel("New label");
		lblPlatz3.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz3.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPlatz3, "cell 1 2,alignx left,aligny center");

		lblPunktePlatz3 = new JLabel("New label");
		lblPunktePlatz3.setFont(SCHRIFT_GROSS_FETT);
		lblPunktePlatz3.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPunktePlatz3, "cell 2 2,alignx right,aligny center");
		//--------------------------------------------
		label_4 = new JLabel("4. ");
		label_4.setFont(SCHRIFT_GROSS_FETT);
		label_4.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(label_4, "cell 0 3");
		
		lblPlatz4 = new JLabel("New label");
		lblPlatz4.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz4.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPlatz4, "cell 1 3,alignx left,aligny center");

		lblPunktePlatz4 = new JLabel("New label");
		lblPunktePlatz4.setFont(SCHRIFT_GROSS_FETT);
		lblPunktePlatz4.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPunktePlatz4, "cell 2 3,alignx right,aligny center");
		//--------------------------------------------
		label_5 = new JLabel("5. ");
		label_5.setFont(SCHRIFT_GROSS_FETT);
		label_5.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(label_5, "cell 0 4");
		
		lblPlatz5 = new JLabel("New label");
		lblPlatz5.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz5.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPlatz5, "cell 1 4,alignx left,aligny center");

		lblPunktePlatz5 = new JLabel("New label");
		lblPunktePlatz5.setFont(SCHRIFT_GROSS_FETT);
		lblPunktePlatz5.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPunktePlatz5, "cell 2 4,alignx right,aligny center");
		//--------------------------------------------
		label_6 = new JLabel("6. ");
		label_6.setFont(SCHRIFT_GROSS_FETT);
		label_6.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(label_6, "cell 0 5");
		
		lblPlatz6 = new JLabel("New label");
		lblPlatz6.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz6.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPlatz6, "cell 1 5,alignx left,aligny center");

		lblPunktePlatz6 = new JLabel("New label");
		lblPunktePlatz6.setFont(SCHRIFT_GROSS_FETT);
		lblPunktePlatz6.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPunktePlatz6, "cell 2 5,alignx right,aligny center");
		//--------------------------------------------
		label_7 = new JLabel("7. ");
		label_7.setFont(SCHRIFT_GROSS_FETT);
		label_7.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(label_7, "cell 0 6");
		
		lblPlatz7 = new JLabel("New label");
		lblPlatz7.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz7.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPlatz7, "cell 1 6,alignx left,aligny center");

		lblPunktePlatz7 = new JLabel("New label");
		lblPunktePlatz7.setFont(SCHRIFT_GROSS_FETT);
		lblPunktePlatz7.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPunktePlatz7, "cell 2 6,alignx right,aligny center");
		//--------------------------------------------
		label_8 = new JLabel("8. ");
		label_8.setFont(SCHRIFT_GROSS_FETT);
		label_8.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(label_8, "cell 0 7");
		
		lblPlatz8 = new JLabel("New label");
		lblPlatz8.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz8.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPlatz8, "cell 1 7,alignx left,aligny center");

		lblPunktePlatz8 = new JLabel("New label");
		lblPunktePlatz8.setFont(SCHRIFT_GROSS_FETT);
		lblPunktePlatz8.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPunktePlatz8, "cell 2 7,alignx right,aligny center");
		//--------------------------------------------
		label_9 = new JLabel("9. ");
		label_9.setFont(SCHRIFT_GROSS_FETT);
		label_9.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(label_9, "cell 0 8");
		
		lblPlatz9 = new JLabel("New label");
		lblPlatz9.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz9.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPlatz9, "cell 1 8,alignx left,aligny center");

		lblPunktePlatz9 = new JLabel("New label");
		lblPunktePlatz9.setFont(SCHRIFT_GROSS_FETT);
		lblPunktePlatz9.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPunktePlatz9, "cell 2 8,alignx right,aligny center");
		//--------------------------------------------
		label_10 = new JLabel("10. ");
		label_10.setFont(SCHRIFT_GROSS_FETT);
		label_10.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(label_10, "cell 0 9");
		
		lblPlatz10 = new JLabel("New label");
		lblPlatz10.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz10.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPlatz10, "cell 1 9,alignx left,aligny center");

		lblPunktePlatz10 = new JLabel("New label");
		lblPunktePlatz10.setFont(SCHRIFT_GROSS_FETT);
		lblPunktePlatz10.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPunktePlatz10, "cell 2 9,alignx right,aligny center");
		//--------------------------------------------
		label_11 = new JLabel("11. ");
		label_11.setFont(SCHRIFT_GROSS_FETT);
		label_11.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(label_11, "cell 0 10");
		
		lblPlatz11 = new JLabel("New label");
		lblPlatz11.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz11.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPlatz11, "cell 1 10,alignx left,aligny center");

		lblPunktePlatz11 = new JLabel("New label");
		lblPunktePlatz11.setFont(SCHRIFT_GROSS_FETT);
		lblPunktePlatz11.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPunktePlatz11, "cell 2 10,alignx right,aligny center");
		//--------------------------------------------
		label_12 = new JLabel("12. ");
		label_12.setFont(SCHRIFT_GROSS_FETT);
		label_12.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(label_12, "cell 0 11");
		
		lblPlatz12 = new JLabel("New label");
		lblPlatz12.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz12.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPlatz12, "cell 1 11,alignx left,aligny center");

		lblPunktePlatz12 = new JLabel("New label");
		lblPunktePlatz12.setFont(SCHRIFT_GROSS_FETT);
		lblPunktePlatz12.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPunktePlatz12, "cell 2 11,alignx right,aligny center");
		//--------------------------------------------
		label_13 = new JLabel("13. ");
		label_13.setFont(SCHRIFT_GROSS_FETT);
		label_13.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(label_13, "cell 0 12");
		
		lblPlatz13 = new JLabel("New label");
		lblPlatz13.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz13.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPlatz13, "cell 1 12,alignx left,aligny center");

		lblPunktePlatz13 = new JLabel("New label");
		lblPunktePlatz13.setFont(SCHRIFT_GROSS_FETT);
		lblPunktePlatz13.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPunktePlatz13, "cell 2 12,alignx right,aligny center");
		//--------------------------------------------
		btnZumStartfenster = new JButton("Startfenster");
		btnZumStartfenster.setFont(SCHRIFT_NORMAL_FETT);
		btnZumStartfenster.addActionListener(new ButtonListener(this, ButtonListener.SHOW_STARTFENSTER));
		//--------------------------------------------
		pHighsoreAusgabe.add(btnZumStartfenster, "cell 0 13 2 1,alignx left,aligny center");
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
}