package frames;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import interfaces.IFarben;
import interfaces.IFensterEigenschaften;
import interfaces.ISchriften;
import listeners.ButtonListener;
import listeners.TextfieldListener;
import listeners.WindowListener;
import net.miginfocom.swing.MigLayout;

public class Startfenster extends JFrame implements IFensterEigenschaften, IFarben, ISchriften
{
	private static String spielername;
	private static JTextField txtSpielername;
	private static JButton btnSpielStarten;
	private static JButton btnHighscore;
	
	private JPanel cpWillkommen;
	private JPanel pWillkommen;
	private JPanel pAnleitung;
	private JLabel lblZielDesSpiels1;
	private JLabel lblZielDesSpiels2;
	private JLabel lblZielDesSpiels3;
	private JLabel lblZielDesSpiels4;
	private JLabel lblZielDesSpiels5;
	private JLabel lblZielDesSpiels6;
	private JLabel lblZielDesSpiels7;
	private JLabel lblZielDesSpiels8;
	private JLabel lblInformationenZuBreakout;
	private JLabel lblWillkommenBei;
	private JLabel lblBreakOut;

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
					new Startfenster();
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
	public Startfenster()
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
		setTitle("Willkommen");
		setSize(FENSTER_BREITE, FENSTER_HOEHE);
		setMinimumSize(MINIMALE_GROESSE);
		setMaximumSize(MAXIMALE_GROESSE);
		setLocation(FENSTER_POSITION);
		
		cpWillkommen = new JPanel();
		cpWillkommen.setBackground(GUI_HINTERGRUND);
		cpWillkommen.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(cpWillkommen);
		cpWillkommen.setLayout(new MigLayout("", "[182px][grow][165px][364px,grow][166px][181px]",
				"[grow][137px][grow][286px][grow][29px]"));

		pWillkommen = new JPanel();
		pWillkommen.setForeground(VIOLETT);
		pWillkommen.setBackground(GELB);
		cpWillkommen.add(pWillkommen, "cell 3 1,grow");
		GridBagLayout gbl_pWillkommen = new GridBagLayout();
		gbl_pWillkommen.columnWidths = new int[] { 109, 0, 99, 0 };
		gbl_pWillkommen.rowHeights = new int[] { 27, 0, 0, 0, 0 };
		gbl_pWillkommen.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pWillkommen.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pWillkommen.setLayout(gbl_pWillkommen);

		lblWillkommenBei = new JLabel("Willkommen bei");
		lblWillkommenBei.setForeground(VIOLETT);
		lblWillkommenBei.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		GridBagConstraints gbc_lblWillkommen = new GridBagConstraints();
		gbc_lblWillkommen.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblWillkommen.insets = new Insets(0, 0, 5, 5);
		gbc_lblWillkommen.gridx = 1;
		gbc_lblWillkommen.gridy = 1;
		pWillkommen.add(lblWillkommenBei, gbc_lblWillkommen);

		lblBreakOut = new JLabel("Break\u002DOut");
		lblBreakOut.setFont(SCHRIFT_GROSS_FETT);
		lblBreakOut.setForeground(VIOLETT);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 2;
		pWillkommen.add(lblBreakOut, gbc_lblNewLabel);

		txtSpielername = new JTextField("Bitte hier Ihren Spielername eingeben");
		txtSpielername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtSpielername.setToolTipText("Bitte geben Sie hier Ihren Spielernamen ein\u0021");
		txtSpielername.addKeyListener(new TextfieldListener(this, txtSpielername));
		txtSpielername.addFocusListener(new TextfieldListener(this, txtSpielername));
		cpWillkommen.add(txtSpielername, "cell 3 2,growx");

		pAnleitung = new JPanel();
		pAnleitung.setBackground(VIOLETT);
		cpWillkommen.add(pAnleitung, "cell 0 3 6 1,grow");
		GridBagLayout gbl_pAnleitung = new GridBagLayout();
		gbl_pAnleitung.columnWidths = new int[] { 1058, 0 };
		gbl_pAnleitung.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_pAnleitung.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_pAnleitung.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		pAnleitung.setLayout(gbl_pAnleitung);

