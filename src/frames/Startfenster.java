package frames;

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

/**
 * In der<i>"<b>Startfenster</b>" - Klasse </i> wird das <b>Startfenster dargestellt</b>.<br>
 * Das <i>Startfenster</i> ist das <i>erste Fenster</i>, das der Benutzer zu Gesicht bekommt.<br>
 * <br>
 * Im Startfenster hat der Benutzer die Moelichkeit, sich mittels einer kurzen <b>Spielanleitung</b> unterzuziehen.<br>
 * In deisem Fenster, hat der Spielr auch die einmalige Gelegenheit, sich einen <b>Spielerename</b>n mithilfe des <i>Textfeldes</i> zu geben.<br>
 * Außerdem kann die jeweilige Person ins <b>Highscorefenster</b> wechseln,<br>
 * um dort Informationen, bezueglich <i>Punktestand und dem dazugehoerigen Spielernamen</i>, zu den vorherigen Spielen zu bekommen.<br>
 * <br>
 * Sobald der Spieler seinen <i>Spielernamen eingegeben</i> hat, wird ein <i>Button</i> (mit der Inschrift "Spiel starten") <i>anwaehlbar</i>.<br>
 * Mittels diesem Knopf ist es nun moeglich in <i>Hauptfenster zu wechseln</i> und somit das <i>Spiel</i> zu <i>starten</i>.<br>
 * <br>
 * Diese Klasse <i>erbt</i> von der Klasse <b>"JFrame"</b> und<br>
 * <i>implementiert</i> die Interfaces <b>IFEnsterEigenschaften, IFarben</b> und das Interface <b> ISchriften</b>.<br>
 * 
 * @version 1.0
 * 
 * @author Thomas Mader-Ofer
 * @author Manuel Glantschnig
 * @author Jonas Hörtnagl
 * @author Cristina Erhart
 * 
 */
public class Startfenster extends JFrame implements IFensterEigenschaften, IFarben, ISchriften
{
	private static final long serialVersionUID = 4373566965500848918L;

	/**
	 * Das Textfeld "<i><b>txtSpielername</b></i>" wurde erstellt.<br>
	 */
	private static JTextField txtSpielername;
	
	/**
	 * Der Button "<i><b>btnSpielStarten</b></i>" wurde erstellt.<br>
	 */
	private static JButton btnSpielStarten;
	
	/**
	 * Der Button "<i><b>btnHighscore</b></i>" wurde erstellt.<br>
	 */
	private static JButton btnHighscore;
	
	/**
	 * Das JPanel "<i><b>cpWillkommen</b></i>" wurde erstellt.<br>
	 * Es handelt sich heirbei um die <i>contentPane</i> (= Hintergrund).<br>
	 */
	private JPanel cpWillkommen;
	
	/**
	 * Das JPanel "<i><b>pWillkommen</b></i>" wurde erstellt.<br>
	 * Es handelt sich heirbei um ein <i>Willkommensfenster</i>.<br>
	 */
	private JPanel pWillkommen;
	
	/**
	 * Das JPanel "<i><b>pAnleitung</b></i>" wurde erstellt.<br>
	 * Es handelt sich heirbei um die <i>Speilanleitung</i>.<br>
	 */
	private JPanel pAnleitung;
	
	/**
	 * Das JLabel "<i><b>lblZielDesSpiels1</b></i>" wurde erstellt.<br>
	 * Es handelt sich heirbei um die <i>erste Zeile der Spielanleitung</i>.<br>
	 */
	private JLabel lblZielDesSpiels1;
	
	/**
	 * Das JLabel "<i><b>lblZielDesSpiels2</b></i>" wurde erstellt.<br>
	 * Es handelt sich heirbei um die <i>zweite Zeile der Spielanleitung</i>.<br>
	 */
	private JLabel lblZielDesSpiels2;

	/**
	 * Das JLabel "<i><b>lblZielDesSpiels3</b></i>" wurde erstellt.<br>
	 * Es handelt sich heirbei um die <i>dritte Zeile der Spielanleitung</i>.<br>
	 */
	private JLabel lblZielDesSpiels3;

