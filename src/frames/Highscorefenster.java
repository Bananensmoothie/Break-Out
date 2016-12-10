package frames;

import java.awt.BorderLayout;
import java.awt.Color;

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

public class Highscorefenster extends JFrame implements IFensterEigenschaften, IFarben, ISchriften
{
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
	
	/**
	 * Create the frame.
	 */
	public Highscorefenster()
	{
		initialize();
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
		pHighsoreAusgabe.setLayout(new MigLayout("", "[][]", "[][][][][][][][][][][][][][][][][][][]"));
		//--------------------------------------------
		label_1 = new JLabel("1. ");
		label_1.setFont(SCHRIFT_GROSS_FETT);
		label_1.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(label_1, "cell 0 0");
		
		lblPlatz1 = new JLabel("New label");
		lblPlatz1.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz1.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPlatz1, "cell 1 0");
		//--------------------------------------------
		label_2 = new JLabel("2. ");
		label_2.setFont(SCHRIFT_GROSS_FETT);
		label_2.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(label_2, "cell 0 1");
		
		lblPlatz2 = new JLabel("New label");
		lblPlatz2.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz2.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPlatz2, "cell 1 1");
		//--------------------------------------------
		label_3 = new JLabel("3. ");
		label_3.setFont(SCHRIFT_GROSS_FETT);
		label_3.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(label_3, "cell 0 2");
		
		lblPlatz3 = new JLabel("New label");
		lblPlatz3.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz3.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPlatz3, "cell 1 2");
		//--------------------------------------------
		label_4 = new JLabel("4. ");
		label_4.setFont(SCHRIFT_GROSS_FETT);
		label_4.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(label_4, "cell 0 3");
		
		lblPlatz4 = new JLabel("New label");
		lblPlatz4.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz4.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPlatz4, "cell 1 3");
		//--------------------------------------------
		label_5 = new JLabel("5. ");
		label_5.setFont(SCHRIFT_GROSS_FETT);
		label_5.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(label_5, "cell 0 4");
		
		lblPlatz5 = new JLabel("New label");
		lblPlatz5.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz5.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPlatz5, "cell 1 4");
		//--------------------------------------------
		label_6 = new JLabel("6. ");
		label_6.setFont(SCHRIFT_GROSS_FETT);
		label_6.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(label_6, "cell 0 5");
		
		lblPlatz6 = new JLabel("New label");
		lblPlatz6.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz6.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPlatz6, "cell 1 5");
		//--------------------------------------------
		label_7 = new JLabel("7. ");
		label_7.setFont(SCHRIFT_GROSS_FETT);
		label_7.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(label_7, "cell 0 6");
		
		lblPlatz7 = new JLabel("New label");
		lblPlatz7.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz7.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPlatz7, "cell 1 6");
		//--------------------------------------------
		label_8 = new JLabel("8. ");
		label_8.setFont(SCHRIFT_GROSS_FETT);
		label_8.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(label_8, "cell 0 7");
		
		lblPlatz8 = new JLabel("New label");
		lblPlatz8.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz8.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPlatz8, "cell 1 7");
		//--------------------------------------------
		label_9 = new JLabel("9. ");
		label_9.setFont(SCHRIFT_GROSS_FETT);
		label_9.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(label_9, "cell 0 8");
		
		lblPlatz9 = new JLabel("New label");
		lblPlatz9.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz9.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPlatz9, "cell 1 8");
		//--------------------------------------------
		label_10 = new JLabel("10. ");
		label_10.setFont(SCHRIFT_GROSS_FETT);
		label_10.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(label_10, "cell 0 9");
		
		lblPlatz10 = new JLabel("New label");
		lblPlatz10.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz10.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPlatz10, "cell 1 9");
		//--------------------------------------------
		label_11 = new JLabel("11. ");
		label_11.setFont(SCHRIFT_GROSS_FETT);
		label_11.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(label_11, "cell 0 10");
		
		lblPlatz11 = new JLabel("New label");
		lblPlatz11.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz11.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPlatz11, "cell 1 10");
		//--------------------------------------------
		label_12 = new JLabel("12. ");
		label_12.setFont(SCHRIFT_GROSS_FETT);
		label_12.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(label_12, "cell 0 11");
		
		lblPlatz12 = new JLabel("New label");
		lblPlatz12.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz12.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPlatz12, "cell 1 11");
		//--------------------------------------------
		label_13 = new JLabel("13. ");
		label_13.setFont(SCHRIFT_GROSS_FETT);
		label_13.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(label_13, "cell 0 12");
		
		lblPlatz13 = new JLabel("New label");
		lblPlatz13.setFont(SCHRIFT_GROSS_FETT);
		lblPlatz13.setForeground(WEISSE_SCHRIFT);
		pHighsoreAusgabe.add(lblPlatz13, "cell 1 12");
		//--------------------------------------------
		btnZumStartfenster = new JButton("Startfenster");
		btnZumStartfenster.setFont(SCHRIFT_NORMAL_FETT);
		btnZumStartfenster.addActionListener(new ButtonListener(this, ButtonListener.SHOW_STARTFENSTER));
		//--------------------------------------------
		pHighsoreAusgabe.add(btnZumStartfenster, "cell 0 13 2 1,alignx left,aligny center");
	}
	
	public static void spielernameEintragen(String spielername)
	{
		// NUR TEST!!!!
		lblPlatz1.setText(spielername);
		lblPlatz1.setForeground(Color.RED);
	}
}