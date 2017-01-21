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

import ball.Ball;
import interfaces.IFarben;
import interfaces.IFensterEigenschaften;
import interfaces.ISchriften;
import listeners.EnterHauptfenster;
import listeners.WindowListener;
import schlaeger.Schlaeger;
import spieler.Spieler;

/**
 * Dies ist die Hautpklasse, in dieser wird das Spielfeld erzeugt und dargestellt. 
 * Weiters gibt es in dieser Klasse eine Innereklasse, welche die daführ sorgt, dass das Spielfeld die ganze Zeit geupdatet wird.
 * 
 * @version 1.0
 * 
 * @author Thomas Mader-Ofer
 * @author Manuel Glantschnig
 * @author Jonas Hörtnagl
 * @author Cristina Erhart
 */
public class Hauptfenster extends JFrame implements IFensterEigenschaften, IFarben, ISchriften
{
	private static final long serialVersionUID = 6077461681697162447L;
	
	private static final int GUI_SPALTEN = 10; 	//Konstante für die Erzeugung der Panels und für die Anzahl der Panles pro Zeile
	private static final int GUI_ZEILEN = 5;	//Konstante für die Erzeugung der Panels und für die Anzahl der Panles pro Spalte
	
	private JPanel pSpielstand;					//Auf diesem Panle wird der Spielstand geschrieben
	private JPanel pBenutzerebene;				//dies ist der Schläger, von welchem der Ball abprallt
	
	private Timer oTimer = new Timer();			//dies ist das Obejekt der inneren Klasse Timer 
	
	private static boolean timerAktiv = false;	//diese boolean wird verwendet, um den Timer "Aktivieren"
	
	private static JPanel[][] aPanels = new JPanel[50][50];	//in dieses Array werden die Blöcke, hinzugefühgt
	
	private static Hauptfenster oHauptfenster;	//Hier wird ein Objekt für die Hauptklasse erstellt, ist aber noch nicht Initialisiert	
	private static JLabel lblSpielstandText;	//In diesem Label wird weiter unten der Text angezeigt
	private static JLabel lblBall;				//Dies ist das Label auf, welches das Icon(Bild) des Balles gesetzt wird
	private static JPanel pBall;				//auf dieses Panel wird das Label gesetzt
	private static JPanel cpSpielfeld;		//dieses Label wird auf das Frame gesetzt
	private static ImageIcon imBall = new ImageIcon(Hauptfenster.class.getResource("/images/Ball.png"));	//Dies ist das Bild des Balles

	/**
	 * Create the frame.
	 */
	public Hauptfenster()
	{
		initializeFenster();
	}