	/**
	 * Das JLabel "<i><b>lblZielDesSpiels4</b></i>" wurde erstellt.<br>
	 * Es handelt sich heirbei um die <i>vierte Zeile der Spielanleitung</i>.<br>
	 */
	private JLabel lblZielDesSpiels4;

	/**
	 * Das JLabel "<i><b>lblZielDesSpiels5</b></i>" wurde erstellt.<br>
	 * Es handelt sich heirbei um die <i>fuenfte Zeile der Spielanleitung</i>.<br>
	 */
	private JLabel lblZielDesSpiels5;

	/**
	 * Das JLabel "<i><b>lblZielDesSpiels6</b></i>" wurde erstellt.<br>
	 * Es handelt sich heirbei um die <i>sechste Zeile der Spielanleitung</i>.<br>
	 */
	private JLabel lblZielDesSpiels6;

	/**
	 * Das JLabel "<i><b>lblZielDesSpiels7</b></i>" wurde erstellt.<br>
	 * Es handelt sich heirbei um die <i>siebte Zeile der Spielanleitung</i>.<br>
	 */
	private JLabel lblZielDesSpiels7;

	/**
	 * Das JLabel "<i><b>lblZielDesSpiels8</b></i>" wurde erstellt.<br>
	 * Es handelt sich heirbei um die <i>achte Zeile der Spielanleitung</i>.<br>
	 */
	private JLabel lblZielDesSpiels8;

	/**
	 * Das JLabel "<i><b>lblInformationenZuBreakout</b></i>" wurde erstellt.<br>
	 */
	private JLabel lblInformationenZuBreakout;
	
	/**
	 * Das JLabel "<i><b>lblWillkommenBei</b></i>" wurde erstellt.<br>
	 */
	private JLabel lblWillkommenBei;

	/**
	 * Das JLabel "<i><b>lblBrakOut</b></i>" wurde erstellt.<br>
	 */
	private JLabel lblBreakOut;

	/**
	 * Der Konstruktor "<i><b>Startfenster</b></i>" ruft die Methode <b>initialize</b> auf.<br>
	 */
	public Startfenster()
	{
		initialize();										//Die Methode "initialize" wurde aufgerufen.
	}
	
	/**
	 * Die Methode "<i><b>initialize</b></i>" erstellt mithilfe des <i>Windowbuilders</i> die <b>Oberflaeche</b> (= <i>GUI</i>).<br>
	 */
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
		
		cpWillkommen = new JPanel();													//Ein neues Panel wurde generiert.
		cpWillkommen.setBackground(GUI_HINTERGRUND);
		cpWillkommen.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(cpWillkommen);
		cpWillkommen.setLayout(new MigLayout("", "[182px][grow][165px][364px,grow][166px][181px]",
				"[grow][137px][grow][286px][grow][29px]"));

		pWillkommen = new JPanel();														//Ein neues Panel wurde generiert.
		pWillkommen.setForeground(VIOLETT);												//Die Farbe wird auf "Violett" gesetzt.
		pWillkommen.setBackground(GELB);												//Die Hintergrundfarbe wird auf "Gelb" gesetzt.
		cpWillkommen.add(pWillkommen, "cell 3 1,grow");
		GridBagLayout gbl_pWillkommen = new GridBagLayout();
		gbl_pWillkommen.columnWidths = new int[] { 109, 0, 99, 0 };
		gbl_pWillkommen.rowHeights = new int[] { 27, 0, 0, 0, 0 };
		gbl_pWillkommen.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_pWillkommen.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pWillkommen.setLayout(gbl_pWillkommen);

		lblWillkommenBei = new JLabel("Willkommen bei");								//Ein neues Label wird generiert.
		lblWillkommenBei.setForeground(VIOLETT);										//Die Farbe wird auf "violett" gesetzt.
		lblWillkommenBei.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		GridBagConstraints gbc_lblWillkommen = new GridBagConstraints();
		gbc_lblWillkommen.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblWillkommen.insets = new Insets(0, 0, 5, 5);
		gbc_lblWillkommen.gridx = 1;
		gbc_lblWillkommen.gridy = 1;
		pWillkommen.add(lblWillkommenBei, gbc_lblWillkommen);

