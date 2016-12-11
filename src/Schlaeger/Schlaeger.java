package Schlaeger;
import javax.swing.JPanel;


public class Schlaeger extends JPanel{


		private static final long serialVersionUID = 1L;

		boolean left, right;

		int x, y, breite, hoehe, schlaegernummer;
		int move;
		int speed = 10;//wie viele pixel pro ausführen der move methode sich verändern
		Gui gui;
		/**
		 * Konstruktor
		 * @param x1
		 * @param y1
		 * @param breite1
		 * @param hoehe1
		 * @param gui1
		 * @param schlaegernummer1
		 */
		Schlaeger(int x1, int y1, int breite1, int hoehe1, Gui gui1, int schlaegernummer1) {
			y = y1;
			x = x1;
			breite = breite1;
			hoehe = hoehe1;
			gui = gui1;
			schlaegernummer = schlaegernummer1;
			this.setBounds(x, y, breite, hoehe);
		}
		/**
		 * Diese Methode wird verwendet um die Schlaeger zu bewegen
		 */
		public void move(){
			long anfangszeit=System.currentTimeMillis();
			if(move == 1) {

				if(y - speed >= 0 && move == 1) {			//Als Beschränkung für y Koordinate nach oben

					y -= speed;
				}

			}
			else {

				if(y + speed + hoehe <= gui.framehoehe-45 && move == 2)	//Als Beschränkung für y Koordinate nach unten (-45 wegen dem Balken oben)
				{

					y += speed;
				}

			}
			while(System.currentTimeMillis()-anfangszeit<=5)//nach jeder bewegung werden 5 millisekunden gewartet 
			{

			}
			this.setLocation(x, y);
			this.validate();
		}
		/**
		 * Methode um das Fenster, in dem das Spiel stattfindet dynamisch zu gestalten
		 */
		public void frameSizeChanged() {

			if(schlaegernummer == 2) {
				x = gui.framebreite-breite*2;

			}

			if(schlaegernummer == 3) {                      //Schlaeger 3 --> panelMitte (wegen frameSizechanged;; hat
				//aber keine move-Methode etc.
				x = gui.framebreite/2-breite*2;
				y = gui.framehoehe;
			}

			if((gui.framehoehe-45) < y+hoehe) {
				y = gui.framehoehe-45-hoehe;

			}

			this.setLocation(x, y);
			this.validate();
		}

		public int startpositionYBerechnen() {

			return (gui.framehoehe - 45)/2 - hoehe/2;
		}

		/** nur fuer schlaeger 1 und 2 */
		public int startpositionXBerechnen() {
			if(schlaegernummer == 2) {
				return gui.framebreite - breite*2;
			}
			else {
				return 0;
			}

		}

		public void setLayout(Object object) {
			// TODO Auto-generated method stub

		}

	}

}