	/**
	 * In dieser Methode wird das Hauptfenster mit seiner Größe und seinen Eigenschaften erzeugt.
	 */
	private void initializeFenster()
	{
		oHauptfenster = this;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//die gibt dem X rechts oben die möglichkeit das Fenster zu schließen
		addKeyListener(new EnterHauptfenster());		//Dies ist der Keylistener der dem Fenster hier zugewießen wird
		addWindowListener(new WindowListener(this));	//Hier wrid der WindowListener dem Fenster zugewießen
		setVisible(true);								//Fenster sichtbar machen
		setFocusable(true);								//den Focus auf das Fenster setzen
		setResizable(false);							//Hier mit wird verhindert, dass der Spieler die Fenstergröße verändern kann 
		setIconImage(FENSTER_SYMBOL);					//Hier wird dem Fenster links oben ein Symbol zugewießen
		setTitle("Break\u002DOut");						//Hier wird dem Fenster der Titel, also der Name gegeben
		setSize(FENSTER_BREITE, FENSTER_HOEHE);			//Dies gibt dem Fenster seine breite und seine höhe
		setMinimumSize(MINIMALE_GROESSE);				//Hier wrid die Minimale Größe des Fenster festgelegt
		setMaximumSize(MAXIMALE_GROESSE);				//Hier wird die Maximale Größe des Fenstes festgelegt
		setLocation(FENSTER_POSITION);					//Dies setzt die Position des Fensters auf dem Bildschirm
		getContentPane().setLayout(new BorderLayout()); //Hier wird dem Conantepane, welches auf dem Frame liegt das BorderLayout gesetzt

		setCpHauptfenster(new JPanel());
		
		getCpSpielfeld().setBackground(GUI_HINTERGRUND);	//wird der Hintergrund gesetzt 
		getCpSpielfeld().setLayout(null);				//wird das Layout auf null geändert
		
		oHauptfenster.add(getCpSpielfeld(), BorderLayout.CENTER);	//Hier wird das Panel in die Mitte des Contantepane gesetzt
		setVisible(true);	// nötig, damit der Schläger richtig angezeigt wird

		lblSpielstandText = new JLabel(getSpielstandLabelText());	//Hier werden die Daten wie, Leben, Name und Punkte angegeben 
		lblSpielstandText.setHorizontalAlignment(SwingConstants.CENTER);	//Hier wird der Text in die Mitte des Labels gesetzt
		lblSpielstandText.setFont(SCHRIFT_NORMAL_FETT);	// Hier wird die Schrift auf Fett gesetzt, dammit man es gut lesen kann
		lblSpielstandText.setForeground(WEISSE_SCHRIFT);//Hier wird die Schirftfarbe auf Weiß gesetzt
		
		pSpielstand = new JPanel();	//Hier wir das Panel erzeugt, auf welchem Später die Daten sind
		pSpielstand.setBackground(VIOLETT);	//Hier wird die Hintergrundfarbe gesetzt
		pSpielstand.add(lblSpielstandText);// Hier wird dem Panel das Label mit den Spielinformationen zugewiesen
		getContentPane().add(pSpielstand, BorderLayout.NORTH); // Hier wird das Panel dem Contentpane ganz oben Zugewiesen
		
		generateBloecke();	//Hier wird die Methode zum Erstellen der Blöcke aufgerufen

		lblBall = new JLabel();	//Hier wird das Label für den Ball gesetzt
		lblBall.setIcon(imBall);	//Hier wird dem Label das Bild des Balles zugewiesen
		
		pBall = new JPanel();	//Hier wird ein Panel für den Ball erstellt
		pBall.setBackground(GUI_HINTERGRUND);	//Hier wird die Hintergrundfarbe des Panels auf die Farbe des Hintergrundes gesetzt
		pBall.setSize(imBall.getIconWidth(), imBall.getIconHeight() + 10);	//Hier wird dem Panel die Größe zugewiesen
		pBall.add(lblBall);	//Dem Panel wird das Label zugewiesen
		getCpSpielfeld().add(pBall);	//Das Panel wird dem Hauptfenster zugewiesen
		
		Ball.setStartPosition();	//Der Ball wird auf seine Startposition gesetzt

		pBenutzerebene = new JPanel();	//Hier wird die Benutzerebene als Panel erstellt (dies ist der Schläger)
		pBenutzerebene.setBackground(PINK);	//Farbe des Panels wird geändert
		pBenutzerebene.setSize(200, 10);	//Die Größe wird festgelegt
		new Schlaeger(pBenutzerebene);		//Hier wird der Klasse Schläger die Benutzerbene zugewiesen
		getCpSpielfeld().add(pBenutzerebene);	//Hier wird die Benutzerebene dem Hauptfenster zugewiesen

		getContentPane().add(getCpSpielfeld(), BorderLayout.CENTER);	//Hier wird das Hauptfenster dem contantePane zugewiesen

		initializeSpiel();		//Hier wird die Methode initiakizeSpiel aufgerufen
		showSpielInformation();	// Hier wird die Metthode showSpielInformation aufgerufen
	}

	/**
	 * Diese Methode wird verwendet, um ein Spielfeld festzulegen.
	 * @param cpSpielfeld JPanel, welches als Spielfeld verwendet werden soll
	 */
	private void setCpHauptfenster(JPanel cpSpielfeld)
	{
		Hauptfenster.cpSpielfeld = cpSpielfeld;
	}

	/**
	 * Hier werden dem Spieler seine Anfangswerte gegeben mit 3 Leben und 0 Punkten
	 */
	private void initializeSpiel()
	{
		Spieler.setLeben(3);
		Spieler.setPunktestand(0);
	}
	