		lblBreakOut = new JLabel("Break\u002DOut");										//Ein neues Label wird generiert.
		lblBreakOut.setFont(SCHRIFT_GROSS_FETT);
		lblBreakOut.setForeground(VIOLETT);												//Die Farbe wird auf "violett" gesetzt.
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

		pAnleitung = new JPanel();																//Ein neues Panel wurde generiert.
		pAnleitung.setBackground(VIOLETT);														//Die Hintergrundfarbe wird auf "violett" gesetzt.
		cpWillkommen.add(pAnleitung, "cell 0 3 6 1,grow");
		GridBagLayout gbl_pAnleitung = new GridBagLayout();
		gbl_pAnleitung.columnWidths = new int[] { 1058, 0 };
		gbl_pAnleitung.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_pAnleitung.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_pAnleitung.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		pAnleitung.setLayout(gbl_pAnleitung);

		lblInformationenZuBreakout = new JLabel("Informationen zu Break\u002DOut\u003A");		//Ein neues Label wird generiert.
		lblInformationenZuBreakout.setFont(SCHRIFT_MITTEL_FETT);								//Dem Label wird eine "mittlere, fette Schrift" zugewiessen.
		lblInformationenZuBreakout.setForeground(HELL_GRAU);									//Die Farbe wird auf "Hellgrau" gesetzt.
		GridBagConstraints gbc_lblInformationenZuBreakout = new GridBagConstraints();
		gbc_lblInformationenZuBreakout.anchor = GridBagConstraints.NORTH;
		gbc_lblInformationenZuBreakout.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblInformationenZuBreakout.insets = new Insets(0, 0, 5, 0);
		gbc_lblInformationenZuBreakout.gridx = 0;
		gbc_lblInformationenZuBreakout.gridy = 0;
		pAnleitung.add(lblInformationenZuBreakout, gbc_lblInformationenZuBreakout);

		lblZielDesSpiels1 = new JLabel("Ziel des Spiels ist es\u002C so viele Punkte wie m\u00F6glich zu erzielen\u002E");	//Ein neues Label wird generiert.
		lblZielDesSpiels1.setForeground(GELBE_SCHRIFT);								//Dem Label wird eine "gelbe Schrift" zugewiessen.
		lblZielDesSpiels1.setFont(SCHRIFT_NORMAL);									//Dem Label wird eine "normale Schrift" zugewiessen.
		GridBagConstraints gbc_lblZielDesSpiels1 = new GridBagConstraints();
		gbc_lblZielDesSpiels1.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblZielDesSpiels1.insets = new Insets(0, 0, 5, 0);
		gbc_lblZielDesSpiels1.gridx = 0;
		gbc_lblZielDesSpiels1.gridy = 1;
		pAnleitung.add(lblZielDesSpiels1, gbc_lblZielDesSpiels1);

		lblZielDesSpiels2 = new JLabel("Dies erfolgt mittels Abschie\u00DFen der bunten Bl\u00F6cke auf der oberen Seite des Spiels\u002E");	//Ein neues Label wird generiert.
		lblZielDesSpiels2.setForeground(GELBE_SCHRIFT);								//Dem Label wird eine "gelbe Schrift" zugewiessen.
		lblZielDesSpiels2.setFont(SCHRIFT_NORMAL);									//Dem Label wird eine "normale Schrift" zugewiessen.
		GridBagConstraints gbc_lblZielDesSpiels2 = new GridBagConstraints();
		gbc_lblZielDesSpiels2.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblZielDesSpiels2.insets = new Insets(0, 0, 5, 0);
		gbc_lblZielDesSpiels2.gridx = 0;
		gbc_lblZielDesSpiels2.gridy = 2;
		pAnleitung.add(lblZielDesSpiels2, gbc_lblZielDesSpiels2);
		