		lblInformationenZuBreakout = new JLabel("Informationen zu Break\u002DOut\u003A");
		lblInformationenZuBreakout.setFont(SCHRIFT_MITTEL_FETT);
		lblInformationenZuBreakout.setForeground(HELL_GRAU);
		GridBagConstraints gbc_lblInformationenZuBreakout = new GridBagConstraints();
		gbc_lblInformationenZuBreakout.anchor = GridBagConstraints.NORTH;
		gbc_lblInformationenZuBreakout.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblInformationenZuBreakout.insets = new Insets(0, 0, 5, 0);
		gbc_lblInformationenZuBreakout.gridx = 0;
		gbc_lblInformationenZuBreakout.gridy = 0;
		pAnleitung.add(lblInformationenZuBreakout, gbc_lblInformationenZuBreakout);

		lblZielDesSpiels1 = new JLabel("Ziel des Spiels ist es\u002C so viele Punkte wie m\u00F6glich zu erzielen\u002E");
		lblZielDesSpiels1.setForeground(GELBE_SCHRIFT);
		lblZielDesSpiels1.setFont(SCHRIFT_NORMAL);
		GridBagConstraints gbc_lblZielDesSpiels1 = new GridBagConstraints();
		gbc_lblZielDesSpiels1.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblZielDesSpiels1.insets = new Insets(0, 0, 5, 0);
		gbc_lblZielDesSpiels1.gridx = 0;
		gbc_lblZielDesSpiels1.gridy = 1;
		pAnleitung.add(lblZielDesSpiels1, gbc_lblZielDesSpiels1);

		lblZielDesSpiels2 = new JLabel("Dies erfolgt mittels Abschie\u00DFen der bunten Bl\u00F6cke auf der oberen Seite des Spiels\u002E");
		lblZielDesSpiels2.setForeground(GELBE_SCHRIFT);
		lblZielDesSpiels2.setFont(SCHRIFT_NORMAL);
		GridBagConstraints gbc_lblZielDesSpiels2 = new GridBagConstraints();
		gbc_lblZielDesSpiels2.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblZielDesSpiels2.insets = new Insets(0, 0, 5, 0);
		gbc_lblZielDesSpiels2.gridx = 0;
		gbc_lblZielDesSpiels2.gridy = 2;
		pAnleitung.add(lblZielDesSpiels2, gbc_lblZielDesSpiels2);
		
		lblZielDesSpiels3 = new JLabel("Diese Bl\u00F6cke k\u00F6nnen mittels einem sich selbst bewegenden\u002C wei\u00DFen Ball abgeschossen werden\u002E");
		lblZielDesSpiels3.setForeground(GELBE_SCHRIFT);
		lblZielDesSpiels3.setFont(SCHRIFT_NORMAL);
		GridBagConstraints gbc_lblZielDesSpiels3 = new GridBagConstraints();
		gbc_lblZielDesSpiels3.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblZielDesSpiels3.insets = new Insets(0, 0, 5, 0);
		gbc_lblZielDesSpiels3.gridx = 0;
		gbc_lblZielDesSpiels3.gridy = 3;
		pAnleitung.add(lblZielDesSpiels3, gbc_lblZielDesSpiels3);
		
		lblZielDesSpiels4 = new JLabel("Sie k\u00F6nnen die rosane Benutzerfl\u00E4che im unteren Bereich des Spiels nach rechts und links bewegen\u002E");
		lblZielDesSpiels4.setForeground(GELBE_SCHRIFT);
		lblZielDesSpiels4.setFont(SCHRIFT_NORMAL);
		GridBagConstraints gbc_lblZielDesSpiels4 = new GridBagConstraints();
		gbc_lblZielDesSpiels4.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblZielDesSpiels4.insets = new Insets(0, 0, 5, 0);
		gbc_lblZielDesSpiels4.gridx = 0;
		gbc_lblZielDesSpiels4.gridy = 4;
		pAnleitung.add(lblZielDesSpiels4, gbc_lblZielDesSpiels4);
		