	/**
	 * Hier in dieser Methode werden die Blöcke erzeugt und in ein Array geschrieben und die Blöcke werdne auch dem Hauptfenster zugewiesen.
	 * Die Position auf dem Hautpfenster bekommen die Blöcke direkt zugewiesen.
	 */
	private void generateBloecke()
	{
		int xPos = 5;	//Dies ist Notwendig, damit der schwarze Rand auf der X-Seite möglich ist 
		int yPos = 5;	//Dies ist Notwendog, damit der schwarze Rand auf der Y-Seite möglich ist
		
		for (int iZeile = 0; iZeile < GUI_ZEILEN; iZeile++)	//Hier wird Festgelgegt, auf welcher Zeile sich die Blöcke befinden
		{
			for (int iSpalte = 0; iSpalte < GUI_SPALTEN; iSpalte++)	//Hier wird die Spalte in welcher sich die Blöcke befinden festgelegt
			{
				switch (iZeile)								// Mit diesem Switch Case wird geschaut in welcher Zeile sich der Block befindet
				{
					case 0:
						JPanel pRot = new JPanel();			// Hier werden die Panels für die roten Blöcke erzeugt
						pRot.setLocation(xPos, yPos);		//Hier bekommen diese ihre Position zugewiesen
						pRot.setSize(105, 50);				//Hier wird ihnen ihre größe gegeben 
						pRot.setBackground(ROT);			//Der Hintergrund wird auf Rot gesetzt
						aPanels[iZeile][iSpalte] = pRot;	//Das erzeugte Panel wird dem Array hinzugefügt
						getCpSpielfeld().add(pRot);			//Wird dem Hauptfenster zugewiesen
						xPos += 109;						//Die X-Postion wird für das nächste Panel geändert
						break;

					case 1:
						JPanel pOrange = new JPanel();
						pOrange.setLocation(xPos, yPos);
						pOrange.setSize(105, 50);
						pOrange.setBackground(ORANGE);
						aPanels[iZeile][iSpalte] = pOrange;
						getCpSpielfeld().add(pOrange);
						xPos += 109;
						break;

					case 2:
						JPanel pGelb = new JPanel();
						pGelb.setLocation(xPos, yPos);
						pGelb.setSize(105, 50);
						pGelb.setBackground(GELB);
						aPanels[iZeile][iSpalte] = pGelb;
						getCpSpielfeld().add(pGelb);
						xPos += 109;
						break;

					case 3:
						JPanel pGruen = new JPanel();
						pGruen.setLocation(xPos, yPos);
						pGruen.setSize(105, 50);
						pGruen.setBackground(GRUEN);
						aPanels[iZeile][iSpalte] = pGruen;
						getCpSpielfeld().add(pGruen);
						xPos += 109;
						break;

					case 4:
						JPanel pBlau = new JPanel();
						pBlau.setLocation(xPos, yPos);
						pBlau.setSize(105, 50);
						pBlau.setBackground(HELL_BLAU);
						aPanels[iZeile][iSpalte] = pBlau;
						getCpSpielfeld().add(pBlau);
						xPos += 109;
						break;
				}
			}
			xPos = 5;	// Die X-Position wird auf den Anfangswert gesetzt
			yPos += 55;	// Die Y-Position wird auf die neue Position gesetzt
		}
	}

	/**
	 * Dies ist die Methode, über welche die Punkte und die Leben des Spielers auf das Spielfeld gesetzt wird.
	 * @return den anzuzeigenden Text
	 */
	private static String getSpielstandLabelText()
	{
		return "Name: "+ Spieler.getSpielername() + "               ||               Leben: " + Spieler.getLeben()
				+ "               ||               Punkte: " + String.format("%,.0f", Spieler.getPunktestand());
	}

	/**
	 * Hier wird die Information ausgegeben, welche am Anfang des Spieles zu sehen ist.
	 */
	public void showSpielInformation()
	{
		JOptionPane.showMessageDialog(	getHauptfenster(), "Zum Starten des Spiels\u002C oder wenn Sie ein Leben verlieren ENTER dr\u00FCcken\u002E\n"
		                              					 + "\n"
														 + "\u0021 \u0021 \u0021 ACHTUNG \u0021 \u0021 \u0021\n"
														 + "Bei Bet\u00E4tigung der ENTER\u002DTaste fliegt der Ball automatisch los\u0021",
										"Information", JOptionPane.INFORMATION_MESSAGE);
		initializeSpiel();
	}