		lblZielDesSpiels3 = new JLabel("Diese Bl\u00F6cke k\u00F6nnen mittels einem sich selbst bewegenden\u002C wei\u00DFen Ball abgeschossen werden\u002E");	//Ein neues Label wird generiert.
		lblZielDesSpiels3.setForeground(GELBE_SCHRIFT);								//Dem Label wird eine "gelbe Schrift" zugewiessen.
		lblZielDesSpiels3.setFont(SCHRIFT_NORMAL);									//Dem Label wird eine "normale Schrift" zugewiessen.
		GridBagConstraints gbc_lblZielDesSpiels3 = new GridBagConstraints();
		gbc_lblZielDesSpiels3.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblZielDesSpiels3.insets = new Insets(0, 0, 5, 0);
		gbc_lblZielDesSpiels3.gridx = 0;
		gbc_lblZielDesSpiels3.gridy = 3;
		pAnleitung.add(lblZielDesSpiels3, gbc_lblZielDesSpiels3);
		
		lblZielDesSpiels4 = new JLabel("Sie k\u00F6nnen die rosane Benutzerfl\u00E4che im unteren Bereich des Spiels nach rechts und links bewegen\u002E");	//Ein neues Label wird generiert.
		lblZielDesSpiels4.setForeground(GELBE_SCHRIFT);								//Dem Label wird eine "gelbe Schrift" zugewiessen.
		lblZielDesSpiels4.setFont(SCHRIFT_NORMAL);									//Dem Label wird eine "normale Schrift" zugewiessen.
		GridBagConstraints gbc_lblZielDesSpiels4 = new GridBagConstraints();
		gbc_lblZielDesSpiels4.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblZielDesSpiels4.insets = new Insets(0, 0, 5, 0);
		gbc_lblZielDesSpiels4.gridx = 0;
		gbc_lblZielDesSpiels4.gridy = 4;
		pAnleitung.add(lblZielDesSpiels4, gbc_lblZielDesSpiels4);
		
		lblZielDesSpiels5 = new JLabel("Hiermit verhindern Sie\u002C dass der wei\u00DFe Ball aus dem Spielfeld hinausfliegt\u002E");	//Ein neues Label wird generiert.
		lblZielDesSpiels5.setForeground(GELBE_SCHRIFT);								//Dem Label wird eine "gelbe Schrift" zugewiessen.
		lblZielDesSpiels5.setFont(SCHRIFT_NORMAL);									//Dem Label wird eine "normale Schrift" zugewiessen.
		GridBagConstraints gbc_lblZielDesSpiels5 = new GridBagConstraints();		//Ein neues Label wird generiert.
		gbc_lblZielDesSpiels5.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblZielDesSpiels5.insets = new Insets(0, 0, 5, 0);
		gbc_lblZielDesSpiels5.gridx = 0;
		gbc_lblZielDesSpiels5.gridy = 5;
		pAnleitung.add(lblZielDesSpiels5, gbc_lblZielDesSpiels5);
		
		lblZielDesSpiels6 = new JLabel("Wenn dieser Ball dreimal aus dem Spielfeld geflogen ist\u002C");	//Ein neues Label wird generiert.
		lblZielDesSpiels6.setForeground(GELBE_SCHRIFT);								//Dem Label wird eine "gelbe Schrift" zugewiessen.
		lblZielDesSpiels6.setFont(SCHRIFT_NORMAL);									//Dem Label wird eine "normale Schrift" zugewiessen.
		GridBagConstraints gbc_lblZielDesSpiels6 = new GridBagConstraints();
		gbc_lblZielDesSpiels6.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblZielDesSpiels6.insets = new Insets(0, 0, 5, 0);
		gbc_lblZielDesSpiels6.gridx = 0;
		gbc_lblZielDesSpiels6.gridy = 6;
		pAnleitung.add(lblZielDesSpiels6, gbc_lblZielDesSpiels6);
		
