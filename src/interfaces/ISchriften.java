package interfaces;

import java.awt.Font;

/**
 * @author Manuel Glantschnig
 * @version 1.0
 */
public interface ISchriften
{
	Font SCHRIFT_GROSS_FETT = new Font("Tempus Sans ITC", Font.BOLD, 30);
	Font SCHRIFT_MITTEL_FETT = new Font("Tempus Sans ITC", Font.BOLD, 20);
	Font SCHRIFT_NORMAL_FETT = new Font("Tempus Sans ITC", Font.BOLD, 15);
	Font SCHRIFT_GROSS = new Font("Tempus Sans ITC", Font.PLAIN, 30);
	Font SCHRIFT_MITTEL = new Font("Tempus Sans ITC", Font.PLAIN, 20);
	Font SCHRIFT_NORMAL = new Font("Tempus Sans ITC", Font.PLAIN, 15);
}