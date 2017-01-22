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

/**
 * In der<i>"<b>Highscorefenster</b>" - Klasse </i> wird das <b>Highscorefenster dargestellt</b>.<br>
 * Mit diesem <i>Higscorefenster</i> handelt es sich um eine <b>Highscoretabelle</b>.<br>
 * <br>
 * Der Benutzer des Spiels kann diese Highscoretabelle entweder <b>direkt vom Startfenster</b>,<br>
 * oder als <b>weitere Folge zum Hauptfenster</b> <i>aufrufen</i>.<br>
 * <br>
 * Mithilfe der Highscoretabelle kann der Spieler seine <b>bisherigen Erfolge betrachten</b> und genauer <i>analysieren</i> sowie <i>interpretieren</i>.<br>
 * Wenn der Benuetzer das Spiel spielt, oeffnet sich <i>nach Verlust aller Leben</i> ober <i>Erhalt aller Punkte</i> das Higscorefenster.
 * Dort wird der <i>aktuelle</i> <b>Spilername</b> und der <i>aktuell</i> <b>eriehlte Punktestand</b> <br>rot<br> <i>hervorgehoben</i>.
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
public class Highscorefenster extends JFrame implements IFensterEigenschaften, IFarben, ISchriften
{
	private static final long serialVersionUID = 2327949639563321162L;

	/**
	 * Das Panel <i><b>cpHighscore</b></i> wurde erstellt.<br>
	 */
	private JPanel cpHighsore;
	
	/**
	 * Das Panel <i><b>pHighscore</b></i> wurde erstellt.<br>
	 */
	private JPanel pHighsore;

	/**
	 * Das Panel <i><b>pHighscoreAusgabe</b></i> wurde erstellt.<br>
	 */
	private JPanel pHighsoreAusgabe;

	/**
	 * Das Panel <i><b>pSpielrnamen</b></i> wurde erstellt.<br>
	 */
	private JPanel pSpielernamen;

	/**
	 * Das Panel <i><b>pPlazierungen</b></i> wurde erstellt.<br>
	 */
	private JPanel pPlatzierungen;

	/**
	 * Das Panel <i><b>pPunkte</b></i> wurde erstellt.<br>
	 */
	private JPanel pPunkte;

	/**
	 * Das Label <i><b>lblHighscore</b></i> wurde erstellt.<br>
	 */
	private JLabel lblHighscore;

	/**
	 * Das Label <i><b>label_1</b></i> wurde erstellt.<br>
	 */
	private JLabel label_1;

	/**
	 * Das Label <i><b>label_2</b></i> wurde erstellt.<br>
	 */
	private JLabel label_2;

	/**
	 * Das Label <i><b>label_3</b></i> wurde erstellt.<br>
	 */
	private JLabel label_3;

	/**
	 * Das Label <i><b>label_4</b></i> wurde erstellt.<br>
	 */
	private JLabel label_4;

	/**
	 * Das Label <i><b>label_5</b></i> wurde erstellt.<br>
	 */
	private JLabel label_5;

	/**
	 * Das Label <i><b>label_6</b></i> wurde erstellt.<br>
	 */
	private JLabel label_6;

	/**
	 * Das Label <i><b>label_7</b></i> wurde erstellt.<br>
	 */
	private JLabel label_7;

	/**
	 * Das Label <i><b>label_8</b></i> wurde erstellt.<br>
	 */
	private JLabel label_8;

	/**
	 * Das Label <i><b>label_9</b></i> wurde erstellt.<br>
	 */
	private JLabel label_9;

	/**
	 * Das Label <i><b>label_10</b></i> wurde erstellt.<br>
	 */
	private JLabel label_10;

	/**
	 * Das Label <i><b>label_12</b></i> wurde erstellt.<br>
	 */
	private JLabel label_12;

	/**
	 * Das Label <i><b>label_13</b></i> wurde erstellt.<br>
	 */
	private JLabel label_13;

	/**
	 * Das Label <i><b>label_14</b></i> wurde erstellt.<br>
	 */
	private JLabel label_14;

	/**
	 * Das Label <i><b>label_11</b></i> wurde erstellt.<br>
	 */
	private JLabel label_11;

	/**
	 * Das Label <i><b>lblPlatz1</b></i> wurde erstellt.<br>
	 */
	private static JLabel lblPlatz1;

	/**
	 * Das Label <i><b>lblPlatz2</b></i> wurde erstellt.<br>
	 */
	private static JLabel lblPlatz2;

	/**
	 * Das Label <i><b>lblPlatz3</b></i> wurde erstellt.<br>
	 */
	private static JLabel lblPlatz3;

	/**
	 * Das Label <i><b>lblPlatz4</b></i> wurde erstellt.<br>
	 */
	private static JLabel lblPlatz4;

	/**
	 * Das Label <i><b>lblPlatz5</b></i> wurde erstellt.<br>
	 */
	private static JLabel lblPlatz5;

	/**
	 * Das Label <i><b>lblPlatz6</b></i> wurde erstellt.<br>
	 */
	private static JLabel lblPlatz6;

	/**
	 * Das Label <i><b>lblPlatz7</b></i> wurde erstellt.<br>
	 */
	private static JLabel lblPlatz7;

	/**
	 * Das Label <i><b>lblPlatz8</b></i> wurde erstellt.<br>
	 */
	private static JLabel lblPlatz8;

	/**
	 * Das Label <i><b>lblPlatz9</b></i> wurde erstellt.<br>
	 */
	private static JLabel lblPlatz9;

	/**
	 * Das Label <i><b>lblPlatz10</b></i> wurde erstellt.<br>
	 */
	private static JLabel lblPlatz10;

	/**
	 * Das Label <i><b>lblPlatz11</b></i> wurde erstellt.<br>
	 */
	private static JLabel lblPlatz11;

	/**
	 * Das Label <i><b>lblPlatz12</b></i> wurde erstellt.<br>
	 */
	private static JLabel lblPlatz12;

	/**
	 * Das Label <i><b>lblPlatz13</b></i> wurde erstellt.<br>
	 */
	private static JLabel lblPlatz13;

	/**
	 * Das Label <i><b>lblPlatz14</b></i> wurde erstellt.<br>
	 */
	private static JLabel lblPlatz14;

	/**
	 * Das Label <i><b>lblPunktePlatz1</b></i> wurde erstellt.<br>
	 */
	private static JLabel lblPunktePlatz1;

	/**
	 * Das Label <i><b>lblPunktePlatz2</b></i> wurde erstellt.<br>
	 */
	private static JLabel lblPunktePlatz2;

	/**
	 * Das Label <i><b>lblPunktePlatz3</b></i> wurde erstellt.<br>
	 */
	private static JLabel lblPunktePlatz3;

	/**
	 * Das Label <i><b>lblPunktePlatz4</b></i> wurde erstellt.<br>
	 */
	private static JLabel lblPunktePlatz4;

	/**
	 * Das Label <i><b>lblPunktePlatz5</b></i> wurde erstellt.<br>
	 */
	private static JLabel lblPunktePlatz5;

	/**
	 * Das Label <i><b>lblPunktePlatz6</b></i> wurde erstellt.<br>
	 */
	private static JLabel lblPunktePlatz6;

	/**
	 * Das Label <i><b>lblPunktePlatz7</b></i> wurde erstellt.<br>
	 */
	private static JLabel lblPunktePlatz7;

	/**
	 * Das Label <i><b>lblPunktePlatz8</b></i> wurde erstellt.<br>
	 */
	private static JLabel lblPunktePlatz8;

	/**
	 * Das Label <i><b>lblPunktePlatz9</b></i> wurde erstellt.<br>
	 */
	private static JLabel lblPunktePlatz9;

	/**
	 * Das Label <i><b>lblPunktePlatz10</b></i> wurde erstellt.<br>
	 */
	private static JLabel lblPunktePlatz10;

	/**
	 * Das Label <i><b>lblPunktePlatz11</b></i> wurde erstellt.<br>
	 */
	private static JLabel lblPunktePlatz11;

	/**
	 * Das Label <i><b>lblPunktePlatz12</b></i> wurde erstellt.<br>
	 */
	private static JLabel lblPunktePlatz12;

	/**
	 * Das Label <i><b>lblPunktePlatz13</b></i> wurde erstellt.<br>
	 */
	private static JLabel lblPunktePlatz13;

	/**
	 * Das Label <i><b>lblPunktePlatz14</b></i> wurde erstellt.<br>
	 */
	private static JLabel lblPunktePlatz14;

	/**
	 * Der Button <i><b>btnZumStartfenster</b></i> wurde erstellt.<br>
	 */
	private static JButton btnZumStartfenster;

	/**
	 * Der Konstruktor "<i><b>Highscorefenster</b></i>" ruft die Methode <b>initialize</b> sowie die Klasse "<i><b>Tabelle</b></i>" auf.<br>
	 */
	public Highscorefenster()
	{
		initialize();											//Die Methode "inizialize" wird aufgerufen.
		new Tabelle();											//Die Klasse "Tabelle" wird auafgerufen.
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
		setTitle("Highscore\u00B4s");
		setSize(FENSTER_BREITE, FENSTER_HOEHE);
		setMinimumSize(MINIMALE_GROESSE);
		setMaximumSize(MAXIMALE_GROESSE);
		setLocation(FENSTER_POSITION);
		
		cpHighsore = new JPanel();												//Ein neues Panel wurde generiert.
		cpHighsore.setBackground(GUI_HINTERGRUND);
		cpHighsore.setBorder(new EmptyBorder(5, 5, 5, 5));
		cpHighsore.setLayout(new BorderLayout(0, 0));
		setContentPane(cpHighsore);

		pHighsore = new JPanel();												//Ein neues Panel wurde generiert.
		pHighsore.setBackground(VIOLETT);										//Die Hintergrundfarbe wird auf "violett" gesetzt.
		cpHighsore.add(pHighsore, BorderLayout.NORTH);							//Das Panel wird dem Hintergrund zugewiessen.

		lblHighscore = new JLabel("Highscore\u00B4s");							//Ein neues Label wird generiert.
		lblHighscore.setFont(SCHRIFT_GROSS_FETT);
		lblHighscore.setForeground(HELL_GRAU);									//Die Farbe wird auf "Hellgrau" gesetzt.
		pHighsore.add(lblHighscore);											//Das Label wird dem Hintergund zugewiessen.

		pHighsoreAusgabe = new JPanel();										//Ein neues Panel wurde generiert.
		pHighsoreAusgabe.setBackground(GUI_HINTERGRUND);
		pHighsoreAusgabe.setLayout(new BorderLayout());
		cpHighsore.add(pHighsoreAusgabe, BorderLayout.CENTER);					//Das Panel wird dem Hintergrund zugewiessen.
		
		pPlatzierungen = new JPanel();											//Ein neues Panel wurde generiert.
		pPlatzierungen.setBackground(GUI_HINTERGRUND);
		pPlatzierungen.setLayout(new BoxLayout(pPlatzierungen, BoxLayout.Y_AXIS));
		pHighsoreAusgabe.add(pPlatzierungen, BorderLayout.WEST);				//Das Panel wird dem Hintergrund zugewiessen.
		
		pSpielernamen = new JPanel();											//Ein neues Panel wurde generiert.
		pSpielernamen.setBackground(GUI_HINTERGRUND);
		pSpielernamen.setLayout(new BoxLayout(pSpielernamen, BoxLayout.Y_AXIS));
		pHighsoreAusgabe.add(pSpielernamen, BorderLayout.CENTER);				//Das Panel wird dem Hintergrund zugewiessen.
		
		pPunkte = new JPanel();													//Ein neues Panel wurde generiert.
		pPunkte.setBackground(GUI_HINTERGRUND);
		pPunkte.setLayout(new BoxLayout(pPunkte, BoxLayout.Y_AXIS));
		pHighsoreAusgabe.add(pPunkte, BorderLayout.EAST);						//Das Panel wird dem Hintergrund zugewiessen.
		
		label_1 = new JLabel("1.");												//Ein neues Label wird generiert.
		label_1.setFont(SCHRIFT_GROSS_FETT);									//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		label_1.setForeground(WEISSE_SCHRIFT);									//Dem Label wird eine "weisse Schrift" zugewiessen.
		pPlatzierungen.add(label_1);											//Das Label wird dem Hintergund hinzugefuegt.
		
		lblPlatz1 = new JLabel();												//Ein neues Label wird generiert.
		lblPlatz1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlatz1.setFont(SCHRIFT_GROSS_FETT);									//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		lblPlatz1.setForeground(WEISSE_SCHRIFT);								//Dem Label wird eine "weisse Schrift" zugewiessen.
		pSpielernamen.add(lblPlatz1);											//Das Label wird dem Hintergund hinzugefuegt.
		
		lblPunktePlatz1 = new JLabel();											//Ein neues Label wird generiert.
		lblPunktePlatz1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblPunktePlatz1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPunktePlatz1.setFont(SCHRIFT_GROSS_FETT);							//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		lblPunktePlatz1.setForeground(WEISSE_SCHRIFT);							//Dem Label wird eine "weisse Schrift" zugewiessen.
		pPunkte.add(lblPunktePlatz1);											//Das Label wird dem Hintergund hinzugefuegt.
		
		label_2 = new JLabel("2.");												//Ein neues Label wird generiert.
		label_2.setFont(SCHRIFT_GROSS_FETT);									//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		label_2.setForeground(WEISSE_SCHRIFT);									//Dem Label wird eine "weisse Schrift" zugewiessen.
		pPlatzierungen.add(label_2);											//Das Label wird dem Hintergund hinzugefuegt.
		
		lblPlatz2 = new JLabel();												//Ein neues Label wird generiert.
		lblPlatz2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlatz2.setFont(SCHRIFT_GROSS_FETT);									//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		lblPlatz2.setForeground(WEISSE_SCHRIFT);								//Dem Label wird eine "weisse Schrift" zugewiessen.
		pSpielernamen.add(lblPlatz2);											//Das Label wird dem Hintergund hinzugefuegt.
		
		lblPunktePlatz2 = new JLabel();											//Ein neues Label wird generiert.
		lblPunktePlatz2.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblPunktePlatz2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPunktePlatz2.setFont(SCHRIFT_GROSS_FETT);							//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		lblPunktePlatz2.setForeground(WEISSE_SCHRIFT);							//Dem Label wird eine "weisse Schrift" zugewiessen.
		pPunkte.add(lblPunktePlatz2);											//Das Label wird dem Hintergund hinzugefuegt.
		
		label_3 = new JLabel("3.");												//Ein neues Label wird generiert.
		label_3.setFont(SCHRIFT_GROSS_FETT);									//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		label_3.setForeground(WEISSE_SCHRIFT);									//Dem Label wird eine "weisse Schrift" zugewiessen.
		pPlatzierungen.add(label_3);											//Das Label wird dem Hintergund hinzugefuegt.
		
		lblPlatz3 = new JLabel();												//Ein neues Label wird generiert.
		lblPlatz3.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlatz3.setFont(SCHRIFT_GROSS_FETT);									//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		lblPlatz3.setForeground(WEISSE_SCHRIFT);								//Dem Label wird eine "weisse Schrift" zugewiessen.
		pSpielernamen.add(lblPlatz3);											//Das Label wird dem Hintergund hinzugefuegt.
		
		lblPunktePlatz3 = new JLabel();											//Ein neues Label wird generiert.
		lblPunktePlatz3.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblPunktePlatz3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPunktePlatz3.setFont(SCHRIFT_GROSS_FETT);							//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		lblPunktePlatz3.setForeground(WEISSE_SCHRIFT);							//Dem Label wird eine "weisse Schrift" zugewiessen.
		pPunkte.add(lblPunktePlatz3);											//Das Label wird dem Hintergund hinzugefuegt.
		
		label_4 = new JLabel("4.");												//Ein neues Label wird generiert.
		label_4.setFont(SCHRIFT_GROSS_FETT);									//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		label_4.setForeground(WEISSE_SCHRIFT);									//Dem Label wird eine "weisse Schrift" zugewiessen.
		pPlatzierungen.add(label_4);											//Das Label wird dem Hintergund hinzugefuegt.
		
		lblPlatz4 = new JLabel();												//Ein neues Label wird generiert.
		lblPlatz4.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlatz4.setFont(SCHRIFT_GROSS_FETT);									//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		lblPlatz4.setForeground(WEISSE_SCHRIFT);								//Dem Label wird eine "weisse Schrift" zugewiessen.
		pSpielernamen.add(lblPlatz4);											//Das Label wird dem Hintergund hinzugefuegt.
		
		lblPunktePlatz4 = new JLabel();											//Ein neues Label wird generiert.
		lblPunktePlatz4.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblPunktePlatz4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPunktePlatz4.setFont(SCHRIFT_GROSS_FETT);							//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		lblPunktePlatz4.setForeground(WEISSE_SCHRIFT);							//Dem Label wird eine "weisse Schrift" zugewiessen.
		pPunkte.add(lblPunktePlatz4);											//Das Label wird dem Hintergund hinzugefuegt.
		
		label_5 = new JLabel("5.");												//Ein neues Label wird generiert.
		label_5.setFont(SCHRIFT_GROSS_FETT);									//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		label_5.setForeground(WEISSE_SCHRIFT);									//Dem Label wird eine "weisse Schrift" zugewiessen.
		pPlatzierungen.add(label_5);											//Das Label wird dem Hintergund hinzugefuegt.
		
		lblPlatz5 = new JLabel();												//Ein neues Label wird generiert.
		lblPlatz5.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlatz5.setFont(SCHRIFT_GROSS_FETT);									//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		lblPlatz5.setForeground(WEISSE_SCHRIFT);								//Dem Label wird eine "weisse Schrift" zugewiessen.
		pSpielernamen.add(lblPlatz5);											//Das Label wird dem Hintergund hinzugefuegt.
		
		lblPunktePlatz5 = new JLabel();											//Ein neues Label wird generiert.
		lblPunktePlatz5.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblPunktePlatz5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPunktePlatz5.setFont(SCHRIFT_GROSS_FETT);							//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		lblPunktePlatz5.setForeground(WEISSE_SCHRIFT);							//Dem Label wird eine "weisse Schrift" zugewiessen.
		pPunkte.add(lblPunktePlatz5);											//Das Label wird dem Hintergund hinzugefuegt.
		
		label_6 = new JLabel("6.");												//Ein neues Label wird generiert.
		label_6.setFont(SCHRIFT_GROSS_FETT);									//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		label_6.setForeground(WEISSE_SCHRIFT);									//Dem Label wird eine "weisse Schrift" zugewiessen.
		pPlatzierungen.add(label_6);											//Das Label wird dem Hintergund hinzugefuegt.
		
		lblPlatz6 = new JLabel();												//Ein neues Label wird generiert.
		lblPlatz6.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlatz6.setFont(SCHRIFT_GROSS_FETT);									//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		lblPlatz6.setForeground(WEISSE_SCHRIFT);								//Dem Label wird eine "weisse Schrift" zugewiessen.
		pSpielernamen.add(lblPlatz6);											//Das Label wird dem Hintergund hinzugefuegt.
		
		lblPunktePlatz6 = new JLabel();											//Ein neues Label wird generiert.
		lblPunktePlatz6.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblPunktePlatz6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPunktePlatz6.setFont(SCHRIFT_GROSS_FETT);							//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		lblPunktePlatz6.setForeground(WEISSE_SCHRIFT);							//Dem Label wird eine "weisse Schrift" zugewiessen.
		pPunkte.add(lblPunktePlatz6);											//Das Label wird dem Hintergund hinzugefuegt.
		
		label_7 = new JLabel("7.");												//Ein neues Label wird generiert.
		label_7.setFont(SCHRIFT_GROSS_FETT);									//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		label_7.setForeground(WEISSE_SCHRIFT);									//Dem Label wird eine "weisse Schrift" zugewiessen.
		pPlatzierungen.add(label_7);											//Das Label wird dem Hintergund hinzugefuegt.
		
		lblPlatz7 = new JLabel();												//Ein neues Label wird generiert.
		lblPlatz7.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlatz7.setFont(SCHRIFT_GROSS_FETT);									//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		lblPlatz7.setForeground(WEISSE_SCHRIFT);								//Dem Label wird eine "weisse Schrift" zugewiessen.
		pSpielernamen.add(lblPlatz7);											//Das Label wird dem Hintergund hinzugefuegt.
		
		lblPunktePlatz7 = new JLabel();											//Ein neues Label wird generiert.
		lblPunktePlatz7.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblPunktePlatz7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPunktePlatz7.setFont(SCHRIFT_GROSS_FETT);							//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		lblPunktePlatz7.setForeground(WEISSE_SCHRIFT);							//Dem Label wird eine "weisse Schrift" zugewiessen.
		pPunkte.add(lblPunktePlatz7);											//Das Label wird dem Hintergund hinzugefuegt.
		
		label_8 = new JLabel("8.");												//Ein neues Label wird generiert.
		label_8.setFont(SCHRIFT_GROSS_FETT);									//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		label_8.setForeground(WEISSE_SCHRIFT);									//Dem Label wird eine "weisse Schrift" zugewiessen.
		pPlatzierungen.add(label_8);											//Das Label wird dem Hintergund hinzugefuegt.
		
		lblPlatz8 = new JLabel();												//Ein neues Label wird generiert.
		lblPlatz8.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlatz8.setFont(SCHRIFT_GROSS_FETT);									//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		lblPlatz8.setForeground(WEISSE_SCHRIFT);								//Dem Label wird eine "weisse Schrift" zugewiessen.
		pSpielernamen.add(lblPlatz8);											//Das Label wird dem Hintergund hinzugefuegt.
		
		lblPunktePlatz8 = new JLabel();											//Ein neues Label wird generiert.
		lblPunktePlatz8.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblPunktePlatz8.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPunktePlatz8.setFont(SCHRIFT_GROSS_FETT);							//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		lblPunktePlatz8.setForeground(WEISSE_SCHRIFT);							//Dem Label wird eine "weisse Schrift" zugewiessen.
		pPunkte.add(lblPunktePlatz8);											//Das Label wird dem Hintergund hinzugefuegt.
		
		label_9 = new JLabel("9.");												//Ein neues Label wird generiert.
		label_9.setFont(SCHRIFT_GROSS_FETT);									//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		label_9.setForeground(WEISSE_SCHRIFT);
		pPlatzierungen.add(label_9);											//Das Label wird dem Hintergund hinzugefuegt.
		
		lblPlatz9 = new JLabel();												//Ein neues Label wird generiert.
		lblPlatz9.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlatz9.setFont(SCHRIFT_GROSS_FETT);									//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		lblPlatz9.setForeground(WEISSE_SCHRIFT);								//Dem Label wird eine "weisse Schrift" zugewiessen.
		pSpielernamen.add(lblPlatz9);											//Das Label wird dem Hintergund hinzugefuegt.
		
		lblPunktePlatz9 = new JLabel();											//Ein neues Label wird generiert.
		lblPunktePlatz9.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblPunktePlatz9.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPunktePlatz9.setFont(SCHRIFT_GROSS_FETT);							//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		lblPunktePlatz9.setForeground(WEISSE_SCHRIFT);							//Dem Label wird eine "weisse Schrift" zugewiessen.
		pPunkte.add(lblPunktePlatz9);											//Das Label wird dem Hintergund hinzugefuegt.
		
		label_10 = new JLabel("10.");											//Ein neues Label wird generiert.
		label_10.setFont(SCHRIFT_GROSS_FETT);									//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		label_10.setForeground(WEISSE_SCHRIFT);									//Dem Label wird eine "weisse Schrift" zugewiessen.
		pPlatzierungen.add(label_10);											//Das Label wird dem Hintergund hinzugefuegt.
		
		lblPlatz10 = new JLabel();												//Ein neues Label wird generiert.
		lblPlatz10.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlatz10.setFont(SCHRIFT_GROSS_FETT);									//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		lblPlatz10.setForeground(WEISSE_SCHRIFT);								//Dem Label wird eine "weisse Schrift" zugewiessen.
		pSpielernamen.add(lblPlatz10);											//Das Label wird dem Hintergund hinzugefuegt.
		
		lblPunktePlatz10 = new JLabel();										//Ein neues Label wird generiert.
		lblPunktePlatz10.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblPunktePlatz10.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPunktePlatz10.setFont(SCHRIFT_GROSS_FETT);							//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		lblPunktePlatz10.setForeground(WEISSE_SCHRIFT);							//Dem Label wird eine "weisse Schrift" zugewiessen.
		pPunkte.add(lblPunktePlatz10);											//Das Label wird dem Hintergund hinzugefuegt.
		
		label_11 = new JLabel("11.");											//Ein neues Label wird generiert.
		label_11.setFont(SCHRIFT_GROSS_FETT);									//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		label_11.setForeground(WEISSE_SCHRIFT);									//Dem Label wird eine "weisse Schrift" zugewiessen.
		pPlatzierungen.add(label_11);											//Das Label wird dem Hintergund hinzugefuegt.
		
		lblPlatz11 = new JLabel();												//Ein neues Label wird generiert.
		lblPlatz11.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlatz11.setFont(SCHRIFT_GROSS_FETT);									//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		lblPlatz11.setForeground(WEISSE_SCHRIFT);								//Dem Label wird eine "weisse Schrift" zugewiessen.
		pSpielernamen.add(lblPlatz11);											//Das Label wird dem Hintergund hinzugefuegt.
		
		lblPunktePlatz11 = new JLabel();										//Ein neues Label wird generiert.
		lblPunktePlatz11.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblPunktePlatz11.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPunktePlatz11.setFont(SCHRIFT_GROSS_FETT);							//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		lblPunktePlatz11.setForeground(WEISSE_SCHRIFT);							//Dem Label wird eine "weisse Schrift" zugewiessen.
		pPunkte.add(lblPunktePlatz11);											//Das Label wird dem Hintergund hinzugefuegt.
		
		label_12 = new JLabel("12.");											//Ein neues Label wird generiert.										//Ein neues Label wird generiert.
		label_12.setFont(SCHRIFT_GROSS_FETT);									//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		label_12.setForeground(WEISSE_SCHRIFT);									//Dem Label wird eine "weisse Schrift" zugewiessen.
		pPlatzierungen.add(label_12);											//Das Label wird dem Hintergund hinzugefuegt.
		
		lblPlatz12 = new JLabel();												//Ein neues Label wird generiert.									//Ein neues Label wird generiert.
		lblPlatz12.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlatz12.setFont(SCHRIFT_GROSS_FETT);									//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		lblPlatz12.setForeground(WEISSE_SCHRIFT);								//Dem Label wird eine "weisse Schrift" zugewiessen.
		pSpielernamen.add(lblPlatz12);											//Das Label wird dem Hintergund hinzugefuegt.
		
		lblPunktePlatz12 = new JLabel();										//Ein neues Label wird generiert.
		lblPunktePlatz12.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblPunktePlatz12.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPunktePlatz12.setFont(SCHRIFT_GROSS_FETT);							//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		lblPunktePlatz12.setForeground(WEISSE_SCHRIFT);							//Dem Label wird eine "weisse Schrift" zugewiessen.
		pPunkte.add(lblPunktePlatz12);											//Das Label wird dem Hintergund hinzugefuegt.
		
		label_13 = new JLabel("13.");											//Ein neues Label wird generiert.
		label_13.setFont(SCHRIFT_GROSS_FETT);									//Dem Label wird eine "grosse, fette Schrift" zugewiessen.	
		label_13.setForeground(WEISSE_SCHRIFT);									//Dem Label wird eine "weisse Schrift" zugewiessen.
		pPlatzierungen.add(label_13);											//Das Label wird dem Hintergund hinzugefuegt.
		
		lblPlatz13 = new JLabel();												//Ein neues Label wird generiert.
		lblPlatz13.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlatz13.setFont(SCHRIFT_GROSS_FETT);									//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		lblPlatz13.setForeground(WEISSE_SCHRIFT);								//Dem Label wird eine "weisse Schrift" zugewiessen.
		pSpielernamen.add(lblPlatz13);											//Das Label wird dem Hintergund hinzugefuegt.
		
		lblPunktePlatz13 = new JLabel();										//Ein neues Label wird generiert.
		lblPunktePlatz13.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblPunktePlatz13.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPunktePlatz13.setFont(SCHRIFT_GROSS_FETT);							//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		lblPunktePlatz13.setForeground(WEISSE_SCHRIFT);							//Dem Label wird eine "weisse Schrift" zugewiessen.
		pPunkte.add(lblPunktePlatz13);											//Das Label wird dem Hintergund hinzugefuegt.
		
		label_14 = new JLabel("14.");											//Ein neues Label wird generiert.
		label_14.setFont(SCHRIFT_GROSS_FETT);									//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		label_14.setForeground(WEISSE_SCHRIFT);									//Dem Label wird eine "weisse Schrift" zugewiessen.
		pPlatzierungen.add(label_14);											//Das Label wird dem Hintergund hinzugefuegt.
		
		lblPlatz14 = new JLabel();												//Ein neues Label wird generiert.
		lblPlatz14.setHorizontalAlignment(SwingConstants.LEFT);
		lblPlatz14.setFont(SCHRIFT_GROSS_FETT);									//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		lblPlatz14.setForeground(WEISSE_SCHRIFT);								//Dem Label wird eine "weisse Schrift" zugewiessen.
		pSpielernamen.add(lblPlatz14);											//Das Label wird dem Hintergund hinzugefuegt.
		
		lblPunktePlatz14 = new JLabel();										//Ein neues Label wird generiert.
		lblPunktePlatz14.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblPunktePlatz14.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPunktePlatz14.setFont(SCHRIFT_GROSS_FETT);							//Dem Label wird eine "grosse, fette Schrift" zugewiessen.
		lblPunktePlatz14.setForeground(WEISSE_SCHRIFT);							//Dem Label wird eine "weisse Schrift" zugewiessen.
		pPunkte.add(lblPunktePlatz14);											//Das Label wird dem Hintergund hinzugefuegt.
		
		btnZumStartfenster = new JButton("Zum Startfenster");					//Der Button "Zum Startfenster" wird erstellt.
		btnZumStartfenster.setVerticalAlignment(SwingConstants.BOTTOM);
		btnZumStartfenster.setFont(SCHRIFT_GROSS_FETT);							//Dem Button wird eine "grosse, fette Schrift" zugewiessen.
		btnZumStartfenster.addActionListener(new ButtonListener(this, ButtonListener.SHOW_STARTFENSTER));
		pHighsoreAusgabe.add(btnZumStartfenster, BorderLayout.SOUTH);			//Das Label wird dem Hintergund hinzugefuegt.
	}

	/**
	 * In der Methode "<i><b>getLblPlatz1</b></i>"  wird das <i>Label "lblPlatz1"</i> zurueckgegeben.<br>
	 * 
	 * @return Das Label "lblPlatz1" wird zurueckgegeben.
	 */
	public static JLabel getLblPlatz1()
	{
		return lblPlatz1;					//Das Label wird zurueckgegeben.
	}

	/**
	 * In der Methode "<i><b>getLblPlatz2</b></i>"  wird das <i>Label "lblPlatz2"</i> zurueckgegeben.<br>
	 * 
	 * @return Das Label "lblPlatz2" wird zurueckgegeben.
	 */
	public static JLabel getLblPlatz2()
	{
		return lblPlatz2;					//Das Label wird zurueckgegeben.
	}

	/**
	 * In der Methode "<i><b>getLblPlatz3</b></i>"  wird das <i>Label "lblPlatz3"</i> zurueckgegeben.<br>
	 * 
	 * @return Das Label "lblPlatz3" wird zurueckgegeben.
	 */
	public static JLabel getLblPlatz3()
	{
		return lblPlatz3;					//Das Label wird zurueckgegeben.
	}

	/**
	 * In der Methode "<i><b>getLblPlatz4</b></i>"  wird das <i>Label "lblPlatz4"</i> zurueckgegeben.<br>
	 * 
	 * @return Das Label "lblPlatz4" wird zurueckgegeben.
	 */
	public static JLabel getLblPlatz4()
	{
		return lblPlatz4;					//Das Label wird zurueckgegeben.
	}

	/**
	 * In der Methode "<i><b>getLblPlatz5</b></i>"  wird das <i>Label "lblPlatz5"</i> zurueckgegeben.<br>
	 * 
	 * @return Das Label "lblPlatz5" wird zurueckgegeben.
	 */
	public static JLabel getLblPlatz5()
	{
		return lblPlatz5;					//Das Label wird zurueckgegeben.
	}

	/**
	 * In der Methode "<i><b>getLblPlatz6</b></i>"  wird das <i>Label "lblPlatz6"</i> zurueckgegeben.<br>
	 * 
	 * @return Das Label "lblPlatz6" wird zurueckgegeben.
	 */
	public static JLabel getLblPlatz6()
	{
		return lblPlatz6;					//Das Label wird zurueckgegeben.
	}

	/**
	 * In der Methode "<i><b>getLblPlatz7</b></i>"  wird das <i>Label "lblPlatz7"</i> zurueckgegeben.<br>
	 * 
	 * @return Das Label "lblPlatz7" wird zurueckgegeben.
	 */
	public static JLabel getLblPlatz7()
	{
		return lblPlatz7;					//Das Label wird zurueckgegeben.
	}

	/**
	 * In der Methode "<i><b>getLblPlatz8</b></i>"  wird das <i>Label "lblPlatz8"</i> zurueckgegeben.<br>
	 * 
	 * @return Das Label "lblPlatz8" wird zurueckgegeben.
	 */
	public static JLabel getLblPlatz8()
	{
		return lblPlatz8;					//Das Label wird zurueckgegeben.
	}

	/**
	 * In der Methode "<i><b>getLblPlatz9</b></i>"  wird das <i>Label "lblPlatz9"</i> zurueckgegeben.<br>
	 * 
	 * @return Das Label "lblPlatz9" wird zurueckgegeben.
	 */
	public static JLabel getLblPlatz9()
	{
		return lblPlatz9;					//Das Label wird zurueckgegeben.
	}

	/**
	 * In der Methode "<i><b>getLblPlatz10</b></i>"  wird das <i>Label "lblPlatz10"</i> zurueckgegeben.<br>
	 * 
	 * @return Das Label "lblPlatz10" wird zurueckgegeben.
	 */
	public static JLabel getLblPlatz10()
	{
		return lblPlatz10;					//Das Label wird zurueckgegeben.
	}

	/**
	 * In der Methode "<i><b>getLblPlatz11</b></i>"  wird das <i>Label "lblPlatz11"</i> zurueckgegeben.<br>
	 * 
	 * @return Das Label "lblPlatz11" wird zurueckgegeben.
	 */
	public static JLabel getLblPlatz11()
	{
		return lblPlatz11;					//Das Label wird zurueckgegeben.
	}

	/**
	 * In der Methode "<i><b>getLblPlatz12</b></i>"  wird das <i>Label "lblPlatz12"</i> zurueckgegeben.<br>
	 * 
	 * @return Das Label "lblPlatz12" wird zurueckgegeben.
	 */
	public static JLabel getLblPlatz12()
	{
		return lblPlatz12;					//Das Label wird zurueckgegeben.
	}

	/**
	 * In der Methode "<i><b>getLblPlatz13</b></i>"  wird das <i>Label "lblPlatz13"</i> zurueckgegeben.<br>
	 * 
	 * @return Das Label "lblPlatz13" wird zurueckgegeben.
	 */
	public static JLabel getLblPlatz13()
	{
		return lblPlatz13;					//Das Label wird zurueckgegeben.
	}

	/**
	 * In der Methode "<i><b>getLblPlatz14</b></i>"  wird das <i>Label "lblPlatz14"</i> zurueckgegeben.<br>
	 * 
	 * @return Das Label "lblPlatz14" wird zurueckgegeben.
	 */
	public static JLabel getLblPlatz14()
	{
		return lblPlatz14;					//Das Label wird zurueckgegeben.
	}

	/**
	 * Die Methode "<i><b>getLblPunktePlatz1</b></i>"  gibt das<i>Label "lblPlatz1"</i> zurueck.<br>
	 * 
	 * @return Das Label "lblPunktePlatz1" wird zurueckgegeben.
	 */
	public static JLabel getLblPunktePlatz1()
	{
		return lblPunktePlatz1;				//Das Label wird zurueckgegeben.
	}

	/**
	 * Die Methode "<i><b>getLblPunktePlatz2</b></i>"  gibt das<i>Label "lblPlatz2"</i> zurueck.<br>
	 * 
	 * @return Das Label "lblPunktePlatz2" wird zurueckgegeben.
	 */
	public static JLabel getLblPunktePlatz2()
	{
		return lblPunktePlatz2;				//Das Label wird zurueckgegeben.
	}

	/**
	 * Die Methode "<i><b>getLblPunktePlatz3</b></i>"  gibt das<i>Label "lblPlatz3"</i> zurueck.<br>
	 * 
	 * @return Das Label "lblPunktePlatz3" wird zurueckgegeben.
	 */
	public static JLabel getLblPunktePlatz3()
	{
		return lblPunktePlatz3;				//Das Label wird zurueckgegeben.
	}

	/**
	 * Die Methode "<i><b>getLblPunktePlatz4</b></i>"  gibt das<i>Label "lblPlatz4"</i> zurueck.<br>
	 * 
	 * @return Das Label "lblPunktePlatz4" wird zurueckgegeben.
	 */
	public static JLabel getLblPunktePlatz4()
	{
		return lblPunktePlatz4;				//Das Label wird zurueckgegeben.
	}

	/**
	 * Die Methode "<i><b>getLblPunktePlatz5</b></i>"  gibt das<i>Label "lblPlatz5"</i> zurueck.<br>
	 * 
	 * @return Das Label "lblPunktePlatz5" wird zurueckgegeben.
	 */
	public static JLabel getLblPunktePlatz5()
	{
		return lblPunktePlatz5;				//Das Label wird zurueckgegeben.
	}

	/**
	 * Die Methode "<i><b>getLblPunktePlatz6</b></i>"  gibt das<i>Label "lblPlatz6"</i> zurueck.<br>
	 * 
	 * @return Das Label "lblPunktePlatz6" wird zurueckgegeben.
	 */
	public static JLabel getLblPunktePlatz6()
	{
		return lblPunktePlatz6;				//Das Label wird zurueckgegeben.
	}

	/**
	 * Die Methode "<i><b>getLblPunktePlatz7</b></i>"  gibt das<i>Label "lblPlatz7"</i> zurueck.<br>
	 * 
	 * @return Das Label "lblPunktePlatz7" wird zurueckgegeben.
	 */
	public static JLabel getLblPunktePlatz7()
	{
		return lblPunktePlatz7;				//Das Label wird zurueckgegeben.
	}

	/**
	 * Die Methode "<i><b>getLblPunktePlatz8</b></i>"  gibt das<i>Label "lblPlatz8"</i> zurueck.<br>
	 * 
	 * @return Das Label "lblPunktePlatz8" wird zurueckgegeben.
	 */
	public static JLabel getLblPunktePlatz8()
	{
		return lblPunktePlatz8;				//Das Label wird zurueckgegeben.
	}

	/**
	 * Die Methode "<i><b>getLblPunktePlatz9</b></i>"  gibt das<i>Label "lblPlatz9"</i> zurueck.<br>
	 * 
	 * @return Das Label "lblPunktePlatz9" wird zurueckgegeben.
	 */
	public static JLabel getLblPunktePlatz9()
	{
		return lblPunktePlatz9;				//Das Label wird zurueckgegeben.
	}

	/**
	 * Die Methode "<i><b>getLblPunktePlatz10</b></i>"  gibt das<i>Label "lblPlatz10"</i> zurueck.<br>
	 * 
	 * @return Das Label "lblPunktePlatz10" wird zurueckgegeben.
	 */
	public static JLabel getLblPunktePlatz10()
	{
		return lblPunktePlatz10;			//Das Label wird zurueckgegeben.
	}

	/**
	 * Die Methode "<i><b>getLblPunktePlatz11</b></i>"  gibt das<i>Label "lblPlatz11"</i> zurueck.<br>
	 * 
	 * @return Das Label "lblPunktePlatz11" wird zurueckgegeben.
	 */
	public static JLabel getLblPunktePlatz11()
	{
		return lblPunktePlatz11;			//Das Label wird zurueckgegeben.
	}

	/**
	 * Die Methode "<i><b>getLblPunktePlatz12</b></i>"  gibt das<i>Label "lblPlatz12"</i> zurueck.<br>
	 * 
	 * @return Das Label "lblPunktePlatz12" wird zurueckgegeben.
	 */
	public static JLabel getLblPunktePlatz12()
	{
		return lblPunktePlatz12;			//Das Label wird zurueckgegeben.
	}

	/**
	 * Die Methode "<i><b>getLblPunktePlatz13</b></i>"  gibt das<i>Label "lblPlatz13"</i> zurueck.<br>
	 * 
	 * @return Das Label "lblPunktePlatz13" wird zurueckgegeben.
	 */
	public static JLabel getLblPunktePlatz13()
	{
		return lblPunktePlatz13;			//Das Label wird zurueckgegeben.
	}

	/**
	 * Die Methode "<i><b>getLblPunktePlatz14</b></i>"  gibt das<i>Label "lblPlatz14"</i> zurueck.<br>
	 * 
	 * @return Das Label "lblPunktePlatz14" wird zurueckgegeben.
	 */
	public static JLabel getLblPunktePlatz14()
	{
		return lblPunktePlatz14;			//Das Label wird zurueckgegeben.
	}
}