		lblZielDesSpiels7 = new JLabel("ist das Spiel beendet und Sie k\u00F6nnen Ihren erspielten Punktestand im Ranking der Highsoretabelle genauer betrachten\u002E");	//Ein neues Label wird generiert.
		lblZielDesSpiels7.setForeground(GELBE_SCHRIFT);								//Dem Label wird eine "gelbe Schrift" zugewiessen.
		lblZielDesSpiels7.setFont(SCHRIFT_NORMAL);									//Dem Label wird eine "normale Schrift" zugewiessen.
		GridBagConstraints gbc_lblZielDesSpiels7 = new GridBagConstraints();
		gbc_lblZielDesSpiels7.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblZielDesSpiels7.insets = new Insets(0, 0, 5, 0);
		gbc_lblZielDesSpiels7.gridx = 0;
		gbc_lblZielDesSpiels7.gridy = 7;
		pAnleitung.add(lblZielDesSpiels7, gbc_lblZielDesSpiels7);
		
		lblZielDesSpiels8 = new JLabel("Sie k\u00F6nnen w\u00E4hrend des Spiels jederzeit Ihren aktuellen Punktestand sowie Ihre noch zur verf\u00FCgungstehenden Leben abrufen\u002E");	//Ein neues Label wird generiert.
		lblZielDesSpiels8.setForeground(GELBE_SCHRIFT);								//Dem Label wird eine "gelbe Schrift" zugewiessen.
		lblZielDesSpiels8.setFont(SCHRIFT_NORMAL);									//Dem Label wird eine "normale Schrift" zugewiessen.
		GridBagConstraints gbc_lblZielDesSpiels8 = new GridBagConstraints();
		gbc_lblZielDesSpiels8.insets = new Insets(0, 0, 5, 0);
		gbc_lblZielDesSpiels8.anchor = GridBagConstraints.WEST;
		gbc_lblZielDesSpiels8.gridx = 0;
		gbc_lblZielDesSpiels8.gridy = 8;
		pAnleitung.add(lblZielDesSpiels8, gbc_lblZielDesSpiels8);

		btnSpielStarten = new JButton("Spiel starten");
		btnSpielStarten.setFont(SCHRIFT_NORMAL_FETT);									//Dem Button wird eine "normale, fette Schrift" zugewiessen.
		btnSpielStarten.setEnabled(false);												//Man kann den Button nicht anwaehlen.
		btnSpielStarten.addActionListener(new ButtonListener(this, ButtonListener.START_GAME));		//Dem Button wird ein ActionListener hinzugefuegt.
		cpWillkommen.add(btnSpielStarten, "cell 0 5,alignx center,aligny center");

		btnHighscore = new JButton("Highscore\u00B4s");
		btnHighscore.setFont(SCHRIFT_NORMAL_FETT);									//Dem Button wird eine "normale, fette Schrift" zugewiessen.
		btnHighscore.addActionListener(new ButtonListener(this, ButtonListener.SHOW_HIGHSCORES));	//Dem Button wird ein ActionListener hinzugefuegt.
		cpWillkommen.add(btnHighscore, "cell 5 5,alignx center,aligny center");
	}

	/**
	 * In der Methode "<i><b>getBtnSpielername</b></i>"  wird das <i>Textfeld</i> , wo der Spieler <i>seinen Spielernamen</i> eingeben kann, zurueckgegeben.<br>
	 * 
	 * @return Textfeld "Spielername"
	 */
	public static JTextField getTxtSpielername()
	{
		return txtSpielername;						//Das Textfeld "txtSpielername" wird zurueckgegeben.
	}

	/**
	 * In der Methode "<i><b>getBtnSpielStarten</b></i>"  wird der <i>Button "Spiel starten"</i> zurueckgegeben.<br>
	 * 
	 * @return Button "Spiel starten"
	 */
	public static JButton getBtnSpielStarten()
	{
		return btnSpielStarten;						//Der Button "btnSpielStarten" wird zurueckgegeben.
	}

	/**
	 * In der Methode "<i><b>getBtnHighscore</b></i>"  wird der <i>Button "Highscore"</i> zurueckgegeben.<br>
	 * 
	 * @return Button "Highscore"
	 */
	public static JButton getBtnHighscore()
	{
		return btnHighscore;						//Der Button "btnHighscore" wird zurueckgegeben.
	}
}