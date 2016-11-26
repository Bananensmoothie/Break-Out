package frames;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;
import java.awt.Font;
import java.awt.Toolkit;

public class Hauptfenster extends JFrame {

	private JPanel cpHauptfenser;

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
					Hauptfenster frame = new Hauptfenster();
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
	public Hauptfenster()
	{
		initialize();
	}

	private void initialize()
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\glant\\Desktop\\Logo.jpg"));
		setTitle("Break-Out");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 700);
		cpHauptfenser = new JPanel();
		cpHauptfenser.setBackground(Color.DARK_GRAY);
		cpHauptfenser.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(cpHauptfenser);
		cpHauptfenser.setLayout(new MigLayout("", "[grow][grow][grow][grow][grow][grow][grow][grow][grow][grow]", "[grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow][grow]"));
		
		JPanel pName = new JPanel();
		pName.setBackground(new Color(138, 43, 226));
		cpHauptfenser.add(pName, "cell 0 0 4 1,growx,aligny top");
		
		JLabel lblName = new JLabel("Name: ");
		lblName.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblName.setForeground(new Color(255, 240, 245));
		pName.add(lblName);
		
		JPanel PLeben = new JPanel();
		PLeben.setBackground(new Color(138, 43, 226));
		cpHauptfenser.add(PLeben, "cell 4 0 3 1,growx,aligny top");
		
		JLabel lblLeben = new JLabel("Leben: ");
		lblLeben.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblLeben.setForeground(new Color(255, 240, 245));
		PLeben.add(lblLeben);
		
		JPanel pPunkte = new JPanel();
		pPunkte.setBackground(new Color(138, 43, 226));
		cpHauptfenser.add(pPunkte, "cell 7 0 3 1,growx,aligny top");
		
		JLabel lblPunkte = new JLabel("Punkte: ");
		lblPunkte.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblPunkte.setForeground(new Color(255, 240, 245));
		pPunkte.add(lblPunkte);
		
		JPanel pRot1_1 = new JPanel();
		pRot1_1.setBackground(new Color(220, 20, 60));
		cpHauptfenser.add(pRot1_1, "cell 0 1,grow");
		
		JPanel pRot1_2 = new JPanel();
		pRot1_2.setBackground(new Color(220, 20, 60));
		cpHauptfenser.add(pRot1_2, "cell 1 1,grow");
		
		JPanel pRot1_3 = new JPanel();
		pRot1_3.setBackground(new Color(220, 20, 60));
		cpHauptfenser.add(pRot1_3, "cell 2 1,grow");
		
		JPanel pRot1_4 = new JPanel();
		pRot1_4.setBackground(new Color(220, 20, 60));
		cpHauptfenser.add(pRot1_4, "cell 3 1,grow");
		
		JPanel pRot1_5 = new JPanel();
		pRot1_5.setBackground(new Color(220, 20, 60));
		cpHauptfenser.add(pRot1_5, "cell 4 1,grow");
		
		JPanel pRot1_6 = new JPanel();
		pRot1_6.setBackground(new Color(220, 20, 60));
		cpHauptfenser.add(pRot1_6, "cell 5 1,grow");
		
		JPanel pRot1_7 = new JPanel();
		pRot1_7.setBackground(new Color(220, 20, 60));
		cpHauptfenser.add(pRot1_7, "cell 6 1,grow");
		
		JPanel pRot1_8 = new JPanel();
		pRot1_8.setBackground(new Color(220, 20, 60));
		cpHauptfenser.add(pRot1_8, "cell 7 1,grow");
		
		JPanel pRot1_9 = new JPanel();
		pRot1_9.setBackground(new Color(220, 20, 60));
		cpHauptfenser.add(pRot1_9, "cell 8 1,grow");
		
		JPanel pRot1_10 = new JPanel();
		pRot1_10.setBackground(new Color(220, 20, 60));
		cpHauptfenser.add(pRot1_10, "cell 9 1,grow");
		
		JPanel pOrange1_1 = new JPanel();
		pOrange1_1.setBackground(new Color(255, 140, 0));
		cpHauptfenser.add(pOrange1_1, "cell 0 2,grow");
		
		JPanel pOrange1_2 = new JPanel();
		pOrange1_2.setBackground(new Color(255, 140, 0));
		cpHauptfenser.add(pOrange1_2, "cell 1 2,grow");
		
		JPanel pOrange1_3 = new JPanel();
		pOrange1_3.setBackground(new Color(255, 140, 0));
		cpHauptfenser.add(pOrange1_3, "cell 2 2,grow");
		
		JPanel pOrange1_4 = new JPanel();
		pOrange1_4.setBackground(new Color(255, 140, 0));
		cpHauptfenser.add(pOrange1_4, "cell 3 2,grow");
		
		JPanel pOrange1_5 = new JPanel();
		pOrange1_5.setBackground(new Color(255, 140, 0));
		cpHauptfenser.add(pOrange1_5, "cell 4 2,grow");
		
		JPanel pOrange1_6 = new JPanel();
		pOrange1_6.setBackground(new Color(255, 140, 0));
		cpHauptfenser.add(pOrange1_6, "cell 5 2,grow");
		
		JPanel pOrange1_7 = new JPanel();
		pOrange1_7.setBackground(new Color(255, 140, 0));
		cpHauptfenser.add(pOrange1_7, "cell 6 2,grow");
		
		JPanel pOrange1_8 = new JPanel();
		pOrange1_8.setBackground(new Color(255, 140, 0));
		cpHauptfenser.add(pOrange1_8, "cell 7 2,grow");
		
		JPanel pOrange1_9 = new JPanel();
		pOrange1_9.setBackground(new Color(255, 140, 0));
		cpHauptfenser.add(pOrange1_9, "cell 8 2,grow");
		
		JPanel pOrange1_10 = new JPanel();
		pOrange1_10.setBackground(new Color(255, 140, 0));
		cpHauptfenser.add(pOrange1_10, "cell 9 2,grow");
		
		JPanel pGelb1_1 = new JPanel();
		pGelb1_1.setBackground(new Color(255, 215, 0));
		cpHauptfenser.add(pGelb1_1, "cell 0 3,grow");
		
		JPanel pGelb1_2 = new JPanel();
		pGelb1_2.setBackground(new Color(255, 215, 0));
		cpHauptfenser.add(pGelb1_2, "cell 1 3,grow");
		
		JPanel pGelb1_3 = new JPanel();
		pGelb1_3.setBackground(new Color(255, 215, 0));
		cpHauptfenser.add(pGelb1_3, "cell 2 3,grow");
		
		JPanel pGelb1_4 = new JPanel();
		pGelb1_4.setBackground(new Color(255, 215, 0));
		cpHauptfenser.add(pGelb1_4, "cell 3 3,grow");
		
		JPanel pGelb1_5 = new JPanel();
		pGelb1_5.setBackground(new Color(255, 215, 0));
		cpHauptfenser.add(pGelb1_5, "cell 4 3,grow");
		
		JPanel pGelb1_6 = new JPanel();
		pGelb1_6.setBackground(new Color(255, 215, 0));
		cpHauptfenser.add(pGelb1_6, "cell 5 3,grow");
		
		JPanel pGelb1_7 = new JPanel();
		pGelb1_7.setBackground(new Color(255, 215, 0));
		cpHauptfenser.add(pGelb1_7, "cell 6 3,grow");
		
		JPanel pGelb1_8 = new JPanel();
		pGelb1_8.setBackground(new Color(255, 215, 0));
		cpHauptfenser.add(pGelb1_8, "cell 7 3,grow");
		
		JPanel pGelb1_9 = new JPanel();
		pGelb1_9.setBackground(new Color(255, 215, 0));
		cpHauptfenser.add(pGelb1_9, "cell 8 3,grow");
		
		JPanel pGelb1_10 = new JPanel();
		pGelb1_10.setBackground(new Color(255, 215, 0));
		cpHauptfenser.add(pGelb1_10, "cell 9 3,grow");
		
		JPanel pGrün1_1 = new JPanel();
		pGrün1_1.setBackground(new Color(154, 205, 50));
		cpHauptfenser.add(pGrün1_1, "cell 0 4,grow");
		
		JPanel pGrün1_2 = new JPanel();
		pGrün1_2.setBackground(new Color(154, 205, 50));
		cpHauptfenser.add(pGrün1_2, "cell 1 4,grow");
		
		JPanel pGrün1_3 = new JPanel();
		pGrün1_3.setBackground(new Color(154, 205, 50));
		cpHauptfenser.add(pGrün1_3, "cell 2 4,grow");
		
		JPanel pGrün1_4 = new JPanel();
		pGrün1_4.setBackground(new Color(154, 205, 50));
		cpHauptfenser.add(pGrün1_4, "cell 3 4,grow");
		
		JPanel pGrün1_5 = new JPanel();
		pGrün1_5.setBackground(new Color(154, 205, 50));
		cpHauptfenser.add(pGrün1_5, "cell 4 4,grow");
		
		JPanel pGrün1_6 = new JPanel();
		pGrün1_6.setBackground(new Color(154, 205, 50));
		cpHauptfenser.add(pGrün1_6, "cell 5 4,grow");
		
		JPanel pGrün1_7 = new JPanel();
		pGrün1_7.setBackground(new Color(154, 205, 50));
		cpHauptfenser.add(pGrün1_7, "cell 6 4,grow");
		
		JPanel pGrün1_8 = new JPanel();
		pGrün1_8.setBackground(new Color(154, 205, 50));
		cpHauptfenser.add(pGrün1_8, "cell 7 4,grow");
		
		JPanel pGrün1_9 = new JPanel();
		pGrün1_9.setBackground(new Color(154, 205, 50));
		cpHauptfenser.add(pGrün1_9, "cell 8 4,grow");
		
		JPanel pGrün1_10 = new JPanel();
		pGrün1_10.setBackground(new Color(154, 205, 50));
		cpHauptfenser.add(pGrün1_10, "cell 9 4,grow");
		
		JPanel pBlau1_1 = new JPanel();
		pBlau1_1.setBackground(new Color(0, 191, 255));
		cpHauptfenser.add(pBlau1_1, "cell 0 5,grow");
		
		JPanel pBlau1_2 = new JPanel();
		pBlau1_2.setBackground(new Color(0, 191, 255));
		cpHauptfenser.add(pBlau1_2, "cell 1 5,grow");
		
		JPanel pBlau1_3 = new JPanel();
		pBlau1_3.setBackground(new Color(0, 191, 255));
		cpHauptfenser.add(pBlau1_3, "cell 2 5,grow");
		
		JPanel pBlau1_4 = new JPanel();
		pBlau1_4.setBackground(new Color(0, 191, 255));
		cpHauptfenser.add(pBlau1_4, "cell 3 5,grow");
		
		JPanel pBlau1_5 = new JPanel();
		pBlau1_5.setBackground(new Color(0, 191, 255));
		cpHauptfenser.add(pBlau1_5, "cell 4 5,grow");
		
		JPanel pBlau1_6 = new JPanel();
		pBlau1_6.setBackground(new Color(0, 191, 255));
		cpHauptfenser.add(pBlau1_6, "cell 5 5,grow");
		
		JPanel pBlau1_7 = new JPanel();
		pBlau1_7.setBackground(new Color(0, 191, 255));
		cpHauptfenser.add(pBlau1_7, "cell 6 5,grow");
		
		JPanel pBlau1_8 = new JPanel();
		pBlau1_8.setBackground(new Color(0, 191, 255));
		cpHauptfenser.add(pBlau1_8, "cell 7 5,grow");
		
		JPanel pBlau1_9 = new JPanel();
		pBlau1_9.setBackground(new Color(0, 191, 255));
		cpHauptfenser.add(pBlau1_9, "cell 8 5,grow");
		
		JPanel pBlau1_10 = new JPanel();
		pBlau1_10.setBackground(new Color(0, 191, 255));
		cpHauptfenser.add(pBlau1_10, "cell 9 5,grow");
		
		JPanel pBall = new JPanel();
		pBall.setBackground(new Color(255, 240, 245));
		cpHauptfenser.add(pBall, "cell 4 10,grow");
		
		JPanel pBenutzerebene = new JPanel();
		pBenutzerebene.setBackground(new Color(255, 182, 193));
		cpHauptfenser.add(pBenutzerebene, "flowx,cell 4 11 2 1,growx,aligny bottom");
	}
}