	/**
	 * Hier wird der Timer gestartet, welcher dafür sorgt, dass das Spielfeld immer aktuell ist.
	 */
	public void timerStarten()
	{
		timerAktiv = true;
		oTimer = new Timer();				//Hier wird ein Objekt der Klasse Timer erstellt
		TimerTask oTimerTask = new Task();	//Hier wird ein OBjekt der Klasse Timertask erstellt
		oTimer.schedule(oTimerTask, 0, 5);	//Hier wird der Methode schedule in der Klasse Timer das Timertask Objekt und die Zeit,
											//mit welcher Aufgerufen wird, übergeben
	}

	/**
	 * In dieser Method wird der Timer gestoppt.
	 */
	public void timerStoppen()
	{
		timerAktiv = false;
		oTimer.cancel();	//Beendet den Timer
		oTimer.purge();		//Löscht sämtliche beendeten Timer
	}

	/**
	 * Hier wird das SpielstandLabel auf den aktuellen Stand gebracht.
	 */
	public static void updateSpielstandLabelText()
	{
		lblSpielstandText.setText(getSpielstandLabelText());
	}

	/**
	 * Diese Methode wird benötigt, um nicht statische Methoden dieser Klasse aufrufen zu können.
	 * @return ein Objekt der Klasse "Hauptfenster"
	 */
	public static Hauptfenster getHauptfenster()
	{
		return oHauptfenster;
	}

	/**
	 * Hier wird der Ball zurückgegeben, um ihn in anderen Klassen verwendbar zu machen.
	 * @return das JPanel "pBall"
	 */
	public static JPanel getBall()
	{
		return pBall;
	}

	/**
	 * Hier wird die Breite des Spielfeldes zurückgegeben, um dies in anderen Klassen verwenden zu können.
	 * @return Breite des Spielfeldes
	 */
	public static int getSpielfeldBreite()
	{
		return getCpSpielfeld().getWidth();
	}

	/**
	 * Hier wird die Spielfeldhöhe zurückgegeben, um diese in anderen Klassen verwenden zu können.
	 * @return Höhe des Spielfeldes
	 */
	public static int getSpielfeldHoehe()
	{
		return getCpSpielfeld().getHeight();
	}

	/**
	 * Hier wird die Breite des Balles zurückgegeben, um diese in andern Klassen verwenden zu können.
	 * @return Breite des Balles
	 */
	public static int getBallBreite()
	{
		return pBall.getWidth();
	}

	/**
	 * Hier wird die Höhe des Balles zurückgegeben, um diese in andern Klassen verwenden zu können.
	 * @return Höhe des Balles
	 */
	public static int getBallHoehe()
	{
		return pBall.getHeight();
	}

	/**
	 * Diese Methode überprüft, ob der Timer aktiv ist.
	 * @return true, wenn der Timer aktiv ist<br>
	 * false, wenn der Timer deaktiviert ist
	 */
	public static boolean isTimerAktiv()
	{
		return timerAktiv;
	}

	/**
	 * Hier wird das Spielfeld zurückgegeben, um dieses in andern Klassen verwenden zu können.
	 * @return das JPanel "cpSpielfeld"
	 */
	public static JPanel getCpSpielfeld()
	{
		return cpSpielfeld;
	}
	
	/**
	 * Diese Methode dient nur dazu das aPanels-Array, in welchem sich die Blöcke befinden, zurück zugeben.
	 * @return Das 2D-Array "<b>aPanels</b>"
	 */
	public static JPanel[][] getPanels()
	{
		return aPanels;
	}

	// **************************************

	/**
	 * Dies ist die Klasse Timer in welcher sich die Run-Methode befindet.<br>
	 * Von dieser Methode aus wird die "bewegen"-Methode in der Klasse "Ball" aufgerufen.
	 * 
	 * @version 1.0
	 * 
	 * @author Thomas Mader-Ofer
	 * @author Manuel Glantschnig
	 * @author Jonas Hörtnagl
	 * @author Cristina Erhart
	 */
	private class Task extends TimerTask
	{
		@Override
		public void run()
		{
			Ball.bewegen();
		}
	}
}