		lblZielDesSpiels5 = new JLabel("Hiermit verhindern Sie\u002C dass der wei\u00DFe Ball aus dem Spielfeld hinausfliegt\u002E");
		lblZielDesSpiels5.setForeground(GELBE_SCHRIFT);
		lblZielDesSpiels5.setFont(SCHRIFT_NORMAL);
		GridBagConstraints gbc_lblZielDesSpiels5 = new GridBagConstraints();
		gbc_lblZielDesSpiels5.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblZielDesSpiels5.insets = new Insets(0, 0, 5, 0);
		gbc_lblZielDesSpiels5.gridx = 0;
		gbc_lblZielDesSpiels5.gridy = 5;
		pAnleitung.add(lblZielDesSpiels5, gbc_lblZielDesSpiels5);
		
		lblZielDesSpiels6 = new JLabel("Wenn dieser Ball dreimal aus dem Spielfeld geflogen ist\u002C");
		lblZielDesSpiels6.setForeground(GELBE_SCHRIFT);
		lblZielDesSpiels6.setFont(SCHRIFT_NORMAL);
		GridBagConstraints gbc_lblZielDesSpiels6 = new GridBagConstraints();
		gbc_lblZielDesSpiels6.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblZielDesSpiels6.insets = new Insets(0, 0, 5, 0);
		gbc_lblZielDesSpiels6.gridx = 0;
		gbc_lblZielDesSpiels6.gridy = 6;
		pAnleitung.add(lblZielDesSpiels6, gbc_lblZielDesSpiels6);
		
		lblZielDesSpiels7 = new JLabel("ist das Spiel beendet und Sie k\u00F6nnen Ihren erspielten Punktestand im Ranking der Highsoretabelle genauer betrachten\u002E");
		lblZielDesSpiels7.setForeground(GELBE_SCHRIFT);
		lblZielDesSpiels7.setFont(SCHRIFT_NORMAL);
		GridBagConstraints gbc_lblZielDesSpiels7 = new GridBagConstraints();
		gbc_lblZielDesSpiels7.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblZielDesSpiels7.insets = new Insets(0, 0, 5, 0);
		gbc_lblZielDesSpiels7.gridx = 0;
		gbc_lblZielDesSpiels7.gridy = 7;
		pAnleitung.add(lblZielDesSpiels7, gbc_lblZielDesSpiels7);
		
		lblZielDesSpiels8 = new JLabel("Sie k\u00F6nnen w\u00E4hrend des Spiels jederzeit Ihren aktuellen Punktestand sowie Ihre noch zur verf\u00FCgungstehenden Leben abrufen\u002E");
		lblZielDesSpiels8.setForeground(GELBE_SCHRIFT);
		lblZielDesSpiels8.setFont(SCHRIFT_NORMAL);
		GridBagConstraints gbc_lblZielDesSpiels8 = new GridBagConstraints();
		gbc_lblZielDesSpiels8.insets = new Insets(0, 0, 5, 0);
		gbc_lblZielDesSpiels8.anchor = GridBagConstraints.WEST;
		gbc_lblZielDesSpiels8.gridx = 0;
		gbc_lblZielDesSpiels8.gridy = 8;
		pAnleitung.add(lblZielDesSpiels8, gbc_lblZielDesSpiels8);

		btnSpielStarten = new JButton("Spiel starten");
		btnSpielStarten.setFont(SCHRIFT_NORMAL_FETT);
		btnSpielStarten.setEnabled(false);
		btnSpielStarten.addActionListener(new ButtonListener(this, ButtonListener.START_GAME));
		cpWillkommen.add(btnSpielStarten, "cell 0 5,alignx center,aligny center");

		btnHighscore = new JButton("Highscore\u00B4s");
		btnHighscore.setFont(SCHRIFT_NORMAL_FETT);
		btnHighscore.addActionListener(new ButtonListener(this, ButtonListener.SHOW_HIGHSCORES));
		cpWillkommen.add(btnHighscore, "cell 5 5,alignx center,aligny center");
	}

	public static String getSpielername()
	{
		return spielername;
	}

	public static void setSpielername(String spielername)
	{
		Startfenster.spielername = spielername;
	}

	/**
	 * @return the txtSpielername
	 */
	public static JTextField getTxtSpielername()
	{
		return txtSpielername;
	}

	/**
	 * @return the btnSpielStarten
	 */
	public static JButton getBtnSpielStarten()
	{
		return btnSpielStarten;
	}

	/**
	 * @return the btnHighscore
	 */
	public static JButton getBtnHighscore()
	{
		return btnHighscore;
	}
}