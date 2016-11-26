package frames;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;
import java.awt.Font;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;
import javax.swing.JTextField;

public class Startfenster extends JFrame
{
	private JPanel cpWillkommen;
	private JTextField txtBitteHierIhren;

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
					Startfenster frame = new Startfenster();
					frame.setVisible(true);
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
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Startfenster.class.getResource("/images/Logo.jpg")));
		setTitle("Willkommen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 700);
		cpWillkommen = new JPanel();
		cpWillkommen.setBackground(Color.DARK_GRAY);
		cpWillkommen.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(cpWillkommen);
		cpWillkommen.setLayout(new MigLayout("", "[182px][grow][165px][364px,grow][166px][181px]", "[grow][137px][grow][286px][grow][29px]"));
		
		JPanel pWillkommen = new JPanel();
		pWillkommen.setForeground(new Color(138, 43, 226));
		pWillkommen.setBackground(new Color(255, 215, 0));
		cpWillkommen.add(pWillkommen, "cell 3 1,grow");
		GridBagLayout gbl_pWillkommen = new GridBagLayout();
		gbl_pWillkommen.columnWidths = new int[]{109, 0, 99, 0};
		gbl_pWillkommen.rowHeights = new int[]{27, 0, 0, 0, 0};
		gbl_pWillkommen.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pWillkommen.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pWillkommen.setLayout(gbl_pWillkommen);
		
		JLabel lblWillkommen = new JLabel("Willkommen bei");
		lblWillkommen.setForeground(new Color(138, 43, 226));
		lblWillkommen.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		GridBagConstraints gbc_lblWillkommen = new GridBagConstraints();
		gbc_lblWillkommen.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblWillkommen.insets = new Insets(0, 0, 5, 5);
		gbc_lblWillkommen.gridx = 1;
		gbc_lblWillkommen.gridy = 1;
		pWillkommen.add(lblWillkommen, gbc_lblWillkommen);
		
		JLabel lblNewLabel = new JLabel("Break-Out");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 30));
		lblNewLabel.setForeground(new Color(138, 43, 226));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 2;
		pWillkommen.add(lblNewLabel, gbc_lblNewLabel);
		
		txtBitteHierIhren = new JTextField();
		txtBitteHierIhren.setToolTipText("Bitte gebeb Sie hier Ihren Spielernamen ein!");
		txtBitteHierIhren.setText("Bitte hier Ihren Spielername eingeben");
		cpWillkommen.add(txtBitteHierIhren, "cell 3 2,growx");
		txtBitteHierIhren.setColumns(10);
		
		JPanel pAnleitung = new JPanel();
		pAnleitung.setBackground(new Color(138, 43, 226));
		cpWillkommen.add(pAnleitung, "cell 0 3 6 1,grow");
		GridBagLayout gbl_pAnleitung = new GridBagLayout();
		gbl_pAnleitung.columnWidths = new int[]{1058, 0};
		gbl_pAnleitung.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pAnleitung.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_pAnleitung.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		pAnleitung.setLayout(gbl_pAnleitung);
		
		JLabel lblInformationenZuBreakout = new JLabel("Informationen zu Break-Out: ");
		lblInformationenZuBreakout.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		lblInformationenZuBreakout.setForeground(new Color(255, 240, 245));
		GridBagConstraints gbc_lblInformationenZuBreakout = new GridBagConstraints();
		gbc_lblInformationenZuBreakout.anchor = GridBagConstraints.NORTH;
		gbc_lblInformationenZuBreakout.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblInformationenZuBreakout.insets = new Insets(0, 0, 5, 0);
		gbc_lblInformationenZuBreakout.gridx = 0;
		gbc_lblInformationenZuBreakout.gridy = 0;
		pAnleitung.add(lblInformationenZuBreakout, gbc_lblInformationenZuBreakout);
		
		JLabel lblZielDesSpiels1 = new JLabel("Ziel des Spiels ist es so viele Punkte wie möglich zu erzielen.");
		lblZielDesSpiels1.setForeground(Color.YELLOW);
		lblZielDesSpiels1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		GridBagConstraints gbc_lblZielDesSpiels1 = new GridBagConstraints();
		gbc_lblZielDesSpiels1.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblZielDesSpiels1.insets = new Insets(0, 0, 5, 0);
		gbc_lblZielDesSpiels1.gridx = 0;
		gbc_lblZielDesSpiels1.gridy = 1;
		pAnleitung.add(lblZielDesSpiels1, gbc_lblZielDesSpiels1);
		
		JLabel lblZielDesSpiels2 = new JLabel("Dies erfolgt mittels Abschiessen der bunten Blöcke auf der oberen Seite des Spiels.");
		lblZielDesSpiels2.setForeground(Color.YELLOW);
		lblZielDesSpiels2.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		GridBagConstraints gbc_lblZielDesSpiels2 = new GridBagConstraints();
		gbc_lblZielDesSpiels2.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblZielDesSpiels2.insets = new Insets(0, 0, 5, 0);
		gbc_lblZielDesSpiels2.gridx = 0;
		gbc_lblZielDesSpiels2.gridy = 2;
		pAnleitung.add(lblZielDesSpiels2, gbc_lblZielDesSpiels2);
		JLabel lblZielDesSpiels3 = new JLabel("Diese Blöcke können mittels einem sich selbst bewegenden, weißen Ball abgeschossen werden.");
		lblZielDesSpiels3.setForeground(Color.YELLOW);
		lblZielDesSpiels3.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		GridBagConstraints gbc_lblZielDesSpiels3 = new GridBagConstraints();
		gbc_lblZielDesSpiels3.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblZielDesSpiels3.insets = new Insets(0, 0, 5, 0);
		gbc_lblZielDesSpiels3.gridx = 0;
		gbc_lblZielDesSpiels3.gridy = 3;
		pAnleitung.add(lblZielDesSpiels3, gbc_lblZielDesSpiels3);
		JLabel lblZielDesSpiels4 = new JLabel("Sie können die rosane Benutzerfläche im unteren Bereich des Spiels anch rechts und links bewegen.");
		lblZielDesSpiels4.setForeground(Color.YELLOW);
		lblZielDesSpiels4.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		GridBagConstraints gbc_lblZielDesSpiels4 = new GridBagConstraints();
		gbc_lblZielDesSpiels4.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblZielDesSpiels4.insets = new Insets(0, 0, 5, 0);
		gbc_lblZielDesSpiels4.gridx = 0;
		gbc_lblZielDesSpiels4.gridy = 4;
		pAnleitung.add(lblZielDesSpiels4, gbc_lblZielDesSpiels4);
		JLabel lblZielDesSpiels5 = new JLabel("Hiermit verhindern Sie, dass der weiße Ball aus dem Spielfeld hinausfliegt.");
		lblZielDesSpiels5.setForeground(Color.YELLOW);
		lblZielDesSpiels5.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		GridBagConstraints gbc_lblZielDesSpiels5 = new GridBagConstraints();
		gbc_lblZielDesSpiels5.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblZielDesSpiels5.insets = new Insets(0, 0, 5, 0);
		gbc_lblZielDesSpiels5.gridx = 0;
		gbc_lblZielDesSpiels5.gridy = 5;
		pAnleitung.add(lblZielDesSpiels5, gbc_lblZielDesSpiels5);
		JLabel lblZielDesSpiels6 = new JLabel("Wenn dieser Ball drei mal aus dem Spielfeld geflogen ist,");
		lblZielDesSpiels6.setForeground(Color.YELLOW);
		lblZielDesSpiels6.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		GridBagConstraints gbc_lblZielDesSpiels6 = new GridBagConstraints();
		gbc_lblZielDesSpiels6.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblZielDesSpiels6.insets = new Insets(0, 0, 5, 0);
		gbc_lblZielDesSpiels6.gridx = 0;
		gbc_lblZielDesSpiels6.gridy = 6;
		pAnleitung.add(lblZielDesSpiels6, gbc_lblZielDesSpiels6);
		JLabel lblZielDesSpiels7 = new JLabel("ist das Spiel beendet und Sie können Ihren erspielten Punktestand im Ranking der Highsoretabelle genauer betrachten.");
		lblZielDesSpiels7.setForeground(Color.YELLOW);
		lblZielDesSpiels7.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		GridBagConstraints gbc_lblZielDesSpiels7 = new GridBagConstraints();
		gbc_lblZielDesSpiels7.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblZielDesSpiels7.insets = new Insets(0, 0, 5, 0);
		gbc_lblZielDesSpiels7.gridx = 0;
		gbc_lblZielDesSpiels7.gridy = 7;
		pAnleitung.add(lblZielDesSpiels7, gbc_lblZielDesSpiels7);
		JLabel lblZielDesSpiels8 = new JLabel("Sie können während des Spiels jederzeit Ihren aktuellen Punktestand sowie Ihre noch zur verfügungstehenden Leben abrufen.");
		lblZielDesSpiels8.setForeground(Color.YELLOW);
		lblZielDesSpiels8.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		GridBagConstraints gbc_lblZielDesSpiels8 = new GridBagConstraints();
		gbc_lblZielDesSpiels8.insets = new Insets(0, 0, 5, 0);
		gbc_lblZielDesSpiels8.anchor = GridBagConstraints.WEST;
		gbc_lblZielDesSpiels8.gridx = 0;
		gbc_lblZielDesSpiels8.gridy = 8;
		pAnleitung.add(lblZielDesSpiels8, gbc_lblZielDesSpiels8);
		
		JButton btnSpielStarten = new JButton("Spiel starten");
		btnSpielStarten.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		cpWillkommen.add(btnSpielStarten, "cell 0 5,alignx center,aligny center");
		
		JButton btnHighscore = new JButton("Highscore\u00B4s");
		btnHighscore.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		cpWillkommen.add(btnHighscore, "cell 5 5,alignx center,aligny center");
	}
}
